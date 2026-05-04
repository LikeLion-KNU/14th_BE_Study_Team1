package week1;

import java.util.Scanner;

public class InputNumber {
    Scanner scanner = new Scanner(System.in);
    int inputNum(){
        System.out.println("숫자를 입력해주세요 : ");
        String input = scanner.nextLine();
        if(!input.matches("[1-9]{3}")){
            throw new IllegalArgumentException();
        }
        if(input.charAt(0) == input.charAt(1)
            || input.charAt(1) == input.charAt(2)
            || input.charAt(0) == input.charAt(2)){
            throw new IllegalArgumentException();
        }
        return Integer.parseInt(input);
    }
}
