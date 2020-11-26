package com.github.joschi.dropwizard;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class ExternalLogApplication extends Application<ExternalLogConfiguration> {

    public static void main(final String[] args) throws Exception {
        new ExternalLogApplication().run(args);
    }

    @Override
    public String getName() {
        return "ExternalLog";
    }

    @Override
    protected void bootstrapLogging() {
    }

    @Override
    public void initialize(final Bootstrap<ExternalLogConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final ExternalLogConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
