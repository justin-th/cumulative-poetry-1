package main.java;

class Main {

    static Poem poem;

    public static void main(String args[]) {
        // ToDo: Load the poem
        poem = new Poem(); // ToDo: Filename and Exception handling
        // Processing command-line arguments
        int index = -1;
        if (args.length < 2 || args.length > 3) {
            System.out.println("Invalid argument count. Exiting...");
            System.exit(0);
        } else if (args.length == 2 && args[1].equals("--recite")) {
            // ToDo: Recite the poem
        } else if (args.length == 3 && args[1].equals("--reveal-for-day")) {
            try {
                index = Integer.parseInt(args[2]);
                if (index > poem.getLength()) {
                    System.out.println(String.format("The poem is just %d lines long. Exiting...", poem.getLength()));
                } else {
                    // ToDo: Reveal for the day
                }
            } catch (NumberFormatException exception) {
                System.out.println("Option 'reveal-for-day' must be followed by an integer. Exiting...");
                System.exit(0);
            }
        }
    }
}