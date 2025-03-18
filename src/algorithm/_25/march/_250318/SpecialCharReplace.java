package algorithm._25.march._250318;

public class SpecialCharReplace implements NewName{

    @Override
    public String transfer(String nickname) {

        String[] words = nickname.split("");
        String answer = "";

        for(String word : words){
            if(word.matches("[a-z0-9._-]+")) answer += word;
        }

        return answer;
    }
}
