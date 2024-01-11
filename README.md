# S3

- src/main/resources/application.yml

```
cloud:
  aws:
    credentials:
      access-key: AWIUEJWQIUWJEJIOWJIO  // IAM 계정의 accessKey
      secret-key: BqwulzzZqiZw+wwW0ifeweqDmiz+LfAlp  // IAM 계정의 secretKey
    region:
      static: ap-northeast-2  // 버킷의 리전
    s3:
      bucket: my-bucket   //  버킷 이름
    stack:
      auto: false

spring:
  servlet:
    multipart:
      max-file-size: 10MB
      max-request-size: 10MB
```
