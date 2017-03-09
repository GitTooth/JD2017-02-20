package by.it.korzun.jd01_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskA {
    static void run() {
        System.out.println("TaskA:\n1.------------------------------------------");
        StringBuilder sb = new StringBuilder(Data.lukomor);
        Pattern pattern = Pattern.compile("[а-яА-ЯёЁ]{4,}");
        Matcher matcher = pattern.matcher(sb);
        while (matcher.find()) {
            int pos = matcher.start() + 3;
            sb.setCharAt(pos, '#');
            pos = matcher.start() + 6;
            if (matcher.group().length() > 6) {
                sb.setCharAt(pos, '#');
            }
        }
        System.out.println(sb.toString());
        System.out.println("2.------------------------------------------");
        String[] words = Data.lukomor.split("[^а-яА-ЯеЁ]+");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int counter = 0;
            if (!word.isEmpty()) {
                for (int j = i + 1; j < words.length; j++) {
                    if (word.equalsIgnoreCase(words[j])) {
                        counter++;
                        words[j] = "";
                    }
                }
                System.out.printf("Слово %s повторяется %d раз\n", word, counter);
            }
        }
    }
}
