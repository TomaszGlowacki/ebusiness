INSERT INTO sqlite_master (type, name, tbl_name, rootpage, sql) VALUES ('table', 'play_evolutions', 'play_evolutions', 2, 'CREATE TABLE play_evolutions (
          id int not null primary key,
          hash varchar(255) not null,
          applied_at timestamp not null,
          apply_script text,
          revert_script text,
          state varchar(255),
          last_problem text
      )');
INSERT INTO sqlite_master (type, name, tbl_name, rootpage, sql) VALUES ('index', 'sqlite_autoindex_play_evolutions_1', 'play_evolutions', 3, null);
INSERT INTO sqlite_master (type, name, tbl_name, rootpage, sql) VALUES ('table', 'sqlite_sequence', 'sqlite_sequence', 5, 'CREATE TABLE sqlite_sequence(name,seq)');
INSERT INTO sqlite_master (type, name, tbl_name, rootpage, sql) VALUES ('table', 'category', 'category', 6, 'CREATE TABLE `category` (
                                          `id` integer not null primary key autoincrement,
                                          `name` varchar(255) ,
                                          `details` text
)');
INSERT INTO sqlite_master (type, name, tbl_name, rootpage, sql) VALUES ('table', 'order_details', 'order_details', 9, 'CREATE TABLE `order_details` (
                                               `order_details_id` integer not null primary key autoincrement,
                                               `order_id` int(11) ,
                                               `product_id` int(11) ,
                                               `quantity` int(11)
)');
INSERT INTO sqlite_master (type, name, tbl_name, rootpage, sql) VALUES ('table', 'sales', 'sales', 11, 'CREATE TABLE `sales` (
                                       `sales_id` integer not null primary key autoincrement,
                                       `order_id` int(11) NOT NULL,
                                       `sales_amount` int(11) NOT NULL,
                                       `created_at` int(11) NOT NULL
)');
INSERT INTO sqlite_master (type, name, tbl_name, rootpage, sql) VALUES ('table', 'users', 'users', 12, 'CREATE TABLE `users` (
                                       `user_id` integer not null primary key autoincrement,
                                       `firstname` varchar(255) ,
                                       `middlename` varchar(255) ,
                                       `lastname` varchar(255) ,
                                       `email` varchar(255) ,
                                       `password` varchar(255) ,
                                       `address` varchar(255) ,
                                       `phone` varchar(255) ,
                                       `type` varchar(255),
                                       `created_at` int(11)
)');
INSERT INTO sqlite_master (type, name, tbl_name, rootpage, sql) VALUES ('table', 'product', 'product', 14, 'CREATE TABLE "product"
(
	product_id integer not null
		primary key autoincrement,
	name varchar(255),
	description text,
	image varchar(255),
	category_id int(11)
		references category,
	quantity integer,
	brand varchar(255) default NULL,
	model varchar(255) default NULL,
	configuration varchar(255) default NULL,
	price integer,
	featured int(11),
	created_at int(11)
)');
INSERT INTO sqlite_master (type, name, tbl_name, rootpage, sql) VALUES ('table', 'contact', 'contact', 10, 'CREATE TABLE "contact"
(
	contact_id integer not null
		primary key autoincrement,
	firstname varchar(255),
	middlename varchar(255),
	lastname varchar(255),
	email varchar(255),
	message varchar(255),
	created_at int(11)
)');
INSERT INTO sqlite_master (type, name, tbl_name, rootpage, sql) VALUES ('table', 'orders', 'orders', 7, 'CREATE TABLE "orders"
(
	order_id integer not null
		primary key autoincrement,
	user_id int(11)
		constraint user_fk
			references users,
	shiping_address varchar(255) default NULL,
	shiping_date int(11) default NULL,
	shipping_status varchar(255) default NULL,
	created_at int(11)
)');