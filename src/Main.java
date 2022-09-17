import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/words_alpha.txt"));

        ArrayList<String> wordsCEI = new ArrayList<String>();
        ArrayList<String> wordsEI = new ArrayList<String>();
        ArrayList<String> wordsIE = new ArrayList<String>();

        String l = bufferedReader.readLine();
        int lineIndex = 1;
        while (l != null) {
//            if (lineIndex == 100000) break;
            if (l.contains("cei")) wordsCEI.add(l);
            if (l.contains("ei")) wordsEI.add(l);
            if (l.contains("ie")) wordsIE.add(l);

            lineIndex++;
            l = bufferedReader.readLine();
        }

        System.out.println("CEI: " + wordsCEI.size());
        System.out.println("EI: " + wordsEI.size());
        System.out.println("IE: " + wordsIE.size());
        // ei: 4351 ie:13310 cei: 251
    }
}