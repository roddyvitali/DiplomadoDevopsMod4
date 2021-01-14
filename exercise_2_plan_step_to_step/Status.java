package exercise_2_plan_step_to_step;

public class Status {
    String location;
    String step;
    String[] restrictionDay;

    public Status(String location, String step, String[] restrictionDay) {
        this.location = location;
        this.step = step;
        this.restrictionDay = restrictionDay;
    }

    public String[] getRestrictionDay() {
        return restrictionDay;
    }

    public String getLocation() {
        return location;
    }

    public String getStep() {
        return step;
    }

}