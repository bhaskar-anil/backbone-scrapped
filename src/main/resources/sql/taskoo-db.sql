CREATE TABLE `category`
(
  `id` int(11) PRIMARY KEY,
  `title` varchar(255)
);

CREATE TABLE `task`
(
  `id` int(11) PRIMARY KEY,
  `title` varchar(255),
  `category_id` int(11)
);

CREATE TABLE `attribute`
(
  `id` int(11) PRIMARY KEY,
  `title` varchar(255),
  `type` int,
  `task_id` int(11)
);

CREATE TABLE `price`
(
  `id` int(11),
  `price` decimal(15,2),
  `attribute_id` int(11),
  `task_id` int(11)
);

CREATE TABLE `user`
(
  `id` int(11) PRIMARY KEY,
  `email` varchar(255),
  `phone` int(15)
);

CREATE TABLE `order`
(
  `id` int(11) PRIMARY KEY,
  `user_id` int(11),
  `price_id` int(11)
);

CREATE TABLE `order_details`
(
  `order_id` int(11),
  `task_id` int(11)
);

