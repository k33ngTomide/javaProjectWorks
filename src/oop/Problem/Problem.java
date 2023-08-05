package oop.Problem;

public class Problem{

    private String name;
    private ProblemType type;
    private boolean isSolved;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public boolean getIsSolved() {
        return isSolved;
    }

    public void setIsSolved(boolean isSolved) {
        this.isSolved = isSolved;
    }

    public Problem (String name, ProblemType type){
        this.name = name;
        this.type = type;
    }

}
