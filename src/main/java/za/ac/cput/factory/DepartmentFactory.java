package za.ac.cput.factory;

import za.ac.cput.domain.Department;
import java.util.UUID;

/**
 * DepartmentFactory.java - Factory class for creating Department objects
 * Author: Likhona Noroyita(230154239)
 * Date: 25 March 2026
 */

public class DepartmentFactory {

    public static Department createDepartment(String name) {

        if (name == null || name.isEmpty()) return null;

        return new Department.Builder()
                .setDepartmentId(UUID.randomUUID().toString())
                .setName(name)
                .build();
    }
}