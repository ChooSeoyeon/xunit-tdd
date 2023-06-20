package xunit;

// 테스트 클래스
public class WasRun {
    public boolean wasRun; // 테스트메소드가 실행됐는지 체크하는 플래그 (실행 전엔 false, 실행 후엔 true)

    // 어떤 테스트 메소드 실행될지 인자로 이름 받음
    public WasRun(String testMethod) {
    }

    // 테스트메소드
    public void testMethod() {
        wasRun = true;
    }

    public void run() {
        testMethod(); // live하게 하면 이렇게 할 순 있음
    }
}
