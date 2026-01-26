/*
Name: Natasha Foreman
Course: CSD 402 – Java for Programmers
Date: January 24, 2026
Assignment: Module 5
Purpose: Determine the location of the largest and smallets elements.
*/

/* Returns the largest element (double[][]). */

public static int[] locateLargest(double[][] arrayParam) {
    int[] location = new int[2];
    double max = arrayParam[0][0];

    for (int i = 0; i < arrayParam.length; i++) {
        for (int j = 0; j < arrayParam[i].length; j++) {
            if (arrayParam[i][j] > max) {
                max = arrayParam[i][j];
                location[0] = i;
                location[1] = j;
            }
        }
    }
    return location;
}

/* Returns the largest element (int[][]). */

public static int[] locateLargest(int[][] arrayParam) {
    int[] location = new int[2];
    int max = arrayParam[0][0];

    for (int i = 0; i < arrayParam.length; i++) {
        for (int j = 0; j < arrayParam[i].length; j++) {
            if (arrayParam[i][j] > max) {
                max = arrayParam[i][j];
                location[0] = i;
                location[1] = j;
            }
        }
    }
    return location;
}

/* Returns the smallest element (double[][]). */

public static int[] locateSmallest(double[][] arrayParam) {
    int[] location = new int[2];
    double min = arrayParam[0][0];

    for (int i = 0; i < arrayParam.length; i++) {
        for (int j = 0; j < arrayParam[i].length; j++) {
            if (arrayParam[i][j] < min) {
                min = arrayParam[i][j];
                location[0] = i;
                location[1] = j;
            }
        }
    }
    return location;
}

/* Returns the smallest element (int[][]). */

public static int[] locateSmallest(int[][] arrayParam) {
    int[] location = new int[2];
    int min = arrayParam[0][0];

    for (int i = 0; i < arrayParam.length; i++) {
        for (int j = 0; j < arrayParam[i].length; j++) {
            if (arrayParam[i][j] < min) {
                min = arrayParam[i][j];
                location[0] = i;
                location[1] = j;
            }
        }
    }
    return location;
}

