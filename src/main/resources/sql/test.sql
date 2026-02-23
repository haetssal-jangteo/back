use haetssal_jangteo;

select * from tbl_market;

select * from tbl_store;

select * from tbl_category;

select * from tbl_sub_category;

select * from tbl_item;

select * from tbl_item_option;

select * from tbl_file;

select * from tbl_file_item;

select * from tbl_file_user;

select * from vw_file_user;

select * from tbl_review;

delete from tbl_file
where file_type = 'image';

select * from tbl_user;

select * from tbl_auth;

select * from tbl_seller;

select * from tbl_delivery;

# 확인용 유저 샘플
insert into tbl_user (id, user_email, user_phone, user_name, user_intro)
values (4,'example6@example.com', '01066666666', '홍길동8', '설명6');

select id from tbl_store;

select count(*) from tbl_item
where item_store_id = 8;

