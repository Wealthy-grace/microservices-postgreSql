CREATE TABLE IF NOT EXISTS users (
                                     id BIGSERIAL PRIMARY KEY,
                                     username VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    enabled BOOLEAN DEFAULT TRUE,
    email VARCHAR(255),
    full_name VARCHAR(255),
    image VARCHAR(255),
    role VARCHAR(50) CHECK (role IN ('ROLE_ADMIN', 'ROLE_USER', 'ROLE_MEDIATOR'))
    );
