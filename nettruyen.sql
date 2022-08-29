create database nettruyen;
use nettruyen;
create table users(
	id int auto_increment,
    fullname nvarchar(255),
    email varchar(200),
    pass varchar(200),
    gender nvarchar(10),
    avatar varchar(255),
    id_role int,
    primary key(id),
    foreign key(id_role) references roles(id)
);

insert into users(fullname, email, pass, gender, avatar, id_role) values("Thái Nhật Tân", "tan@gmail.com", "123456", "Nam", " ", 1);

create table roles(
	id int auto_increment,
    role_name nvarchar(100),
    role_description nvarchar(255),
    primary key(id)
);

insert into roles(role_name, role_description) values("ROLE_ADMIN", "Quản Trị Viên");
insert into roles(role_name, role_description) values("ROLE_MEMBER", "Người Dùng");

create table comic_user_detail(
	id int auto_increment,
	id_comic int,
    id_user int,
    primary key(id),
    foreign key(id_user) references users(id),
    foreign key(id_comic) references comic(id)
);


create table author(
	id int auto_increment,
    author_name nvarchar(200),
    primary key(id)
);

create table comic(
	id int auto_increment,
    comic_name nvarchar(255),
    views int,
    description_comic nvarchar(255),
    content nvarchar(255),
    thumbnail nvarchar(255),
    id_author int,
    id_comic_status int,
    primary key(id),
    foreign key(id_author) references author(id),
    foreign key(id_comic_status) references comic_status(id)
);

create table chapter(
	id int auto_increment,
    chapter_name nvarchar(255),
    chapter_description nvarchar(255),
    id_comic int,
    source_comic nvarchar(255),
    primary key(id),
	foreign key(id_comic) references comic(id)
);


create table comic_status(
	id int auto_increment,
    status_name nvarchar(255),
    status_description nvarchar(255),
    primary key(id)
);

create table comic_category(
	id int auto_increment,
    category_name nvarchar(255),
    category_description nvarchar(255),
    primary key(id)
);

create table comic_category_detail(
	id int auto_increment,
	id_comic int,
    id_category int,
    primary key(id),
    foreign key(id_comic) references comic(id),
    foreign key(id_category) references comic_category(id)
);










