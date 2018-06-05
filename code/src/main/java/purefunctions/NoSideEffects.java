package purefunctions;

public class NoSideEffects {

    public String withSideEffects(String input){
        String result = "transformed " + input;
        System.out.println(result);
        return result;
    }

    public String stillWithSideEffects(String input){
        String result = transformationWithoutSideEffects(input);
        System.out.println(result);
        return result;
    }

    private String transformationWithoutSideEffects(String input) {
        return "transformed " + input;
    }
}
