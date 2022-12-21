package org.craftedsw.tripservicekata.trip;

import org.craftedsw.tripservicekata.user.User;

public class FakeSessionManager implements SessionManagerInterface{
    private User loggedUser = null;

    public void setLoggedUser(User loggedUser) {
        this.loggedUser = loggedUser;
    }

    @Override
    public User getLoggedUser() {
        return loggedUser;
    }
}
