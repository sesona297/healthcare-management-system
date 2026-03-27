package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Appointment;
import za.ac.cput.factory.AppointmentFactory;
import java.time.LocalTime;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Author: 221066748-Noxolo Portia Ngubo
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class AppointmentRepositoryTest {
    private static AppointmentRepository repository = AppointmentRepository.getRepository();

    private static Appointment appointment = AppointmentFactory.createAppointment(
            LocalDate.now(),
            LocalTime.now(),
            "DOC-99",
            "PAT-77",
            true
    );
    @Test
    @Order(1)
    void create() {
        Appointment created = repository.create(appointment);
        assertNotNull(created);
        System.out.println("Created: " + created);
    }
    @Test
    @Order(2)
    void read() {
        Appointment read = repository.read(appointment.getAppointmentID());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }
    @Test
    @Order(3)
    void update() {
        // Use the builder copy method to change the status
        Appointment updated = new Appointment.Builder()
                .copy(appointment)
                .setStatus(false)
                .build();
        assertNotNull(repository.update(updated));
        System.out.println("Updated: " + updated);
    }
    @Test
    @Order(4)
    void getAll() {
        assertNotNull(repository.getAll());
        assertTrue(repository.getAll().size() > 0);
        System.out.println("Show All: " + repository.getAll());
    }
    @Test
    @Order(5)
    void delete() {
        boolean success = repository.delete(appointment.getAppointmentID());
        assertTrue(success);
        System.out.println("Deleted: " + success);
    }
}


