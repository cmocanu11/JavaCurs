package Curs7.Tema;

public class Teacher {
    private String course;
    private String schedule;
    private int experienceYears;

    public Teacher(String course, String schedule, int experienceYears){
        this.course = course;
        this.schedule = schedule;
        this.experienceYears = experienceYears;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }
}
