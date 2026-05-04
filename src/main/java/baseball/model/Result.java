package baseball.model;

public class Result {
    private int strike;
    private int ball;
    private boolean isEnd;

    public Result(int strike, int ball, boolean isEnd) {
        this.strike = strike;
        this.ball = ball;
        this.isEnd = isEnd;
    }
    public int getStrike() {
        return strike;
    }
    public int getBall() {
        return ball;
    }
    public boolean getIsEnd() {
        return isEnd;
    }
}
