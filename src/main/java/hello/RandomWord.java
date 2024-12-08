import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        String champion = null; // The "champion" word
        int count = 0; // Count of words read so far

        // Read words from standard input
        while (!StdIn.isEmpty()) {
            String word = StdIn.readString();
            count++;

            // Replace the champion with probability 1/count
            if (StdRandom.bernoulli(1.0 / count)) {
                champion = word;
            }
        }

        // Print the surviving champion
        if (champion != null) {
            StdOut.println(champion);
        }
    }
}