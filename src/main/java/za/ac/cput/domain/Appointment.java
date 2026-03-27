package za.ac.cput.domain;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Appointment Model Class
 * Author: 221066784-Noxolo Portia Ngubo
 * Date : 26 March 2026
 */
public class Appointment {
    private String appointmentID;
    private LocalDate date;
    private LocalTime time;
    private String doctorID;
    private String patientID;
    private boolean status;

    private Appointment (Builder builder) {
        this.appointmentID = builder.appointmentID;
        this.date = builder.date;
        this.time = builder.time;
        this.doctorID = builder.doctorID;
        this.patientID = builder.patientID;
        this.status = builder.status;
    }
    public String getAppointmentID (){
        return appointmentID;
    }
    public LocalDate getDate(){
        return date;
    }
    public LocalTime getTime(){
        return time;
    }
    public String getDoctorID (){
        return doctorID;
    }
    public String getPatientID (){
        return patientID;
    }
    public boolean getStatus (){
        return status;
    }
    @Override
    public String toString (){
        return "Appointment{" +
                "appointmentID='" + appointmentID + '\'' +
                ", date=" + date +
                ", time=" + time +
                ", doctorID=" + doctorID + '\'' +
                ", patientID=" + patientID + '\'' +
                ", status=" + status +
                '}';
    }
    public static class Builder {
        private String appointmentID;
        private LocalDate date;
        private LocalTime time;
        private String doctorID;
        private String patientID;
        private boolean status;

        public Builder setAppointmentID (String appointmentID){
            this.appointmentID= appointmentID;
            return this;
        }
        public Builder setDate (LocalDate date){
            this.date= date;
            return this;
        }
        public Builder setTime (LocalTime time) {
            this.time= time;
            return this;
        }
        public Builder setDoctorID(String doctorID){
            this.doctorID= doctorID;
            return this;
        }
        public Builder setPatientID (String patientID) {
            this.patientID= patientID;
            return this;
        }
        public Builder setStatus(boolean status){
            this.status= status;
            return this;
        }
        public Builder copy (Appointment appointment){
            this.appointmentID= appointment.appointmentID;
            this.date= appointment.date;
            this.time= appointment.time;
            this.doctorID= appointment.doctorID;
            this.patientID= appointment.patientID;
            this.status= appointment.status;
            return this;
        }
        public Appointment build(){
            return new Appointment(this);
        }
    }

}
