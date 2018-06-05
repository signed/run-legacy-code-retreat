package conditionals;

public class SimplifiedReturns {

    public boolean before(int input) {
        if (input > 7) {
            return false;
        }
        return true;
    }

    public boolean after(int input) {
        return input <= 7;
    }
}
