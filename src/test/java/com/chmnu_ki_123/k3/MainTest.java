package com.chmnu_ki_123.k3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    public void testOneDArraySum() {
        int[] oneDArray = {1, 2, 3, 4, 5};
        OneDArraySolution oneDSolution = new OneDArraySolution(oneDArray);
        assertEquals(15, oneDSolution.getSum());
    }

    @Test
    public void testTwoDArraySum() {
        int[][] twoDArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        TwoDArraySolution twoDSolution = new TwoDArraySolution(twoDArray);
        assertEquals(45, twoDSolution.getSum());
    }
}
