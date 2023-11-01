package LeetCodeSolutions;


import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateParenthesisHelper(result, "", n, n);
        return result;
    }

    private void generateParenthesisHelper(List<String> result, String current, int open, int close) {
        if (open == 0 && close == 0) {
            result.add(current);
            return;
        }

        if (open > 0) {
            generateParenthesisHelper(result, current + "(", open - 1, close);
        }
        if (close > open) {
            generateParenthesisHelper(result, current + ")", open, close - 1);
        }
    }

}
