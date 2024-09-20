package fc.java.part3;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "안민성";
        p.age = 30;
        p.phone = "01055434341";
        System.out.println(p.name+" "+p.age+" "+p.phone);

        p.play();
        p.eat();
        p.walk();
    }
}
