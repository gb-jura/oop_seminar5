public class UserManagementApp {
    public static void main(String[] args) {
        User model = new User("Александр Пушкин", "alexs", "password123");
        UserView view = new UserView();
        UserPresenter presenter = new UserPresenter(model, view);

        presenter.registerUser();
        presenter.loginUser();
        presenter.changeUserPassword();
    }
}
