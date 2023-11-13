package attendance;

import java.util.Date;
import java.util.UUID;

import user.Eit;

public class Track {
    private String id;
    private Eit user;
    private Date dateChecked;

    public Track(Eit user) {
        this.user = user;
        this.id = UUID.randomUUID().toString();
    }

    public void markAttendance() {
        this.dateChecked = new Date();
    }

    public Date getDateChecked() {
        return dateChecked;
    }

    public Eit getUser() {
        return user;
    }

}
