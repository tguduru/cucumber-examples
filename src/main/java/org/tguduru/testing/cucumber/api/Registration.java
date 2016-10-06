package org.tguduru.testing.cucumber.api;

/**
 * API for registering a @{@link User}
 * 
 * @author Guduru, Thirupathi Reddy
 * @since 10/4/16
 */
public interface Registration {
    void save(User user);

    boolean delete(User user);

    User get(long id);

    boolean update(User user);

    interface Factory {
        Registration create();
    }
}
