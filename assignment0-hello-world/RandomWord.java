import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        String champion = StdIn.readString();
        int stringsRead = 1;
        while (!StdIn.isEmpty()) {
            String input = StdIn.readString();
            stringsRead++;
            if (StdRandom.bernoulli((double)1/stringsRead)) {
                champion = input;
            }
        }
        System.out.println(champion);
    }
}
