package chapter2;

public class CountinueEx {

	public static void main(String[] args) {
		int num=0;
		int total=0;
		
		for(num=1;num<=100;num++) {
			if(num%2==0) {
				continue;
			}
			//total=total+num;
			total+=num;
			
		}
		System.out.println("1���� 100������ Ȧ���� ���� : "+total+"�Դϴ�.");
	}

}