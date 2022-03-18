package week3;

public class Basic2 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("1,3,5,7,9");
        for (int i = 1; i < 10; i +=2 ) {
        	System.out.println(i);
        }
        for (int i =1; i <10; i++) {
        	if(i%2 == 0)
        		continue;
        	System.out.println(i);
        }
        for (int k = 0; k < 10; k++) {
        	System.out.println(k);
        }
	}

}