package self;

import java.util.*;
public class StackEx {
    public static Stack back = new Stack();
    public static Stack forward = new Stack();

    public static void main(String[] args) {
        goURL("1.구글");
        goURL("2.야후");
        goURL("3.네이버");
        goURL("4.다음");

        printStatus();

        goBack();
        System.out.println("뒤로");
        printStatus();

        goBack();
        System.out.println("뒤로");
        printStatus();

        goForward();
        System.out.println("앞으로");
        printStatus();

        goURL("codechobo.com");
        System.out.println("새로운 주소로 이동후");
        printStatus();

    }
    public static void printStatus() {
        System.out.println("back: "+back);
        System.out.println("forward: "+forward);
        System.out.println("현재화면은 "+back.peek()+"입니다.");
    }
    public static void goURL(String url) {
        back.push(url);
        if(!forward.empty()){
            back.push(back.pop());
        }

    }
    public static void goForward() {
        if(!back.empty()) {
            back.push(forward.pop());
        }
    }
    public static void goBack() {
        if(!back.empty()) {
            forward.push(back.pop());
        }
    }
}
