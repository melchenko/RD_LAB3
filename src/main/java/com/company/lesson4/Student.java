package com.company.lesson4;

import com.company.lesson3.Person;

public class Student extends Person {

    private String id;
    private String faculty;
    private String course;
    private String groupe;

    public Student(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Student(String firstName, String lastName, String id, String faculty, String course, String groupe) {
        super(firstName, lastName);
        this.id = id;
        this.faculty = faculty;
        this.course = course;
        this.groupe = groupe;
    }



    public Student(String firstName, String lastName, int age, String id, String faculty, String course, String groupe) {
        super(firstName, lastName, age);
        this.id = id;
        this.faculty = faculty;
        this.course = course;
        this.groupe = groupe;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getGroupe() {
        return groupe;
    }

    public void setGroupe(String groupe) {
        this.groupe = groupe;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", middleName='" + getMiddleName() + '\'' +
                ", dateOfBirthday='" + getDateOfBirthday() + '\'' +
                ", adress='" + getAdress() + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", age=" + getAge() +
                "id='" + id + '\'' +
                ", faculty='" + faculty + '\'' +
                ", course='" + course + '\'' +
                ", groupe='" + groupe + '\'' +
                '}';
    }


}
