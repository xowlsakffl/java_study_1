package fc.java.part3;

import fc.java.model.UserDTO;

public class AccessModifier {
    public static void main(String[] args) {
        UserDTO u = new UserDTO();
        u.name = "안민성";
        u.phone = "010-5543-4341";
        //u.age = ; 접근불가 private
        System.out.println(u.name+"\t"+u.phone);
    }
}
