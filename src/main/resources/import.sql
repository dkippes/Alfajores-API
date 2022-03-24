INSERT INTO categorias (name, description) VALUES ('Dulce de leche', 'Tiene dulce de leche');
INSERT INTO categorias (name, description) VALUES ('Chocolate', 'Tiene chocolate');
INSERT INTO imagenes (name) VALUES ('imagen1.jpg');
INSERT INTO imagenes (name) VALUES ('imagen2.jpg');
INSERT INTO alfajores (name, description, weight, price, categoria_id) VALUES ('Capitan del espacio', 'Es re rico!', 15, 150, 1);
INSERT INTO alfajores (name, description, weight, price, categoria_id) VALUES ('del as', 'Es re rico!', 15, 150, 1);
INSERT INTO alfajores (name, description, weight, price, categoria_id) VALUES ('Pepitas', 'Tiene pepas', 10, 50, 2);
INSERT INTO alfajores_imagenes (alfajor_id, imagen_id) VALUES (1, 1);
INSERT INTO alfajores_imagenes (alfajor_id, imagen_id) VALUES (1, 2);
