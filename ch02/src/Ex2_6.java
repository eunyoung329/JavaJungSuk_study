class Ex2_6 {
   public static void main(String args[]) {
		int 	 x = 100;
		double pi = 3.14;
		char 	 ch = 'a';
		String str = "abc";

		System.out.println(x); 
		System.out.println(pi); 
		System.out.println(ch);
		System.out.println(str);
		
		/* ey 추가
		 * chapeter2.5
		 *  '상수(Constant)는 변수와 마찬가지로 '값을 저장할 수 있는 공간이지만, 변수와 달리 한번 값을 저장하면 다른값으로 변경할수 없다. 상수를 선언하는 방법은 변수와 동일하며,
		 *  단지, 변수의 타입앞에 키워드 'final'을 붙여주기만 하면된다.
		 *  final int MAX_SPEED=10;
		 *  
		 *  리터럴(literal)
		 *  원래 12,123,3.14,'A'와 같은 값들이 상수인데, 프로그래밍에서는 상수를 '값을 한번 저장하면 변경할 수 없는 공간으로 저장하였기 때문에 이를 구분하기 위
		 *  상수를 다른이름으로 불러야만했다.그래서 상수대신 literal이라는 용어를 사용한다.
		 *  
		 *  변수에 타입이 있는 것 처럼 리터럴에도 타입이 있다.변수의 타입은 저장될 '값의 타입(리터럴의 타입)'에 의해 결정되므로, 만약 리터럴에 타입이 없다면 변수의 타입도 
		 *  필요없을 것이다.
		 *  
		 *  1.int octNum=010; //8진수 10,10진수로 8
		 *  2.int hexNum=0x10; //16진수 10,10진수로 16
		 *  
		 *  그리고 JDK 1.7부터 정수형 리터럴의 중간에 구분자'_'를 넣을 수 있게 되어서 큰 숫자를 편하게 읽을 수 있게 되었다.
		 *  long big=100_000_000_000L
		 *  int hex=0xFFFF_FFFF_FFFF_FFFFL;
		 *  
		 *  실수형에서는 float타입의 리터럴 접미사 'f'또는 'F'를 붙이고 ,double타입의 리터럴에는 접미사 'd'또는 'D'를 부틴다.
		 *  float pi=3.14f
		 *  double rate=1.618d
		 *  		 */
	}
}