#In Progress..
#

# About the project
The schedule project is an online agenda to detail meetings with the aim of facilitating the team's visualization, knowing at what time it would be most appropriate to request a call/technical conversation regarding a question/definition, among others.


# Technologies
## Back end
- Java
- Spring Boot

## Front end
- In Progress

## Back end
Prerequisites: Java 23


# Methods
## GET
### Request (all records)
```bash
http://localhost:8080/api/agendas
```
### Request (passing ID)
```bash
http://localhost:8080/api/agendas/1
```

### Response (all records)
```bash
 {
        "id": 1,
        "nome": "name 1",
        "compromisso": "Meeting with example 1",
        "data": "2024-08-01",
        "hora": "21:38:00"
    },
    {
        "id": 2,
        "nome": "name 2",
        "compromisso": "Meeting with example 2",
        "data": "2024-10-16",
        "hora": "21:38:00"
    },
```

### Response (by Id)
```bash
    200 OK
    {
        "id": 1,
        "nome": "name",
        "compromisso": "Meeting with example",
        "data": "2024-08-01",
        "hora": "21:38:00"
    },
```



## POST

### Request
```bash
http://localhost:8080/api/agendas

{ 
"id": 3 ,
"nome": "Name Example",
"compromisso": "Meeting with example",
"data": "2024-10-16",
"hora": "21:38:00"
}

```

### Response
```bash
    200 OK
    {
        "id": 1,
        "nome": "Name Example",
        "compromisso": "Meeting with example",
        "data": "2024-08-01",
        "hora": "21:38:00"
    },
```



## PUT

## DELETE


# Author

Antonio Vinnicius Lacerda

[https://www.linkedin.com/in/antonio-vinnicius-lacerda](https://www.linkedin.com/in/antonio-vinnicius-lacerda/)
