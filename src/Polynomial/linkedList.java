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
public class linkedList {
        Node head;
        Node tail;
         Node start1;
         Node cur1;
          Node  start2;
          Node  cur2;
        int elementCount;
        public linkedList(){
            head = null;
            tail =null;
            elementCount = 0;
             start1 = null; 
             cur1 = null;
             start2 = null;
             cur2 = null;

        }
        
        public boolean isEmpty(){
            return (elementCount == 0);
        }
        public  void insertFirst(int d,int d1){
            Node myNode = new Node(d,d1);
            if (isEmpty()){
                head =tail= myNode;
                
            }
            else{
                head.previous=myNode;
                myNode.next = head;
                head = myNode;
            }
            elementCount++;
        }
        public void insertLast(int d,int d1){
            Node myNode = new Node(d,d1);
            if(isEmpty()){
                head =tail= myNode;
            }
            else{
               tail.next=myNode;
               myNode.previous=tail;
               tail=myNode;
            }
            elementCount++;
        }
        public void insertAt(int pos, int d,int d1){
            Node myNode = new Node(d,d1);
            if (pos == 0){
                insertFirst(d,d1);
            }
            else{
                Node temp = head;
                for (int i =0;i<pos-1;i++){
                    temp = temp.next;
                }
                myNode.next = temp.next;
                temp.next = myNode;
                myNode.previous=temp;
                temp.next.previous=myNode;
            }
            elementCount++;
        }
       
        public int count(){
            return elementCount;
        }
     
        
        public void Polynomial(){
            
         
        int[] list1_coeff = { 5, 4, 2 }; 
        int[] list1_pow = { 3, 2, 0 }; 
        int n = list1_coeff.length; 
        int i = 0;
        
        while (n-- > 0) {
            int a = list1_coeff[i];
            int b = list1_pow[i];

            Node ptr = new Node(a, b);

            if (start1 == null) {
                start1 = ptr;
                cur1 = ptr;
            }

            else {
                cur1.next = ptr;
                ptr.previous=cur1;
                cur1 = ptr;
            }

            i++;
        }
       
          Node trav = start1; 
        while (trav != null) {
            System.out.print(trav.coeff + "x^" + trav.pow);
            if (trav.next != null)
                System.out.print(" + ");
            trav = trav.next;
            
            
        }
        System.out.println("");
       
         int j=0; 
          System.out.println(list1_coeff[j]+","+list1_pow[j]+","+"next-->"+list1_coeff[j+1]+","+list1_pow[j+1]+"next-->"+list1_coeff[j+2]+","+list1_pow[j+2]+","+"next-->null");
       
        }
        
    }
        
        
