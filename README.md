# Spring with LocalStack and AWS DynamoDB

### Requeriments
 - HTTPie/cURL
 - Docker
 - Maven 5+
 - Java 11+
 - LocalStack

### AWS CLI

* [AWS CLI](https://aws.amazon.com/pt/cli/)

```shell
aws configure
Key ID: accessK3yFake
Access Key: secretK3yFake
Region: us-east-1
Format: json
```

### LocalStack

```shell
# Start in background
localstack start -d

# Verify status
localstack status
```

### Initial-database

```shell
./initial-database.sh
```

### Requests

Example with HTTPie

```shell
# POST
http --json POST :8090/api/games < bodyRequests/createANewGame.json

HTTP/1.1 201 Created
Connection: keep-alive
Content-Length: 0
Date: Sat, 25 Jun 2022 00:53:31 GMT
Location: /games/84a6ee98-07d9-4ffb-99f9-098c0a43d8a0 
```
```shell
# GET By ID
http --json GET :8090/api/games/84a6ee98-07d9-4ffb-99f9-098c0a43d8a0

HTTP/1.1 200 OK
Connection: keep-alive
Content-Type: application/json
Date: Sat, 25 Jun 2022 00:54:01 GMT
Transfer-Encoding: chunked

{
    "description": "Geralt of Rivia",
    "gameId": "84a6ee98-07d9-4ffb-99f9-098c0a43d8a0",
    "name": "The Wither 3 Wild Hunt",
    "platform": "Geralt of Rivia",
    "price": 179
}
```

### DynomoDB Admin UI (Optional)

- Requerid NPM (NodeJS)

```shell
# Install
npm install -g dynamodb-admin

# Running
DYNAMO_ENDPOINT=http://localhost:4566 dynamodb-admin

  database endpoint:    http://localhost:4566
  region:               us-east-1
  accessKey:            accessK3y

  dynamodb-admin listening on http://:::8001 (alternatively http://0.0.0.0:8001)
```

 - [DynamoDB UI](http://localhost:8001)

### Reference Documentation

* [LocalStack](https://docs.localstack.cloud/get-started/#installation)
* [AWS DataMapper](https://docs.aws.amazon.com/pt_br/amazondynamodb/latest/developerguide/DynamoDBMapper.DataTypes.html)
* [Kaike Ventura Medium](https://medium.com/@kaikeventura/api-rest-com-spring-boot-e-aws-dynamodb-5e79ecb80b62)

For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.1/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.7.1/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.7.1/reference/htmlsingle/#web)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

