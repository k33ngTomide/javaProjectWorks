package ProblemTest;

import oop.Problem.Person;
import oop.Problem.*;
import org.testng.annotations.Test;
import static oop.Problem.ProblemType.*;

public class ProblemTest {

    @Test
    public void testForProblems(){
        Person person = new Person("Sleeping under the bridge", FINANCIAL);
        person.add(new Problem("Family issues", SPIRITUAL));
        person.add(new Problem("Nigerian University", EDUCATION));
        person.add(new Problem("Not Selling Enough", BUSINESS));
        person.add(new Problem("Faulty Laptop Battery", TECHNICAL));
        person.add(new Problem("Sapa, No money", FINANCIAL));

        person.solve("Sleeping under the bridge");
        System.out.println(person.toString());


    }

}
