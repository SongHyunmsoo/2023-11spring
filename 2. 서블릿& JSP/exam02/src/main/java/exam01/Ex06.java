package exam01;

import exam02.Student;

public class Ex06 {
    public static void main(String[] args) {
        Student s1 = new Student(1000,"이름1","체육");
        Student s2 = new Student(1000,"이름1","체육");
        System.out.println(s1==s2);
        System.out.println("equals:" + s1.equals(s2));

    }
}
