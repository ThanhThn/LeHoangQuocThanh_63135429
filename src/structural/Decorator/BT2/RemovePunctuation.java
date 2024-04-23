package structural.Decorator.BT2;

import java.util.List;

public class RemovePunctuation extends TokenDecorator{
    public RemovePunctuation(Tokenize tokens) {
        super(tokens);
    }

    @Override
    public List<String> tokenize() {
        List<String> list = tokens.tokenize();
        list.replaceAll(s -> s.replaceAll("\\p{Punct}", ""));
        return list;
    }
}
