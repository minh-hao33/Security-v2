package com.example.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoderTest {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

        // Nhập mật khẩu cần mã hóa
        String rawPassword = "Password@123";
        String encodedPassword = encoder.encode(rawPassword);

        System.out.println("Mật khẩu gốc: " + rawPassword);
        System.out.println("Mật khẩu đã mã hóa: " + encodedPassword);
    }
}
