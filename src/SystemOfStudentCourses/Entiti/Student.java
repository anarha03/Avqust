package SystemOfStudentCourses.Entiti;

import java.util.ArrayList;

public class Student {
    private String name;
    private String surname;
    private int age;
    private ArrayList<Course> coursesOfStudent = new ArrayList<>();

    public Student(String name, String surname, int age, ArrayList<Course> coursesOfStudent) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.coursesOfStudent = coursesOfStudent;
    }

    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }



    public String informPrint() {
        if (coursesOfStudent.isEmpty()) {
            return name + " " + surname + ". Yas: " + age + "\n" + "Heleki hec bir kursda istirak etmir.";
        } else {
            return name + " " + surname + ". Yas: " + age + "\n" + "Kurslar: " + coursesOfStudent;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Course> getCoursesOfStudent() {
        return coursesOfStudent;
    }

    public void setCoursesOfStudent(ArrayList<Course> coursesOfStudent) {
        this.coursesOfStudent = coursesOfStudent;
    }
}
