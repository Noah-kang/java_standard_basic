public class VarEx3 {
    //ch2-6 리터럴의 타입과 접미사
    public static void main(String[] args) {
        final int score = 100;
        // score = 200;
        boolean power = true;
        // boolean 타입이기 때문에 true, false 두가지만 저장 가능
        // boolean power = 0; // 타입에러가 발생합니다. 0은 int 타입이기 때문입니다.

        byte b = 127; // byte 타입은 -128 ~ 127까지 저장 가능합니다.
        // byte b = 128; // 타입에러가 발생합니다. 128은 byte 타입의 범위를 벗어났기 때문입니다.

        int oct = 010; // 접두사로 0이 붙어서 8진수, 10진수로 8
        int hex = 0x10; // 접두사로 0x이 붙어서 16진수, 10진수로 16
        System.out.println(oct); // 8
        System.out.println(hex); // 16
        // println()은 값을 10진수로 출력하며 접두사와 접미사는 출력하지 않습니다.
        // 10진수가 아닌 다른 진수로 출력하려면 printf()를 사용하면 됩니다. 뒤의 강의에서 상세히 설명

        long l = 1000_000_000; // 10억, 현재 리터럴은 int 이며 int 의 범위 내이기에 허용 됩니다.
        //long l = 10_000_000_000; // 100억, 타입에러가 발생합니다. 리터럴이 int 의 범위를 벗어났기 때문입니다. L을 붙이면 에러가 사라집니다.

        float f = 3.14f;
        // float f = 3.14; // 리터럴이 double 타입이되며 float 타입의 범위를 벗어났기 때문에 에러가 발생합니다.
        double d = 3.14;
        // double d = 3.14f; // float 타입의 리터럴이지만 double 은 float 보다 범위가 넓어서 허용됩니다.

        System.out.println(10.); // 10.0 .을 붙이면 실수형으로 인식하며 f가 붙지 않았기에 double 타입으로 인식합니다.
        System.out.println(.10); // 0.1 위와 같이 double 로 인식하며 뒤의 0은 생략합니다.
        System.out.println(10f); // 10.0 f를 붙이면 float 타입으로 인식하며 접미사는 생략되어 10.0이 출력됩니다.
        System.out.println(1e3); // 1000.0 e는 10^n을 의미합니다. 따라서 1*10^3 인 1000이 출력되며 e는 실수형 이기에 1000.0이 출력됩니다.

        //ch2-7,8 문자, 문자열 리터럴, 문자열 결합
        char ch = 'A';
        //char ch = 'AB'; // '' 문자형이기에 하나의 문자만 들어가야합니다.
        //char ch = ''; // 빈문자도 허용되지 않습니다. 하나의 문자가 들어가야합니다.
        System.out.println(ch); // 저장된 char 타입 문자 A가 출력됩니다.
        int i = 'A'; // 정수타입 int 에 문자 'A'를 할당합니다.
        System.out.println(i); // 문자 A의 문자코드 65가 출력됩니다.

        String str = ""; // "" 문자열이기에 빈문자열(empty string)도 허용합니다.
        String str2 = "ABCD"; // 둘이상의 문자도 허용합니다.
        String str3 = "123";
        String str4 = str2 + str3;
        String str5 = str3 + str2;
        System.out.println(str4); // ABCD123이 출력됩니다.
        System.out.println(str5); // 123ABCD이 출력됩니다.
        System.out.println(""+7+7); // 문자열변환이 우선되어 77이 출력됩니다.
        System.out.println(7+7+""); // 숫자연산이 먼저 되서 14가 출력됩니다.
        // 연산은 좌에서 우로 실행되기 때문입니다.
    }
}
