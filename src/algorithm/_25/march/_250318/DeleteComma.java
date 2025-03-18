package algorithm._25.march._250318;

public class DeleteComma implements NewName {

    @Override
    public String transfer(String nickname) {

        String answer = nickname;

        if(nickname.charAt(0) == '.'){
            answer = nickname.substring(1);
        }else if(nickname.charAt(nickname.length()-1) == '.'){
            answer = nickname.substring(0, nickname.length() - 1);
        }

        return answer;
    }
}
