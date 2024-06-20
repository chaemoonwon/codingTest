package programmers;

public class Rsp {

    public static void main(String[] args) {
        Solution solution = new Solution();

        solution.solution("2");
    }
}

class Solution {
    public String solution(String rsp) {
        String answer = "";
        if (rsp.contains("2")) {
            answer = "0";
        }
        if (rsp.contains("0")) {
            answer = "5";
        }
        if (rsp.contains("5")) {
            answer = "2";
        }
        return answer;
    }
}
