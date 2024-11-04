package ie.atu;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Customer user = new Customer();
        user.setName("John");
        user.setId("123");
        user.setType("String Email");
        user.setType();

        String name = user.getName ();
        String id = user.getId();
        String type = user.getType();

        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println(user.toString());
        if(user.isValidId()) {
            System.out.println("Email is valid");
        }else{
            System.out.println("It is invalid");
            System.out.println("Formaion def");
            System.out.println(user.getFormation.detail);
        }
        String username = "John";
        String changeusername = "123";
        boolean changesuccessful = false;

        for (User user : users){
            if(user.username.equals(username)) {
                System.out.println("Change successful for user:" + user);
                changesuccessful = true;
                break;
            }else{
                System.out.println("Incorrect" + user);
                changesuccessful = true;
                break;
            }
        }
        if (!changesuccessful) {
            System.out.println("User not found: " + username);
        }

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }
    }
}