package ch18_static;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Product {
    private String name;

    @Getter
    private static int count = 0;
}
