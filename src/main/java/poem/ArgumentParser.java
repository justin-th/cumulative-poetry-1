package poem;

import java.io.*;

class ArgumentParser {

    // Return a stream from default poem
    private InputStream getFileStream() {
        return getClass().getClassLoader().getResourceAsStream("poem");
    }

    // Gets an input stream from file path specified
    private InputStream getFileStream(String path) throws IOException {
        return new FileInputStream(new File(path));
    }

    void parse(String[] args) throws IllegalArgumentException, IOException {
        if (args.length > 3) throw new IllegalArgumentException("Invalid number of arguments.");
        switch (args[0]) {
            case "--recite":
                if (args.length == 1) {
                    System.out.println(new Poem(getFileStream()).recite());
                } else if (args.length == 2) {
                    System.out.println(new Poem(getFileStream(args[1])).recite());
                } else {
                    throw new IllegalArgumentException("Invalid number of arguments.");
                }
                break;
            case "--reveal-for-day":
                if (args.length == 2) {
                    System.out.println(new Poem(getFileStream()).revealForTheDay(Integer.parseInt(args[1])));
                } else {
                    System.out.println(new Poem(getFileStream(args[2])).revealForTheDay(Integer.parseInt(args[1])));
                }
                break;
            default:
                throw new IllegalArgumentException("Invalid arguments.");
        }
    }

}
