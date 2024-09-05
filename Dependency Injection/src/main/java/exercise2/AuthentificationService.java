package exercise2;

public class AuthentificationService {
    private PasswordValidator passwordValidator;

    public void setPasswordValidator(PasswordValidator passwordValidator) {
        this.passwordValidator = passwordValidator;
    }

    public boolean authenticate(String password) {
        return passwordValidator.validate(password);
    }
}
