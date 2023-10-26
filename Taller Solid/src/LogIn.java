//public class LogIn {
	public class LogIn implements Logger{	
    public void log (User user) {
        System.out.println("Has access to the website");
        
        InsertUserDatabase.insertUserInDatabase(user);
        // Logic
    }
//    public void insertUserInDatabase(User user){
//        // Insert user in database
//    }
}

