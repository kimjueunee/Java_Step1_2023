package chapter06;

import java.util.Scanner;

public class CanMain {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);

		String select="";
		int money=0;
		
		Vending ven=new Vending();
		ven.init();//음료준비
		
		System.out.print("돈을 투입하세요 : ");
		money=scan.nextInt();//돈투입
		System.out.println();
		ven.showCans(money);
		System.out.println("---------------------");
		System.out.print("음료를 선택하세요 : ");
		select=scan.next(); //음료 종류 선택
		ven.outCan(select);
		

	}

}
