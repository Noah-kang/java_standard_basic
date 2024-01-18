public class Ex2_1 {
    // ch2-1~2 화면에 글자 출력하기, 덧셈 뺄셈 계산하기
    public static void main(String[] args) {
        // 강의의 이클립스 기준에서는
        // sysout ctrl+space 자동완성
        // System.out.println
        // 인텔리제이에선 sout 을 쓰면 자동완성 됩니다.
        // 강의에서는 이클립스의 행 복사 단축키 ctrl+alt+shift+down을 사용하여 행 복사
        // 이클립스의 원래 행 복사 단축키는 ctrl+alt+down 이지만 윈도우의 기존 키와 충돌이 나서 위와같이 커맨드를 변경해줌
        // 자세한 내용은 이전강의에 존재한다.
        // 인텔리제이에서는 ctrl+D 를 누르면 바로 아래에 행이 복사된다.
        // 이클립스에서 행 삭제는 ctrl+D 입니다.
        // 인텔리제이에서는 ctrl+y를 redo또는 delete line으로 사용할 수 있습니다.
        // redo는 ctrl+shift+z로도 사용할 수 있기 때문에
        // 저는 ctrl+y를 행 삭제로 설정하여 사용합니다.
        // 단축키 변경은 file - settings - keymap에서 가능합니다.
        // 이클립스에서 멀티커서 모드에 진입 하는 커맨드는 alt+shift+a이며(토글로작동) shift+방향키 두번 누르면 커서가 추가된다.
        // 인텔리제이에서 멀티커서 단축키는 두가지이다.
        // 방향키로 조작시 ctrl을 두번 누르고 방향키이동
        // 마우스 클릭시 alt+shift+click
        // println() - 출력 후에 줄바꿈을 합니다.
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        // print() - 출력 후에 줄바꿈을 안함
        System.out.print("Hello");
        System.out.print("Hello");
        System.out.print("Hello");
        // 이클립스에서는 실행 전에 저장되지 않았으면 먼저 저장을 하라는 알림 창이 나온다.
        // 인텔리제이에서는 기본 설정이 자동 저장이다.(옵션에서 끌 수 있음)
        System.out.println("5+3"); // ""안에 있는 것은 모두 문자로 취급 8이 아닌 5+3이 출력된다.
        System.out.println(5+3); // 덧셈
        System.out.println(5-3); // 뺄셈
        System.out.println(5*3); // 곱셈
        System.out.println(5/3); // 나눗셈이지만 출력은 1이 나옵니다.
        System.out.println(5/3.0); // 3.0으로 나누면 1.66666666667 우리가 기대하는 결과값이 출력됩니다.
                                   // 이에 관한 자세한 설명은 다음챕터에서 설명하겠습니다. 자료형
    }
}
