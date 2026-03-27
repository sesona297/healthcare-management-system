package za.ac.cput.repository.impl;

import za.ac.cput.domain.Doctor;
import java.util.HashSet;
import java.util.Set;


/**
 * DoctorRepositoryImpl.java - In-memory implementation of DoctorRepository
 * Implements Singleton pattern - only one instance exists
 *
 * Author: Likhona Noroyita
 * Date: 25 March 2026
 */

public class DoctorRepositoryImpl implements DoctorRepository {

    private static DoctorRepository repo = null;
    private Set<Doctor> db = new HashSet<>();

    private DoctorRepositoryImpl(){}

    public static DoctorRepository getRepository() {
        if (repo == null) repo = new DoctorRepositoryImpl();
        return repo;
    }

    public Doctor create(Doctor d){ db.add(d); return d; }

    public Doctor read(String id){
        return db.stream().filter(x->x.getDoctorId().equals(id)).findFirst().orElse(null);
    }

    public Doctor update(Doctor d){
        Doctor old = read(d.getDoctorId());
        if(old!=null){ db.remove(old); db.add(d); return d; }
        return null;
    }

    public boolean delete(String id){
        Doctor d = read(id);
        return d != null && db.remove(d);
    }

    public Set<Doctor> getAll(){ return db; }
}
