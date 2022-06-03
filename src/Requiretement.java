public class Requiretement {
    public static void requirement(String login, String password, String confirmedPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length() > 20) {
            throw new WrongLoginException("Слишком длинный логин");
        }
        if (!login.matches("[a-zA-Z0-9_.]+")) {
            throw new WrongLoginException("В логине должны быть только латинские буквы, цифры, знак подчеркивания, и точка");
        }
        if (password.length() >= 20 || confirmedPassword.length() >= 20) {
            throw new WrongPasswordException("Пароль превышает 20 символов");
        }
        if (!password.matches("[a-zA-Z0-9_]+") || !confirmedPassword.matches("[a-zA-Z0-9_]+")) {
            throw new WrongPasswordException("В пароле должны быть только латинские буквы, цифры и знак подчеркивания");
        }

        if (!password.equals(confirmedPassword)) {
            throw new WrongPasswordException("Пароли отличаются");
        }


    }
}

