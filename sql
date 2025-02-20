-- Tạo database
CREATE DATABASE security;

-- Sử dụng database vừa tạo
USE security;

CREATE TABLE users (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    email VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    role VARCHAR(50) NOT NULL
);

INSERT INTO users (email, password, role) VALUES
('user1@gmail.com', '$2a$10$OOxHZMT55rlPOGhLhY3hWeeaHcbQ2WlPGdIZmphmgwGRBiFFZffKO', 'USER');
