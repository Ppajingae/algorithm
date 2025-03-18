package algorithm._25.march._250318;

public class DeleteString implements NewName {

    @Override
    public String transfer(String nickname) {

        String answer = nickname;

        if (nickname.length() > 15){
            answer =  nickname.substring(0, 15);
        }

        NewName deleteComma = new DeleteComma();

        return deleteComma.transfer(answer);
    }
}
