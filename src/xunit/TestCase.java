package xunit;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// WasRun은 하나의 테스트일 뿐이고,
// 일반화된 테스트 케이스에 적용할 수 있는 공통적인 내용 뽑아서 추상화된 형태로 만든 것
// name, run() 가져옴
public class TestCase {
    protected final String name; // 실행할 테스트 메소드 이름

    public TestCase(String name) {
        this.name = name;
    }

    // 생성자 인자로 받은 이름을 가지고 테스트 메소드 실행함
    public void run() {
        // 특정 method를 dynamic하게 실행시키는 코드 (동적인 프로그래밍 언어와 달리 자바는 이가 조금 복잡함)
        try {
            Method method = getClass().getMethod(name); // 이름을 가지고 method를 찾음.
            // Method라는 meta 정보를 갖고 올 수 있으면 그 메소드를 실행시킬 수 있음.
            // Class(WasRun)에서 getMethod해서 이름 주면 됨.

            method.invoke(this); // method 가져온 후엔 invoke란걸 호출해서 실행해줌.
            // method는 가져왔으니 어느 object의 method인지 알려줘야함.

        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) { // getMethod랑 invoke에 대한 예외처리.
            // 메타정보로 하는 거라 컴파일 시점에 완벽히 체크가 안됨.
            // 이름이 실제로 존재하는건지 알 수 없기에 각종 exception들 발생함.
            throw new RuntimeException(e); // wrapping만 해서 던지게 해줌
        }
    }
}
