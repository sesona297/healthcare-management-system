package za.ac.cput.repository;

import za.ac.cput.domain.Appointment;
import za.ac.cput.repository.IRepository;
import java.util.Set;

/**
 * IAppointmentRepository interface
 * Author: 221066748-Noxolo Portia Ngubo
 */

public interface IAppointmentRepository extends IRepository<Appointment, String> {
    Set<Appointment> getAll();

    Appointment create(Appointment entity);

    Appointment read(String id);

    Appointment update(Appointment entity);

    boolean delete(String id);
}
