package za.ac.cput.factory;

/**
 * DoctorFactoryTest.java - TDD tests for DoctorFactory
 * Author:Likhona Noroyita(230154239)
 * Date: 25 March 2026
 */

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.*;
import za.ac.cput.domain.enums.*;
import static org.junit.jupiter.api.Assertions.*;

class DoctorFactoryTest {

    @Test
    void createDoctor(){
        Doctor d = DoctorFactory.createDoctor("Dr A", Specialization.GENERAL, DoctorStatus.ACTIVE);
        assertNotNull(d);
    }
}
