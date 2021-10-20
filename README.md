# payroll-swagger
Demo spring boot integrate with Swagger 2

Depedencies
```
    <dependency>
			<groupId>io.springfox</groupId>
			<artifactId>springfox-swagger2</artifactId>
			<version>2.9.2</version>
		</dependency>
		<dependency>
			<groupId>io.springfox</groupId>
			<artifactId>springfox-swagger-ui</artifactId>
			<version>2.9.2</version>
		</dependency>
```

Configuration
```
@Configuration
@EnableSwagger2
public class SpringFoxConfig {

  @Bean
  public Docket api() {
    return new Docket(DocumentationType.SWAGGER_2)
        .select()
        .apis(RequestHandlerSelectors.any())
        .paths(PathSelectors.any())
        .build();
  }
}
```

Run
```
./mvnw spring-boot:run
```

```
http://localhost:8081/swagger-ui.html
```

Base url
```
http://localhost:8081/
```

Docs url
```
http://localhost:8081/v2/api-docs
```
