package com.b2bnetwork.AntoniPiszczek;

import java.util.HashSet;


public class Clinic {
    String name;
    HashSet<Patients> patients = new HashSet();
    Clinic(String name){
        this.name=name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void addPatient(int id, String name, String lastName){
        patients.add(new Patients(id,name,lastName));
    }
    public void removePatient(int id){
        patients.removeIf(s-> s.getId() == id);
    }
    public Patients getPatient(int id){
        for (Patients patient : patients) {
            if(patient.getId()==id){
                return patient;
            }
        }
        return null;
    }
    public void printPatient(int id){
        Patients s=getPatient(id);
        s.printPatient();
    }
    public void printAllPatients(){
        patients.forEach(s->s.printPatient());
    }
}
