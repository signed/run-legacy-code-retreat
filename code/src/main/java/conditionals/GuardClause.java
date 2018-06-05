package conditionals;

import java.util.Optional;

public class GuardClause {

    public Optional<String> before(String input) {
        if (null != input) {
            return Optional.of("<" + input + ">");
        } else {
            return Optional.empty();
        }
    }

    public Optional<String> after(String input) {
        if (null == input) {
            return Optional.empty();
        }
        return Optional.of("<" + input + ">");
    }
}
