package ch16_objects.teacher;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TeacherMain {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("안근수", "코리아아이티");
        Teacher teacher2 = new Teacher("안근수", "코리아아이티");

        System.out.println(teacher1);
        System.out.println(teacher2);

        boolean result1 = teacher1.equals(teacher2);
        System.out.println(result1);
//      equals의 재정의 전과 후가 결과값이 다르다.
//        재정의 전에는 false.
//        teacher1과 teacher2의 주소지까지 비교하지만 재정의 이후에는 필드에 입력된 데이터의 동일여부만 비교한다.

        Class tclass = teacher1.getClass();
        System.out.println(tclass); //  class ch16_objects.teacher.Teacher
        System.out.println(tclass.getSimpleName()); // Teacher
        System.out.println(teacher1.getClass().getSimpleName()); // Teacher

        Field[] fields = tclass.getDeclaredFields();
        System.out.println(fields);
        for(int i=0;i<fields.length;i++){
            System.out.println("필드명 출력 : " + fields[i].getName());
            System.out.println("패키지명 + 클래스명 출력 : " + fields[i].getType());
            System.out.println("클래스명 출력 : " + fields[i].getType().getSimpleName());

        }
        for(Field field : fields) {
            System.out.println("필드명 출력 : " + field.getName());
            System.out.println("패키지명 + 클래스명 출력 : " + field.getType());
            System.out.println("클래스명 출력 : " + field.getType().getSimpleName());
        }
        Method[] methods = tclass.getDeclaredMethods();
        for(int i=0;i<methods.length;i++){
            System.out.println("메서드명 출력 : " + methods[i].getName());
            System.out.println("리턴 타입 출력 : "  + methods[i].getReturnType() + "\n");
        }

//        파일경로가 달라서 클래스가 다를 경우 데이터가 같다고 하더라도 equals의 결과가 fasle가 나온다
        ch16_objects.Teacher teacher3 = new  ch16_objects.Teacher("안근수", "코리아아이티");
        boolean result2 = teacher1.equals(teacher3);
        System.out.println(result2); // false

//        System.out.println(teacher3 instanceof Teacher);
//        teacher3의 자료형은 ch16_objects.Teacher이다.
    }
}
