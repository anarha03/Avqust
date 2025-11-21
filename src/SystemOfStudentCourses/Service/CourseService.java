package SystemOfStudentCourses.Service;

import SystemOfStudentCourses.Db.Database;
import SystemOfStudentCourses.Entiti.Course;
import SystemOfStudentCourses.Entiti.Student;

import java.util.Scanner;

public class CourseService {
    Scanner sc = new Scanner(System.in);

    public void addCourses() {
        Course st1 = new Course("Java Programming", "Ehed Djabbarov", "OOP prinsipləri və praktiki Java tətbiqləri");
        Course st2 = new Course("Math", "Yaqub Mustafayev", "Riyazi meselelerin oyrenilmesi ve tetbiqi");
        Course st3 = new Course("Web Development", "Azad Rehimov", "Process of creating and maintaining websites and web applications");
        Database.allCourses.add(st1);
        Database.allCourses.add(st2);
        Database.allCourses.add(st3);
        Database.courseNames.add(st1.getName());
        Database.courseNames.add(st2.getName());
        Database.courseNames.add(st3.getName());
    }

    public void addCourseManually() {
        System.out.println("Elave etmek istediyiniz kursun adini daxil edin:");
        String name = sc.nextLine();
        System.out.println("Tedris edecek muellimin ad ve soyadini daxil edin:");
        String surname = sc.nextLine();
        System.out.println("Description daxil edin:");
        String description = sc.nextLine();
        Course course = new Course(name, surname, description);
        Database.allCourses.add(course);
        Database.courseNames.add(name);
    }


    public void printCourseDetails() {
        int i = 1;
        for (Course course : Database.allCourses) {
            if (course.getStudentsOfCourse().isEmpty()) {
                System.out.printf("%s. Kursun adi: %s. Kursu tedris eden muellim: %s. Bu kursda heleki hec bir telebe istirak etmir.", i, course.getName(), course.getTeacherName());
            } else {
                System.out.printf("%s. Kursun adi: %s. Kursu tedris eden muellim: %s. ", i, course.getName(), course.getTeacherName());
                System.out.println(); System.out.println("Kursda istirak eden telebeler:");
                int j = 1;
                for (Student student : course.getStudentsOfCourse()) {
                    System.out.printf("%s. %s %s", j, student.getName(), student.getSurname());
                    j++;
                    System.out.println();
                }
            }
            i++;
            System.out.println();
        }
        System.out.println();
    }
}
