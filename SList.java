package s4;

import java.util.NoSuchElementException;
public class SList <E extends Comparable<E>> {
	
	protected Node head;  // 연결 리스트의 첫 노드 가리킴
	private   int  size;
	public Node getHead() { return head; }
	public void setHead(Node n) { head= n;}
	public SList(){       // 연결 리스트 생성자
		head = null;
		size = 0;
	}
	public int size() { return size; }
	public boolean isEmpty() { return size == 0; }

	public void insertFront(E newItem){ // 연결리스트 맨 앞에 새 노드 삽입
		head = new Node(newItem, head);
		size++;
	}
	
	public void insertAfter(E newItem, Node p){ // 노드 p 바로 다음에 새 노드 삽입
		p.setNext(new Node(newItem, p.getNext()));
		size++;
	}
}	