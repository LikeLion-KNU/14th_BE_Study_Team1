package baseball.controller;

import baseball.model.Result;
import baseball.model.TargetNum;
import baseball.model.UserNum;
import baseball.Validator;
import baseball.view.InputView;
import baseball.view.OutputView;

public class GameController {

    private static final int RESTART = 1;
    private static final int QUIT = 2;

    private final InputView inputView;
    private final OutputView outputView;

    // DIP: View를 외부에서 주입받음
    public GameController(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void run() {
        outputView.printStartMessage();
        while (true) {
            playOneGame();
            int command = inputView.readRestartCommand();
            if (command == QUIT) {
                break;
            }
        }
    }

    private void playOneGame() {
        TargetNum targetNum = new TargetNum();

        while (true) {
            String input = inputView.readUserInput();
            Validator.validate(input);

            UserNum userNum = new UserNum(input);
            Result result = targetNum.compare(userNum);

            outputView.printResult(result);

            if (result.isEnd()) {
                outputView.printFinishMessage();
                outputView.printRestartGuide();
                break;
            }
        }
    }
}