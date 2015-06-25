package com.pattern.composite;

import java.util.Enumeration;
import java.util.Vector;

/**
 * User: May
 * Date: 2015-06-25
 * Time: 14:27
 */
public class TreeNode {
    private String name;
    TreeNode parent;
    Vector<TreeNode> children;

    public TreeNode(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

    public void addChildren(TreeNode child) {
        children.add(child);
    }

    public void removeChildren(TreeNode child) {
        children.remove(child);
    }

    public Enumeration<TreeNode> getChildren() {
        return children.elements();
    }

}
