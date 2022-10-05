package com.datastructure.datastructure.linkedlist;

//[자료구조 알고리즘] LinkedListNode의 구현 in Java
//첫번째 값이 지워질 수 없었으나 LinkedListNode의 구현을 통해 지울 수 있게함.

class LinkedList {
    Node header;
    static class Node{
        int data;
        Node next = null;
    }

    LinkedList(){
        header = new Node();
    }

    void append(int d){
        Node end = new Node();
        end.data = d;
        Node n = header;
        while(n.next != null) {
            n = n.next;
        }
        n.next = end;
    }

    void delete(int d){
        Node n = header;
        while(n.next != null) {
            if(n.next.data == d){
                n.next = n.next.next;
            } else {
                n = n.next;
            }
        }
    }

    void retrieve(){
        Node n = header.next;
        while(n.next != null) {
            System.out.print(n.data + "->");
            n = n.next;
        }
        System.out.println(n.data);
    }
}

public class LinkedListNode {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.append(1);
        ll.append(2);
        ll.append(3);
        ll.append(4);
        ll.retrieve();
        ll.delete(1);
        ll.retrieve();


    }
}
