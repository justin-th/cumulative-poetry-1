package poem;

import java.io.IOException;

class Main {
    public static void main(String[] args) {
        try {
            if (args.length == 0) throw new IllegalArgumentException("No arguments provided.");
            new ArgumentParser().parse(args);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}