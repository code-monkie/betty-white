CREATE TABLE jewelry (
         id BIGINT AUTO_INCREMENT PRIMARY KEY,
         name VARCHAR(255),
         type VARCHAR(255),
         material VARCHAR(255),
         price DECIMAL(10,2),
         weight_in_grams DOUBLE,
         gemstone VARCHAR(255),
         is_handmade BOOLEAN,
         created_date DATE,
         origin_country VARCHAR(255)
);