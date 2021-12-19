package com.keyin.BST;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BSTTest {
    final int[] input1 = { 1, 2, 3, 4, 5, 6, 7 };
    boolean expected1 = false;
    final int [] input2 = { 1, 1, 2, 3, 5, 8, 13};
    boolean expected2 = true;

    @Test
    public void duplicatesTest() {
        Assertions.assertEquals(MainMenu.duplicates(input1), expected1);
        Assertions.assertEquals(MainMenu.duplicates(input2), expected2);
    }
}
