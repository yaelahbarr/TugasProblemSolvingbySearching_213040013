/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IntelegensiaBuatan;

import IntelegensiaBuatan.Node;
import IntelegensiaBuatan.Labirin;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
/**
 *
 * @author wdead
 */
public class BreadthFirstSearch {
     public void search(Labirin labirin, Node start, Node goal) {
        Queue<Solusi> queue = new LinkedBlockingQueue<>();
        Solusi solusiStart = new Solusi();
        solusiStart.setNode(start);
        queue.add(solusiStart);
        System.out.println("Mencari solusi dari (" + start.getX() + "," + start.getY() +
                ") ke (" + goal.getX() + "," + goal.getY() + ")");

        while (!queue.isEmpty()) {
            Solusi eval = queue.poll();
            System.out.println("Evaluasi: (" + eval.getNode().getX() + "," + eval.getNode().getY() + ")");

            if (eval.getNode().equals(goal)) {
                System.out.println("Solusi ditemukan: ");
                for (Node node : eval.getNodes()) {
                    System.out.print("(" + node.getX() + "," + node.getY() + ") -> ");
                }
                System.out.println("(" + eval.getNode().getX() + "," + eval.getNode().getY() + ")");
                break;
            } else {
                System.out.println("Suksesor (" + eval.getNode().getX() + "," + eval.getNode().getY() + ")");
                for (Node successor : eval.getNode().getTetangga()) {
                    System.out.print("(" + successor.getX() + "," + successor.getY() + ") ");
                    Solusi solusiSuksesor = new Solusi();
                    solusiSuksesor.setNode(successor);
                    solusiSuksesor.setNodes(eval.getNodes());
                    solusiSuksesor.getNodes().add(eval.getNode());

                    queue.offer(solusiSuksesor);
                }
                System.out.println();
                System.out.println();
            }
        }
    }
     
     public static void main(String[] args) {
        // Inisialisasi labirin
        int[][] labirinGrid = {
                {0, 1, 0, 0, 0},
                {0, 1, 0, 1, 0},
                {0, 0, 0, 1, 0},
                {1, 1, 1, 1, 0},
                {0, 0, 0, 0, 0}
        };

        Labirin labirin = new Labirin(labirinGrid);

        // Inisialisasi node start dan goal
        Node start = new Node(0, 0, 0);
        Node goal = new Node(4, 4, 0);

        // Inisialisasi objek BreadthFirstSearch dan lakukan pencarian
        BreadthFirstSearch bfs = new BreadthFirstSearch();
        bfs.search(labirin, start, goal);
    }
}
