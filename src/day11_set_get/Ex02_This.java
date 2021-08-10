package day11_set_get;

public class Ex02_This {
	public int age; // 인스턴스 변수로 만들게 되면 자동적으로 초기화 됨
					// int같은 소문자이면 0으로 String같은 대문자이면 NULL로
	public void ageFunc(int age) { this.age = age -1;}
	public void printAge() {System.out.println("당신의 나이 : "+age);
	
	}

}
