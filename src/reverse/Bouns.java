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
public class Bouns {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args)
    {
        linkedList l = new linkedList();

       l.insertFirst(1);
       l.insertLast(2);
       l.insertLast(3);

        System.out.println("Original linked list ");
         l.displayForward();

        l.reverse();
        System.out.println("The reversed Linked List is ");
         l.displayForward();

    }
}

