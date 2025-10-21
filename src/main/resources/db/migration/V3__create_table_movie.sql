CREATE TABLE tb_movie (
    id SERIAL PRIMARY KEY,
    title VARCHAR(50) NOT NULL,
    description VARCHAR(300),
    release_date DATE,
    rating NUMERIC,
    created_at DATE,
    updated_at DATE
);