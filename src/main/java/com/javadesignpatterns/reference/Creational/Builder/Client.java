package com.javadesignpatterns.reference.Creational.Builder;

public class Client {
    public static void main(String[] args) {
        Student student = Student.StudentBuilder.newInstance()
                .name("Sukumar")
                .age(25)
                .department("ECE")
                .email("sukumar@gmail.com")
                .gender("male")
                .mobileNo("1000000000")
                .build();
        student.display();
        System.out.println(student);
    }
}
