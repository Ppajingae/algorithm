package algorithm._26.october._261030;

import java.util.ArrayList;
import java.util.List;

public class Algorithm261030 {

    public String solution(String new_id) {
        String answer = new IdFactory(new_id)
                .toLowerCase()
                .replaceSpecialChars()
                .replaceFirstAndLastFormat()
                .checkedLength()
                .replaceFirstAndLastFormat()
                .transferShortId()
                .toString();

        return answer;
    }

    public class IdFactory{
        private String id;

        public IdFactory(String id) {
            this.id = id;
        }

        public IdFactory toLowerCase(){
            return new IdFactory(this.id.toLowerCase());
        }

        public IdFactory replaceSpecialChars(){
            return new IdFactory(this.id.replaceAll("[^a-z0-9\\-\\_\\.]", "").replaceAll("\\.{2,}", "."));
        }

        public IdFactory replaceFirstAndLastFormat(){
            List<Character> chars = new ArrayList<>();

            for (char c : this.id.toCharArray()) {
                chars.add(c);
            }

            for (int i = 0; i < chars.size(); i++) {
                if (chars.get(i)== '.' && (i == 0 || i == chars.size() - 1)) {
                    chars.remove(i);
                }
            }

            if(chars.isEmpty()) return new IdFactory("a");
            StringBuilder answer = new StringBuilder();

            for (char c : chars) {
                answer.append(c);
            }

            return new IdFactory(answer.toString());
        }

        public IdFactory checkedLength() {

            if (this.id.length() > 15){
                this.id =  this.id.substring(0, 15);
            }

            return new IdFactory(this.id);
        }

        public IdFactory transferShortId(){
            while (this.id.length() < 3){
                this.id += this.id.charAt(this.id.length() - 1);

                if (this.id.length() == 3){
                    return new IdFactory(this.id);
                }
            }

            return new IdFactory(this.id);
        }

        public String toString(){
            return this.id;
        }
    }


    public static void main(String[] args) {
        Algorithm261030 algorithm = new Algorithm261030();

        String[] newIds = {
                "...!@BaT#*..y.abcdefghijklm",
                "z-+.^.",
                "=.=",
                "123_.def",
                "abcdefghijklmn.p"
        };

        String[] expected = {
                "bat.y.abcdefghi",
                "z--",
                "aaa",
                "123_.def",
                "abcdefghijklmn"
        };

        for (int i = 0; i < newIds.length; i++) {
            System.out.println(
                    "결과: " + algorithm.solution(newIds[i])
                            + " / 예상: " + expected[i]
            );
        }
    }
}