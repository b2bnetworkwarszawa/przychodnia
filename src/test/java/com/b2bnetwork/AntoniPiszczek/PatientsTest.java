package com.b2bnetwork.AntoniPiszczek;

import org.junit.Assert;
import org.junit.Test;



public class PatientsTest {

    Patients patients=new Patients(1,"Ant","Pi");
    @Test
    public void getId() {
        Assert.assertEquals(1, patients.getId());
    }

    @Test
    public void getLastName() {
        Assert.assertEquals("Pi", patients.getLastName());
    }

    @Test
    public void getName() {
        Assert.assertEquals("Ant", patients.getName());
    }

    @Test
    public void setId() {
        patients.setId(2);
        Assert.assertEquals(2, patients.getId());
        patients.setId(1);
    }
    @Test
    public void setLastName() {
        patients.setLastName("Example");
        Assert.assertEquals("Example", patients.getLastName());
        patients.setLastName("Pi");
    }
    @Test
    public void setName() {
        patients.setName("Example");
        Assert.assertEquals("Example", patients.getName());
        patients.setName("Pi");
    }
}