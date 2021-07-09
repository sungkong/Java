package DataStructure;



//singleLinkedList
public class LinkedList<T> {
	
	public Node<T> head = null; // 첫 번째 노드 초기화.
	
	public class Node<T>{ // 
		
		T data;
		Node<T> next = null; // 다음 데이터 주소 초기화.
		
		public Node(T data) {
			this.data = data;
		}
	
	}
	
	/* 맨 마지막에 추가 */
	public void addNode(T data) {
		if(this.head == null) {
			this.head = new Node<>(data);
		} else {
			Node<T> node = this.head; // 맨 앞에서부터 순회.
			while(true) {
				if(node.next == null) {
					node.next = new Node<T>(data);
					break;
				} else {
					node = node.next;
				}	
			}
		}
	}
	
	public void addFirst(T data) {
		if(this.head == null) {
			this.head = new Node(data);
		} else{
			Node<T> node = this.head;
			this.head = new Node<T>(data);
			head.next = node;
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
	
	public Node<T> search(T isData) {
		if(this.head == null) {
			System.out.println("텅 빔");
			return null;
		} else {
			Node<T> node = this.head;
			while(node != null) {
				if(node.data == isData) {
					System.out.println(node.data + "있습니다.");
					return node;
				} else {
					node = node.next;
				}
			}
			return null;
		}
	}
	
	public void addInside(T findData,T addData) {
		Node<T> searchNode = this.search(findData);
		if(searchNode == null) {
			System.out.println("찾는 데이터가 없습니다.");
		} else {
			Node<T> nodeNext = searchNode.next;
			searchNode.next = new Node<T>(addData);
			searchNode.next.next = nodeNext;
		}
	}
	
	public boolean remove(T findData) {
		if(this.head == null) {
			System.out.println("텅 빔");
			return false;
		} else {
			Node<T> node = this.head;
				if(node.data == findData) {
					this.head = this.head.next;
					return true;
				} else {
					while(node.next != null) {
						if(node.next.data == findData) {
							node.next = node.next.next;
							return true;
						} else {
							node = node.next;
						}					
				}
				return false;
			}
		}
	}
}
