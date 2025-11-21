package SystemOfStudentCourses.Service;

import SystemOfStudentCourses.Db.Database;
import SystemOfStudentCourses.Entiti.Student;

import java.util.Scanner;

public class UsefullMethods {
    StudentService studentService = new StudentService();
    CourseService courseService = new CourseService();
    Scanner sc = new Scanner(System.in);

    public void adminMethods() {
        while (true) {
            System.out.println("=== ADMIN PANEL ===\n" +
                    "1. Yeni tələbə əlavə et\n" +
                    "2. Yeni kurs əlavə et\n" +
                    "3. Tələbəni kursa təyin et\n" +
                    "4. Tələbələrin siyahısını göstər\n" +
                    "5. Kursların siyahısını göstər\n" +
                    "6. Geri qayıt\n" +
                    "Secim:");
            int secim = sc.nextInt();
            switch (secim) {
                case 1: {
                    studentService.addStudentManually();
                    break;
                }
                case 2: {
                    courseService.addCourseManually();
                    break;
                }
                case 3: {
                    studentService.addStudentToCourse();
                    break;
                }
                case 4: {
                    studentService.printStudentDetails();
                    break;
                }
                case 5: {
                    courseService.printCourseDetails();
                    break;
                }
                case 6: {
                    return;
                }
                default:
                    System.out.println("Seciminiz yanlisdir!!");
                    break;
            }
        }
    }

    public void studentMethods() {
        while (true) {
            System.out.println("=== STUDENT PANEL ===\n" +
                    "Adini daxil et:");
            String name = sc.nextLine();
            System.out.println("Soyadini daxil et");
            String surname = sc.nextLine();
            for (Student student : Database.allStudents) {
                if (name.equals(student.getName()) && surname.equals(student.getSurname())) {
                    System.out.println(student.informPrint());
                    return;
                }
            }
            System.out.println("Bele bir telebe bazada yoxdur!!");
            return;
        }
    }public void courseManagement(){
        UsefullMethods usefullMethods=new UsefullMethods();
        studentService.add4Student();
        courseService.addCourses();
    while (true) {
        System.out.println("=== COURSE MANAGEMENT SYSTEM ===");
        System.out.println("1. Admin kimi daxil ol\n" +
                "2. Tələbə kimi daxil ol\n" +
                "3. Çıxış\n" +
                "Seçiminizi daxil edin:");
        int secim = sc.nextInt();
        switch (secim) {
            case 1: {
                usefullMethods.adminMethods();
                break;
            }
            case 2: {
                usefullMethods.studentMethods();break;
            }
            case 3: {
                System.out.println("Sagolun");
                return;
            }
            default: {
                System.out.println("Seciminiz yanlisdir");
            }
        }
    }}
}
