package za.ac.cput.repository.impl;

import za.ac.cput.domain.Doctor;
import za.ac.cput.repository.Repository;
import java.util.Set;

/**
 * DoctorRepository.java - Repository interface for Doctor entity
 * Extends generic Repository for CRUD operations
 *
 * Author: Likhona Noroyita(23015423)
 * Date: 25 March 2026
 */


public interface DoctorRepository extends Repository<Doctor, String> {
    Set<Doctor> getAll();
}
