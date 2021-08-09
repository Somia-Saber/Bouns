/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doubleLinkedList;


/**
 *
 * @author somia saber
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DoubleLinkedList l = new DoubleLinkedList();
        //Add nodes to the list
        l.addNode(10);
        l.addNode(20);
        l.addNode(30);
        l.addNode(40);
        l.addNode(50);

        l.printNodes();    }
    
}
