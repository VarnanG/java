package com.wipro.java.collection;

//Node class to represent each element in the linked list
class Node {
 int data;       // Data stored in the node
 Node next;      // Reference to the next node

 // Constructor to create a new node
 public Node(int data) {
     this.data = data;
     this.next = null;
 }
}

//LinkedList class to manage the list
class LinkedList {
 private Node head;  // Head of the linked list

 // Constructor to initialize an empty linked list
 public LinkedList() {
     this.head = null;
 }

 // Method to add a node at the end of the linked list
 public void add(int data) {
     Node newNode = new Node(data);  // Create a new node
     if (head == null) {
         head = newNode;  // If the list is empty, make the new node the head
     } else {
         Node current = head;
         while (current.next != null) {
             current = current.next;  // Traverse to the end of the list
         }
         current.next = newNode;  // Add the new node at the end
     }
     System.out.println("Added: " + data);
 }

 // Method to display the linked list
 public void display() {
     if (head == null) {
         System.out.println("The list is empty.");
         return;
     }
     Node current = head;
     System.out.print("Linked List: ");
     while (current != null) {
         System.out.print(current.data + " -> ");
         current = current.next;
     }
     System.out.println("null");
 }

 // Method to delete a node by value
 public void delete(int data) {
         System.out.println(data + " not found in the list.");
     }
 }


//Main class to test the linked list
public class UserCreatedLinkedList {
 public static void main(String[] args) {
     LinkedList list = new LinkedList();  // Create a new linked list

     // Add elements to the linked list
     list.add(10);
     list.add(20);
     list.add(30);
     list.add(40);

     // Display the linked list
     list.display();

     // Delete an element from the linked list
     list.delete(20);
     list.display();

     list.delete(50);  // Attempt to delete a non-existent element
     list.display();
 }
}