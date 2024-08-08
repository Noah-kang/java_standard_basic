public class PrintfEx1 {
    //ch2-12,13 printf()를 이용한 출력
    public static void main(String[] args) {
        System.out.println(10/3); // 정수끼리의 연산 결과는 정수이기에 3이 출력됩니다.
        System.out.println(10.0/3);
        // System.out.printf의 단축어는 souf 입니다.
        System.out.printf("%d%n", 15); // 10진수 지시자
        System.out.printf("%o%n", 15); // 8진수 지시자
        System.out.printf("%x%n", 15); // 16진수 지시자
        System.out.printf("%#o%n", 15); // 8진수 지시자, 접두사 0을 붙여줍니다.
        System.out.printf("%#x%n", 15); // 16진수 지시자, 접두사 0x를 붙여줍니다.
        System.out.printf("%s%n", Integer.toBinaryString(15)); // 정수를 이진수로 변환하여 문자열로 출력합니다. 2진수는 따로 지시자가 없어서 메소드 활용

        float f = 123.456789f; // float의 정밀도는 7입니다.
        System.out.printf("%f%n", f); // 123.456787 출력, float의 정밀도는 7이기에 123.4567까지만 정확합니다. 8은 우연히 맞은것입니다.
        double d = 123.456789; // double의 정밀도는 15입니다.
        System.out.printf("%f%n", d); // 123.456789 출력, double의 정밀도는 15이기에 값이 정확하게 다 나옵니다.
        System.out.printf("%e%n", f); // f를 e지시자를 이용하여 지수형태로 출력합니다.
        System.out.printf("%g%n", f); // f를 g지시자를 이용하여 적절한 형태로 출력합니다.

        System.out.printf("[%5d]%n", 10); // 10을 공백포함 5자리로 출력합니다.
        System.out.printf("[%5d]%n", 1234567); // 만약 지정한자리수를 초과하더라도 다 출력합니다.
        System.out.printf("[%-5d]%n", 10); // 왼쪽정렬하여 5자리로 출력합니다.
        System.out.printf("[%05d]%n", 10); // 공백에 0을 채웁니다.


        System.out.printf("%f%n", d); // 일반적인 실수형 출력 소수점아래 6자리까지 출력됩니다.
        System.out.printf("%14.10f%n", d); // 소수점 포함 총 14자리 소수점이하 10자리로 출력합니다. 소수점 공백은 0으로 채워집니다.
        System.out.printf("%14.6f%n", d); // 소수점 이하 6자리로 출력합니다. 정수자리 남는부분은 공백으로 처리됩니다.
        System.out.printf("%.6f%n", d); // 정수는 온전히 출력되며 소수점이하는 적용됩니다.

        String s = "www.noah_kang.com";
        System.out.printf("[%s]%n", "www.noah_kang.com");

        System.out.printf("[%s]%n", s); // 문자열 출력도 같습니다.
        System.out.printf("[%20s]%n", s); // 기본은 오른쪽 정렬이어서 앞에 공백을 둡니다.
        System.out.printf("[%-20s]%n", s); // 왼쪽정렬하여 뒤에 공백을 둡니다.
        System.out.printf("[%.10s]%n", s); // .숫자 사용시 그 숫자만큼만 출력합니다.
    }
}
