1)
//create country table
CREATE TABLE country (
    country_id SERIAL PRIMARY KEY,
    country_name VARCHAR(50) NOT NULL
);

insert values
INSERT INTO country (country_name)
VALUES 
    ('India'),
    ('USA'),
    ('Canada');

//Retrieve values
SELECT * FROM country;
2)
//create table language
CREATE TABLE language (
    language_id SERIAL PRIMARY KEY,
    language_name VARCHAR(50) NOT NULL,
    last_update TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

//Insert values
INSERT INTO language (language_name)
VALUES 
    ('English'),
    ('Hindi'),
    ('Marathi');

// Retrieve values
SELECT * FROM language;
3)
//Create table category
CREATE TABLE category (
    category_id SERIAL PRIMARY KEY,
    category_name VARCHAR(50) NOT NULL,
    last_update TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

//Insert values
INSERT INTO category (category_name)
VALUES 
    ('Action'),
    ('Comedy'),
    ('Drama');

// Retrieve values
SELECT * FROM category;
4)
//Create table film
CREATE TABLE film (
    film_id SERIAL PRIMARY KEY,
    title VARCHAR(100),
    release_year INT,
    language_id INT REFERENCES language(language_id),
    last_update TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

// Insert values
INSERT INTO film (title, release_year, language_id)
VALUES
    ('Chak De! India', 2007, 2),
    ('12th Fail', 2023, 2),
    ('3 Idiots', 2009, 2);

// Retrieve values
SELECT * FROM film;

5)
// Create table  actor
CREATE TABLE actor (
    actor_id SERIAL PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    last_update TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

//Insert values
INSERT INTO actor (first_name, last_name)
VALUES 
    ('Aamir', 'Khan'),
    ('Shahrukh', 'Khan'),
    ('Rani', 'Mukerji');

// Retrieve values
SELECT * FROM actor;

6)
//Create table film_actor
CREATE TABLE film_actor (
    film_id INT REFERENCES film(film_id),
    actor_id INT REFERENCES actor(actor_id),
    last_update TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (film_id, actor_id)
);

//Insert values
INSERT INTO film_actor (film_id, actor_id)
VALUES
    (1, 1),  -- Chak De! India – Aamir Khan
    (2, 2),  -- 12th Fail – Shahrukh Khan
    (3, 1),  -- 3 Idiots – Aamir Khan
    (3, 3);  -- 3 Idiots – Rani Mukerji

// Retrieve values
SELECT * FROM film_actor;


