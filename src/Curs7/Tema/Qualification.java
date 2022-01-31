package Curs7.Tema;

import java.util.Locale;

public class Qualification extends Teacher{

    public Qualification(String course, String schedule, int experienceYears){
        super(course,schedule,experienceYears);
       /**
        * Daca scot constructorul din Teacher, presupun ca este ok sa folosec setteri din Teacher sa setez caracteristicile. In momentul de fata cu constructorul in
        * Teacher, nu prea mai este nevoie de getteri & setteri.
        *
        *  setCourse(course);
        *  setSchedule(schedule);
        *  setExperienceYears(experienceYears);
        */
    }

    public void verify(){

        if (getCourse().toLowerCase().equals("java") && getSchedule().toLowerCase().equals("afternoon") && getExperienceYears() == 3){
            System.out.println("You qualify to teach at this school!");
        } else {
            System.out.println("You do not qualify");
        }
    }

}
