package xunit;

public class XUnitTest {
    public static void main(String[] args) {

        // (테스트 클래스 안에 들어있는) 테스트 메소드 실행됐는지 체크하는 테스트
        WasRun wasRun = new WasRun();
        System.out.println(wasRun.wasRun); // false
        wasRun.testMethod(); // 테스트 메소드 실행
        System.out.println(wasRun.wasRun); // true
    }
}
