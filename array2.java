package s3;

import java.util.Scanner;

public class array2 {

	public static void arrDel(int[] abc, int ii) {
		int i;
		for (i = ii; i < abc.length-1; i++) {
			abc[i] = abc[i+1];
		}
		abc[i] = 0;
	}
	
	public static void main(String[] args) {
		int i, idx;
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 index 입력 : ");
		idx = sc.nextInt();
		int[] def = {10,20,30,40,50};
		arrDel(def,idx);
		for (i = 0; i < def.length; i++) {
			System.out.print(def[i]);
		}
	}

}
