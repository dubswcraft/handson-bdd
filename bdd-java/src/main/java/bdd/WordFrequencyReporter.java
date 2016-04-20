package bdd;

import java.util.*;

public class WordFrequencyReporter {

    public String calculate(List<String> words) {
        HashMap<String, Integer> counts = countOccurances(words);
        return formatForOutput(counts);
    }

    public HashMap<String, Integer> countOccurances(List<String> words) {
        HashMap<String, Integer> count = new HashMap<String, Integer>();

        for (String word : words) {
            if (count.containsKey(word)) {
                count.put(word, count.get(word) + 1);
            } else {
                count.put(word, 1);
            }
        }
        return count;
    }

    public String formatForOutput(Map<String, Integer> wordCount){
        ArrayList<String> listOfCounts = new ArrayList<String>();
        for(String key: wordCount.keySet()){
            listOfCounts.add(wordCount.get(key) + " " + key);
        }
        return String.join(",\r\n", listOfCounts);
    }
}