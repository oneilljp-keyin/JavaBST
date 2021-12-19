package com.keyin.BST;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

import java.util.Objects;

class BSTReconstructionTest {
  @Test
  void testReconstruct() {
    BinaryTreeNode<Integer> actualReconstructResult = BSTReconstruction.reconstruct(new int[]{42, 42, 42, 42});
    assertEquals(42, Objects.requireNonNull(actualReconstructResult).item.intValue());
    BinaryTreeNode<Integer> binaryTreeNode = actualReconstructResult.right;
    assertNull(binaryTreeNode.right);
    BinaryTreeNode<Integer> binaryTreeNode1 = actualReconstructResult.left;
    assertNull(binaryTreeNode1.right);
    Integer integer = actualReconstructResult.item;
    assertSame(integer, binaryTreeNode1.item);
    assertSame(integer, binaryTreeNode.item);
    BinaryTreeNode<Integer> binaryTreeNode2 = binaryTreeNode1.left;
    assertSame(integer, binaryTreeNode2.item);
    assertNull(binaryTreeNode2.left);
  }
}

