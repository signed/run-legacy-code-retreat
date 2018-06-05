package purefunctions;

public class ResultOnlyReliesOnThePassedArguments {

    public static String GlobalState = "might change";

    private String field = "on field level";

    public String violatesBecauseOfGlobalState() {
        return GlobalState + " appended";
    }

    public String violatesBecauseOfFieldAccess(){
        return field + " appended";
    }

    public String pure(String input) {
        return input + " appended";
    }
}
