package DataStructure;

public class DoublyLinkedList<T> {
	
	Node<T> head = null; // 처음
	Node<T> tail = null; // 마지막

	public class Node<T>{

		T data;
		
		Node<T> prev = null; //앞 노드
		Node<T> next = null; //뒤 노드
		
		public Node(T data) {
			this.data = data;
		}
	}
	//마지막 노드에 추가하기.
	public void addNode(T data) {
		if(this.head == null) {
			this.head = new Node<T>(data);
			this.tail = this.head;
		} else {
			Node<T> node = this.head;
			while(true) {
				if(node.next == null) {
					node.next = new Node<T>(data);
					this.tail = node.next;
					node.next.prev = node;
					break;
				} else {
					node = node.next;
				}
			}
		}
	}
	
	public void show() {
		if(this.head == null) {
			System.out.println("텅 빔");
		} else {
			Node<T> node = this.head;
			System.out.println(node.data);
			while(node.next != null) {
				node = node.next;
				System.out.println(node.data);
			}
		}
	}
		
	public Node<T> searchFromHead(T isData) {
		if(this.head == null) {
			System.out.println("텅 빔");
			return null;
		} else {
			Node<T> node = this.head;
			while(node != null) {
				if(node.data == isData) {
					System.out.println(isData + "존재");
					return node;
				} else {
					node = node.next;
				}
			}
			return null;
		}
	}
	
	public Node<T> searchFromTail(T isData){
		if(this.tail == null) {
			System.out.println("텅 빔");
			return null;
		} else {
			Node<T> node = this.tail;
			while(node != null) {
				if(node.data == isData) {
					System.out.println(isData + "존재");
					return node;
				} else{
					node = node.prev;
				}
			}
			return null;
		}
	}
	
	// 찾는 노드 앞에 추가하기
	public boolean insertToFront(T existedData, T addData) {
			if(this.head == null) {
				this.head = new Node<T>(addData);
				this.tail = this.head;
				return true;
			} else if(this.head.data == existedData){
				Node<T> node = new Node<T>(addData);
				node.next = this.head;
				return true;
			} else {	
				Node<T> node = this.head;
				while(node != null) {
					if(node.data == existedData) {
						Node<T> nodePrev = node.prev;
						
						node.prev = new Node<T>(addData);
						node.prev.next = node;
						node.prev.prev = nodePrev;
						nodePrev.next = node.prev;
						
						return true;
					} else {
						node = node.next;
					}
				
				}
				return false;
			}
		}
		
	//찾는 노드 뒤에 추가하기
	public boolean insertToNext(T existedData,T addData) {
		if(this.head == null) {
			this.head = new Node<T>(addData);
			this.tail = this.head;
			return true;
		} else {
			Node<T> node = this.head;
			
				while(node.next != null) {
					if(node.data == existedData) {
						Node<T> nodeNext = node.next;
						
						node.next = new Node<T>(addData);
						node.next.prev = node;
						node.next.next = nodeNext;
						nodeNext.prev = node.next;
						return true;
					} else {
						node = node.next;
					}
				
				}
				return false;
			}
			
	} 
}

