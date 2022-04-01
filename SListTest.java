package s4;

public class SListTest {
	public static void main(String[] args){
		SList<String> s = new SList<String>();
		s.insertFront("orange"); s.insertFront("apple");
		s.insertAfter("cherry", s.head.getNext());
		s.insertFront("pear");
		s.print();
		
		System.out.println(": s의 길이 = " + s.size());
		System.out.println("체리가 \t" + s.search("cherry") + "번째 있다");
		System.out.println("키위가 \t" + s.search("kiwi") + "번째 있다");
		
		
		
	}
}
