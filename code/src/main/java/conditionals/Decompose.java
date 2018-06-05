package conditionals;

import java.time.LocalDate;

public class Decompose {

    public void before(LocalDate input) {
        if (input.isBefore(input.withMonth(6).withDayOfMonth(22)) ||
            input.isAfter(input.withMonth(9).withDayOfMonth(23))) {
            //do something
            return;
        }

        //do something else
        return;
    }

    public void after(LocalDate input) {
        LocalDate startOfSummer = input.withMonth(6).withDayOfMonth(22);
        LocalDate endOfSummer = input.withMonth(9).withDayOfMonth(23);
        if (input.isBefore(startOfSummer) || input.isAfter(endOfSummer)) {
            //do something
            return;
        }

        //do something else
        return;
    }
}
