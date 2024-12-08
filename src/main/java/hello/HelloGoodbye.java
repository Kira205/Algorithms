public class HelloGoodbye {

    public static void main(String[] args) {
        // Ensure exactly two arguments are passed
        if (args.length != 2) {
            System.out.println("Usage: java HelloGoodbye <name1> <name2>");
            return;
        }

        // Read the names from the command-line arguments
        String name1 = args[0];
        String name2 = args[1];

        // Print hello message
        System.out.println("Hello " + name1 + " and " + name2 + ".");

        // Print goodbye message with names reversed
        System.out.println("Goodbye " + name2 + " and " + name1 + ".");
    }
}