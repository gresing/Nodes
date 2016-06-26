package main;

import java.util.ArrayList;
import java.util.List;


public class Node {

    private boolean isRoot;

    private Node parent;

    private List<Node> childes = new ArrayList<>();

    private int parameterForComparison;

    public void addChild(Node n) {
        childes.add(n);
    }

    public Node(boolean isRoot, Node parent, int parameterForComparison) {

        this.isRoot = isRoot;
        this.parent = parent;
        // this.childes = childes;
        this.parameterForComparison = parameterForComparison;
        if (parent != null) {
            parent.addChild(this);
        }
    }

    public void setChildes(ArrayList<Node> childes) {
        this.childes = childes;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Node node = (Node) o;

        if (isRoot != node.isRoot) return false;
        if (parameterForComparison != node.parameterForComparison) return false;
        return childes != null ? childes.equals(node.childes) : node.childes == null;

    }

    @Override
    public int hashCode() {
        int result = (isRoot ? 1 : 0);
        result = 31 * result + (childes != null ? childes.hashCode() : 0);
        result = 31 * result + parameterForComparison;
        return result;
    }


    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }


}
