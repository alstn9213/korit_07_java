package ch14_abstraction.interfaces;

public abstract class Button implements Press, Up, Down{
    @Override
    public void onDown() {

    }

    @Override
    public abstract void onPressed(); // 구현부를 설정하지 않지만 다른 곳에서 구현해준다면 오버라이딩이라고 할 수 있다.

    @Override
    public String onUp() {
        return "올립니다.";
    }
}
