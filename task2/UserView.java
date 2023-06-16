import java.util.Scanner;

public class UserView {

    private Scanner scanner = new Scanner(System.in);

    public void showRegisterForm() {
        System.out.println("Введите имя:");
        String name = scanner.nextLine();
        System.out.println("Ваш логин:");
        String login = scanner.nextLine();
        System.out.println("Придумайте пароль:");
        String password = scanner.nextLine();
        System.out.println("Зарегистрирован!");
    }

    public void showLoginForm() {
        System.out.println("Ваш логин:");
        String login = scanner.nextLine();
        System.out.println("Ваш пароль:");
        String password = scanner.nextLine();
        System.out.println("Авторизация прошла успешно!");
    }

    public void showChangePasswordForm() {
        System.out.println("Введите старый пароль:");
        String oldPassword = scanner.nextLine();
        System.out.println("Введите новый пароль:");
        String newPassword = scanner.nextLine();
        System.out.println("Пароль изменен!");
    }
}