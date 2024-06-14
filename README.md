# TRẦN MINH TRƯỜNG -  SPRING BOOT

![SPRING BOOT](https://img.icons8.com/?size=100&id=90519&format=png&color=000000)

## Giới thiệu
SỬ DỤNG SPRING BOOT, MYSQL VÀ SWAGGER , MÔ HÌNH ONE - MANY
## Mục lục
- [Giới thiệu](#giới-thiệu)
- [Cài đặt](#cài-đặt)
- [Sử dụng](#sử-dụng)
- [Đóng góp](#đóng-góp)
- [Giấy phép](#giấy-phép)
- [Liên hệ](#liên-hệ)

## Cài đặt
Hướng dẫn cài đặt dự án của bạn trên máy của người dùng.



```bash
# B1 : TẠO 2 BẢNG DỰ LIỆU BẰNG LỆNH TRONG MYSQL
CREATE TABLE classes (
    class_id INT AUTO_INCREMENT PRIMARY KEY,
    class_name VARCHAR(100) NOT NULL,
    teacher_name VARCHAR(100) NOT NULL
);


CREATE TABLE students (
    student_id INT AUTO_INCREMENT PRIMARY KEY,
    student_name VARCHAR(100) NOT NULL,
    date_of_birth DATE,
    gender ENUM('male', 'female', 'other'),
    class_id INT,
    FOREIGN KEY (class_id) REFERENCES classes(class_id)
);

#B2 : CHẠY LẦN LƯỢT 2 LỆNH SAU ĐÊ THÊM DATA VÀO 2 BẢNG

INSERT INTO classes (class_name, teacher_name) VALUES ('Math 102', 'Nguyen Van B');

INSERT INTO students (student_name, date_of_birth, gender, class_id) VALUES 
('Le Thi B', '2005-01-15', 'female', 2),
('Nguyen Van C', '2005-02-20', 'male', 2),
('Tran Thi D', '2005-03-25', 'female', 2),
('Pham Van E', '2005-04-30', 'male', 2),
('Vu Thi F', '2005-05-05', 'female', 2),
('Hoang Van G', '2005-06-10', 'male',2),
('Bui Thi H', '2005-07-15', 'female', 2),
('Dao Van I', '2005-08-20', 'male', 2),
('Ngo Thi J', '2005-09-25', 'female', 2),
('Dinh Van K', '2005-10-30', 'male', 2);

#FILE POM.XML
 <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>

        <dependency>
            <groupId>com.mysql</groupId>
            <artifactId>mysql-connector-j</artifactId>
            <scope>runtime</scope>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.springdoc</groupId>
            <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
            <version>2.2.0</version>
        </dependency>
    </dependencies>

# CẤU HÌNH APPLICATION.PROPERTIES
springdoc.api-docs.path=/api-docs
springdoc.swagger-ui.path=/
spring.application.name=demo1
spring.datasource.url = jdbc:mysql://localhost:3306/ecommerce?useUnicode=yes&characterEncoding=UTF-8
spring.datasource.username=root
spring.datasource.password=123456
spring.main.allow-circular-references=true

