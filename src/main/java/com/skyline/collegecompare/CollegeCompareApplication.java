package com.skyline.collegecompare;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = {"com.skyline.collegecompare.mapper"})
@SpringBootApplication
public class CollegeCompareApplication {

    public static void main(String[] args) {
        SpringApplication.run(CollegeCompareApplication.class, args);
    }

}
