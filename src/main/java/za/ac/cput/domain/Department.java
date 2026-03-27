package za.ac.cput.domain;

/**
 * Department.java - Department model class using Builder Pattern
 * Author: Likhona Noroyita(230154239)
 * Date: 25 March 2026
 */

public class Department {

    private String departmentId;
    private String name;

    private Department(Builder builder) {
        this.departmentId = builder.departmentId;
        this.name = builder.name;
    }

    public String getDepartmentId() { return departmentId; }
    public String getName() { return name; }

    public static class Builder {
        private String departmentId;
        private String name;

        public Builder setDepartmentId(String departmentId) {
            this.departmentId = departmentId;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder copy(Department dept) {
            this.departmentId = dept.departmentId;
            this.name = dept.name;
            return this;
        }

        public Department build() {
            return new Department(this);
        }
    }
}
