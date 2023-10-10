/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IntelegensiaBuatan;

import IntelegensiaBuatan.Node;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author wdead
 */
public class Solusi {
    private List<Node> nodes;
    private Node node;

    public Solusi() {
        nodes = new ArrayList<>();
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public Node getNode() {
        return node;
    }

    public void setNodes(List<Node> nodes) {
        this.nodes = new ArrayList<>(nodes);
    }

    public List<Node> getNodes() {
        return nodes;
    }
}
