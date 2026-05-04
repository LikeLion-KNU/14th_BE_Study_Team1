package baseball.model;

import java.util.ArrayList;

public class UserNum {
    private ArrayList<Integer> userNum;
    public UserNum(ArrayList<Integer> userNum) {
        this.userNum = userNum;
    }
    public ArrayList<Integer> getUserNum() {
        return userNum;
    }
    public void setUserNum(ArrayList<Integer> userNum) {
        this.userNum = userNum;
    }
}
