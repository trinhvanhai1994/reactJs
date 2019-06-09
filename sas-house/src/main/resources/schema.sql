CREATE TABLE IF NOT EXISTS `employee` (
    `id` BIGINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    `name` varchar(45) NOT NULL,
    `phone` varchar(45) NOT NULL,
    `salary` DECIMAL(15,3) NOT NULL,
    `created` DATETIME,
	`modified` TIMESTAMP
)ENGINE=InnoDB CHARACTER SET=UTF8 COLLATE=utf8_unicode_ci;