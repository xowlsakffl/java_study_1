package fc.java.part3;

import fc.java.model.PersonVO;

public class ToStringPrint {
    public static void main(String[] args) {
        PersonVO p = new PersonVO("안민성",30, "010-5543-4341");
        System.out.println(p);// p.toString() 생략가능
    }
}
