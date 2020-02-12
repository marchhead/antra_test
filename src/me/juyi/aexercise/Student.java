package me.juyi.aexercise;

public class Student {
    private String name;
    private int age;
    private String address;

    public Student() {
        this.name = "unknown";
        this.age = 0;
        this.address = "not available";
    }

    public void setInfo (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setInfo(String name, int age, String address) {
        setInfo(name, age);
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
