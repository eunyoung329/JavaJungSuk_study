class Ex2_9 {
	public static void main(String[] args) {
		
		/*
		 * 12.printf를 이용한 출력
		 * System.out.printf("age:%d",age);
		 * System.out.printf("age:%d",14);
		 * System.out.printf("age:14"); age:14가 화면에 출력된다
		 * 
		 * 만약 출력하려는 값이 2개라면 지시자도 2개를 사용해야 하며 출력될 값과 지시자의 순서는 일치해야 한다.
		 * 물론 3개이상의 값도 지시자를 지정해서 출력할수 있으며 개수의 제한은 없다.
		 *  
		 *  System.out.printf("age:%d year:%d",age,year);
		 *  System.out.printf("age:%d year:%d",14,2019);
		 *  
		 *  printIn();과 달리 Printf()는 줄바꿈을 하지 않는다. 줄바꿈을 하려면 지시자 %n을 따로 넣어줘야한다
		 *  -%n대신 \n을 사용해도 되지만,OS마다 문자가 다를수있기 때문에 %n을 사용하는것이 더 안전하다.
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
		System.out.printf("d=%14.10f%n", d); // 전체 14자리 중 소수점 10자리
		System.out.printf("[12345678901234567890]%n");
		System.out.printf("[%s]%n", url);
		System.out.printf("[%20s]%n", url);
		System.out.printf("[%-20s]%n", url); // 왼쪽 정렬
		System.out.printf("[%.8s]%n", url);  // 왼쪽에서 8글자만 출력
	}
}