package baseball.model;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;

public class TargetNum {
    private ArrayList<Integer> targetNum;
    public TargetNum() {
        this.targetNum = generateTargetNum();
    }
    public int getTargetNumOfIndex(int index) {
        return targetNum.get(index);
    }

    public boolean contains(int num) {
        return targetNum.contains(num);
    }
    private ArrayList<Integer> generateTargetNum() {
        ArrayList<Integer> numbers = new ArrayList<>();
        while (numbers.size() < 3) {
            int num = Randoms.pickNumberInRange(1, 9);
            if (!numbers.contains(num)) {
                numbers.add(num);
            }
        }
        return numbers;
    }

}
