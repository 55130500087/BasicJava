public class main {
    public static void main(String[] args) {
        String firstname = args[0];
        String lastname = args[0];
        Employee pop = new Employee(firstname,lastname); //Default Constuctor

        String result = pop.getFullName();
        System.out.println(result);
    }
}