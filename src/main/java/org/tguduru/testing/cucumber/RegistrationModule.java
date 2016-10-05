package org.tguduru.testing.cucumber;

import org.tguduru.testing.cucumber.api.Registration;
import org.tguduru.testing.cucumber.impl.RegistrationImpl;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Stage;

/**
 * @author Guduru, Thirupathi Reddy
 * @modified 10/4/16
 */
public class RegistrationModule extends AbstractModule {
    protected void configure() {
        // install(new FactoryModuleBuilder().implement(Registration.class, RegistrationImpl.class)
        // .build(Registration.Factory.class));
        bind(Registration.class).to(RegistrationImpl.class);
    }

    public static Registration getRegistration() {
        Injector injector = Guice.createInjector(Stage.PRODUCTION, new RegistrationModule());
        return injector.getInstance(Registration.class);
    }
}
