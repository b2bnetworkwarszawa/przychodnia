package com.b2bnetwork.AntoniPiszczek;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;


import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ClinicTest {
    @Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
            /* id name lastname*/
              {1, "imie", "nazwisko"},
              {2, "", "nazwisko2"},
              {3, "imie3", ""},
              {0, "imie4", "nazwisko4"}
        });
    }
    @Parameter
    public int id;
    @Parameter(1)
    public String name;
    @Parameter(2)
    public String lastName;
    private Clinic clinic=new Clinic("probna klinika");
    @Before
    public void SetUP(){
        for (int i = 0; i<=10; i++){
            clinic.patients.add(new Patients(i,"pacjent"+Integer.toString(i), "nazwisko"+Integer.toString(i)));
        }
    }
    @Test
    public void setName() {
        clinic.setName(name);
        Assert.assertEquals(name,clinic.getName());
        clinic.setName("probna klinika");
    }
    @Test
    public void getName() {
        Assert.assertEquals("probna klinika",clinic.getName());
    }
    @Test
    public void addPatient() {
        clinic.addPatient(id,name,lastName);
        Assert.assertTrue(clinic.getPatients().stream().anyMatch(s->s.getName().equals(name)));
    }

    @Test
    public void removePatient() {
        clinic.addPatient(id,name,lastName);
        clinic.removePatient(id);
        Assert.assertTrue(clinic.getPatients().stream().noneMatch(s->s.getName().equals(name)));
    }

    @Test
    public void getPatient() {
        Patients tmpPatient= clinic.getPatient(0);
        Assert.assertEquals("pacjent0", tmpPatient.getName());
    }
}