package com.chmnu_ki_123.k3;

public class Main {
    public static void main(String[] args) {

        int[] oneDArray = {1, 2, 3, 4, 5};
        OneDArraySolution oneDSolution = new OneDArraySolution(oneDArray);
        System.out.println("1D Array Sum: " + oneDSolution.getSum()); // Expected Output: 15

        int[][] twoDArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        TwoDArraySolution twoDSolution = new TwoDArraySolution(twoDArray);
        System.out.println("2D Array Sum: " + twoDSolution.getSum()); // Expected Output: 45
    }
}
