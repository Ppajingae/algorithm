package algorithm._25.march._250318;

import java.util.HashSet;
import java.util.Set;

public class SequenceComma implements NewName {

    @Override
    public String transfer(String nickname) {

        return nickname.replaceAll("\\.\\.+", ".");
    }
}
