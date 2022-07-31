# Fluent multiline logging with Java (EFK stack) 

## The purpose

The goal of this project is to create a application to test Fluentbit/Fluentd multiline logs in a Kubernetes environment in my [Kubernetes Pi Cluster](http://picluster.ricsanfre.com)

This is Java sample application, Spring Boot based application, that produces
multiline logs and exception stacktraces. Demo app is mainly based on the one provided by [galovics](https://github.com/galovics/fluentd-multiline-java) updated for my home lab (picluster).

## Docker multistage building image

Dockerfile provides a multi-stage building image where in the first stage, maven project is compiled. 

Base Maven project have been created with [Spring Initializator](https://start.spring.io/) without specifying any dependency.

## Building the docker image

Build the docker image and the application
```bash
$ docker build -t ricsanfre/fluent-multiline-app:latest .
```

## Docker images available in docker hub

Git actions configured to build automatically multiarchitecture AMD64 and ARM64 images. Docker hub images available at [ricsanfre/fluent-multiline-app](https://hub.docker.com/r/ricsanfre/fluent-multiline-app)

## Deploying the app in kubernetes

To deploy the application in Kubernetes execute the following

```bash
$ kubectl apply -f kubernetes/fluent-multiline-app-deployment.yaml
```