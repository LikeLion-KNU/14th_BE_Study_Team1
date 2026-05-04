package baseball.model;

import java.util.ArrayList;

public class Game {

    private final TargetNum target;

    public Game(TargetNum target) {
        this.target = target;
    }

    public Result play(UserNum user) {
        int strike = 0;
        int ball = 0;
        boolean isEnd = false;

        ArrayList<Integer> numbers = user.getUserNum();
        for (int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);
            if (number == target.getTargetNumOfIndex(i)) {
                strike++;
            } else if (target.contains(numbers.get(i))) {
                ball++;
            }
        }
        if(strike == 3){
            isEnd = true;
        }
        return new Result(strike, ball, isEnd);
    }
}
