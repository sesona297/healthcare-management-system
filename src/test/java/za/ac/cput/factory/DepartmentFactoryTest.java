package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Department;
import static org.junit.jupiter.api.Assertions.*;

/** DepartmentFactoryTest.java - TDD tests for DepartmentFactory
 * Author: Likhona Noroyita(230154239)
 * Date: 25 March 2026
 */

class DepartmentFactoryTest {

    @Test
    void createDepartment() {
        Department dept = DepartmentFactory.createDepartment("Cardiology");

        assertNotNull(dept);
        assertNotNull(dept.getDepartmentId());
        assertEquals("Cardiology", dept.getName());
    }

    @Test
    void createDepartmentFail() {
        Department dept = DepartmentFactory.createDepartment("");

        assertNull(dept);
    }
}
