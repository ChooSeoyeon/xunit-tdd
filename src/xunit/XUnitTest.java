package xunit;

// 테스트 코드
public class XUnitTest {
    public static void main(String[] args) {

        // (테스트 클래스 안에 들어있는) 테스트 메소드 실행됐는지 체크하는 테스트
        /*
         리팩토링 #1 - 테스트 기능 손대지 않고 동일한 결과 나오게 코드 개선(중복 제거)

         테스트 메소드는 이름을 테스트할 때 WasRun에 만들고 싶은거고,
         사실은 어떤 클래스의 이름이 뭐든 간에 테스트 메소드엔 의미 있는 이름 부여해주는 게 좋음
         따라서 wasRun.run() 이라 하면 테스트 메소드가 실행되면 좋겠음
         어느 테스트 메소드가 실행될지를 결정하는 건 wasRun(테스트클래스) 생성할 때 이름 넘겨줘서 결정
        */
//        WasRun wasRun = new WasRun("testMethod");
//        System.out.println(wasRun.wasRun); // false
//        wasRun.run(); // 테스트 메소드 실행
//        System.out.println(wasRun.wasRun); // true

        /*
        리팩토링 #2 - 테스트 케이스 일반화
        테스트란 건 인스턴스 만든 후, run이란 메소드 실행하면 특정 테스트 메소드 실행한다.
        이를 wasRun이란 특정 케이스가 아니고 좀 더 일반화해보자.
        */

        /*
        리팩토링 #3 - 테스트를 테스트하는 테스트 일반화
        main문 내부에 있던 코드들을 테스트케이스를 상속한 테스트로 만들자.
        */
        new TestCaseTest("testRunning").run();
    }
}
