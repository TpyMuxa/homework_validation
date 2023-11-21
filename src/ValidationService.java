public class ValidationService {

    private static final Checker CHECKER = new LoopChecker();

    private ValidationService() {
    }

    public static void check(String login,
                             String password,
                             String confirmPassword) throws WrongLoginException, WrongPasswordException {
        CHECKER.checkLogin(login);
        CHECKER.checkPassword(password);
        CHECKER.checkPasswords(password, confirmPassword);

    }
}
