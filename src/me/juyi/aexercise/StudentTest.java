package me.juyi.aexercise;

public class StudentTest {
    public static void main(String[] args) {
        int studentsSize = 10;
        Student[] students = new Student[studentsSize];
        for (int i = 0; i<studentsSize; i++) {
            Student s = new Student();
            s.setInfo("Superman"+i,20+i,"Star00000"+i);
            students[i] = s;
        }
        for (Student s:students) {
            System.out.println(s);
        }
    }
}
