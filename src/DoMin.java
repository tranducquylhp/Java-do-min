public class DoMin {
    public static void main(String[] args) {
        String[][] map = {
                {"*", ".", "*", ".", "."},
                {".", "*", ".", ".", "."}
        };
        int height = map.length;
        int width = map[0].length;
        int[][] count = new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (map[i][j] != "*") {
                    count[i][j] = 0;
                } else {
                    count[i][j] = -1;
                }
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (count[i][j] == -1) {
                    //kiem tra 4 goc
                    if (i == 0 && j == 0) {
                        if (count[i][j + 1] != -1) {
                            count[i][j + 1]++;
                        } ;
                        if (count[i + 1][j + 1] != -1) count[i + 1][j + 1]++;
                        if (count[i + 1][j] != -1) count[i + 1][j]++;
                    }
                    if (i == 0 && j == width - 1) {
                        if (count[i][j - 1] != -1) count[i][j - 1]++;
                        if (count[i + 1][j - 1] != -1) count[i + 1][j - 1]++;
                        if (count[i + 1][j] != -1) count[i + 1][j]++;
                    }
                    if (j == 0 && i == height - 1) {
                        if (count[i - 1][j] != -1) count[i - 1][j]++;
                        if (count[i][j + 1] != -1) count[i][j + 1]++;
                        if (count[i - 1][j + 1] != -1) count[i - 1][j + 1]++;
                    }
                    if (j == width - 1 && i == height - 1) {
                        if (count[i - 1][j] != -1) count[i - 1][j]++;
                        if (count[i - 1][j - 1] != -1) count[i - 1][j - 1]++;
                        if (count[i][j - 1] != -1) count[i][j - 1]++;
                    }

                    //kiem tra 4 duong vien
                    if (i == 0 && j != 0 && j != width - 1) {
                        if (count[i][j + 1] != -1) count[i][j + 1]++;
                        if (count[i + 1][j + 1] != -1) count[i + 1][j + 1]++;
                        if (count[i + 1][j] != -1) count[i + 1][j]++;
                        if (count[i][j - 1] != -1) count[i][j - 1]++;
                        if (count[i + 1][j - 1] != -1) count[i + 1][j - 1]++;
                    }
                    if (i == height - 1 && j != 0 && j != width - 1) {
                        if (count[i][j - 1] != -1) count[i][j - 1]++;
                        if (count[i][j + 1] != -1) count[i][j + 1]++;
                        if (count[i - 1][j - 1] != -1) count[i - 1][j - 1]++;
                        if (count[i - 1][j] != -1) count[i - 1][j]++;
                        if (count[i - 1][j + 1] != -1) count[i - 1][j + 1]++;
                    }
                    if (j == 0 && i != 0 && i != height - 1) {
                        if (count[i - 1][j] != -1) count[i - 1][j]++;
                        if (count[i + 1][j] != -1) count[i + 1][j]++;
                        if (count[i - 1][j + 1] != -1) count[i - 1][j + 1]++;
                        if (count[i][j + 1] != -1) count[i][j + 1]++;
                        if (count[i + 1][j + 1] != -1) count[i + 1][j + 1]++;
                    }
                    if (j == width - 1 && i != 0 && i != height - 1) {
                        if (count[i - 1][j] != -1) count[i - 1][j]++;
                        if (count[i + 1][j] != -1) count[i + 1][j]++;
                        if (count[i - 1][j - 1] != -1) count[i - 1][j - 1]++;
                        if (count[i][j - 1] != -1) count[i][j - 1]++;
                        if (count[i + 1][j - 1] != -1) count[i + 1][j - 1]++;
                    }

                    //kiem tra o giua
                    if (i != 0 && i != height - 1 && j != 0 && j != width - 1) {
                        if (count[i - 1][j - 1] != -1) count[i - 1][j - 1]++;
                        if (count[i + 1][j + 1] != -1) count[i + 1][j + 1]++;
                        if (count[i - 1][j + 1] != -1) count[i - 1][j + 1]++;
                        if (count[i + 1][j - 1] != -1) count[i + 1][j - 1]++;
                        if (count[i][j - 1] != -1) count[i][j - 1]++;
                        if (count[i][j + 1] != -1) count[i][j + 1]++;
                        if (count[i + 1][j] != -1) count[i + 1][j]++;
                        if (count[i - 1][j] != -1) count[i - 1][j]++;
                    }
                }
            }
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (map[i][j] != "*") {
                    map[i][j] = String.valueOf(count[i][j]);
                }
            }
        }
        System.out.println();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}
