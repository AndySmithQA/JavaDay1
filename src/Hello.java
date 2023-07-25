public class Hello {
    public static void main(String[] args) {

        System.out.println(greeting());
    }

    public static String greeting() {
        String myName = "Dave";
        int age = 66;
        return "Hi " + myName + ", you are " + age;
    }
}
