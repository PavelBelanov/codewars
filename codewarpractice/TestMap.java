package codewarpractice;

import java.util.HashMap;

public class TestMap {
    public static void main(String[] args) {
        HashMap<String, Integer> score = new HashMap<>();
        score.put("Katty", 42);
        score.put("Bert", 343);
        score.put("Skyler", 420);
        System.out.println(score);
        System.out.println(score.get("Bert"));
    }
}
