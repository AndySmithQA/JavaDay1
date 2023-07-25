public class Rabbit {
    private String name;
    private int age;
    private String colour;

    public Rabbit(String name, int age, String colour){
        this.name = name;
        this.age = age;
        this.colour = colour;

    }
    public void move() {
        System.out.println("Hop Hop Hop");
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void stroke(int times){
        String strokes;
        strokes = "stroke ".repeat(times);
        System.out.println(strokes);
    }

    public String toString(){
        return "name: " + name + " is " + age;
    }

    public static void main(String[] args) {
        Rabbit R1 = new Rabbit("Flopsy", 2, "Brown");
        System.out.println(R1);
//        R1.move();
//        R1.stroke(5);

        Rabbit R2 = new Rabbit("Bill", 3, "black");
        Rabbit R3 = new Rabbit("Bill", 3, "black");
        Rabbit R4 = new Rabbit("Bill", 3, "black");

//        System.out.println(R2);
//        System.out.println(R3);
//        System.out.println(R4);

        System.out.println(R1.getName());
        System.out.println(R3.getAge());

        R1.setName("Bob");
        System.out.println(R1.getName());

//        R2.stroke(3);
    }
}
