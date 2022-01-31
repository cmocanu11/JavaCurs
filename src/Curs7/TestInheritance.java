package Curs7;

public class TestInheritance {

    public static void main(String[] args) {

        TesterAutomat testerAutomat = new TesterAutomat();

        testerAutomat.setName("Cosmin Mocanu");
        testerAutomat.setEmail("cmocanu@email.com");
        testerAutomat.setDepartament("Business");
        testerAutomat.setSeniority("Senior");
        testerAutomat.setLimbajProgramare("Javra");

        System.out.println(testerAutomat.getName() + " - " + testerAutomat.getEmail());
        System.out.println(testerAutomat.getDepartament() + " - " + testerAutomat.getSeniority());
        System.out.println(testerAutomat.getLimbajProgramare());

    }


}
