package fc.java.part3;

public class PersonAccessTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "안민성";
        person.age = 1000;
        person.phone = "010-5543-4341";
        System.out.println(person.name+"\t"+person.age+"\t"+person.phone);
    }
}
