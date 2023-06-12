# Spring Boot 3 + Spring Security 6
This project was created to study Spring Security 6.

## Endpoints
<details>
 <summary><strong>Login endpoint</strong></summary>

POST `api/v1/auth/authentication`
```json
{
  "email": "example@gmail.com",
  "password": "Password"
}
```
Response:
```json
{
    "token": "some-jwt-token..."
}
```
</details>

<details>
 <summary><strong>Register endpoint</strong></summary>

POST `api/v1/auth/register`
```json
{
    "firstname": "Name",
    "lastname": "Surname",
    "email": "example@gmail.com",
    "password": "Password"
}
```
Response:
```json
{
    "token": "some-jwt-token..."
}
```
</details>
<details>
 <summary><strong>Demo endpoint</strong></summary>

Required headers: `"Authorization: Bearer some-jwt-token..."` 

GET `api/v1/auth/demo-controller`

Response:
```text
Hello from security demo!
```
</details>

## How to run
1. Clone this repository
2. Create a database and configure it in `application.yml`
3. Run `mvn spring-boot:run` in the root directory
4. Use endpoints
5. Enjoy!