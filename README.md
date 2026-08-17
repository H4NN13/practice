# Task 6.3.7. Unit-тест с Mockito - UserService

```

Практическая задача 6.3.7/task6_3_7/
├── Exceptions/
│   └── UserNotFoundException
│
├── Services/
│   ├── EmailService
│   └── UserService
│
├── User/
│   ├── User
│   └── UserRepository
│
└── Tests/
    └── task6_3_7_test/
        └── UserServiceTest
```

## Модули

### `User`
POJO-модель с полями:
- `id`  идентификатор
- `name`  имя
- `email`  адрес электронной почты

### `UserRepository`
Интерфейс хранилища пользователей:
- `Optional<User> findById(int id)`
- `User save(User user)`
- `boolean existsById(int id)`
- `void deleteById(int id)`

### `EmailService`
Интерфейс сервиса отправки email:
- `void sendWelcomeEmail(String email, String name)`

### `UserService`
Сервис, реализующий бизнес-логику:
- `getUser(int id)` -  получение пользователя по ID (выбрасывает `UserNotFoundException`, если не найден)
- `createUser(String name, String email)` - создание пользователя и отправка приветственного письма
- `deleteUser(int id)` - удаление пользователя, если он существует

### `UserServiceTest`
Unit-тесты, покрывающие:
- Успешное получение пользователя
- Выброс исключения при отсутствии пользователя
- Создание пользователя с вызовом `EmailService`
- Проверку передаваемых аргументов через `ArgumentCaptor`
- Удаление существующего и несуществующего пользователя
