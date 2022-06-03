public class WrongLoginException extends RuntimeException {
    public WrongLoginException(String s) {
        System.out.println(s);
    }
}
