/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polynomial;

/**
 *
 * @author somia saber
 */
public class Node {
    int coeff;
    int pow;
    Node next;
    Node previous;
    Node(int a, int b)
    {
        coeff = a;
        pow = b;
        next = null;
        previous=null;
    }
}