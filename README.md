# ExternalLog

Reproducer for https://github.com/dropwizard/dropwizard/issues/3557.

How to start the ExternalLog application
---

1. Run `mvn clean install` to build your application
1. Start application with `java -jar target/dropwizard-issue-3557-1.0.0-SNAPSHOT.jar server config.yml`
1. To check that your application is running enter url `http://localhost:8080`