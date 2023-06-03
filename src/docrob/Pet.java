package docrob;

public class Pet {
    private int age;
    private boolean isRescue;
    private String name;

    public Pet(int age, boolean isRescue, String name) {
        // If the passed name argument is null, the constructor should throw an IllegalArgumentException.
        if(name == null) {
            throw new IllegalArgumentException("name cannot be null");
        }

        this.age = age;
        this.isRescue = isRescue;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isRescue() {
        return isRescue;
    }

    public void setRescue(boolean rescue) {
        isRescue = rescue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
