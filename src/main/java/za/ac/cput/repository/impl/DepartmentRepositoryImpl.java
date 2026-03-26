package za.ac.cput.repository.impl;

import za.ac.cput.domain.Department;
import java.util.HashSet;
import java.util.Set;

/**
 * DepartmentRepositoryImpl.java - In-memory implementation of DepartmentRepository
 * Implements Singleton pattern - only one instance exists
 *
 * Author: Likhona Noroyita(230154239)
 * Date: 25 March 2026
 */

public class DepartmentRepositoryImpl implements DepartmentRepository {

    private static DepartmentRepository repo = null;
    private Set<Department> db = new HashSet<>();

    private DepartmentRepositoryImpl(){}

    public static DepartmentRepository getRepository(){
        if(repo==null) repo=new DepartmentRepositoryImpl();
        return repo;
    }

    public Department create(Department d){ db.add(d); return d; }

    public Department read(String id){
        return db.stream().filter(x->x.getDepartmentId().equals(id)).findFirst().orElse(null);
    }

    public Department update(Department d){
        Department old = read(d.getDepartmentId());
        if(old!=null){ db.remove(old); db.add(d); return d; }
        return null;
    }

    public boolean delete(String id){
        Department d = read(id);
        return d != null && db.remove(d);
    }

    public Set<Department> getAll(){ return db; }
}
