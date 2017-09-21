insert into company(name, developer, publisher)
Values ('Platinum Games',TRUE ,FALSE );
insert into company(name, developer, publisher)
Values ('Sega',TRUE ,TRUE );
insert into company(name, developer, publisher)
Values ('MachineGames',TRUE ,FALSE );
insert into company(name, developer, publisher)
Values ('Bethesda Softworks',TRUE ,TRUE );
insert into company(name, developer, publisher)
Values ('Square Enix',true,TRUE );






insert into game(id, name, developer_name, publisher_name)
VALUES (1000, 'Nier: automata', 'Platinum Games','Square Enix');
insert into game(id, name, developer_name, publisher_name)
VALUES (2000, 'Yakuza 0', 'Sega','Sega');
insert into game(id, name, developer_name, publisher_name)
VALUES (3000, 'Wolfenstein: the new order', 'MachineGames','Bethesda Softworks');

UPDATE game SET picture = LOAD_FILE( 'Nier.jpg' ) WHERE id =1000;
UPDATE game SET picture = LOAD_FILE( 'Yakuza.png' ) WHERE id =2000;
UPDATE game SET picture = LOAD_FILE( 'Wolfenstein.jpg' ) WHERE id =3000;


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

