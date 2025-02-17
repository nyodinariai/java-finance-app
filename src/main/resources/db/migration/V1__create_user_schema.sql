CREATE TABLE `user` (
    `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
    `email` VARCHAR(255) NOT NULL,
    `full_name` VARCHAR(255) NOT NULL,
    `password` VARCHAR(255) NOT NULL,
    `user_type` VARCHAR(8) NOT NULL,
    PRIMARY KEY (`id`)
);