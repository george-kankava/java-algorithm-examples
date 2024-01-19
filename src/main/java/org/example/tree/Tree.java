package org.example.tree;

import lombok.ToString;


@ToString
public class Tree {
    TreeNode root;
    public void insert(int data) {
        if (root == null) {
            root = new TreeNode(data);
        } else {
            root.insert(data);
        }

    }

    @ToString
    public static class TreeNode {

        private final int data;
        private TreeNode leftChild;
        private TreeNode rightChild;

        public TreeNode(int data) {
            this.data = data;
        }

        public void insert(int data) {
            if (this.data == data) {
                return;
            }
            if (this.data > data) {
                if (leftChild == null) {
                    leftChild = new TreeNode(data);
                } else {
                    leftChild.insert(data);
                }
            } else {
                if (rightChild == null) {
                    rightChild = new TreeNode(data);
                } else {
                    rightChild.insert(data);
                }
            }
        }
    }

    /*
    public void add(int data) {
        System.out.println(data);
        if (root == null) {
            root = new TreeNode(data);
        } else {
            add(data, root);
        }
    }


    public void add(int data, TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        if (data < treeNode.getData()) {
            add(data, treeNode.getLeftChild());
            if (treeNode.getLeftChild() == null) {
                treeNode.setLeftChild(new TreeNode(data));
            }
        } else {
            add(data, treeNode.getRightChild());
            if (treeNode.getRightChild() == null) {
                treeNode.setRightChild(new TreeNode(data));
            }
        }
    }
     */

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(1);
        tree.insert(5);
        tree.insert(10);
        tree.insert(15);
//        tree.insert(-5);
//        tree.insert(-10);
//        tree.insert(-15);
//        tree.insert(-12);
//        tree.insert(20);
//        tree.insert(18);
        System.out.println(tree);
    }

}
