package week09_review;

import java.util.ArrayList;

public class ScrumTeam {

    public String PO, BA, SM;
    public ArrayList<Tester> testers;
    public ArrayList<Developer> developers ;
    public int daysOfSprint;

    public ScrumTeam(String PO, String BA, String SM, int daysOfSprint) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.daysOfSprint = daysOfSprint;
        testers = new ArrayList<>();
        developers = new ArrayList<>();
    }





}

/*
3. create a class called ScrumTeam
           	Attributes:
                  PO, BA, SM (for storing their names ONLY)
                  testers, developers, daysOfSprint

            Add a constructor that can set the PO, BA, SM and daysOfSprint

         	Actions:
                addTester(Tester tester): adds the given tester to the testers ArrayList

                addTesters(Tester[] testers): adds the given testers to the testers ArrayList

                addDeveloper(Developer developer): adds the given developer to the developers ArrayList

                addDevelopers(Developer[] developers): adds the given developers to the developers ArrayList

                removeTester(long employeeID): removes the given tester from the testers ArrayList

                removeDeveloper(long employeeID): removes the developer from the developers ArrayList

                toString(): prints number of tester,& developers,  PO name, SM name, BA name, and daysOfSprint
 */