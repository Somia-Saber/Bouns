/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverse;

/**
 *
 * @author somia saber
 */
public class Node {
        int data;
        Node next;
        Node previous;
        public Node(int data){
            this.data = data;
            next = null;
            previous=null;
        }
    }