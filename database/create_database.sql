CREATE DATABASE  IF NOT EXISTS `wcsdto` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `wcsdto`;

CREATE USER IF NOT EXISTS 'dto'@'localhost' IDENTIFIED BY 'dto';

GRANT ALL PRIVILEGES ON `wcsdto`.* TO 'dto'@'localhost';
FLUSH PRIVILEGES;

-- mock data for the pokemon and user tables

INSERT INTO user (name, age, level) VALUES
                                        ('Ash Ketchum', 10, 100),
                                        ('Misty', 12, 80);

INSERT INTO pokemon (name, power, attribute) VALUES
                                                  ('Pikachu', 8, 'FIRE'),
                                                  ('Charmander', 7, 'ELECTRICITY'),
                                                  ('Squirtle', 7, 'ICE'),
                                                  ('Bulbasaur', 7, 'FIRE'),
                                                  ('Jigglypuff', 6, 'WIND');

