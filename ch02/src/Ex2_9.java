class Ex2_9 {
	public static void main(String[] args) {
		
		/*
		 * 12.printf�� �̿��� ���
		 * System.out.printf("age:%d",age);
		 * System.out.printf("age:%d",14);
		 * System.out.printf("age:14"); age:14�� ȭ�鿡 ��µȴ�
		 * 
		 * ���� ����Ϸ��� ���� 2����� �����ڵ� 2���� ����ؾ� �ϸ� ��µ� ���� �������� ������ ��ġ�ؾ� �Ѵ�.
		 * ���� 3���̻��� ���� �����ڸ� �����ؼ� ����Ҽ� ������ ������ ������ ����.
		 *  
		 *  System.out.printf("age:%d year:%d",age,year);
		 *  System.out.printf("age:%d year:%d",14,2019);
		 *  
		 *  printIn();�� �޸� Printf()�� �ٹٲ��� ���� �ʴ´�. �ٹٲ��� �Ϸ��� ������ %n�� ���� �־�����Ѵ�
		 *  -%n��� \n�� ����ص� ������,OS���� ���ڰ� �ٸ����ֱ� ������ %n�� ����ϴ°��� �� �����ϴ�.
		 *  
		 *  
		 * 
		 * 
		 * 
		 */
		String url = "www.codechobo.com";
		float f1 = .10f;   // 0.10, 1.0e-1
		float f2 = 1e1f;   // 10.0, 1.0e1, 1.0e+1
		float f3 = 3.14e3f;
		double d = 1.23456789;
		System.out.printf("f1=%f, %e, %g%n", f1, f1, f1); 
		System.out.printf("f2=%f, %e, %g%n", f2, f2, f2); 
		System.out.printf("f3=%f, %e, %g%n", f3, f3, f3);
		System.out.printf("d=%f%n", d);
		System.out.printf("d=%14.10f%n", d); // ��ü 14�ڸ� �� �Ҽ��� 10�ڸ�
		System.out.printf("[12345678901234567890]%n");
		System.out.printf("[%s]%n", url);
		System.out.printf("[%20s]%n", url);
		System.out.printf("[%-20s]%n", url); // ���� ����
		System.out.printf("[%.8s]%n", url);  // ���ʿ��� 8���ڸ� ���
	}
}