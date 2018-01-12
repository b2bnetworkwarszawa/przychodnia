package com.b2bnetwork.AntoniPiszczek;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.any;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.MatcherAssert.assertThat;

public class ClinicTest {

    Clinic clinic=new Clinic("probna klinika");
    @Before
    public void SetUP(){
        for (int i = 0; i<=10; i++){
            clinic.addPatient(i, "pacjent" + Integer.toString(i), "nazwisko");
        }
    }
    @Test
    public void setName() {
        clinic.setName("zmieniona nazwa");
        Assert.assertEquals("zmieniona nazwa",clinic.getName());
        clinic.setName("probna klinika");
    }
    @Test
    public void getName() {
        Assert.assertEquals("probna klinika",clinic.getName());
    }
    @Test
    public void addPatient() {
        clinic.addPatient(11,"ant", "pi");
        Assert.assertTrue(clinic.patients.stream().anyMatch(s->s.getName()=="ant"));
    }

    @Test
    public void removePatient() {
        clinic.addPatient(12, "ant2", "pi2");
        clinic.removePatient(12);
        Assert.assertTrue(clinic.patients.stream().noneMatch(s->s.getName()=="ant2"));
    }

    @Test
    public void getPatient() {
        Patients tmpPatient= clinic.getPatient(0);
        Assert.assertEquals("pacjent0", tmpPatient.getName());
    }
}