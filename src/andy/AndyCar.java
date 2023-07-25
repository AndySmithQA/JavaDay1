package andy;

public class AndyCar {
    private String name;
    private String make;
    private String model;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "AndyCar{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public AndyCar(String name, String make, String model, int age) {
        this.name = name;
        this.make = make;
        this.model = model;
        this.age = age;
    }
}
