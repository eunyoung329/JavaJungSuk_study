class Ex2_8 {
	public static void main(String args[]) {
		
		/*
		 * ey 추가
		 *  두변수 x,y에 저장된 값을 바꾸려면 어떻게 해야할까?
		 *  int x=10;
		 *  int y=20;
		 *  
		 *  int tmp;(임시로 값을 저장하기위한 변수-빈컵역할)
		 *  tmp=x;
		 *  x=y;
		 *  y=tmp;
		 *  
		 */
		int x = 10, y = 5;   // int x = 10; int y = 5;를 한 줄로
		System.out.println("x="+x); 
		System.out.println("y="+y); 

		int tmp = x;    // 1. x의 값을 tmp에 저장
		x = y;          // 2. y의 값을 x에 저장
 		y = tmp;        // 3. tmp에 저장된 값을 y에 저장
		System.out.println("x="+x); 
		System.out.println("y="+y); 
		
		//11.기본형의 종류와 범위
		/*
		 * -boolean은 true와 false 두가지 값만 표현할 수 있으면 되므로 가장 작은크기인 1byte
		 * -char은 자바에서 유니코드(2byte 문자체계)를 사용하므로 2byte
		 * -byte는 크기가 1byte라서 byte
		 * -int(4byte)를 기준으로 짧아서 short(2byte)길어서 long(8byte).(short<=> long)
		 * -float는 실수값을 부동소수점(floating-poing)방식으로 저장하기 때문에 float.
		 * double은 float보다 두배의 크기(8byte)를 갖기 때문에 double
		 * 
		 */
	}
}