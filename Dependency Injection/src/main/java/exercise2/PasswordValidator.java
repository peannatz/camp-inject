package exercise2;

public class PasswordValidator {
    public boolean validate(String password) {
        return password != null && password.length() >= 8;
    }
}
