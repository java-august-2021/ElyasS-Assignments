import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class PuzzleJavaTest {
    public static void main(String[] args) {
        PuzzleJava randValues = new PuzzleJava();
        ArrayList<Integer> randArr = randValues.randomNum(5);
        
        
        System.out.println(randArr);
        System.out.println(randValues.randomAlphabets());
        System.out.println(randValues.generatePass());
        System.out.println(randValues.getNewPass(5));


    }
}
