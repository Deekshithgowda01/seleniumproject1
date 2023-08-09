import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class occuranceofstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Map<Character, Integer> m = new HashMap();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (m.containsKey(ch)) {
                m.put(ch, m.get(ch) + 1);
            } else {
                m.put(ch, 1);
            }
        }
        for (Map.Entry o : m.entrySet()) {
            System.out.println(o.getKey() + "  =   " + o.getValue());
        }
    }
}
