package org.tguduru.testing.cucumber.impl;

import org.tguduru.testing.cucumber.api.Registration;
import org.tguduru.testing.cucumber.api.User;

/**
 * @author Guduru, Thirupathi Reddy
 * @modified 10/4/16
 */
public class RegistrationImpl implements Registration {
    public void save(final User user) {
        System.out.println("Saved");
    }

    public boolean delete(final User user) {
        return false;
    }

    public User get(final long id) {
        return null;
    }

    public boolean update(final User user) {
        return false;
    }
}
