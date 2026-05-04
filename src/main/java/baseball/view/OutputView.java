package baseball.view;

import baseball.model.Result;

public class OutputView {
    public void finish() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료\n");
    }

    public void print(Result result) {
        if(result.getBall()>0 && result.getStrike() > 0) {
            System.out.println(result.getBall() + "볼 " + result.getStrike() + "스트라이크");
        } else if (result.getBall() > 0) {
            System.out.println(result.getBall() + "볼");
        } else if (result.getStrike() > 0) {
            System.out.println(result.getStrike() + "스트라이크");
        } else {
            System.out.println("낫싱");
        }
    }
}
