package week1;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GameManager gameManager = new GameManager();
        while (true) {
            gameManager.gameStart();
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            int flag = scanner.nextInt();
            if (flag == 1) continue;
            else if(flag == 2){
                break;
            }
        }
    }
}
