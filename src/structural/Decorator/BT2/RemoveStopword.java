package structural.Decorator.BT2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveStopword extends TokenDecorator{
    List<String> stopwords;

    public RemoveStopword(Tokenize tokens) {
        super(tokens);
        stopwords = new ArrayList<>(Arrays.asList("thì","bị", "bởi", "cả", "các","cái", "mà", "là", "nhưng","và"));
    }

    @Override
    public List<String> tokenize() {
        List<String> result = tokens.tokenize();
        result.removeAll(stopwords);
        return result;
    }
}
