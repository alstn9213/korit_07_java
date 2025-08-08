package ch14_abstraction.interfaces;

public interface Press {
    String NAME = "button";
//    String age; 필드 선언 불가능(인터페이스에선 변수들이 자동으로 상수가 되는데 초기화를 안해줘서 오류)
//    public Press() {} 생성자 불가능
//    void popOut() {} 일반 메서드 불가능
    void onPressed();
}
