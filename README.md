# S3

- src/main/resources/application.yml

```
cloud:
  aws:
    credentials:
      access-key: {  IAM 계정의 accessKey  } # IAM 계정의 accessKey
      secret-key: { IAM 계정의 secretKey }  # IAM 계정의 secretKey
    region:
      static: ap-northeast-2 # 버킷의 리전
    s3:
      bucket: { 버킷 이름 }  #  버킷 이름
    stack:
      auto: false

spring:
  servlet:
    multipart:
      max-file-size: 10MB
      max-request-size: 10MB
  datasource:
    url: jdbc:mysql://localhost:3306/{DB이름}
    username: root
    password: { 비밀번호 }
    driver-class-name: com.mysql.cj.jdbc.Driver
```
