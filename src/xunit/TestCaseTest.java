package xunit;

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
}
