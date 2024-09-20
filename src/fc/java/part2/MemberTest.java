package fc.java.part2;

public class MemberTest {
    public static void main(String[] args) {
        Member m = new Member();
        m.name = "안민성";
        m.age = 18;
        m.addr = "인천";
        m.email = "ms1114@kakao.com";
        m.tel = "01055434341";
        m.weight = 80.2f;

        System.out.println(m.name+"\t"+m.tel+"\t"+m.email+"\t"+m.age+"\t"+m.weight+"\t"+m.addr);
    }

}
