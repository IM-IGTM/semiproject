create table coffee(
c_no number(3) primary key,
c_title varchar2(30 char) not null,
c_price varchar2(30 char) not null,
c_img varchar2(100 char) not null,
c_explain varchar2(100 char) not null
);

create sequence coffee_seq;

insert into coffee values (coffee_seq.nextval, 'Ŀ�� �̸�1', '5000��', 'Ŀ�� �̹���1', 'Ŀ�� ����');
insert into coffee values (coffee_seq.nextval, 'Ŀ�� �̸�2', '5000��', 'Ŀ�� �̹���2', 'Ŀ�� ����');
insert into coffee values (coffee_seq.nextval, 'Ŀ�� �̸�3', '5000��', 'Ŀ�� �̹���3', 'Ŀ�� ����');
insert into coffee values (coffee_seq.nextval, 'Ŀ�� �̸�4', '5000��', 'Ŀ�� �̹���4', 'Ŀ�� ����');
insert into coffee values (coffee_seq.nextval, 'Ŀ�� �̸�5', '5000��', 'Ŀ�� �̹���5', 'Ŀ�� ����');
insert into coffee values (coffee_seq.nextval, 'Ŀ�� �̸�6', '5000��', 'Ŀ�� �̹���6', 'Ŀ�� ����');
insert into coffee values (coffee_seq.nextval, 'Ŀ�� �̸�7', '5000��', 'Ŀ�� �̹���7', 'Ŀ�� ����');
insert into coffee values (coffee_seq.nextval, 'Ŀ�� �̸�8', '5000��', 'Ŀ�� �̹���8', 'Ŀ�� ����');

delete coffee where c_no = 1;

select*from coffee;



