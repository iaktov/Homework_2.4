public class WrongPasswordException extends RuntimeException {
    public WrongPasswordException(String s) {
        System.out.println(s);
    }
}
