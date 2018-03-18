package com.yonyou.scf.Gateway;

import java.util.AbstractSequentialList;
import java.util.ListIterator;

public class MyLinked extends AbstractSequentialList{
	
	private Node head;
	
	
	public MyLinked() {
		head = new Node(null,null);
	}

	public void setHeader(Object o) {
		Node h = head;
		Node newNode = new Node();
		newNode.next = h.next;
		newNode.e = o;
		h.next = newNode;
	}
	
	public void setLast(Object o) {
		Node temp = head;
		while(temp.next!=null) {
			temp = temp.next;
		}
		setAfterE(o,temp);
	}
	
	private void setAfterE(Object t, Node n) {
		Node newNode = new Node();
		newNode.next = null;
		newNode.e = t;
		n.next = newNode;
	}
	
	public void setPosition(Object o, int index) {
		Node temp = head;
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}
		setAfterE(o,temp);
	}
	public Object select(int index) {
		Node temp = head;
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}
		return temp.e;
	}
	
	public void selectAll() {
		Node temp = head;
		Node c;
		while((c = temp.next)!=null) {
			System.out.println(c.e);
			temp=temp.next;
		}
	}
	
	public void delete(int index) {
		Node temp = head;
		for (int i = 0; i < index-1; i++) {
			temp = temp.next;
		}
		temp.next.e=null;
		temp.next = temp.next.next;
		temp.next.next = null;
	}
	private class Node{
		Object e;
		Node next;
		public Object getE() {
			return e;
		}
		public void setE(Object e) {
			this.e = e;
		}
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
		public Node(Object e, Node next) {
			this.e = e;
			this.next = next;
		}
		public Node() {
		}
		
	}
	@Override
	public ListIterator listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		
		return 0;
	}
}
