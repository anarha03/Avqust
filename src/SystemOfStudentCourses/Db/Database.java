package SystemOfStudentCourses.Db;

import SystemOfStudentCourses.Entiti.Course;
import SystemOfStudentCourses.Entiti.Student;

import java.util.ArrayList;
import java.util.Map;

public class Database {
    public static Map<String, Student>courseStudents;
    public static ArrayList<Student>allStudents=new ArrayList<>();
    public static ArrayList<Course>allCourses=new ArrayList<>();
    public static ArrayList<String>studentNames=new ArrayList<>();
    public static ArrayList<String>courseNames=new ArrayList<>();
}
