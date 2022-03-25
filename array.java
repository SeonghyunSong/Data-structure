package s3;

import java.util.Scanner;

//배열 : 동일한 데이터타입
public class array {
	public static void main(String[] args) {
		int[] abc = new int[5];
//		int abc[];
//	    abc = new int[5];	
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < abc.length; i++) {
			System.out.println((i+1) + "n번째 정수 입력 : ");
			abc[i] = sc.nextInt();
		}

		for (int i = 0; i < abc.length; i++) {
			System.out.println(abc[i]);
		}
		
		int i;;
		int[] def = {10,20,30,40,50};
		
		for (i = 2; i < def.length-1; i++) {
			def[i] = def[i+1];
		}
		
		def[i] = 0; //마지막 배열 0
		for (i = 0; i < def.length; i++) {
			System.out.println(def[i]);
		}
	}
}
