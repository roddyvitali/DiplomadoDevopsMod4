package exercise_2_covid;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class StepToStepTests {
    @Test
    public void allowedToGoOutTests() {
        StepToStep plan = new StepToStep();
        // You're allowed to go out
        // You're allowed to go out in business day when location is transition
        assertTrue(plan.allowedToGoOut(Location.MACUL, Week.BUSINESS_DAY, Schedule.DAY));
        // You're allowed to go out all week when location is preparation
        assertTrue(plan.allowedToGoOut(Location.LA_REINA, Week.BUSINESS_DAY, Schedule.DAY));
        assertTrue(plan.allowedToGoOut(Location.LA_REINA, Week.WEEKEND, Schedule.DAY));
        // You're allowed to go out all week when location is initial opening
        assertTrue(plan.allowedToGoOut(Location.LAS_CONDES, Week.BUSINESS_DAY, Schedule.DAY));
        assertTrue(plan.allowedToGoOut(Location.LAS_CONDES, Week.WEEKEND, Schedule.DAY));
        // Shouldn't go out - stay in your home
        // Shouldn't go out when is night in all of Chile
        assertFalse(plan.allowedToGoOut(Location.SANTIAGO, Week.BUSINESS_DAY, Schedule.NIGHT));
        assertFalse(plan.allowedToGoOut(Location.SANTIAGO, Week.WEEKEND, Schedule.NIGHT));
        assertFalse(plan.allowedToGoOut(Location.MACUL, Week.BUSINESS_DAY, Schedule.NIGHT));
        assertFalse(plan.allowedToGoOut(Location.MACUL, Week.WEEKEND, Schedule.NIGHT));
        assertFalse(plan.allowedToGoOut(Location.LAS_CONDES, Week.BUSINESS_DAY, Schedule.NIGHT));
        assertFalse(plan.allowedToGoOut(Location.LAS_CONDES, Week.WEEKEND, Schedule.NIGHT));
        assertFalse(plan.allowedToGoOut(Location.LA_REINA, Week.BUSINESS_DAY, Schedule.NIGHT));
        assertFalse(plan.allowedToGoOut(Location.LA_REINA, Week.WEEKEND, Schedule.NIGHT));
        // Shouldn't go out during day when location is in quarintine
        assertFalse(plan.allowedToGoOut(Location.SANTIAGO, Week.BUSINESS_DAY, Schedule.DAY));
        assertFalse(plan.allowedToGoOut(Location.SANTIAGO, Week.WEEKEND, Schedule.DAY));
        // Shouldn't go out during day in weekend when location is in transition
        assertFalse(plan.allowedToGoOut(Location.MACUL, Week.WEEKEND, Schedule.DAY));
        // Location is not register but for security shouldn't go out during all week
        assertFalse(plan.allowedToGoOut(Location.RANDOM, Week.BUSINESS_DAY, Schedule.DAY));
        assertFalse(plan.allowedToGoOut(Location.RANDOM, Week.WEEKEND, Schedule.DAY));
        assertFalse(plan.allowedToGoOut(Location.RANDOM, Week.BUSINESS_DAY, Schedule.NIGHT));
        assertFalse(plan.allowedToGoOut(Location.RANDOM, Week.WEEKEND, Schedule.NIGHT));

    }
}