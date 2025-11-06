ALTER TABLE tb_product
ADD COLUMN image_url VARCHAR(255);

UPDATE tb_product SET image_url = 'https://exemple.com/images/iphone15.jpg' WHERE model = 'iPhone 15 256gb';
UPDATE tb_product SET image_url = 'https://exemple.com/images/motog85.jpg' WHERE model = 'G85 256gb';
UPDATE tb_product SET image_url = 'https://exemple.com/images/redmi13c.jpg' WHERE model = 'Redmi 13C 256gb';
UPDATE tb_product SET image_url = 'https://exemple.com/images/s23ultra.jpg' WHERE model = 'S23 Ultra 256gb';