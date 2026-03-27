package za.ac.cput.factory;

import za.ac.cput.domain.Appointment;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

/**
 * Appointment factory class
 * Author: 221066748-Noxolo Portia Ngubo
 * Date: 26 March 2026
 */

public class AppointmentFactory {
    public static Appointment createAppointment (LocalDate date, LocalTime time, String doctorID, String patientID, boolean status ) {
        if (doctorID == null || doctorID.isEmpty() || patientID == null || patientID.isEmpty()) {
            return null;
        }
        String appointmentID = UUID.randomUUID().toString();

        return new Appointment.Builder()
                .setAppointmentID(appointmentID)
                .setDate(date)
                .setTime(time)
                .setDoctorID(doctorID)
                .setPatientID(patientID)
                .setStatus(status)
                .build();
    }
    }

