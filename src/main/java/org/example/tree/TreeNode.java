package org.example.tree;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public class TreeNode {

    private int data;
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

    public static void main(String[] args) {
        new TreeNode();
    }



}
