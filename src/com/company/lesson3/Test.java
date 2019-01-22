package com.company.lesson3;

import com.company.lesson4.Student;

import java.util.ArrayList;

public class Test {


    public ArrayList<Person> persons(){
        ArrayList<Person> personArrayList = new ArrayList<>();

        personArrayList.add(new Person("Petro", "Poroshenko", 60));
        personArrayList.add(new Person("Petro", "Poroshenko", 60));
        personArrayList.add(new Person("Petro", "Poroshenko", 60));
        personArrayList.add(new Person("Yulia", "Tymoshenko", 63));
        personArrayList.add(new Person("Svyatoslav", "Vakarchuk", 41));
        personArrayList.add(new Person("Volodymyr", "Zelenskiy", 40));
        personArrayList.add(new Person("Andrii", "Sadoviy", 55));
        personArrayList.add(new Person("Oleh", "Tyagnybok", 48));
        personArrayList.add(new Person("Oleh", "Lyashko", 44));
        personArrayList.add(new Person("Mykhaylo", "Dobkin", 46));
        personArrayList.add(new Person("Nadiya", "Savchenko", 37));
        personArrayList.add(new Person("Serhii", "Taruta", 54));
    return personArrayList;
    }

    public Company myCompany(){
        return new Company("My", persons());
    }

    public ArrayList<Student> students(){
        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(new Student("Petro", "Patochkin", 22, "001", "FITKI", "fifth", "3"));
        studentArrayList.add(new Student("Vinni", "Puh", 30, "002","FITKI", "fifth", "3" ));
        studentArrayList.add(new Student("Christopher", "Robin", 18,  "003","FITKI", "fifth", "3"));
        studentArrayList.add(new Student("Micky", "Mouse", 22, "004", "FITKI", "fifth", "2"));
        studentArrayList.add(new Student("Sponge", "Bob", 19, "005", "FITKI", "fifth", "2"));
        studentArrayList.add(new Student("Gena", "the Crocodile", 33, "006", "FITKI", "fifth", "2"));
        return studentArrayList;
    }






}
