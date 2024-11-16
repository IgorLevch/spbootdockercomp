USE company;

CREATE TABLE employees(
    id  INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255),
    positio VARCHAR(255),
    salary DECIMAL(10,2)
);

INSERT INTO employees(name, positio, salary)  VALUES
    ('John', 'Engeneer', 7500.00),
    ('Jane', 'Manager', 90000.00);