package org.launchcode.techjobs_oo.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId(){
        Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job test_job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(1,test_job.getId());
        assertEquals(2,test_job2.getId());
        assertTrue(test_job2.getId() > test_job.getId());
        assertFalse(test_job2.getId()<test_job.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(test_job instanceof Job);
    }

    @Test
    public void testJobsForEquality(){
        Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job test_job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(test_job.equals(test_job2));
    }

}

