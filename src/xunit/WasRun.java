package xunit;

// 테스트 클래스
// XUnit 테스트 만들기 위해 메소드 실행 여부 체크하기 위한 일종의 샘플 테스트 만든 것
public class WasRun extends TestCase {
    public boolean wasRun; // 테스트메소드가 실행됐는지 체크하는 플래그 (실행 전엔 false, 실행 후엔 true)

    // 어떤 테스트 메소드 실행될지 인자로 이름 받음
    public WasRun(String name) {
        super(name); // 이름을 저장
    }

    // 테스트메소드
    public void testMethod() {
        wasRun = true;
    }
}
