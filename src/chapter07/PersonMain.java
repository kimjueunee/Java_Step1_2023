package chapter07;

public class PersonMain {
	
	public static void main(String[] args) {
		
		Person num=new Person();
		System.out.println(num.name="김유신");
		System.out.println(num.height=180f);
		System.out.println(num.weight=80f);
		
		System.out.println("---------------------------------------");
		Person num2=new Person("강감찬");
		System.out.println(num2.name);
		System.out.println(num2.height=175f);
		System.out.println(num2.weight=75f);
		
		System.out.println("---------------------------------------");
		Person num3=new Person("이순신",170,70);
		System.out.println(num3.name);
		System.out.println(num3.height);
		System.out.println(num3.weight);
		
	}

}
