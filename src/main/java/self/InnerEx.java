package self;

public class InnerEx {
    class InstanceInner {
        int iv = 100;
        static int cv = 100;
        final static int CONST = 100;
    }
    static class StaticInner {
        int iv = 200;
        static int cv = 200;
    }
    void myMethod() {
        class LocalInner{
            int iv = 300;
            static int cv = 300;    // 책에서는 static변수를 선언할 수 없다는데 오류가 안남
            final static int CONST = 300;
        }
    }

    public static void main(String[] args) {
        System.out.println(InstanceInner.CONST);
        System.out.println(StaticInner.cv);
    }
}
