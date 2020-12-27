# Simple Backend Service as Example for StackOverflow question

See https://stackoverflow.com/questions/65467958/alternative-to-zuul-to-forward-custom-token-stored-in-httpsession-as-request-par

Start with: 
```
./mvnw spring-boot:run
```

Listens on http://localhost:7070

Contains just one resource: http://localhost:7070/list?user=$user

`$user` can be one of 

- Sam Jones
- Penny Morris
- Elvis Cridlington
- Norris Steele
- Tom Thomas
- Norman Price

Example:
```
curl http://localhost:7070/list?user=Sam%20Jones
```

## Content 

- [VehicelRestController](src/main/java/com/github/acme42/backend/VehicelRestController.java)

## Related Projects

- [Simplified SPA Frontend](https://github.com/acme42/frontend)

- [Super Simplified Single Sign-On Portal](https://github.com/acme42/portal)
