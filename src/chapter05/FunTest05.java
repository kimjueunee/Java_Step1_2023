package chapter05;

import javax.swing.JOptionPane;

public class FunTest05 {

	public String channe1; //멤버변수
	public int channelInt; //멤버변수
	public int volume; //멤버변수
	//생략가능
	public FunTest05() {
		
	}
	/*
    public FunTest05(int volume) {
		
	}
	*/
	public void channelUp(int volume) {
		System.out.println("소리를 "+volume +"만큼 올립니다");
	}
	
	public void channelDown(int volume) {
		System.out.println("소리를 "+volume +"만큼 내립니다");
	}
	
	//오버로딩(다형성 만족)
	public void channelChange(String channel) {
		System.out.println("TV 채널을 "+channel +"로 바꿉니다");
	}
	//오버로딩(다형성 만족)
    public void channelChange(int channelInt) {
    	System.out.println("채널을 "+channelInt +"로 바꿉니다");
	}
	
    //=================================================
	public static void main(String[] args) {

		int a,b,c;
		a=Integer.parseInt(JOptionPane.showInputDialog("값1"));
		b=Integer.parseInt(JOptionPane.showInputDialog("값2"));
		c=Integer.parseInt(JOptionPane.showInputDialog("값3"));
		String d=JOptionPane.showInputDialog("값4");
		FunTest05 tv=new FunTest05();
		tv.channelUp(a);
		tv.channelDown(b);
		tv.channelChange(c);
		tv.channelChange(d);

	}

}
