package me.juyi.aexercise;

public class ParentTest {
    public static void main(String[] args) {
        Parent p1 = new SubParent1();
        Parent p2 = new SubParent2();
        p1.message();
        p2.message();
    }
}
