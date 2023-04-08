import java.util.*;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1(){
        System.out.println("Решение задания 1");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<Integer> outList = new ArrayList<>();
        for (Integer num : nums) {
            if (num % 2 == 1) {
                outList.add(num);
            }
        }
        System.out.println(outList);
    }

    private static void task2() {
        System.out.println("Решение задания 2");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        TreeSet<Integer> outSet = new TreeSet<>();
        for (Integer num : nums) {
            if (num % 2 == 0) {
                outSet.add(num);
            }
        }
        System.out.println(outSet);
    }

    private static void task3() {
        System.out.println("Решение задания 3");
        String testText = "one, two, one, three, four, four";
        HashSet<String> outSet = new HashSet<>(List.of(testText.split(", ")));
        System.out.println(outSet);
    }

    private static void task4() {
        System.out.println("Решение задания 4");
        String testText = "one, two, one, three, four, four";
        ArrayList<String> wordsList = new ArrayList<>(List.of(testText.split(", ")));
        HashSet<String> keys = new HashSet<>(List.of(testText.split(", ")));
        ArrayList<Integer> outList = new ArrayList<>();
        for (String key : keys) {
            int cnt = 0;
            for (String s : wordsList) {
                if (s.equals(key)) {
                    cnt++;
                }
            }
            if (cnt > 1) {
                outList.add(cnt);
            }
        }
        System.out.println(outList);
    }
}