package com.javadesignpatterns.reference.Creational.Builder;

public class Student {

    private String name;
    private int age;
    private String gender;
    private String department;
    private String mobileNo;
    private String email;

    public Student(StudentBuilder studentBuilder) {
        this.name = studentBuilder.name;
        this.age = studentBuilder.age;
        this.gender = studentBuilder.gender;
        this.department = studentBuilder.department;
        this.mobileNo = studentBuilder.mobileNo;
        this.email = studentBuilder.email;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", department='" + department + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static class StudentBuilder {
        private String name;
        private int age;
        private String gender;
        private String department;
        private String mobileNo;
        private String email;

        public static StudentBuilder newInstance() {
            return new StudentBuilder();
        }
        private StudentBuilder() {}

        public StudentBuilder name(String name) {
            this.name = name;
            return this;
        }
        public StudentBuilder age(int age) {
            this.age = age;
            return this;
        }

        public StudentBuilder gender(String gender) {
            this.gender = gender;
            return this;
        }
        public StudentBuilder department(String department) {
            this.department = department;
            return this;
        }
        public StudentBuilder mobileNo(String mobileNo) {
            this.mobileNo = mobileNo;
            return this;
        }
        public StudentBuilder email(String email) {
            this.email = email;
            return this;
        }
        public Student build() {
            return new Student(this);
        }
    }

    public void display() {
        System.out.println(name.toUpperCase());
    }
}
