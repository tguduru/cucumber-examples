package org.tguduru.testing.cucumber;

import org.tguduru.testing.cucumber.api.Registration;
import org.tguduru.testing.cucumber.api.User;

/**
 * @author Guduru, Thirupathi Reddy
 * @since 10/4/16
 */
public class Demo {

    public static void main(String[] args) {
        Registration registration = RegistrationModule.getRegistration();
        registration.save(new User());
    }
}
