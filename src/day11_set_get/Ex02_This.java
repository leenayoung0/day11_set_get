package day11_set_get;

public class Ex02_This {
	public int age; // �ν��Ͻ� ������ ����� �Ǹ� �ڵ������� �ʱ�ȭ ��
					// int���� �ҹ����̸� 0���� String���� �빮���̸� NULL��
	public void ageFunc(int age) { this.age = age -1;}
	public void printAge() {System.out.println("����� ���� : "+age);
	
	}

}
