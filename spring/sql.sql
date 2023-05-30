create database find_dining;

create table user (
	user_id bigint AUTO_INCREMENT primary key,
	nick_name varchar(20) not null,
    phone varchar(20),
    address varchar(50),
    get_liked bigint
);

create table review (
	review_id bigint AUTO_INCREMENT primary key,
    user_id bigint not null,
    store_id bigint not null,
    image_address text,
    score bigint,
    date bigint,
    num_comments bigint,
    liked bigint,
    foreign key(user_id) references user(user_id) on delete cascade on update cascade
);

create table review_detail (
	review_detail_id bigint AUTO_INCREMENT primary key,
    review_id bigint not null,
    comment varchar(255),
    food_type varchar(20),
    foreign key(review_id) references review(review_id) on delete cascade on update cascade
);

create table image(
	image_id bigint AUTO_INCREMENT primary key,
    review_id bigint not null,
    image_link text,
    foreign key(review_id) references review(review_id) on delete cascade on update cascade
);

create table comment (
	comment_id bigint AUTO_INCREMENT primary key,
    user_id bigint not null,
    review_detail_id bigint not null,
    content varchar(255),
    date bigint,
    foreign key(user_id) references user(user_id) on delete cascade on update cascade,
    foreign key(review_detail_id) references review_detail(review_detail_id) on delete cascade on update cascade
);





