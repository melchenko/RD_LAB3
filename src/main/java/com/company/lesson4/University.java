package com.company.lesson4;

import java.util.ArrayList;

public class University {
    private String nameOfUniversity;
    private ArrayList<Student> students;

    public University(String nameOfUniversity, ArrayList<Student> students) {
        this.nameOfUniversity = nameOfUniversity;
        this.students = students;
    }

    public University() {
    }

    @Override
    public String toString() {
        return "University{" +
                "nameOfUniversity='" + nameOfUniversity + '\'' +
                ", students=" + students +
                '}';
    }

    public String getNameOfUniversity() {
        return nameOfUniversity;
    }

    public void setNameOfUniversity(String nameOfUniversity) {
        this.nameOfUniversity = nameOfUniversity;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Student> getStudentsOfFaculty(String fac) {
        ArrayList<Student> studentOfFaculty = new ArrayList<>();

        for (Student s : students) {
            if (s.getFaculty().equals(fac)) {
                studentOfFaculty.add(s);
            }
        }
        return studentOfFaculty;
    }

    public Student findStudent(String firstName, String lastName) {
        for (Student s : students) {
            if (s.getFirstName().equals(firstName) && s.getLastName().equals(lastName)) return s;
        }
        return null;
    }

    public ArrayList<Student> getStudentOfFacultyAndCourse(String faculty, String course){
        ArrayList<Student> studentOfFacultyAndCourse = new ArrayList<>();

        for (Student s : students) {
            if ((s.getFaculty().equals(faculty))&&(s.getCourse().equals(course))) {
                studentOfFacultyAndCourse.add(s);
            }
        }
        return studentOfFacultyAndCourse;
    }

    public ArrayList<Student> getStudentAfterYear(int year){
        //     boolean after = date2.after(date);
        ArrayList<Student> studentOfYear = new ArrayList<>();

        for (Student s : students) {
            if (s.getAge() <= 2019-year) {
                studentOfYear.add(s);
            }
        }
        return studentOfYear;
    }


    public void setStudentFaculty(String firstName, String lastName, String faculty) {
        for (Student s : students) {
            if (s.getFirstName().equals(firstName) && s.getLastName().equals(lastName)) s.setFaculty(faculty);
        }

    }
}

