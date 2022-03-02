# Steps to use API:

# Clone repository: git clone https://github.com/RantJames/javaSpringBoot.git

cd <directory>/javaSpringBoot

# Edit Database properties in \src\main\resources\application.properties

spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://<server>:<port>/<database_name>
spring.datasource.username=<username>
spring.datasource.password=<password>
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

# Health Check url 

http://localhost:8080/

# Get Url

http://localhost:8080/hotel

# Post Url

http://localhost:8080/add/


# Post json request body:

{
"hotelName": "Garden Inn",
"price": 250
}

success message : Added new hotel to repo!