package xunit;

public class XUnitTest {
    public static void main(String[] args) {

        // (테스트 클래스 안에 들어있는) 테스트 메소드 실행됐는지 체크하는 테스트
        /*
         리팩토링 - 테스트 기능 손대지 않고 동일한 결과 나오게 코드 개선(중복 제거)

         테스트 메소드는 이름을 테스트할 때 WasRun에 만들고 싶은거고,
         사실은 어떤 클래스의 이름이 뭐든 간에 테스트 메소드엔 의미 있는 이름 부여해주는 게 좋음
         따라서 wasRun.run() 이라 하면 테스트 메소드가 실행되면 좋겠음
         어느 테스트 메소드가 실행될지를 결정하는 건 wasRun(테스트클래스) 생성할 때 이름 넘겨줘서 결정
        */
        WasRun wasRun = new WasRun("testMethod");
        System.out.println(wasRun.wasRun); // false
        wasRun.run(); // 테스트 메소드 실행
        System.out.println(wasRun.wasRun); // true


    }
}
