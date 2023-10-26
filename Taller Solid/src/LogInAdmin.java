//public class LogInAdmin extends LogIn {
public class LogInAdmin extends LogIn implements Logger{	
    private boolean userIsAdmin;
    @Override
    
    // pilas revisar esto 
    public void log (User user) {
        this.userIsAdmin = VerificarUser.verifyTheUserIsAdmin(user);
        if(!userIsAdmin){
            return;
        }
        System.out.println("Has access to the website in admin mode");
        // Logic
    }
 //   private boolean verifyIfTheUserIsAdmin(User user){
 //       // Do something
 //       return true;
    }


