package fc.java.part2;

public class BreakContinueTest {
    public static void main(String[] args) {
        char[] c = {'s','h','u','t','d','o','w','n'};
        for (int i = 0; i < c.length; i++) {
            if(c[i] == 'o'){
                break;
            }
            System.out.print(c[i]);
        }

        int threeCount = 0;
        for(int i = 1; i <= 10; i++){
            if((i % 3) != 0){
                continue;
            }
            threeCount++;
        }
        System.out.println(threeCount);
    }
}
