package fc.java.part3;

import fc.java.model.PersonVO;

public class ConstructorInit {
    public static void main(String[] args) {
        // 생성자 메서드로 PersonVo 객체 출력
        PersonVO person = new PersonVO("안민성", 30, "010-5543-4341");
        System.out.println(person.getName()+"\t"+person.getAge()+"\t"+person.getPhone());
    }
}
