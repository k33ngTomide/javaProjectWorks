package CollectionsClasses;

public class Dog implements  Comparable<Dog>{

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Dog dog) {
        return this.name.compareTo(dog.name);
    }

    @Override
    public String toString() {
        return "{" + "name='" + name + '\'' + '}';
    }
}
