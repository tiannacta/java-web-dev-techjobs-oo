package org.launchcode.techjobs_oo;
import org.junit.Test;
import org.launchcode.techjobs_oo.Job;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class Tests {
    @Test
    public void testSettingJobId() {
        Job test_job = new Job();
        Job test_job2 = new Job();
        assertEquals(test_job.getId(), test_job2.getId());
    }
    @Test
    public void testJobConstructorSetsAllFields() {
        Job test_job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(test_job3.getName(), "Product Tester");
        assertEquals(test_job3.getEmployer().getValue(), "ACME");
        assertEquals(test_job3.getLocation().getValue(), "Desert");
        assertEquals(test_job3.getPositionType().getValue(), "Quality Control");
        assertEquals(test_job3.getCoreCompetency().getValue(), "Persistence");
        assertEquals(test_job3 instanceof Job, true);
        assertTrue(test_job3 instanceof Job);
    }
    @Test

    public void testJobsForEquality() {
        Job test_job4 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        Job test_job5 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        assertEquals(test_job4.equals(test_job5), false);
    }
    @Test
    public void testBlankLineWithToStringMethod(){
        Job test_job6 = new Job();
        Job test_job7 = new Job();
        assertEquals(test_job6.toString().startsWith("\n"), true);
        assertEquals(test_job7.toString().endsWith("\n"), true);
    }
}