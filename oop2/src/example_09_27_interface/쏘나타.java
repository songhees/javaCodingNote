package example_09_27_interface;

public class 쏘나타 extends 중형차 {

	@Override
	public void 출발기능() {
		System.out.println("쏘나타의 출발기능을 실행시킵니다.");
	}

	@Override
	public void 정지기능() {
		System.out.println("쏘나타의 정지기능을 실행시킵니다.");
	}

	@Override
	public void 운전기능() {
		System.out.println("쏘나타의 운전기능을 실행시킵니다.");
	}

	@Override
	public void 속도변경기능() {
		System.out.println("쏘나타의 속도변경기능을 실행시킵니다.");
	}

	@Override
	public void 라디오기능() {
		System.out.println("쏘나타의 라디오기능을 실행시킵니다.");
	}

	@Override
	public void 에어콘기능() {
		System.out.println("쏘나타의 에어콘기능을 실행시킵니다.");
	}

	@Override
	public void 길안내기능() {
		System.out.println("쏘나타의 길안내기능을 실행시킵니다.");
	}

}
