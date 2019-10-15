package DataStructure;

public class LinkedList {
	private int size;
	private Node head;

	public LinkedList() {
		this.head = null;
		size = 0;
	}

	public void push(String value) {
		// TODO Auto-generated method stub

		Node newnode = new Node();
		newnode.value = value;
		newnode.next = this.head;

		this.head = newnode;
		size++;
	}

	public int size() {
		// TODO Auto-generated method stub
		return this.size;
	}

	public String get(int i) {
		// TODO Auto-generated method stub
		Node curr = this.head;
		for (int j = 0; j < i; j++) {
			curr = curr.next;
		}
		return curr.value;
	}

	private static class Node {
		public Node next;
		public String value;
	}

	public String remove(int i) {
		// TODO Auto-generated method stub
		if (size == 1) {
			String returner = this.get(i);
			this.head = null;
			this.size = 0;
			return returner;
		}
		size--;
		String temp = this.get(i);
		Node curr = this.head;
		for (int j = 0; j < i; j++) {
			curr = curr.next;
		}
		curr.value = curr.next.value;
		curr.next = curr.next.next;
		return temp;
	}
}
