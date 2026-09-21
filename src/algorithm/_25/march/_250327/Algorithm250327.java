package algorithm._25.march._250327;

import java.util.HashMap;
import java.util.Map;

public class Algorithm250327 {

    public int iterative(int num) {
        if (num <= 1) {
            return num;
        }
        int prev = 0, curr = 1;
        for (int i = 2; i <= num; i++) {
            int next = prev + curr;
            prev = curr;
            curr = next;
        }
        return curr;
    }

    public int recursive(int num) {
        if (num <= 1) {
            return num;
        }
        return recursive(num - 1) + recursive(num - 2);
    }

    public int memoization(int num) {
        Map<Integer, Integer> memo = new HashMap<>();

        if (num <= 1) {
            return num;
        }
        if (memo.containsKey(num)) {
            return memo.get(num);
        }
        int result = memoization(num - 1) + memoization(num - 2);
        memo.put(num, result);
        return result;
    }
}

