package algorithm._25.march._250318;

public class IdLengthSet implements NewName{

    @Override
    public String transfer(String nickname) {

            while (nickname.length() < 3){
                nickname += nickname.charAt(nickname.length() - 1);

                if (nickname.length() == 3){
                    return nickname;
                }
            }

        return nickname;
    }
}
