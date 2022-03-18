package week3;

import java.util.Scanner;

public class Basic3 {
    
	public static void main(String[] args) {
	Scanner scn= new Scanner(System.in);
	
    String name;
    System.out.println("이름을 입력하시오 : ");
    name = scn.next();
    if(name.equals("홍길동"))
    	System.out.printf("이름이 %s 입니다",name);
    else
    	System.out.printf("%s이 아닙니다", name);
    
    scn.close();
	}

}
