package com.example.codingassessment.dtos;


import lombok.Data;

@Data
public class SignupRequestDto {

        private String email;
        private String password;
        private String name;
}
