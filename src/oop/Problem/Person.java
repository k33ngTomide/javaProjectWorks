package oop.Problem;

import java.util.ArrayList;
import java.util.List;

public class Person extends Problem {

    private List<Problem> problems = new ArrayList<>();

    public Person(String name, ProblemType type) {
        super(name, type);
    }

    public void add(Problem problem) {
        this.problems.add(problem);
    }

    public void solve(String name){
//        for (problem: problems) {
//
//        }

    }

    public List<Problem> tellProblems(){
        List<Problem> problem = new ArrayList<>();
        if (!getIsSolved()) problem.add((Problem) problems);
        return problem;
    }
    @Override
    public String toString() {
        return "Person{" +
                "problems =" + problems +
                '}';
    }
}
