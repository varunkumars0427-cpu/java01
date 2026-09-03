package day13;

public class Demo5 {
	    static class Node {
	        int data;
	        Node next;

	        Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	    static Node merge(Node list1, Node list2) {
	        Node dummy = new Node(0);
	        Node current = dummy;

	        while (list1 != null && list2 != null) {
	            if (list1.data <= list2.data) {
	                current.next = list1;
	                list1 = list1.next;
	            } else {
	                current.next = list2;
	                list2 = list2.next;
	            }
	            current = current.next;
	        }

	        if (list1 != null)
	            current.next = list1;
	        else
	            current.next = list2;

	        return dummy.next;
	    }

	    static void printList(Node head) {
	        while (head != null) {
	            System.out.print(head.data + " ");
	            head = head.next;
	        }
	    }

	    public static void main(String[] args) {

	        Node list1 = new Node(1);
	        list1.next = new Node(2);
	        list1.next.next = new Node(4);

	        Node list2 = new Node(1);
	        list2.next = new Node(3);
	        list2.next.next = new Node(4);

	        Node result = merge(list1, list2);

	        printList(result);
	    }
	}

