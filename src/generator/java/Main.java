package generator.java;

import java.io.File;

class Main {

    public static void main(String[] args) {
        // Process argument (filename)
        if (args.length == 2) {
            File poemFile = new File(args[1]);
            if (!poemFile.exists() || poemFile.isDirectory()) {
                System.out.println("File not found. Exiting...");
            } else {
                // Do things
                    // Extract main jar resource
                    // Append poem as resource
            }
        } else {
            System.out.println("Invalid arguments. Exiting...");
        }
    }

}