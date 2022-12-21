package org.craftedsw.tripservicekata.trip;

import org.craftedsw.tripservicekata.user.User;
import org.craftedsw.tripservicekata.user.UserSession;

public class SessionManager {
    public SessionManager() {
    }

    User getLoggedUser() {
        return UserSession.getInstance().getLoggedUser();
    }
}