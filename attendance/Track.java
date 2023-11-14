package attendance;

import java.util.Date;
import java.util.UUID;

import user.Eit;

public class Track {
    // identity each transaction
    private String id;
    // the user who is performing the tracking
    private Eit user;
    // the user checked in
    private Date dateChecked;

    // a constructor that sets the user to be tracked and the generate the id to
    // track the
    // session of the tracking that is being done
    public Track(Eit user) {
        this.user = user;
        this.id = UUID.randomUUID().toString();
    }

    // record the attendance date of the user
    public void markAttendance() {
        this.dateChecked = new Date();
    }

    // get the date the user checked in
    public Date getDateChecked() {
        return dateChecked;
    }

    // get the eit user, the entire object
    public Eit getUser() {
        return user;
    }

}
