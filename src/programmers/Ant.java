package programmers;

public class Ant {
    public static void main(String[] args) {

        Solution3 solution3 = new Solution3();
        System.out.println("solution3.solution(23) = " + solution3.solution(23));
        System.out.println("solution3.solution(24) = " + solution3.solution(24));
        System.out.println("solution3.solution(999) = " + solution3.solution(999));
        System.out.println("solution3.solution(3) = " + solution3.solution(3));
        System.out.println("solution3.solution(5) = " + solution3.solution(5));
    }
}

class Solution3 {
    public int solution(int hp) {
        int answer = 0; //필요한 개미 수
        int restHp; //남은 hp
        int generalAnt = 5; //장군 개미 공격력
        int armyAnt = 3;    //병정 개미 공격력
        int workAnt = 1;    //일 개미 공격력

        if (hp >= 5) {
            answer = (hp / generalAnt); // 필요한 장군 개미 수
            restHp = hp - (generalAnt * answer);
            if (restHp == 4) {
                answer += (restHp / armyAnt);   //필요한 병정 개미 수
                restHp = restHp - armyAnt;
                answer += (restHp / workAnt);
            } else if (restHp == 3) {
                answer += (restHp / armyAnt);   //필요한 병정 개미 수
            } else {
                answer += (restHp / workAnt);   //필요한 일 개미 수
            }
        } else if (hp >= 3) {
            answer = (hp / armyAnt);
            restHp = hp - (answer * armyAnt);
            if (restHp == 1) {
                answer += (restHp / workAnt);  //필요한 일 개미 수
            }
        } else {
            answer = (hp / workAnt);
        }
        return answer;
    }
}
