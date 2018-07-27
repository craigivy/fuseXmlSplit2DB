drop table if exists items;

CREATE TABLE items (
  id VARCHAR(100) NOT NULL,
  name VARCHAR(100) NOT NULL,
  state VARCHAR(100) NOT NULL,
  PRIMARY KEY (id)
);