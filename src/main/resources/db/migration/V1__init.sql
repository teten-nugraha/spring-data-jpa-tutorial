CREATE TABLE IF NOT EXISTS tb_kategori (
    `id` INT auto_increment primary key,
    `nama` VARCHAR(11),
    `maker` VARCHAR(7),
    `is_active` BOOLEAN
);