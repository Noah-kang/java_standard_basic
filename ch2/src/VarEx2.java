public class VarEx2 {
    // ch2-9 두 변수 바꾸기
    public static void main(String[] args) {
        // 변수를 선언하고 사용함으로 간단하게 값을 유연하게 변경 가능합니다.
        int x = 4, y = 2;
        int tmp; // 임시값을 저장할 tmp

        tmp = x; // 1. x의 값을 tmp 에 저장
        x = y; // 2. y의 값을 x에 저장
        y = tmp; // 3. tmp 의 값을 y에 저장

        System.out.println("x="+x); // x와 y값을 보기 쉽게 앞에 문자열을 덧붙여줍니다.
        System.out.println("y="+y); // +는 글자와 숫자를 더하라는 뜻이 아닌 숫자 앞에 글자를 덧붙이라는 뜻으로 사용되었습니다.

        // 인텔리제이에서 아래와 같은 설명(description)이 나타납니다.
        // 'y' should probably not be assigned to 'x'
        // y 값을 x에 할당하면 안됩니다. 라는 뜻입니다.
        // 이는 같은값을 가진 변수를 서로에게 할당하려고 하는 개발자의 실수를 막기위한 경고입니다.
        // 이 실습안에서는 서로 다른값을 교환하려는 의도가 명확하기 때문에 무시해도됩니다.
        // IDE 의 민감한 경고입니다.
    }
}
