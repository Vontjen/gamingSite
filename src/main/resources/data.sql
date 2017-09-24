


insert into company(id,name, developer, publisher)
Values (1000,'Platinum Games',TRUE ,FALSE );
insert into company(id,name, developer, publisher)
Values (2000,'Sega',TRUE ,TRUE );
insert into company(id,name, developer, publisher)
Values (3000,'MachineGames',TRUE ,FALSE );
insert into company(id,name, developer, publisher)
Values (4000,'Bethesda Softworks',TRUE ,TRUE );
insert into company(id,name, developer, publisher)
Values (5000,'Square Enix',true,TRUE );






insert into game(id, name, developer_id, publisher_id)
VALUES (1000, 'Nier: automata', 1000,5000);
insert into game(id, name, developer_id, publisher_id)
VALUES (2000, 'Yakuza 0', 2000,2000);
insert into game(id, name, developer_id, publisher_id)
VALUES (3000, 'Wolfenstein: the new order', 3000,4000);

/*UPDATE game SET picture = LOAD_FILE( 'Nier.jpg' ) WHERE id =1000;
UPDATE game SET picture = LOAD_FILE( 'Yakuza.png' ) WHERE id =2000;
UPDATE game SET picture = LOAD_FILE( 'Wolfenstein.jpg' ) WHERE id =3000;*/


insert into user(id, user_name, email)
values (1000, 'Vontjen', 'pandora_boy2@hotmail.com');
insert into user(id, user_name, email)
values (2000, 'SonJohnson', 'vontjen@gmail.com');
insert into user(id, user_name, email)
values (3000, 'Denowner', 'tjen.dekker@gmail.com');
insert into user(id, user_name, email)
values (4000, 'John Doe', 'tjen_dekker@hotmail.com');

insert into game_genres
values(1000, 0);
insert into game_genres
values(1000, 1);
insert into game_genres
values(2000, 1);
insert into game_genres
values(3000, 2);

insert into game_platforms
    VALUES (1000, 0);
insert into game_platforms
VALUES (1000, 1);
insert into game_platforms
VALUES (1000, 2);
insert into game_platforms
VALUES (2000, 0);
insert into game_platforms
VALUES (2000, 1);
insert into game_platforms
VALUES (2000, 2);
insert into game_platforms
VALUES (3000, 0);
insert into game_platforms
VALUES (3000, 1);
insert into game_platforms
VALUES (3000, 2);

insert into game_data
VALUES (1000,1000,1000);
insert into game_data
VALUES (2000,1000,2000);
insert into game_data
VALUES (3000,2000,2000);
insert into game_data
VALUES (4000,2000,3000);
insert into game_data
VALUES (5000,2000,2000);
insert into game_data
VALUES (6000,2000,1000);
insert into game_data
VALUES (7000,2000,3000);
insert into game_data
VALUES (8000,3000,1000);
insert into game_data
VALUES (9000,3000,2000);
insert into game_data
VALUES (10000,3000,3000);

insert into properties
VALUES (1000, 'Completed main', 'yes');
insert into properties
VALUES (2000, 'completed endings', '26');
insert into properties
VALUES (3000, 'weapons collected', '18');
insert into properties
VALUES (4000, 'Completed', 'yes');
insert into properties
VALUES (5000, 'substories found', '65');
insert into properties
VALUES (6000, 'baccus training complete', 'no');
insert into properties
VALUES (7000, 'Completed', 'no');
insert into properties
VALUES (8000, 'nazi\'s shot', '923');
insert into properties
VALUES (9000, 'killed the doctor', 'no');

insert into game_data_properties_list
values(1000,1000);
insert into game_data_properties_list
values(1000,2000);
insert into game_data_properties_list
values(3000,3000);
insert into game_data_properties_list
values(4000,4000);
insert into game_data_properties_list
values(5000,5000);
insert into game_data_properties_list
values(6000,6000);
insert into game_data_properties_list
values(7000,7000);
insert into game_data_properties_list
values(8000,8000);
insert into game_data_properties_list
values(9000,9000);







