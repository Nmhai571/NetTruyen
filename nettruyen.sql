create database nettruyen;
use nettruyen;
create table users(
	id bigint auto_increment,
    fullname nvarchar(255),
    email varchar(200) unique,
    pass varchar(200),
    gender nvarchar(10),
    avatar varchar(255),
    id_role bigint,
    primary key(id),
    foreign key(id_role) references roles(id)
);

insert into users(fullname, email, pass, gender, avatar, id_role) values("Thái Nhật Tân", "tan@gmail.com", "123456", "Nam", " ", 1);

create table roles(
	id bigint auto_increment,
    role_name nvarchar(100),
    role_description nvarchar(255),
    primary key(id)
);
select * from users u  join task t on u.id = t.id_user join status_task st on st.id = t.id_status where u.id = 1;

insert into roles(role_name, role_description) values("ROLE_ADMIN", "Quản Trị Viên");
insert into roles(role_name, role_description) values("ROLE_MEMBER", "Người Dùng");

create table comic_user_detail(
    id bigint auto_increment,
    id_comic bigint,
    id_user bigint,
    primary key(id),
    foreign key(id_user) references users(id),
    foreign key(id_comic) references comic(id)
);


create table author(
    id bigint auto_increment,
    author_name nvarchar(200),
    primary key(id)
);

create table comic(
    id bigint auto_increment,
    comic_name nvarchar(255),
    views bigint,
    content nvarchar(255),
    thumbnail nvarchar(255),
    id_author bigint,
    id_comic_status bigint,
    primary key(id),
    foreign key(id_author) references author(id),
    foreign key(id_comic_status) references comic_status(id)
);

create table chapter(
	id bigint auto_increment,
    chapter_name nvarchar(255),
    chapter_description nvarchar(255),
    id_comic bigint,
    source_comic nvarchar(255),
	day_upload datetime default now(),
    primary key(id),
    foreign key(id_comic) references comic(id)
);


create table comic_status(
    id bigint auto_increment,
    status_name nvarchar(255),
    primary key(id)
);

create table comic_category(
    id bigint auto_increment,
    category_name nvarchar(255),
    category_description nvarchar(255),
    primary key(id)
);

create table comic_category_detail(
    id bigint auto_increment,
    id_comic bigint,
    id_category bigint,
    primary key(id),
    foreign key(id_comic) references comic(id),
    foreign key(id_category) references comic_category(id)
);

create table history(
	id bigint auto_increment,
    id_comic bigint,
    id_user bigint,
    primary key(id),
	foreign key(id_comic) references comic(id),
    foreign key(id_user) references users(id)
);










