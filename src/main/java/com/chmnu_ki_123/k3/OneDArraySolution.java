package com.chmnu_ki_123.k3;

public class OneDArraySolution {
    private int[] array;

    public OneDArraySolution(int[] array) {
        this.array = array;
    }

    public int getSum() {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
}
