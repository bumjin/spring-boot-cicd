"""A Python Pulumi program"""

import pulumi
import pulumi_docker as docker

stack = pulumi.get_stack()

app_image_name = "springboot-cicd"
app_image = docker.RemoteImage(
    app_image_name,
    name = "bumjin/spring-boot-cicd"
)
