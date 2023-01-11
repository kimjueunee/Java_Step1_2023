package chapter05;

import java.util.Scanner;

public class Method {

	//멤버변수(=필드)
	
	//생성자 생략
	
	//메소드
	
	void makeBread() {
		System.out.println("빵을 만듭니다");
	}//method1
	void makeBread(int count) {
		//1번째 빵을 만들었습니다
		//2번째 빵을 만들었습니다
		//.....
		//요청하신 5개의 빵이 모두 완료되었습니다
		for(int i=0;i<count;i++) {
			System.out.println((i+1)+"번째 빵을 만들었습니다");
		}
		System.out.println("요청하신 "+count+"개의 빵이 모두 완료되었습니다");
	}//method2
	
	void makeBread(int count,String str) {
		//1번째 빵을 만들었습니다
		//2번째 빵을 만들었습니다
		//.....
		//요청하신 5개의 빵이 모두 완료되었습니다
		for(int i=0;i<count;i++) {
			System.out.println((i+1)+"번째 빵을 만들었습니다");
		}
		System.out.println("요청하신 "+count+"개의 "+str+"빵이 모두 완료되었습니다");
	}//method3
	
	void order() {
		
		boolean run=true;
		
		int bread=0;
		int bread2=0;
		String bread3;
		
		
		Scanner scan=new Scanner(System.in);
		
		while(run) {
			System.out.println("1.빵 갯수 선택 | 2.빵의 갯수와 종류 | 3.종료 ");
			System.out.print("선택> ");
			
			int selectNo=Integer.parseInt(scan.nextLine());
			
			if(selectNo==1) {
				System.out.print("주문할 빵의 갯수 : ");
				bread=Integer.parseInt(scan.nextLine());
				makeBread(bread);
			}
		else if(selectNo==2) {
			System.out.print("주문할 빵의 갯수 : ");
			bread2=Integer.parseInt(scan.nextLine());
			System.out.print("주문할 빵의 종류 : ");
			bread3=scan.nextLine();
			makeBread(bread2,bread3);
			}	
		else {
			run=false;
		}//if
	}//while
		System.out.println("프로그램 종료");

 }//order		
}//class
	    	
