package poem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

class Poem {

    LinkedList<String> lines;

    Poem() throws IOException {
        BufferedReader poemReader = new BufferedReader(
                new InputStreamReader(getClass().getResourceAsStream("/resources/poem")));
        lines = new LinkedList<>();
        while (poemReader.ready()) {
            lines.add(poemReader.readLine());
        }
    }

    String revealForTheDay(int day) {
        StringBuilder output = new StringBuilder();
        output.append("This is the ").append(lines.get(lines.size() - day - 1)).append("\n");
        for (int i = lines.size() - day - 2; i > lines.size() - day - 2; i--) {
            output.append("\tthe ").append(lines.get(i)).append("\n");
        }
        return output.toString();
    }

    String recite() {
        return revealForTheDay(lines.size());
    }

    int getLength() {
        return lines.size();
    }
}