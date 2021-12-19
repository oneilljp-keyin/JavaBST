package com.keyin.BST;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TreePrinterTest {
  @Test
  void testGetHeight() {
    assertEquals(1, TreePrinter.getHeight(new BinaryTreeNode<>("Item")));
  }

  @Test
  void testPairConstructor() {
    TreePrinter.Pair<Object, Object> actualPair = new TreePrinter.Pair<>("Left", "Right");

    assertEquals("Left", actualPair.first);
    assertEquals("Right", actualPair.second);
  }

  @Test
  void testSubtreeWidth() {
    assertEquals(0, TreePrinter.subtreeWidth(1));
    assertEquals(0, TreePrinter.subtreeWidth(0));
  }

  @Test
  void testDrawNode() {
    assertEquals("      Ite   ", TreePrinter.drawNode(new BinaryTreeNode<>("Item"), 3));
    assertEquals("        ", TreePrinter.drawNode(null, 1));
    assertEquals("      42    ", TreePrinter.drawNode(new BinaryTreeNode<>(42), 3));
    assertEquals("            ", TreePrinter.drawNode(new BinaryTreeNode<>(null), 3));
    assertEquals("       0    ", TreePrinter.drawNode(new BinaryTreeNode<>(0), 3));
  }

  @Test
  void testStringifyNodeValue() {
    assertEquals("Ite", TreePrinter.stringifyNodeValue(new BinaryTreeNode<>("Item")));
    assertEquals("   ", TreePrinter.stringifyNodeValue(null));
    assertEquals("42 ", TreePrinter.stringifyNodeValue(new BinaryTreeNode<>(42)));
    assertEquals("   ", TreePrinter.stringifyNodeValue(new BinaryTreeNode<>(null)));
    assertEquals(" 0 ", TreePrinter.stringifyNodeValue(new BinaryTreeNode<>(0)));
  }

  @Test
  void testSpacing() {
    assertEquals("   ", TreePrinter.spacing(3));
  }

  @Test
  void testDrawConnections() {
    assertEquals("               ", TreePrinter.drawConnections(new BinaryTreeNode<>("Item"), 3));
    assertEquals("           ", TreePrinter.drawConnections(null, 1));
  }

  @Test
  void testDrawConnections2() {
    BinaryTreeNode<Object> binaryTreeNode = new BinaryTreeNode<>("Item");
    binaryTreeNode.left = new BinaryTreeNode<>("Item");
    assertEquals(" |-----+       ", TreePrinter.drawConnections(binaryTreeNode, 3));
  }

  @Test
  void testDrawConnections3() {
    BinaryTreeNode<Object> binaryTreeNode = new BinaryTreeNode<>(null);
    binaryTreeNode.right = new BinaryTreeNode<>("Item");
    assertEquals("     +---| ", TreePrinter.drawConnections(binaryTreeNode, 1));
  }

  @Test
  void testDrawLeftConnectionPart() {
    assertEquals("      ", TreePrinter.drawLeftConnectionPart(new BinaryTreeNode<>("Item"), 3));
  }

  @Test
  void testDrawLeftConnectionPart2() {
    BinaryTreeNode<Object> binaryTreeNode = new BinaryTreeNode<>("Item");
    binaryTreeNode.left = new BinaryTreeNode<>("Item");
    assertEquals(" |----", TreePrinter.drawLeftConnectionPart(binaryTreeNode, 3));
  }

  @Test
  void testDrawJunction() {
    assertEquals("   ", TreePrinter.drawJunction(new BinaryTreeNode<>("Item")));
  }

  @Test
  void testDrawJunction2() {
    BinaryTreeNode<Object> binaryTreeNode = new BinaryTreeNode<>("Item");
    binaryTreeNode.left = new BinaryTreeNode<>("Item");
    assertEquals("-+ ", TreePrinter.drawJunction(binaryTreeNode));
  }

  @Test
  void testDrawJunction3() {
    BinaryTreeNode<Object> binaryTreeNode = new BinaryTreeNode<>("Item");
    binaryTreeNode.right = new BinaryTreeNode<>("Item");
    assertEquals(" +-", TreePrinter.drawJunction(binaryTreeNode));
  }

  @Test
  void testDrawRightConnectionPart() {
    assertEquals("      ", TreePrinter.drawRightConnectionPart(new BinaryTreeNode<>("Item"), 3));
  }

  @Test
  void testDrawRightConnectionPart2() {
    BinaryTreeNode<Object> binaryTreeNode = new BinaryTreeNode<>("Item");
    binaryTreeNode.right = new BinaryTreeNode<>("Item");
    assertEquals("----| ", TreePrinter.drawRightConnectionPart(binaryTreeNode, 3));
  }

  @Test
  void testDrawLine() {
    assertEquals("---", TreePrinter.drawLine(3));
  }

  @Test
  void testSpacingBetweenNodes() {
    assertEquals("", TreePrinter.spacingBetweenNodes(1, 1));
    assertEquals("      ", TreePrinter.spacingBetweenNodes(1, -1));
  }

  @Test
  void testSpacingBetweenConnections() {
    assertEquals("", TreePrinter.spacingBetweenConnections(1, 1));
  }

}

