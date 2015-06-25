package com.pattern.composite;

/**
 * User: May
 * Date: 2015-06-25
 * Time: 14:31
 */
public class Tree {

    TreeNode root;

    public Tree(String name) {
        this.root = new TreeNode(name);
    }

    public static void main(String[] args) {
        Tree test = new Tree("A");
        TreeNode b = new TreeNode("B");
        TreeNode c = new TreeNode("C");

        b.addChildren(c);
        test.root.addChildren(b);
    }
}
