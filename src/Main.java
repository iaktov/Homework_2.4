public class Main {
    public static void main(String[] args) {
        validation("java_skypro.go", "D_1hWiKjjP_9", "D_1hWiKjjP_9");


    }

    public static void validation(String login, String password, String confirmedPassword) {
        try {
            Requiretement.requirement(login, password, confirmedPassword);
        } catch (WrongLoginException e) {
            System.out.println("Введите новый логин");
        } catch (WrongPasswordException e) {
            System.out.println("Введите новый пароль");
        } finally {
            System.out.println("Проверка данных завершена");
        }
    }
}
