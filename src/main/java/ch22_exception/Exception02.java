package ch22_exception;

class LoginFailedException extends Exception{
//    매개변수 생성자
    public LoginFailedException(String message) {
        super(message); // 수퍼클래스의 생성자 호출
        System.out.println("예외가 발생했습니다.");
    }
}

public class Exception02 {
    public static void login(String id, String password) throws LoginFailedException{
        String correctId = "admin";
        String correctPassword = "1q2w3e4r";

//        고전적인 예외처리
        if(!id.equals(correctId) || !password.equals(correctPassword)) {
            System.out.println("ID 혹은 비밀번호를 확인하세요");
            throw new LoginFailedException("ID 또는 PW가 틀렸습니다.");
            /*
            * "ID 또는 PW가 틀렸습니다."를 인자로하는
            * LoginFailedException객체가 생성됨.
            * */

        }
    }


    public static void main(String[] args) {

        String inputId = "admin";
        String inputPassword = "1234qwer";

//        login(inputId, inputPassword); // throws 키워드때문에 오류발생

        try {
            login(inputId, inputPassword);
        } catch (LoginFailedException e) { // 자동완성으로 사용자 정의 Exception 클래스가 나오는데 그 근거는 login() 메서드 다음에 throws LoginFailedException을 정의했기때문이다.
            System.out.println("로그인 실패" + e.getMessage()); // e.getMessage()의 결과가 "로그인 실패ID 또는 PW가 틀렸습니다."이다.
        } finally {
            System.out.println("프로그램 정상 종료");
        }

    }
}
/*
* 사실상 사용자 정의 예외 처리 방식 역시
* try / catch / finally 와 throws / throw가 추가 되었을 뿐이지
* method의 정의 / 생성자 정의 / 객체 생성 방식이라는 것과 차이가 없다.
* */

