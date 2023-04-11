package showtime;

class User implements UserInterface {
    public String Username, Email, Password;
    public boolean is_staff, is_logged_in;
    int idUsers;

    public void setDetails(int idUsers, String Username, String Email, String Password, boolean is_ataff, boolean is_logged_in) {
        setIdUsers(idUsers);
        setUsername(Username);
        setEmail(Email);
        setPassword(Password);
        setIs_staff(is_staff);
        setIs_logged_in(is_logged_in);
    }

    public void setIdUsers(int idUsers) {
        this.idUsers = idUsers;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setIs_staff(boolean is_staff) {
        this.is_staff = is_staff;
    }

    public void setIs_logged_in(boolean is_logged_in) {
        this.is_logged_in = is_logged_in;
    }
}
