CREATE TABLE `category`
(
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255),
  PRIMARY KEY (`id`)
);

CREATE TABLE `task`
(
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255),
  `category_id` int(11),
  PRIMARY KEY (`id`)
);

CREATE TABLE `attribute`
(
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255),
  `type` int,
  `task_id` int(11),
  PRIMARY KEY (`id`)
);

CREATE TABLE `price`
(
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `price` decimal(15,2),
  `attribute_id` int(11),
  `task_id` int(11),
  PRIMARY KEY (`id`)
);

CREATE TABLE `user`
(
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(255),
  `phone` int(15),
  PRIMARY KEY (`id`)
);

CREATE TABLE `order`
(
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11),
  `price_id` int(11),
  PRIMARY KEY (`id`)
);

CREATE TABLE `order_details`
(
  `order_id` int(11),
  `task_id` int(11)
);

