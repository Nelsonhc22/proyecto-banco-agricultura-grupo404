-- ══════════════════════════════════════════════════
--  Banco Agricultura Salvadoreño — Script inicial
--  Ejecutar en MySQL antes de arrancar el proyecto
-- ══════════════════════════════════════════════════

CREATE DATABASE IF NOT EXISTS banco_agricultura
    CHARACTER SET utf8mb4
    COLLATE utf8mb4_unicode_ci;

USE banco_agricultura;

-- ROLES
INSERT INTO rol (nombre_rol) VALUES
    ('CLIENTE'),
    ('DEPENDIENTE'),
    ('CAJERO'),
    ('GERENTE_SUCURSAL'),
    ('GERENTE_GENERAL')
ON DUPLICATE KEY UPDATE nombre_rol = nombre_rol;

-- SUCURSAL INICIAL
INSERT INTO sucursal (nombre, direccion, departamento) VALUES
    ('Sucursal Central', '1a Calle Poniente, San Salvador', 'San Salvador')
ON DUPLICATE KEY UPDATE nombre = nombre;

-- USUARIO GERENTE GENERAL INICIAL
-- Password: Admin2024!
INSERT INTO usuario (dui, nombre_usuario, correo_electronico, username, password, activo, id_rol)
SELECT '00000000-0', 'Administrador General', 'admin@banco.com', 'admin',
       '$2a$12$LQv3c1yqBWVHxkd0LHAkCOYz6TtxMQyCgJ6XBZS8yT4pQ5YvK3Q2.',
       true, r.id_rol
FROM rol r WHERE r.nombre_rol = 'GERENTE_GENERAL'
ON DUPLICATE KEY UPDATE username = username;