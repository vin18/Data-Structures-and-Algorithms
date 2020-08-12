
public class ReverseLL {

  // Reverse a linked list (iteratively) - O(N)
  public static Node<Integer> reverseLLI(Node<Integer> head) {
    if (head == null || head.next == null) {
      return head;
    }
    Node<Integer> curr = head;
    Node<Integer> prev = null;
    Node<Integer> temp;

    while (curr != null) {
      temp = curr.next;
      curr.next = prev;
      prev = curr;
      curr = temp;
    }
    return prev;
  }

  // Reverse a linked list (double node recursively) - O(N)
  public static Node<Integer> reverseLLR2(Node<Integer> head) {
    if (head == null || head.next == null) {
      return head;
    }

    Node<Integer> reverseTail = head.next;
    Node<Integer> smallHead = reverseLLR2(head.next);
    reverseTail.next = head;
    head.next = null;

    return smallHead;
  }

  // Reverse a linked list (recursively) - O(N)
  public static DoubleNode reverseLLRBetter(Node<Integer> head) {
    if (head == null || head.next == null) {
      DoubleNode ans = new DoubleNode();
      ans.head = head;
      ans.tail = head;
      return ans;
    }
    DoubleNode smallAns = reverseLLRBetter(head.next);
    smallAns.tail.next = head;
    head.next = null;

    DoubleNode ans = new DoubleNode();
    ans.head = smallAns.head;
    ans.tail = head;
    return ans;
  }

  // Reverse a linked list (recursively) - O(N^2)
  public static Node<Integer> reverseLLR(Node<Integer> head) {
    if (head == null || head.next == null) {
      return head;
    }

    Node<Integer> finalHead = reverseLLR(head.next);
    Node<Integer> temp = finalHead;
    while (temp.next != null) {
      temp = temp.next;
    }
    temp.next = head;
    head.next = null;
    return finalHead;
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
    Node<Integer> node1 = new Node<Integer>(10);
    Node<Integer> node2 = new Node<Integer>(20);
    Node<Integer> node3 = new Node<Integer>(30);
    Node<Integer> node4 = new Node<Integer>(40);
    Node<Integer> node5 = new Node<Integer>(50);

    node1.next = node2;
    node2.next = node3;
    node3.next = node4;
    node4.next = node5;

    Node<Integer> head = node1;
    // head = reverseLLR(head);
    // DoubleNode ans = reverseLLRBetter(head);
    // head = reverseLLR2(head);
    head = reverseLLI(head);

    printList(head);
  }
}

class DoubleNode {
  Node<Integer> head;
  Node<Integer> tail;

}