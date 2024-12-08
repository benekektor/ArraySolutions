package com.chmnu_ki_123.k3;

public class TwoDArraySolution {
    private int[][] array;

    public TwoDArraySolution(int[][] array) {
        this.array = array;
    }

    public int getSum() {
        int sum = 0;
        for (int[] row : array) {
            for (int num : row) {
                sum += num;
            }
        }
        return sum;
    }
}

