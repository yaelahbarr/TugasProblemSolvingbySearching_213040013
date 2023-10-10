/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IntelegensiaBuatan;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wdead
 */
public class Node {
    private int nilai;
    private int x;
    private int y;
    private List<Node> tetangga;

    public Node(int nilai, int x, int y) {
        this.nilai = nilai;
        this.x = x;
        this.y = y;
        this.tetangga = new ArrayList<>();
    }

    public int getNilai() {
        return nilai;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public List<Node> getTetangga() {
        return tetangga;
    }

    public void tambahTetangga(Node tetangga) {
        this.tetangga.add(tetangga);
    }
}
