package com.company;

import java.util.Scanner;

public class MinesweeperTemp {
    private static int[][] pair;
    private static String[][] key;
    private static int a, b;

    void chekForMine(int m, int n) {
        if (pair[m][n] != -1) {
            pair[m][n]++;
        }
    }

    public static void main(String[] args) {
        MinesweeperTemp mt = new MinesweeperTemp();
        Scanner sc = new Scanner(System.in);
        int count = 0;
        a = sc.nextInt();
        b = sc.nextInt();

        while (a != 0 && b != 0) {

            key = new String[a][b];
            pair = new int[a][b];

            for (int i = 0; i < key.length; i++) {
                for (int j = 0; j < key[i].length; j++) {
                    key[i][j] = sc.next();
                    pair[i][j] = 0;
                }
            }

            for (int i = 0; i < pair.length; i++) {
                for (int j = 0; j < pair[i].length; j++) {
                    if (key[i][j].equals("*")) {
                        pair[i][j] = -1;
                        if (i == 0 && j == 0) {
                            mt.chekForMine(i, j + 1);
                            mt.chekForMine(i + 1, j + 1);
                            mt.chekForMine(i + 1, j);
                        } else if (i == 0 && j == b - 1) {
                            mt.chekForMine(i, j - 1);
                            mt.chekForMine(i + 1, j - 1);
                            mt.chekForMine(i + 1, j);
                        } else if (i == b - 1 && j == 0) {
                            mt.chekForMine(i - 1, j);
                            mt.chekForMine(i - 1, j + 1);
                            mt.chekForMine(i, j + 1);
                        } else if (i == a - 1 && j == b - 1) {
                            mt.chekForMine(i, j - 1);
                            mt.chekForMine(i - 1, j - 1);
                            mt.chekForMine(i - 1, j);
                        } else if (i == 0 && j >= 1 && j < b - 1) {
                            mt.chekForMine(i, j - 1);
                            mt.chekForMine(i + 1, j - 1);
                            mt.chekForMine(i + 1, j);
                            mt.chekForMine(i + 1, j + 1);
                            mt.chekForMine(i, j + 1);
                        } else if (j == 0 && i >= 1 && i < b - 1) {
                            mt.chekForMine(i - 1, j);
                            mt.chekForMine(i - 1, j + 1);
                            mt.chekForMine(i, j + 1);
                            mt.chekForMine(i + 1, j + 1);
                            mt.chekForMine(i + 1, j);
                        } else if (j == b - 1 && i >= 1 && i < a - 1) {
                            mt.chekForMine(i - 1, j);
                            mt.chekForMine(i - 1, j - 1);
                            mt.chekForMine(i, j - 1);
                            mt.chekForMine(i + 1, j - 1);
                            mt.chekForMine(j, i + 1);
                        } else if (i == a - 1 && j >= 1 && j <= b - 1) {
                            mt.chekForMine(i, j - 1);
                            mt.chekForMine(i - 1, j - 1);
                            mt.chekForMine(i - 1, j);
                            mt.chekForMine(i - 1, j + 1);
                            mt.chekForMine(i, j + 1);
                        } else if (i >= 1 && j >= 1 && i < a - 1 && j < b - 1) {
                            mt.chekForMine(i + 1, j - 1);
                            mt.chekForMine(i, j - 1);
                            mt.chekForMine(i - 1, j - 1);
                            mt.chekForMine(i - 1, j);
                            mt.chekForMine(i - 1, j + 1);
                            mt.chekForMine(i, j + 1);
                            mt.chekForMine(i + 1, j + 1);
                            mt.chekForMine(i + 1, j);
                        }
                    }
                }
            }

            count++;
            System.out.println("Field #" + count + " :");
            for (int i = 0; i < pair.length; i++) {
                for (int j = 0; j < pair[i].length; j++) {
                    if (key[i][j].equals("*")) {
                        System.out.print("*");
                    } else {
                        System.out.print(pair[i][j]);
                    }
                }
                System.out.println();
            }

            a = sc.nextInt();
            b = sc.nextInt();
        }

    }
}
