import java.util.*;

public class Q10 {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> wordToFrequent = new HashMap<>();
        for (String word : words) {
            wordToFrequent.put(word, wordToFrequent.getOrDefault(word, 0) + 1);
        }

        PriorityQueue<Map.Entry<String, Integer>> queue
                = new PriorityQueue<>(words.length
                , new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> a
                    , Map.Entry<String, Integer> b) {
                if (a.getValue() != b.getValue()) {
                    return b.getValue() - a.getValue();
                }
                return a.getValue() != b.getValue()
                        ? b.getValue() - a.getValue()
                        : a.getKey().compareTo(b.getKey());
            }
        });
        queue.addAll(wordToFrequent.entrySet());

        List<String> topKFrequent = new LinkedList<>();
        while (k-- > 0) {
            topKFrequent.add(queue.poll().getKey());
        }

        return topKFrequent;
    }
}
