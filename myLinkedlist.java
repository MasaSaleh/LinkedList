/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ll;

/**
 *
 * @author PC LAND
 */
public class myLinkedlist {
    Node head,tail;
        int size=0;
    
    void addFirst(int v){
        Node nodo=new Node(v);
        if (head == null) {
             head = nodo; 
             tail = nodo; } 
        else { 
            nodo.next = head;
            head = nodo; }
     size++; }
     
    boolean isEmpty(){
        if(head==null){
            return true;}
    
        else{
            return false;}
          }
       
    void clear(){
        head=null;
        tail=null;
        size=0;
          }
    
    void addLast(int v){
        Node nodo=new Node(v);
        if(isEmpty()){
            head=nodo;
            tail=nodo;}
          
        else{
            tail.next=nodo;
            tail=nodo;}
            size++;
          }
     void addbyindex(int index, int value) {
        Node nodo = new Node(value); 
        int i = 0; 
        Node cur = head;
        if (head == null) { 
            head = nodo;
            tail = nodo; } 
        else {
        while (cur != null) { 
           if (i == index - 1) {
               break; }
           cur = cur.next;
           i++; } 
        nodo.next = cur.next;
    cur.next = nodo; size++; } }
    
    void RemoveByIndex(int index){
    Node cur=head;
    int i=0;
         while(cur!=null){
           if(i==index-1){break;}
              cur=cur.next;
              i++;}
         cur.next=cur.next.next;
         size--;  }
    
    void RemoveFirst(){
        Node cur=head;
        head=head.next;
        size--;
        cur.next=null;}
         
    void RemoveLast(){
         Node cur=head;
            while(cur.next.next!=null){
              cur=cur.next;}
    cur.next=null;
    tail=cur;
    size--;  }
    
    int get(int index){
    Node cur=head;
    int i=0;
      while(cur!=null){
         if(i==index){return cur.value;}
    cur=cur.next;
    i++;}
    return -1000;}
    
    
    
    int IndexOf(int v){
    Node cur=head;
    int i=0;
       while(cur!=null){
         if(cur.value==v){
         return i;}
         cur=cur.next;
         i++;}
       return -1;}
      
    void set(int index,int v){
    Node cur=head;
    int i=0;
        while(cur!=null){
           if(i==index){
             cur.value=v;
             return ;}
        cur=cur.next;
        i++;}}
    
    boolean contairs(int v){
      return(IndexOf(v)!=-1);}
    
    void rotR(){
       Node cur=head;
       while(cur.next.next !=null){cur=cur.next;}
      
       cur.next.next=head;
    
       head=cur.next;
    
       cur.next=null; }
    
    void rotL(){
    
      Node cur=head;
      while(cur.next!=null){cur=cur.next;}
      
      cur.next=head;
      
      head=head.next;
      
      cur.next.next=null;}
    
    
    Node mid(){
      Node fast=head;
      Node slow=head;
        
        while(fast!=null && slow!=null){
            fast=fast.next.next;
            slow=slow.next;}
            return slow;}
    
    
    void Reverse(){
      Node pre=null;
      Node cur=head;
      
       while(cur!=null){
           Node nexto=cur.next;
           cur.next=pre;
           pre=cur;
           cur=nexto;}
       head=pre;}
    
    
    
    void printo() { 
        Node cur = head;
        while (cur!= null){ 
           System.out.print(cur.value + " ");
           cur = cur.next; }
        System.out.println(" ");}
    
    
    void printList(Node head){
    Node cur = head;
        while (cur!= null){ 
           System.out.print(cur.value + " ");
           cur = cur.next; }
        System.out.println(" ");}
    
    
    Node[] split() { 
        Node mid = mid();
        Node pre = head; 
        while (pre != null) {
       if (pre.next.equals(mid)) { 
           break;}
        pre = pre.next; }
         pre.next = null; 
    return new Node[]{pre, mid}; }
    
    
    
    myLinkedlist link(myLinkedlist l1, myLinkedlist l2){ 
    Node cur1 = l1.head;
    Node cur2 = l2.head; 
    myLinkedlist l3 = new myLinkedlist(); 
    
       while (cur1 != null || cur2 != null) {
        if (cur1 != null) {
           l3.addLast(cur1.value);
           cur1 = cur1.next; }
        if (cur2 != null) {
           l3.addLast(cur2.value); 
           cur2 = cur2.next; } }
             return l3; }

//    int sum(){
//    Node cur=head;int sum=0;
//    while(cur!=null){
//    sum+=cur.value;
//    cur=cur.next;
//    }
//    return sum;
//    }
    
    
    
    

}

