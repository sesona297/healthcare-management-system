package za.ac.cput.factory;

import za.ac.cput.domain.Appointment;
import java.time.LocalTime;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Appointment Factory test
 * Author: 221066748-Noxolo Portia Ngubo
 */


class AppointmentFactoryTest {

    @Test
    public void testCreateAppointmentSuccess(){
        Appointment appointment= AppointmentFactory.createAppointment(
                LocalDate.now(),
                LocalTime.NOON,
                "DOC-123",
                "PAT-456",
                true
        );
        assertNotNull(appointment);
        System.out.println(appointment.toString());
    }
    @Test
    public void testCreateAppointmentWithFail(){
        Appointment appointment= AppointmentFactory.createAppointment(
                LocalDate.now(),
                LocalTime.NOON,
                "",
                "PAT-456",
                true
        );
        assertNull(appointment);
    }

}
