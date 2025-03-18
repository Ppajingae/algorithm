package algorithm._25.march._250318;

public class IsEmptyString implements NewName {

    @Override
    public String transfer(String nickname) {

        if (!nickname.isEmpty()) {
            return nickname;
        }
        return "a";
    }
}
