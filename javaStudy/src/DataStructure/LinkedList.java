package DataStructure;

import org.w3c.dom.Node;

//singleLinkedList
public class LinkedList<T> {
	
	public Node<T> head = null;
	
	public class Node<T>{
		T data;
		Node<T> next = null;
		
		public Node(T data){
			this.data = data;
		}
	}
	
	public void addNode(T data) {
		if(this.head == null) {
			this.head = new Node(data);
		} else {
			Node<T> node = this.head;
			while(node.next != null) {
				node = node.next;
			}
			node.next = new Node<T>(data);	
		}	
	}
	
	public void addFirst(T data) {
		if(this.head == null) {
			this.addNode(data);
		} else {
			Node<T> node = new Node<T>(data);
			node.next = this.head; 
			this.head = node;
		}
	}
	
	public void show() {
		if(this.head != null) {
			Node<T> node = this.head;
			System.out.println(node.data);
			while(node.next != null) {
				node = node.next;
				System.out.println(node.data);
			}
		}
	}
	
	public Node<T> search(T isData) {
		if(this.head == null) {
			return null;
		} else {
			Node<T> node = this.head;
			while( node != null) {
				if(node.data == isData) {
					return node;
				} else {
					node = node.next;
				}
			}
			return null;
		}
	}
	
	public void addInside(T data,T isData) {
		Node<T> searchNode = this.search(isData);
		if(searchNode == null) {
			this.addNode(data);
		} else {
			Node<T> node = new Node<T>(data);
			node.next = searchNode.next;
			searchNode.next = node;
		}
	}
	
	public boolean remove(T isData) {
		if(this.head == null) {
			return false;
		} else {
			Node<T> node = this.head; // 삭제할 노드가 헤드인 경우
			if(node.data == isData) {
				this.head = this.head.next;
				return true;
			} else {
				while(node.next != null) {
					if(node.next.data == isData) { // 현재 노드의 다음 노드가 찾는 노드일 경우
						node.next = node.next.next;
						return true;
					}
					node = node.next;
				}
				return false; //못찾았으니 false
			}
		}
	}
}
