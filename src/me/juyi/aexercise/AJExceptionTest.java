package me.juyi.aexercise;

public class AJExceptionTest {
    public static void main(String[] args) {
        ExceptionThrower thrower = new ExceptionThrower();
        try {
            thrower.throwAJException();
        } catch (AJException e) {
            e.show();
        }

    }
}

class ExceptionThrower {
    public void throwAJException() throws AJException{
        throw new AJException("I am just an AJException thrower.");
    }
}