CREATE DATABASE airport;

CREATE TABLE plane (
    id INT PRIMARY KEY,
    model TEXT NOT NULL,
    serial_number TEXT NOT NULL UNIQUE,
    seats INT NOT NULL
);

CREATE TABLE pilot (
    id INT PRIMARY KEY,
    name TEXT NOT NULL,
    age INT NOT NULL,
    plane_model TEXT NOT NULL
);

INSERT INTO plane(id, model, serial_number, seats) VALUES (1, 'Boeing 747', 'N474EV', 467),
                                                          (2, 'Airbus A320', 'F-WWBA', 186),
                                                          (3, 'Boeing 747', 'N615FF', 467),
                                                          (4, 'Airbus A320', 'F-GFKQ', 186),
                                                          (5, 'Airbus A320', 'F-GGEG', 186),
                                                          (6, 'Airbus A320', 'F-GGEF', 186),
                                                          (7, 'Airbus A320', 'F-GFKA', 186);
INSERT INTO pilot(id, name, age, plane_model) VALUES (1, 'John Doe', 36, 'Boeing 747'),
                                                     (2, 'Nick Smith', 44, 'Airbus A320'),
                                                     (3, 'Nick Smith', 44, 'Boeing 747'),
                                                     (4, 'Tom Castle', 30, 'Airbus A320'),
                                                     (5, 'Tom Castle', 30, 'Boeing 747'),
                                                     (6, 'Jordan Joris', 35, 'Airbus A320'),
                                                     (7, 'Enrico Cuerdall', 33, 'Airbus A320'),
                                                     (8, 'Cristobal Noar', 45, 'Airbus A320'),
                                                     (9, 'Hedwig Itzkovsky', 39, 'Airbus A320'),
                                                     (10, 'Eldon Gullyes', 47, 'Airbus A320');