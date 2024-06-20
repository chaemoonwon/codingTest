package programmers;

import java.util.Arrays;

public class Americano {

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        System.out.println("solution2.solution(4000) = " + Arrays.toString(solution2.solution(4000)));
        System.out.println("solution2.solution(4000) = " + Arrays.toString(solution2.solution(15000)));

    }

}
class Solution2 {
    public int[] solution(int money) {
        int price = 5500;
        int iceAmericano = money / price;
        int change = money - (price * iceAmericano);
        return new int[]{iceAmericano, change};
    }
}


