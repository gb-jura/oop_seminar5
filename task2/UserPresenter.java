public class UserPresenter {
    private User model;
    private UserView view;

    public UserPresenter(User model, UserView view) {
        this.model = model;
        this.view = view;
    }

    public void registerUser() {
        view.showRegisterForm();
    }

    public void loginUser() {
        view.showLoginForm();
    }

    public void changeUserPassword() {
        view.showChangePasswordForm();
    }
}
