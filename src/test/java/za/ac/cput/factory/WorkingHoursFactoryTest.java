package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.WorkingHours;
import static org.junit.jupiter.api.Assertions.*;

/** WorkingHoursFactoryTest.java - TDD tests for WorkingHoursFactory
 * Author: Likhona Noroyita(23015239)
 * Date : 25 March 2026
 */

class WorkingHoursFactoryTest {

    @Test
    void createWorkingHours() {
        WorkingHours wh = WorkingHoursFactory.createWorkingHours(
                "Monday",
                "08:00",
                "16:00"
        );

        assertNotNull(wh);
        assertNotNull(wh.getWorkingHoursId());
        assertEquals("Monday", wh.getDay());
    }

    @Test
    void createWorkingHoursFail() {
        WorkingHours wh = WorkingHoursFactory.createWorkingHours(
                null,
                "08:00",
                "16:00"
        );

        assertNull(wh);
    }
}
