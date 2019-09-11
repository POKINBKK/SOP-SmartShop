# Movie Rental Shop
Movie Rental Shop API in Spring boot

## Quick Start
1. Clone the repository
2. Create database in MySQLWorkBench
3. Config Spring Data Source in `application.properties`
default configuration
```
## Spring DATASOURCE (DataSourceAutoConfiguration & DataSourceProperties)
spring.datasource.url=jdbc:mysql://localhost:3306/movie_shop?useSSL=false
spring.datasource.username=shop_manager
spring.datasource.password=
spring.jpa.properties.hibernate.temp.use_jdbc_metadata_defaults = false
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.database-platform=org.hibernate.dialect.MySQL5Dialect
spring.jpa.hibernate.ddl-auto=update
```
4. Run application

## Usage

### List all Movies
URL : `/`

Method : `GET`

**Success Response**

Response example

```json
[
    {
        "id": 1,
        "movieName": "The Avengers",
        "amountInStock": 10,
        "dayToRent": 7
    },
    {
        "id": 2,
        "movieName": "Spider-Man : Far From Home",
        "amountInStock": 10,
        "dayToRent": 7
    }
]
```

### Create new Movie to Store
URL : `/add`

Method : `POST`

**Success Response**

Body example

```json
{
	"movieName": "The Incredible Hulk",
	"amountInStock": 10,
	"dayToRent": 7
}
```

Response example

```
Add Movie Complete
```

### Rent Movie by id
URL : `/rent/{id}`

Method : `GET`

**Success Response**

Response example

```
rent complete
```

### Return Movie by id
URL : `/return/{id}`

Method : `GET`

**Success Response**

Response example

```
return complete
```
