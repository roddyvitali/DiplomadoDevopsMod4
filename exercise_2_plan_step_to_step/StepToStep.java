package exercise_2_plan_step_to_step;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StepToStep {

    List<String> validLocations = new ArrayList<>();
    List<Status> locationStatus = new ArrayList<>();

    public StepToStep() {
        addValidLocations();
        addStatus();
    }

    Boolean allowedToGoOut(String location, String week, String schedule) {
        Boolean allowedOut = true;
        if (!validLocations.contains(location))
            allowedOut = false;
        if (schedule == Schedule.NIGHT)
            allowedOut = false;
        Status status = locationStatus.stream().filter(sta -> location.equals(sta.getLocation())).findAny()
                .orElse(null);
        if (status == null)
            allowedOut = false;
        else if (Arrays.asList(status.restrictionDay).contains(week))
            allowedOut = false;
        return allowedOut;
    }

    private void addValidLocations() {
        validLocations.add(Location.SANTIAGO);
        validLocations.add(Location.LAS_CONDES);
        validLocations.add(Location.LA_REINA);
        validLocations.add(Location.MACUL);
    }

    private void addStatus() {
        String[] quarantineRestriction = { Week.BUSINESS_DAY, Week.WEEKEND };
        String[] transitionRestriction = { Week.WEEKEND };
        String[] noneRestriction = {};
        locationStatus.add(new Status(Location.SANTIAGO, Step.QUARANTINE, quarantineRestriction));
        locationStatus.add(new Status(Location.MACUL, Step.TRANSITION, transitionRestriction));
        locationStatus.add(new Status(Location.LA_REINA, Step.PREPARATION, noneRestriction));
        locationStatus.add(new Status(Location.LAS_CONDES, Step.INITIAL_OPENING, noneRestriction));
    }

}