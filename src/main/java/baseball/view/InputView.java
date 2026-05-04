package baseball.view;
import java.util.ArrayList;
import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public void show() {
        System.out.print("숫자를 입력해 주세요 : ");
    }

    public String input(){
        return Console.readLine();
    }
    public ArrayList<Integer> convertNumber(String input) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for ( char c : input.toCharArray()) {
            numbers.add(c - '0');
        }
        return numbers;
    }

    public int newStartInput() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        return Integer.parseInt(input());
    }
}
