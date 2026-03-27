package za.ac.cput.domain;

import za.ac.cput.domain.enums.DoctorStatus;
import za.ac.cput.domain.enums.Specialization;

/**
 * Doctor.java - Doctor model class using Builder Pattern
 * Author: Likhona Noroyita(230154239)
 * Date: 25 March 2026
 */

public class Doctor {

    private String doctorId;
    private String name;
    private Specialization specialization;
    private DoctorStatus status;

    private Doctor(Builder builder) {
        this.doctorId = builder.doctorId;
        this.name = builder.name;
        this.specialization = builder.specialization;
        this.status = builder.status;
    }

    public String getDoctorId() { return doctorId; }
    public String getName() { return name; }
    public Specialization getSpecialization() { return specialization; }
    public DoctorStatus getStatus() { return status; }

    public static class Builder {
        private String doctorId;
        private String name;
        private Specialization specialization;
        private DoctorStatus status;

        public Builder setDoctorId(String doctorId) {
            this.doctorId = doctorId;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSpecialization(Specialization specialization) {
            this.specialization = specialization;
            return this;
        }

        public Builder setStatus(DoctorStatus status) {
            this.status = status;
            return this;
        }

        public Builder copy(Doctor doctor) {
            this.doctorId = doctor.doctorId;
            this.name = doctor.name;
            this.specialization = doctor.specialization;
            this.status = doctor.status;
            return this;
        }

        public Doctor build() {
            return new Doctor(this);
        }
    }
}
