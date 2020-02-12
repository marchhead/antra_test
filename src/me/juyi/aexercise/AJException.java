package me.juyi.aexercise;

public class AJException extends Exception {
    private String msg;

    public AJException(String msg) {
        this.msg = msg;
    }

    public void show() {
        System.out.println(this.msg);
    }
}