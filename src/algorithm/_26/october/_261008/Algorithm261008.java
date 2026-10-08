package algorithm._26.october._261008;

import java.util.*;

public class Algorithm261008 {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        Set<String> visited = new HashSet<>();
        ArrayList<String> graph = new ArrayList<>(Arrays.asList(words));


        return bfs(visited, graph, begin, target);
    }

    private int bfs(Set<String> visited, ArrayList<String> list, String begin, String target) {
        Queue<Node> q = new ArrayDeque<>();
        q.offer(new Node(0, begin));

        while(!q.isEmpty()) {
            Node poll = q.poll();

            for (String s : list) {
                if(canConvert(poll.word, s) && !visited.contains(s)) {
                    visited.add(s);
                    q.offer(new Node(poll.count + 1, s));
                }
            }
            if(poll.word.equals(target)) {
                return poll.count;
            }
        }

        return 0;
    }
    class Node{
        int count;
        String word;
        public Node(int count, String word) {
            this.count = count;
            this.word = word;
        }
    }

    private boolean canConvert(String current, String next) {
        char[] currentArr = current.toCharArray();
        char[] nextArr = next.toCharArray();
        int count = 0;

        for (int i = 0; i < currentArr.length; i++) {
            if(currentArr[i] == nextArr[i]) count++;
        }
        return current.length() - count == 1;
    }

    public static void main(String[] args) {

        String begin = "hit";
        String target = "cog";

        String[] words = {
                "hot", "dot", "dog", "lot", "log", "cog"
        };

        String begin2 = "hit";
        String target2 = "cog";

        String[] words2 = {
                "hot", "dot", "dog", "lot", "log"
        };

        Algorithm261008 algo = new Algorithm261008();

        System.out.println(algo.solution(begin2, target2, words2));
    }
}
