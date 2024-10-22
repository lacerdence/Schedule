# Schedule

## About the project

The **Schedule** project is an online agenda to detail meetings with the aim of facilitating the team's visualization, knowing at what time it would be most appropriate to request a call/technical conversation regarding a question/definition, among others.

## Technologies

### Backend

- Java
- Spring Boot

### Frontend

> [frontend](https://github.com/CarlosMartorini/schedule-next)

- Next
- tailwindcss
- shadcn/ui
- radix-ui

## Prerequesites Backend

- Java 23 or latest
- Maven

## API Endpoints

### GET

- Request (all records)

  > **GET** /api/agendas

- Response (all records)

```json
[
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
  }
]
```

- Request (passing ID)

  > **GET** /api/agendas/{id}

- Response (by Id)

```json
{
  "id": 1,
  "nome": "name",
  "compromisso": "Meeting with example",
  "data": "2024-08-01",
  "hora": "21:38:00"
}
```

### POST

- Request

  > **POST** /api/agendas

- Body

```json
{
  "id": 3,
  "nome": "Name Example",
  "compromisso": "Meeting with example",
  "data": "2024-10-16",
  "hora": "21:38:00"
}
```

- Response

```json
    200 OK
    {
        "id": 1,
        "nome": "Name Example",
        "compromisso": "Meeting with example",
        "data": "2024-08-01",
        "hora": "21:38:00"
    }
```

### PUT

- Request

  > **PUT** /api/agendas/Id

```json
{
  "id": 1,
  "nome": "Altered name",
  "compromisso": "Altered Meeting",
  "data": "2024-08-01",
  "hora": "21:38:00"
}
```

- Response

```json
{
  "id": 1,
  "nome": "Altered name",
  "compromisso": "Altered Meeting",
  "data": "2024-08-01",
  "hora": "21:38:00"
}
```

### DELETE

- Request

  > **DELETE** /api/agendas/Id

- Response

```json
200 OK
```

## Author

Antonio Vinnicius Lacerda

[Linkedin](https://www.linkedin.com/in/antonio-vinnicius-lacerda/)
