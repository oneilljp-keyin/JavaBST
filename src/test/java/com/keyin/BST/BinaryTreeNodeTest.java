package com.keyin.BST;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class BinaryTreeNodeTest {
  @Test
  void testConstructor() {
    BinaryTreeNode<Object> actualBinaryTreeNode = new BinaryTreeNode<>("Item");
    assertEquals("Item", actualBinaryTreeNode.item);
    assertNull(actualBinaryTreeNode.right);
    assertNull(actualBinaryTreeNode.left);
  }
}

