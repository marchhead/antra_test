package me.juyi.aexercise;

public class PureExceptionTest {
    public static void main(String[] args) {
        try {
            throw new Exception("I am a pure Exception thrower!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
