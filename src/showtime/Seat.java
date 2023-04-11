package showtime;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

class Seat extends Show {

    public String Username, Email, Password;
    public boolean is_staff, is_logged_in, is_available;
    int idUsers, idSeat, row, column;

    public void setUserDetails(int idUsers, int idSeat, Movie movie, String Username, String Email, String Password, boolean is_ataff, boolean is_logged_in) {
        this.idUsers = idUsers;
        this.idSeat = idSeat;
        this.Username = Username;
        this.Email = Email;
        this.Password = Password;
        this.is_staff = is_staff;
        this.is_logged_in = is_logged_in;
    }

    @FXML
    void exitApplication(ActionEvent event) {
        Platform.exit();
    }

    /*
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML/ticket.fxml"));
        Parent root = (Parent) loader.load();
        TicketController controller = loader.getController();
        controller.showTickets(21,22,23);
*/
}
