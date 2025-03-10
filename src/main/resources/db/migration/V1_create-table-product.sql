CREATE TABLE product
(
    id             TEXT PRIMARY KEY UNIQUE NOT NULL,
    name           TEXT                    NOT NULL,
    price_in_cents INT                  NOT NULL,
    description    TEXT                    NOT NULL,
    image_url      TEXT                    NOT NULL,
    id_category    INT                    NOT NULL,
);