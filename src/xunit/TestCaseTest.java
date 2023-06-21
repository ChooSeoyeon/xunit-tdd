package xunit;

// 테스트를 테스트하는 테스트
// 다른 테스트케이스(WasRun)를 테스트하는 테스트코드를 테스트케이스로 봄
public class TestCaseTest extends TestCase {

    public TestCaseTest(String name) {
        super(name);
    }

    // 이전에 작성한 테스트코드를 테스트메소드로 만듦
    public void testRunning() {
        WasRun wasRun = new WasRun("testMethod");
        // assert wasRun.wasRun == false;
        Assert.assertEquals(false, wasRun.wasRun); // 기댓값, 실제값
        wasRun.run();
        Assert.assertEquals(true, wasRun.wasRun); // 기댓값, 실제값
    }

    // 테스트케이스라는 프레임워크를 테스트할 때 쓰는 샘플 테스트인 WasRun에다가 testMethod 실행하면
    // setUp은 method 실행할 때 어쨌든 반드시 실행 되어야 하는 거니까 개가 실행됐는지 체크하는 것임
    public void testSetUp() {
        WasRun wasRun = new WasRun("testMethod");
        Assert.assertEquals(false, wasRun.wasSetUp); // 기댓값, 실제값
        wasRun.run();
        Assert.assertEquals(true, wasRun.wasSetUp); // 기댓값, 실제값
    }
}
