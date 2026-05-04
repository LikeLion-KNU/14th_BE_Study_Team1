package week1;

public class BaseballGame {
    RandomNumberGeneration randomNumberGeneration = new RandomNumberGeneration();
    InputNumber inputNumber = new InputNumber();
    String playerNum;

    public boolean compareNum(String randomNum) {
        playerNum = String.valueOf(inputNumber.inputNum());
        int strike = 0;
        int ball = 0;
        if (randomNum.equals(playerNum)) {
            System.out.println("3스트라이크");
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            return true;
        }
        for (int i = 0; i < 3; i++) {
            if(randomNum.charAt(i) == playerNum.charAt(i)) {
                strike += 1;
            } else if (randomNum.contains(String.valueOf(playerNum.charAt(i)))) {
                ball += 1;
            }
        }
        if(strike !=0 && ball !=0){
            System.out.println(ball+"볼 "+strike+"스트라이크");
        }
        else if(strike == 0 && ball != 0){
            System.out.println(ball+"볼");
        }
        else if(strike != 0){
            System.out.println(strike+"스트라이크");
        }
        else{
            System.out.println("낫싱");
        }
        return false;
    }
}

