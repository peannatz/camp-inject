package exercise1;

public class UserService {
    private Logger logger;

    public UserService(Logger logger) {
        this.logger = logger;
    }

    public void registerUser(String username) {
        logger.log("User " + username + " created");
    }
}
