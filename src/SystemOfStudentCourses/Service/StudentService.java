package SystemOfStudentCourses.Service;

import SystemOfStudentCourses.Db.Database;
import SystemOfStudentCourses.Entiti.Student;

import java.util.Scanner;

public class StudentService {
    Scanner sc = new Scanner(System.in);

    public void add4Student() {
        Student st1 = new Student("Anar", "Haciyev", 19);
        Student st2 = new Student("Resul", "Eliyev", 18);
        Student st3 = new Student("Fazil", "Huseynov", 25);
        Student st4 = new Student("Resad", "Agayev", 23);
        Database.allStudents.add(st1);
        Database.allStudents.add(st2);
        Database.allStudents.add(st3);
        Database.allStudents.add(st4);
        Database.studentNames.add(st1.getName());
        Database.studentNames.add(st2.getName());
        Database.studentNames.add(st3.getName());
        Database.studentNames.add(st4.getName());
    }

    public void addStudentManually() {
        System.out.println("Sagirdin adini daxil edin:");
        String name = sc.nextLine();
        System.out.println("Sagirdin soyadini daxil edin:");
        String surname = sc.nextLine();
        System.out.println("Sagirdin yasini daxil edin:");
        int yas = sc.nextInt();
        Student student = new Student(name, surname, yas);
        Database.allStudents.add(student);
        Database.studentNames.add(name);
    }

    public void addStudentToCourse() {
        System.out.println("== Students ==");
        int i = 0;
        int j = 0;
        for (Student student : Database.allStudents) {
            System.out.printf("%s. %s %s", i+1, student.getName(), student.getSurname());
            i++;System.out.println();
        }
        for (String name : Database.courseNames) {
            System.out.printf("%s. %s", j+1, Database.courseNames.get(j));
            j++;System.out.println();
        }
        System.out.println("Telebeni secin:");
        int telebe=sc.nextInt();
        System.out.println("Elave etmek istediyiniz kursu secin:");
        int kurs=sc.nextInt();
        Database.allStudents.get(telebe-1).getCoursesOfStudent().add(Database.allCourses.get(kurs-1));
        Database.allCourses.get(kurs-1).getStudentsOfCourse().add(Database.allStudents.get(telebe-1));
    }
    public void printStudentDetails(){int i=0;
        for (Student student:Database.allStudents){
            System.out.printf("%s. %s",i+1,student.informPrint());
            i++;
            System.out.println();
        }
    }
}
