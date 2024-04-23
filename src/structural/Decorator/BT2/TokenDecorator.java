package structural.Decorator.BT2;

import java.util.List;

public abstract class TokenDecorator implements Tokenize{
    Tokenize tokens;

    public TokenDecorator(Tokenize tokens) {
        this.tokens = tokens;
    }
}
