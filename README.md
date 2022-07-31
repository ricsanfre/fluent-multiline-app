# Fluent multiline logging with Java (EFK stack) 

## The purpose

The goal of this project is to create a application to test Fluentbit/Fluentd multiline logs in a Kubernetes environment.

This is Java sample application, Spring Boot based application, that produces
multiline logs and exception stacktraces.

Demo app is mainly based on the one provided by [galovics](https://github.com/galovics/fluentd-multiline-java) updated for my home lab (picluster)

## Docker multistage building image

Maven project is first compiled (build stage 1) 

Base Maven project created with [Spring Initializator](https://start.spring.io/) without specifying any dependency.

## Building the docker image
Build the docker image and the application
```bash
$ docker build -t ricsanfre/fluent-multiline:latest .
```

