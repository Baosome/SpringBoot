insert into System_Entity (USERNAME, E_MASS_ID, SYSTEM_NAME, ATO_DATE)
values( 'Bao', 1234, 'BAOLAN', '1990-01-01');

insert into System_Entity (USERNAME, E_MASS_ID, SYSTEM_NAME, ATO_DATE)
values( 'Bao', 4321, 'BAOLAN2', '2001-01-01');

insert into System_Entity (USERNAME, E_MASS_ID, SYSTEM_NAME, ATO_DATE)
values( 'Bao', 5678, 'BAOLAN3', '2000-01-01');

insert into Component_Entity(COMPONENT_ID, E_MASS_ID, COMPONENT_TYPE, NAME, VERSION, LDA_DATE)
values(1,1234, 'Software', 'Chrome', '112.X', '2027-03-05');

insert into Component_Entity(COMPONENT_ID, E_MASS_ID, COMPONENT_TYPE, NAME, VERSION, LDA_DATE)
values(2, 1234, 'Software', 'Edge', '118.X', '2029-04-01');

insert into Component_Entity(COMPONENT_ID, E_MASS_ID, COMPONENT_TYPE, NAME, VERSION, LDA_DATE)
values(3, 1234, 'Hardware', 'Switch', '7.X', '2024-11-05');

insert into Component_Entity(COMPONENT_ID, E_MASS_ID, COMPONENT_TYPE, NAME, VERSION, LDA_DATE)
values(4, 1234, 'Hardware', 'Firewall', '6.X', '2022-04-01');
