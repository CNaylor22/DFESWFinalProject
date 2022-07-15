DROP TABLE IF EXISTS `restaurant_menu`;

CREATE TABLE `restaurant_menu` (
`id` BIGINT AUTO_INCREMENT,
`starter` VARCHAR(255) NOT NULL,
`side_dish` VARCHAR(255) NOT NULL,
`main_dish` VARCHAR(255) NOT NULL,
`dessert` VARCHAR(255) NOT NULL,
`price` FLOAT NOT NULL, 
`cuisine` VARCHAR(255) NOT NULL,
PRIMARY KEY (`id`)
);