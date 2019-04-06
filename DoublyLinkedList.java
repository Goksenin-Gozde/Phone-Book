/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg05160000241_05160000163.proje2;


public class DoublyLinkedList{
public class Node{

    private Bilgi data;
    private Node next;
    private Node prev;
    
    
    public Node(Bilgi kisi){
    this.data = kisi;
    }
}
private Node head= null;
private Node tail = null;

public String toString(){
return tail.data.getAdSoyad();
}

public Node siraliEkle(Bilgi data){

Node insert = new Node(data);
    insert.data = data;

    
    if (head == null) {
        head = insert;
        
    }
    
    else if (data.getAdSoyad().compareToIgnoreCase(head.data.getAdSoyad())<0) {
        insert.next = head;
        head.prev = insert;
        head = insert;
    }
    
    else {
        Node current = head;
        
        while (current.next != null && data.getAdSoyad().compareToIgnoreCase(current.data.getAdSoyad())>0) {
            current = current.next;
        } 

        
        if (data.getAdSoyad().compareToIgnoreCase(current.data.getAdSoyad())<0) {
            Node previous = current.prev;

            
            previous.next = insert;
            insert.prev = previous;
            
            insert.next = current;
            current.prev = insert;
        }
        
        else {
            current.next = insert;
            insert.prev = current;
            
            
            
        }
    }

    return head;
}



public void listeyiYazdir()
    {
        Node position = head;
        while (position != null)
        {
            System.out.println(position.data );
            position = position.next;
        }
    }
public void terstenYazdir()
    {
        
        Node position = head;
        while (position.next != null)
        {
            position = position.next;
        }
        tail = position;
        while (tail != null)
        {
            System.out.println(tail.data );
            tail = tail.prev;
        }
    }

public void verileniYazdir(String adSoyad)
    {
        Node position = head;
        
        while (position != null)
        {
            if(position.data.getAdSoyad().equalsIgnoreCase(adSoyad)){
                System.out.println(position.data);
                return;
            }
            else{    
            position = position.next;
            }
            }
        System.out.println("Girdiğiniz isim rehberde bulunamadı");
    }
public boolean bosMu(){

    return (head == null);
}

public void kisiyiSil(String adSoyad){

Node position = head;
        
        while (position != null)
        {
            if(position.data.getAdSoyad().equalsIgnoreCase(adSoyad)){
                if(position == head){
                head = position.next;
                return;
                }
                
                position.prev.next = position.next;
                
                return;
            }
            else{    
            position = position.next;
            }
            }
        System.out.println("Girdiğiniz isim rehberde bulunamadı");
}

}

   
    
