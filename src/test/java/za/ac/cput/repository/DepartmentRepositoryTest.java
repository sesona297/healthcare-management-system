package za.ac.cput.repository;

import org.junit.jupiter.api.*;
import za.ac.cput.domain.*;
import za.ac.cput.factory.*;
import za.ac.cput.repository.impl.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * DepartmentRepositoryTest.java - TDD tests for DepartmentRepository
 * Author: Likhona Noroyita(230154239)
 * Date: 25 March 2026
 */

class DepartmentRepositoryTest {

    private DepartmentRepository repo;
    private Department d;

    @BeforeEach
    void setUp(){
        repo = DepartmentRepositoryImpl.getRepository();
        d = DepartmentFactory.createDepartment("ER");
    }

    @Test
    void create(){ assertNotNull(repo.create(d)); }
}
