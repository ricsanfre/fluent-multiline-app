# Multiline logging apps for testing Fluentbit

## The purpose

The goal of this project is to create applications to test Fluentbit/Fluentd multiline logs in a Kubernetes environment in my [Kubernetes Pi Cluster](http://picluster.ricsanfre.com).

Since built-in fluentbit multiline parsing supports several programming languages, two applications have been developed:

- Go application (`go` directory)
  Generating, json log, text log and multiline logs includign strack traces. 

- Java application (`java` directory)
  Spring Boot based application, that produces multiline logs and exception stacktraces. Demo app is an adaptation of the [Scheduling task Spring example app](https://spring.io/guides/gs/scheduling-tasks/) for scheduling multiline log messages and exception.


## Docker images available in docker hub


Github actions configured to build automatically multiarchitecture AMD64 and ARM64 images with two different tags (`java` and `go`) for each of the application

Docker hub images available at [ricsanfre/fluent-multiline-app](https://hub.docker.com/r/ricsanfre/fluent-multiline-app)

## Deploying the app in kubernetes

To deploy the application in Kubernetes execute the following

```bash
$ kubectl apply -f kubernetes/fluent-multiline-app-deployment.yaml
```