package week1;
import java.util.Random;

public class RandomNumberGeneration {
    Random rand = new Random();
    int getRandomNumber(){
        int first = rand.nextInt(9)+1;
        int second;
        int third;
        do {
            second = rand.nextInt(9)+1;
        } while (first == second);
        do {
            third = rand.nextInt(9)+1;
        } while (first == third || second == third);
        return 100*first + 10*second + third;
    }
}
