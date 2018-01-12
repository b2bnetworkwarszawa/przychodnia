package com.b2bnetwork.AntoniPiszczek;

public class Patients {
    private int id;
    private String name, lastName;
    Patients(int id, String name, String lastName){
        this.id=id;
        this.lastName=lastName;
        this.name=name;
    }
    public int getId() {
        return id;
    }
    public String getLastName() {
        return lastName;
    }
    public String getName() {
        return name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void printPatient(){
        System.out.println(lastName+" "+name+" "+id);
    }
}
