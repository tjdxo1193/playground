package chapter2;

public class SwichCase {

	public static void main(String[] args) {
		int ranking=2;
		char medalColor;
		
		switch(ranking) {
		case 1 : medalColor='G';
		break;
		case 2 : medalColor='S';
		break;
		default : medalColor='A';
		}
		System.out.println(ranking + "�� �޴��� ������ "+medalColor+"�Դϴ�.");
		
	}

}