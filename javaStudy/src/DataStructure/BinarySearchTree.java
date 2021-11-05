package DataStructure;

public class BinarySearchTree {

	public Node head = null;
	
	public class Node {
		public Node left;
		public Node right;
		public int value;
		
		public Node(int value) {
			this.left = null;
			this.right = null;
			this.value = value;
		}
	}
	
	public boolean insertNode(int value) {
		if(this.head == null) {
			this.head = new Node(value);
		} else {
			Node findNode = this.head;
			while(true) {
				if(value < findNode.value) {
					if(findNode.left != null) {
						findNode = findNode.left;
					} else {
						findNode.left = new Node(value);
						break;
					}
				} else if(value > findNode.value) {
					if(findNode.right != null) {
						findNode = findNode.right;
					} else {
						findNode.right = new Node(value);
						break;
					}
				}
			}
		}
		return true;
	}
	
	public Node searchNode(int value) {
		if(this.head == null) {
			return null;
		} else {
			Node findNode = this.head;
			while(findNode != null) {
				if(findNode.value == value) {
					return findNode;
				} else if(value < findNode.value){
					findNode = findNode.left;
				} else if(value > findNode.value) {
					findNode = findNode.right;
				}
			}
			return null;
		}
	}
	
	public boolean deleteNode(int value) {
		boolean searched = false;
		Node currNode = this.head;
		Node currParentNode = this.head;
		
		// 노드가 하나도 없을 때
		if(this.head == null) {
			return false;
		} else {
			// 노드가 하나만 있고, 해당 노드가 삭제할 노드일 때
			if(this.head.value == value && this.head.left == null && this.head.right == null) {
				this.head = null;
				return true;
			} 
		}
		// 검색
		while(currNode != null) {
			if(currNode.value == value) {
				searched = true;
				break;
			} else if(currNode.value < value) {
				if(currNode.right != null) {
					currParentNode = currNode;
					currNode = currNode.right;
				}
			} else {
				currParentNode = currNode;
				currNode = currNode.left;
			}
		}
		
		if(searched == false) {
			return false;
		} else {
			// 삭제할 노드가 leaf 노드 인 경우
			if(currNode.left == null && currNode.right == null) {
				if(value < currParentNode.value) {
					currParentNode.left = null;
					currNode = null; // 안해도 되지만 명시적으로 표현
				} else {
					currParentNode.right = null;
					currNode = null;
				}
				return true;
			} else if(currNode.left != null && currNode.right == null) { // 삭제할 노드의 왼쪽 노드만 존재하는 경우
				if(value < currParentNode.value) {
					currParentNode.left = currNode.left;
					currNode = null;
				} else {
					currParentNode.right = currNode.left;
					currNode = null;
				}
				return true;
			} else if(currNode.left == null && currNode.right != null) { // 삭제할 노드의 오른쪽 노드만 존재하는 경우
				if(value < currParentNode.value) {
					currParentNode.left = currNode.right;
					currNode = null;
				} else {
					currParentNode.right = currNode.right;
					currNode = null;
				}
				return true;
			} else { // 삭제할 노드의 자식노드가 2개인 경우
				if(value < currParentNode.value) { // 삭제할 노드가 왼쪽에 있는 경우 삭제할 노드의 오른쪽 자식노드 중 가장 작은 값으로 교체한다.
					Node changeNode = currNode.right;
					Node changeParentNode = currNode.right;
					while(changeNode.left != null) { 
						changeParentNode = changeNode;
						changeNode = changeNode.left;
					}
					// 여기까지 실행되면, changeNode에는 삭제할 노드의 오른쪽 노드 중에서, 가장 작은 값을 가진 Node가 들어가있다
					// changeNode의 오른쪽 노드가 없을 때
					if(changeNode.right == null) {
						changeParentNode.left = null;				
					} else {				
						changeParentNode.left = changeNode.right;				
					}
					currParentNode.left = changeNode;
					// parentNode의 왼쪽 자식노드가 교체되었고 이전의 노드의 자식들과 연결시켜줘야 한다.
					changeNode.right = currNode.right;
					changeNode.left = currNode.left;
					currNode = null;
				} else { // 삭제할 노드가 오른쪽에 있는 경우
					Node changeNode = currNode.right;
					Node changeParentNode = currNode.right;
					while(changeNode.left != null) { 
						changeParentNode = changeNode;
						changeNode = changeNode.left;
					}
					if(changeNode.right == null) {
						changeParentNode.left = null;				
					} else {				
						changeParentNode.left = changeNode.right;				
					}
					currParentNode.right = changeNode;
					changeNode.left = currNode.left;
					changeNode.right = currNode.right;
					currNode = null;
				}
				return true;
				
			}
		}

	}
	
	//전위 순회
	public void preOrder(Node root) {
		if(root != null) {
			System.out.println(" " + root.value);
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	
}
	
