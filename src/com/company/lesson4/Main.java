package com.company.lesson4;

import com.company.lesson3.Person;
import com.company.lesson3.Test;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Test test = new Test();
        ArrayList<Person> person = test.persons();
//        HashSet<Person> setOfPerson = new HashSet<>(person);
//        System.out.println(setOfPerson);


//        HashMap<String, Integer> myHashMap = new HashMap<>();
//        myHashMap.put("M", 1);
//        myHashMap.put("а", 4);
//        myHashMap.put("м", 3);
//        myHashMap.put("ы", 1);
//        myHashMap.put("л", 1);
//        myHashMap.put("р", 1);
//        myHashMap.put("у",1 );
//
//        for (Map.Entry<String, Integer> entry:myHashMap.entrySet()) {
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }

        ArrayList<Student> students = test.students();
        University university = new University("VNTU", students);

//          university.setStudentFaculty("Petro", "Patochkin", "FITKI");
//        university.setStudentFaculty("Vinni", "Puh", "FAKSU");
//        university.setStudentFaculty("Christopher", "Robin", "FAKSU");
//        university.setStudentFaculty("Micky", "Mouse", "FITKI");
//
//        university.findStudent("Petro", "Patochkin").setFaculty("FITKI");


        System.out.println(university.getStudentOfFacultyAndCourse("FITKI", "3").toString());
        System.out.println(university.getStudentsOfFaculty("FITKI").toString());

        HashExample hash = new HashExample();

        System.out.println(hash.convertStringToHashmaps("Mammma myla rammu"));

        System.out.println(UniversityEnum.FITKI52.getFaculty());


    }
}





