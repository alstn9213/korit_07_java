package ch17_bean;

import lombok.Data;

@Data // 이곳의 애너테이션은 class level
public class UserEntityLombok {
//    이곳의 애너테이션은 field level
    private int username;
    private int password;
    private String email;
    private String name;
}
