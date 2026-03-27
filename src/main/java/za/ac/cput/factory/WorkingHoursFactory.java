package za.ac.cput.factory;

import za.ac.cput.domain.WorkingHours;
import java.util.UUID;

/**
 * WorkingHoursFactory.java - Factory class for creating WorkingHours objects
 * Author: Likhona Noroyita(230154239)
 * Date: 25 March 2026
 */

public class WorkingHoursFactory {

    public static WorkingHours createWorkingHours(String day,
                                                  String start,
                                                  String end) {

        if (day == null || start == null || end == null) return null;

        return new WorkingHours.Builder()
                .setWorkingHoursId(UUID.randomUUID().toString())
                .setDay(day)
                .setStartTime(start)
                .setEndTime(end)
                .build();
    }
}
