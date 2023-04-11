package showtime;

interface UserInterface {
    void setDetails(int idUsers, String Username, String Email, String Password, boolean is_ataff, boolean is_logged_in);

    void setIdUsers(int idUsers);

    void setUsername(String Username);

    void setEmail(String Email);

    void setPassword(String Password);

    void setIs_staff(boolean is_staff);

    void setIs_logged_in(boolean is_logged_in);

}
