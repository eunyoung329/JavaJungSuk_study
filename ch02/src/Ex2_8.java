class Ex2_8 {
	public static void main(String args[]) {
		
		/*
		 * ey �߰�
		 *  �κ��� x,y�� ����� ���� �ٲٷ��� ��� �ؾ��ұ�?
		 *  int x=10;
		 *  int y=20;
		 *  
		 *  int tmp;(�ӽ÷� ���� �����ϱ����� ����-���ſ���)
		 *  tmp=x;
		 *  x=y;
		 *  y=tmp;
		 *  
		 */
		int x = 10, y = 5;   // int x = 10; int y = 5;�� �� �ٷ�
		System.out.println("x="+x); 
		System.out.println("y="+y); 

		int tmp = x;    // 1. x�� ���� tmp�� ����
		x = y;          // 2. y�� ���� x�� ����
 		y = tmp;        // 3. tmp�� ����� ���� y�� ����
		System.out.println("x="+x); 
		System.out.println("y="+y); 
		
		//11.�⺻���� ������ ����
		/*
		 * -boolean�� true�� false �ΰ��� ���� ǥ���� �� ������ �ǹǷ� ���� ����ũ���� 1byte
		 * -char�� �ڹٿ��� �����ڵ�(2byte ����ü��)�� ����ϹǷ� 2byte
		 * -byte�� ũ�Ⱑ 1byte�� byte
		 * -int(4byte)�� �������� ª�Ƽ� short(2byte)�� long(8byte).(short<=> long)
		 * -float�� �Ǽ����� �ε��Ҽ���(floating-poing)������� �����ϱ� ������ float.
		 * double�� float���� �ι��� ũ��(8byte)�� ���� ������ double
		 * 
		 */
	}
}