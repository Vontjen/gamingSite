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

