package me.juyi.aexercise;

public class MemberTest {

    public static void main(String[] args) {
        Manager m = new Manager("Jordan",50,"911","Chicago",10000);
        Employee e = new Employee("Jordan",50,"911","Chicago",10000);
        m.show();
        e.show();
    }

}
