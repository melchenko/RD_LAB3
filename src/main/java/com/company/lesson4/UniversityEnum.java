package com.company.lesson4;

public enum UniversityEnum {
        FITKI51("FITKI", "fifth", "1", 16),
        FITKI52("FITKI", "fifth", "2", 18),
        FITKI53("FITKI", "fifth", "3", 19),
        FAKSU51("FAKSU", "fifth", "1", 22),
        FAKSU52("FAKSU", "fifth", "2", 21),
        FAKSU53("FAKSU", "fifth", "3", 23);

    String faculty;
    String course;
    String groupe;
    int quantityStudent;


    public int getQuantityStudent() {
        return quantityStudent;
    }

     public void setQuantityStudent(int quantityStudent) {
        this.quantityStudent = quantityStudent;
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
        return "UniversityEnum{" +
                "faculty='" + faculty + '\'' +
                ", course='" + course + '\'' +
                ", groupe='" + groupe + '\'' +
                '}';
    }


    UniversityEnum(String faculty, String course, String groupe, int quantityStudents) {
        this.faculty = faculty;
        this.course = course;
        this.groupe = groupe;
        this.quantityStudent=quantityStudents;
    }
}
