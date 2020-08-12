import java.util.Scanner;

public class LinkedListUse {

  // Taking input to construct a linked list
  public static Node<Integer> takeInput() {
    Scanner s = new Scanner(System.in);
    int data = s.nextInt();
    Node<Integer> head = null, tail = null;
    while (data != -1) {
      Node<Integer> newNode = new Node<Integer>(data);
      if (head == null) {
        head = newNode;
        tail = newNode;
      } else {
        tail.next = newNode;
        tail = newNode;
      }
      data = s.nextInt();
    }
    s.close();
    return head;
  }

  // Printing a linked list
  public static void printList(Node<Integer> head) {
    if (head == null)
      return;

    Node<Integer> temp = head;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.println();
  }

  public static void main(String args[]) {
    Node<Integer> head = takeInput();
    printList(head);

  }
}