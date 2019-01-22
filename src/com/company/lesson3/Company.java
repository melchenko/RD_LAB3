package com.company.lesson3;

import java.util.ArrayList;

public class Company {
    private String companyName;
    private ArrayList<Person> employees;

    public Company(String companyName) {
        this.companyName = companyName;
    }

    public Company(String companyName, ArrayList<Person> employees) {
        this.companyName = companyName;
        this.employees = employees;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setEmployees(ArrayList<Person> employees) {
        this.employees = employees;
    }

    public String getCompanyName() {
        return companyName;
    }

    public ArrayList<Person> getEmployees() {
        return employees;
    }

    public int getNumEmployees() {
      return employees.size();
    }

    public boolean checkFirstName(String name){
        for (Person e: employees) {
            if (e.getFirstName().equals(name)) return true;
        }
        return false;
    }
    public boolean checkLastName(String name){
        for (Person e: employees) {
            if (e.getLastName().equals(name)) return true;
        }
        return false;
    }
    public  Person findEmloyeeByFirstname(String name){
        for (Person e: employees) {
            if (e.getFirstName().equals(name)) return e;
        }
        return null;
    }

}
