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

    //[자료구조 알고리즘] Linked List 중복값 삭제 in Java
    void removeDups() {
        Node n = header;
        //마지막 값이 중복값이고 r이 그 중복값을 제거하고나면 n은 마지막에 도달했을 때 null이 되고 에러가 발생한다.
        while(n!=null && n.next!=null) {
            Node r = n;
            while(r.next != null){
                if(n.data == r.next.data){
                    r.next = r.next.next;
                } else {
                    r = r.next;
                }
            }
            n = n.next;
        }
    }
}

public class LinkedListNode {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.append(2);
        ll.append(2);
        ll.retrieve();

        ll.removeDups();
        ll.retrieve();
    }
}
