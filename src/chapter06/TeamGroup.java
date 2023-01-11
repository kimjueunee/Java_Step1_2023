package chapter06;

public class TeamGroup {
	
	//멤버변수(배열->팀구성원)
	private TeamMember member[]=new TeamMember[6];
	
	//기본 생성자
	
	//초기화 메소드
	public void init() {
		member[0]=new TeamMember("김병효","M");
		member[1]=new TeamMember("이채윤","F");
		member[2]=new TeamMember("김지성","M");
		member[3]=new TeamMember("김형우","M");
		member[4]=new TeamMember("윤민주","F");
		member[5]=new TeamMember("김주은","F");
	}
	
	//출력 메소드
	public void Disp() {
		for(int i=0;i<member.length;i++) {
    			System.out.print("이름 : "+member[i].getName());
    			System.out.println(", 성별 : "+member[i].getGender());
		}
	}
	
}
