package baseball;

import baseball.model.Game;
import baseball.model.Result;
import baseball.model.TargetNum;
import baseball.model.UserNum;
import baseball.view.InputView;
import baseball.view.OutputView;


// 게임의 진행자. 입력 -> 서비스 호출 -> 출력 담당
public class GameController {
    public void run(){
        int keyNumber;
        OutputView outputView = new OutputView();
        InputView inputView = new InputView();
        while (true) {
            TargetNum targetNum = new TargetNum();
            Game game = new Game(targetNum);
            keyNumber = runGame(inputView,game,outputView);
            if (keyNumber == 2) {
                break;
            } else if (keyNumber == 1) {
                continue;
            }
        }
    }

    private int runGame(
            final InputView inputView,
            final Game game,
            final OutputView outputView
    ){
        while(true){
            inputView.show();
            String input = inputView.input();
            Validator.validate(input);
            UserNum userNum = new UserNum(inputView.convertNumber(input));
            Result result = game.play(userNum);
            if(result.getIsEnd()){
                outputView.finish();

                return inputView.newStartInput();
            }else{
                outputView.print(result);
            }
        }
    }
}
