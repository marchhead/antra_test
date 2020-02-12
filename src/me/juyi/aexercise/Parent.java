package me.juyi.aexercise;

public abstract class Parent {
    public abstract void message();
}

class SubParent1 extends Parent {

    @Override
    public void message() {
        System.out.println("This is first subclass");
    }
}

class SubParent2 extends Parent {

    @Override
    public void message() {
        System.out.println("This is second subclass");
    }
}