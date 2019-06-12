package com.thoughtworks.collection;

public class SingleLink<T> {
	private Node head = null;
	private Node tail = null;
	
	class Node{
		private T item;
		private Node next;
		Node(T item){
			this.item = item;
			this.next = null;
		}
	}
	
	 // 添加尾指针
    public void addTailPointer(T item){
        Node node = new Node(item);
        if(tail != null){
        	tail.next = node;
        	tail = tail.next;
        } else {
        	tail = head =node;
        }
    }
    
    public T getNode(int index){//index为第几位数
    	Node cur = head.next;
    	for (int i = 0; i < index; i++) {
			cur = cur.next;
		}
    	return cur.item;
    };
}