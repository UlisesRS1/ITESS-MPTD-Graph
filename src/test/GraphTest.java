package test;

import MTPD_EyOP.Graph;

public class GraphTest {
    
    
    public static void main(String[] args) {
        Graph defaulGraph = new Graph();
        
        System.out.println("Graph default constructor ----------");
        System.out.println(defaulGraph.toString());
        
        defaulGraph.setVertex(3);
        System.out.println(defaulGraph.toString());
        
        defaulGraph.setEdge(0, 1);
        defaulGraph.setEdge(1, 2);
        defaulGraph.setEdge(0, 2);
        
        System.out.println(defaulGraph.toString());
        
        // Crear una instancia graph con constructor con vertices
        System.out.println("Graph params constructor ----------");
        Graph paramGraph = new Graph(5);
        
        System.out.println(paramGraph.toString());
        
    }
}
