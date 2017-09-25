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



insert into game(id, name, developer_id, publisher_id, description)
VALUES (1000, 'Nier: automata', 1000,5000,'NieR: Automata tells the story of androids 2B, 9S and A2 and their battle to reclaim the machine-driven dystopia overrun by powerful machines.

Humanity has been driven from the Earth by mechanical beings from another world. In a final effort to take back the planet, the human resistance sends a force of android soldiers to destroy the invaders. Now, a war between machines and androids rages on... A war that could soon unveil a long-forgotten truth of the world.');
insert into game(id, name, developer_id, publisher_id, description)
VALUES (2000, 'Yakuza 0', 2000,2000,'Yakuza 0 is set in 1988 and serves as an origin story for two of the series’ most prominent characters, Kazuma Kiryu and Goro Majima, who find themselves caught up in a land war amongst rival clans.');
insert into game(id, name, developer_id, publisher_id, description)
VALUES (3000, 'Wolfenstein: the new order', 3000,4000, 'Wolfenstein®: The New Order reignites the series that created the first-person shooter genre. Under development at Machine Games, a studio comprised of a seasoned group of developers recognized for their work creating story-driven games, Wolfenstein offers a deep game narrative packed with action, adventure and first-person combat.');
insert into game(id, name,developer_id,publisher_id, description)
VALUES (4000, 'Final Fantasy XII the zodiac age', 5000,5000,'As war looms on the horizon, the mighty Archadian Empire begins a campaign to subjugate its neighbors. To Vaan, a young man living on the streets of Rabanastre, the Empire is a hated enemy who took the life of his brother. Planning on exacting revenge by breaking into the palace, Vaan gets more than he bargained for as he runs into Princess Ashe, the sole surviving heir to the Dalmascan throne. Together, the two embark on an incredible journey tracing the mysteries behind the Archadian Empire''s invasion.' );

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
insert into game_genres
    VALUES (4000,0);
insert into game_genres
    values (4000,1);

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
insert into game_platforms
VALUES (4000,0);
insert into game_platforms
VALUES (4000,1);
insert into game_platforms
VALUES (4000,2);
insert into game_platforms
    values(1000, 4);


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
insert into game_data
VALUES (11000,4000,1000);
insert into game_data
VALUES (12000,4000,3000);
insert into game_data
VALUES (13000,4000,2000);

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
insert into properties
    values (10000, 'Espers obtained', '5');
insert INTO properties
    values(11000, 'maxLvl','87');
insert INTO properties
values(12000, 'Cid defeated','No');

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
insert into game_data_properties_list
values(10000,10000);
insert into game_data_properties_list
values(11000,11000);
insert into game_data_properties_list
values(12000,12000);








