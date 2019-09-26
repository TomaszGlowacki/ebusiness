INSERT INTO play_evolutions (id, hash, applied_at, apply_script, revert_script, state, last_problem) VALUES (1, '9ff8d43e99291c0299d01afbc5af98e04d4f3254', '1523526575234', 'create table "category" (
"id" integer not null primary key autoincrement,
"name" varchar not null
);

create table "product" (
"id" integer not null primary key autoincrement,
"name" varchar not null,
"description" text not null,
category int not null,
foreign key(category) references category(id)
);', 'drop table "product" if exists;
drop table "category" if exists;', 'applied', '');