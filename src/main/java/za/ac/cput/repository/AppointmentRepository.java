package za.ac.cput.repository;

import za.ac.cput.domain.Appointment;

import java.util.HashSet;
import java.util.Set;

/**
 * Author: 221066748-Noxolo Portia Ngubo
 */

public class AppointmentRepository implements IAppointmentRepository{
    public static AppointmentRepository repository= null;
    private Set<Appointment> appointmentDB;

    private AppointmentRepository(){
        appointmentDB= new HashSet<>();
    }
    public static AppointmentRepository getRepository(){
        if (repository== null){
            repository= new AppointmentRepository();
        }
        return repository;
    }
    @Override
    public Appointment create(Appointment entity){
        boolean success= appointmentDB.add(entity);
        if (!success) return null;
        return entity;
    }
    @Override
    public Appointment read(String id) {
        return appointmentDB.stream()
                .filter(a -> a.getAppointmentID().equals(id))
                .findAny()
                .orElse(null);
    }
    @Override
    public Appointment update(Appointment entity) {
        Appointment oldAppointment = read(entity.getAppointmentID());
        if (oldAppointment != null) {
            appointmentDB.remove(oldAppointment);
            appointmentDB.add(entity);
            return entity;
        }
        return null;
    }
    @Override
    public boolean delete(String id) {
        Appointment appointmentToDelete = read(id);
        if (appointmentToDelete == null) return false;
        appointmentDB.remove(appointmentToDelete);
        return true;
    }
    @Override
    public Set<Appointment> getAll() { // Must return Set<Appointments>
        return appointmentDB;
    }

}