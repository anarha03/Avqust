package SystemOfStudentCourses.Entiti;

import java.util.ArrayList;

public class Course {
    private String name;
    private String teacherName;
    private String description;
    private ArrayList<Student> studentsOfCourse=new ArrayList<>();

    public Course(String name, String teacherName, String description) {
        this.name = name;
        this.teacherName = teacherName;
        this.description = description;
    }

    @Override
    public String toString() {
        if (studentsOfCourse.isEmpty()) {
            return "name='" + name + '\'' +
                    ", teacherName='" + teacherName + '\'' +
                    ", description='" + description + '\'' +

                    '}';
        } else
            return "name='" + name + '\'' +
                    ", teacherName='" + teacherName + '\'' +
                    ", description='" + description + '\'' +
                    '}';

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Student> getStudentsOfCourse() {
        return studentsOfCourse;
    }

    public void setStudentsOfCourse(ArrayList<Student> studentsOfCourse) {
        this.studentsOfCourse = studentsOfCourse;
    }
}
