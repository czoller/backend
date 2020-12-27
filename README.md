# Simple Backend Service as Example for StackOverflow question

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
