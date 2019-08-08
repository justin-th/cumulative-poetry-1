package poem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;

class Poem {
    private final LinkedList<String> lines;

    Poem(InputStream input) throws IOException {
        BufferedReader poemReader = new BufferedReader(new InputStreamReader(input));
        lines = new LinkedList<>();
        while (poemReader.ready()) {
            lines.addFirst(poemReader.readLine());
        }
    }

    String revealForTheDay(int day) {
        if (day < 1 || day > lines.size()) return String.format("No poem for day %d.", day);
        StringBuilder output = new StringBuilder();
        output.append("This is ").append(lines.get(day - 1)).append("\n");
        for (int i = day - 2; i >= 0; i--) {
            output.append("\t").append(lines.get(i)).append("\n");
        }
        return output.toString();
    }

    String recite() {
        StringBuilder output = new StringBuilder();
        for (int i = 1; i <= lines.size(); i++) {
            output.append(String.format("Day %d:\n%s", i, revealForTheDay(i)));
        }
        return output.toString();
    }
}