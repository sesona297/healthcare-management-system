package za.ac.cput.factory;

import za.ac.cput.domain.Doctor;
import za.ac.cput.domain.enums.*;
import java.util.UUID;

/**
 * DoctorFactory.java - Factory class for creating Doctor objects
 * Author: Likhona Noroyita(230154239)
 * Date: 25 March 2026
 */

public class DoctorFactory {

    public static Doctor createDoctor(String name,
                                      Specialization specialization,
                                      DoctorStatus status) {

        if (name == null || name.isEmpty()) return null;

        return new Doctor.Builder()
                .setDoctorId(UUID.randomUUID().toString())
                .setName(name)
                .setSpecialization(specialization)
                .setStatus(status)
                .build();
    }
}
