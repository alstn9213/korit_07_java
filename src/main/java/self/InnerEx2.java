package self;

public class InnerEx2 {
//    인스턴스 멤버간에는 서로 직접 접근이 가능하다.
    class InstanceInner{}
//    static 멤버간에는 서로 직접 접근이 가능하다.
    static class StaticInner {}
    InstanceInner iv = new InstanceInner();
    static StaticInner cv = new StaticInner();

    static void staticMethod() {
//        InstanceInner obj1 = new InstanceInner();
        StaticInner obj2 = new StaticInner();
        InnerEx2 outer = new InnerEx2();
        InstanceInner obj1 = outer.new InstanceInner();
    }

    void instanceMethod() {
        InstanceInner obj1 = new InstanceInner();
        StaticInner obj2 = new StaticInner();
    }
    void myMethod() {
        class LocalInner{}
        LocalInner Iv = new LocalInner();
    }
}
