package example_09_13_modifier;

public class Sample1 {
	
	/*public (완전 공개)
	 * 같은 클래스내에서 접근가능
	 * 같은 패키지내의 다른 클래스에서 접근가능
	 * 다른 패키지내의 클래스에서 접근가능
	 */
	public int a;
	
	/*
	 * protected (패키지 공개 + 자식 클래스에 공개)
	 * 같은 클래스내에서 접근가능
	 * 같은 패키지내의 다른 클래스에서 접근가능
	 * 다른 패키지내의 클래스에서 접근 불가능(단, 이 클래스의 자식 클래스는 접근가능)
	 */
	protected int b;
	
	/*
	 * default (패키지 공개)
	 * 같은 클래스내에서 접근가능
	 * 같은 패키지의 다른 클래스에서 접근가능
	 * 다른 패키지의 클래스에서 접근 불가능
	 */
	int c;
	
	/*
	 * private (완전 비공개)
	 * 같은 클래스내에서 접근가능
	 * 같은 패키지의 다른 클래스에서 접근불가능
	 * 다른 패키지의 클래스에서 접근 불가능
	 */
	private int d;
	
	// 생성자 메소드에서 접근제한자를 사용해서 접근을 제한할 수 있다.
	public Sample1() {}
	protected Sample1(int a) {}
	Sample1(int a, int b){}
	private Sample1(int a, int b, int c) {}
	
	// 멤버 메소드에서 접근제한자를 사용해서 접근을 제한할 수 있다.
	public void method1() {}
	protected void method2() {}
	void method3() {}
	private void method4() {}
	
	
}
