package chapter06;

import java.util.Random;
import java.util.Scanner;

public class BaseballGame {
	public int user1;
	public int user2;
	public int user3;
	public int com1;
	public int com2;
	public int com3;
	public int strike = 0;
	public int ball = 0;
	public String check="";
	
	Scanner scan = new Scanner(System.in);
	public BaseballGame() {
		do {
			com1=new Random().nextInt(9)+1;
			com2=new Random().nextInt(9)+1;
			com3=new Random().nextInt(9)+1;
		}  while (com1==com2 || com1==com3 || com2==com3); 	
		
	}
	
	public String check() {
		System.out.println("--1 ~ 9 사이의 수를 입력하세요--");
		System.out.print("첫번째 수를 입력하세요 : ");
		user1 = scan.nextInt();
		System.out.print("두번째 수를 입력하세요 : ");
		user2 = scan.nextInt();
		System.out.print("세번째 수를 입력하세요 : ");
		user3 = scan.nextInt();
		
		int strike=0;
		int ball=0;
		
		if (user1 == com1) {
			strike++;
		} else if (user1 == com2 || user1 == com3) {
			ball++;
		}
		if (user2 == com2) {
			strike++;
		} else if (user2 == com1 || user2 == com3) {
			ball++;
		}
		if (user3 == com3) {
			strike++;
		} else if (user3 == com1 || user3 == com2) {
			ball++;
		}
		if (strike == 3) {
			System.out.println("정답 = " + com1 + com2 + com3);
			check ="WIN";
		} else {
			if (strike > 0 || ball > 0) {
				System.out.println(strike + " Strike, " + ball + " Ball");
			} else {
				System.out.println("OUT!!");
				System.out.println("===================");
				
			}
		}
		return check;
	}
}