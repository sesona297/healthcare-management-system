package za.ac.cput.repository;

import org.junit.jupiter.api.*;
import za.ac.cput.domain.*;
import za.ac.cput.domain.enums.*;
import za.ac.cput.factory.*;
import za.ac.cput.repository.impl.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * DoctorRepositoryTest.java - TDD tests for DoctorRepository
 * Author: Likhona Noroyita(230154239)
 * Date: 25 March 2026
 */

class DoctorRepositoryTest {

    private DoctorRepository repo;
    private Doctor d;

    @BeforeEach
    void setUp(){
        repo = DoctorRepositoryImpl.getRepository();
        d = DoctorFactory.createDoctor("Dr B", Specialization.CARDIOLOGY, DoctorStatus.ACTIVE);
    }

    @Test
    void create(){ assertNotNull(repo.create(d)); }

    @Test
    void read(){
        repo.create(d);
        assertNotNull(repo.read(d.getDoctorId()));
    }
}
