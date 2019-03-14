# TwitterAPIUseCase
1个TwitterAPI的使用范例，获取数据并插入数据库

### 说明

- 使用twitter4j 4.04 jar包
- 使用mysql-connector-java5.1.44

### 使用

- 修改com.twitter.configuration包中的

  ```java
  .setOAuthConsumerKey(keys[0])
      		.setOAuthConsumerSecret(keys[1])
      		.setOAuthAccessToken(keys[2])
      		.setOAuthAccessTokenSecret(keys[3])
  ```

  为自己申请的Keys And Tokens

- 修改com.twitter.mysql包中的数据库账号密码修改为自己的

  ​