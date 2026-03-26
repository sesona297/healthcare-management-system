package za.ac.cput.domain;

/**
 * WorkingHours.java - WorkingHours model class using Builder Pattern
 * Author: Likhona Noroyita(230154239)
 * Date: 25 March 2026
 */

public class WorkingHours {

    private String workingHoursId;
    private String day;
    private String startTime;
    private String endTime;

    private WorkingHours(Builder builder) {
        this.workingHoursId = builder.workingHoursId;
        this.day = builder.day;
        this.startTime = builder.startTime;
        this.endTime = builder.endTime;
    }

    public String getWorkingHoursId() { return workingHoursId; }
    public String getDay() { return day; }
    public String getStartTime() { return startTime; }
    public String getEndTime() { return endTime; }

    public static class Builder {
        private String workingHoursId;
        private String day;
        private String startTime;
        private String endTime;

        public Builder setWorkingHoursId(String id) {
            this.workingHoursId = id;
            return this;
        }

        public Builder setDay(String day) {
            this.day = day;
            return this;
        }

        public Builder setStartTime(String start) {
            this.startTime = start;
            return this;
        }

        public Builder setEndTime(String end) {
            this.endTime = end;
            return this;
        }

        public Builder copy(WorkingHours wh) {
            this.workingHoursId = wh.workingHoursId;
            this.day = wh.day;
            this.startTime = wh.startTime;
            this.endTime = wh.endTime;
            return this;
        }

        public WorkingHours build() {
            return new WorkingHours(this);
        }
    }
}
