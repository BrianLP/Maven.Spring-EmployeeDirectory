create table Department (
    id INT,
    name VARCHAR(50),
    employee OBJECT
    );

create table Employee (
                           employeeNumber INT,
                           firstName VARCHAR(50),
                           lastName VARCHAR(50),
                           title VARCHAR(50),
                           phoneNumber VARCHAR(50),
                           email VARCHAR(50),
                           manager OBJECT,
                           departmentNum NUMBER
);
insert into Employee (employeeNumber, firstName, lastName, title, phoneNumber, email) values (1, 'Trueman', 'Siderfin', 'Administrative Assistant IV', '634-336-8793', 'tsiderfin0@yale.edu');
insert into Employee (employeeNumber, firstName, lastName, title, phoneNumber, email) values (2, 'Gaynor', 'Leman', 'Safety Technician IV', '330-581-7703', 'gleman1@purevolume.com');
insert into Employee (employeeNumber, firstName, lastName, title, phoneNumber, email) values (3, 'Lucais', 'Tune', 'Account Executive', '534-166-5755', 'ltune2@gnu.org');
insert into Employee (employeeNumber, firstName, lastName, title, phoneNumber, email) values (4, 'Lian', 'Shepherdson', 'Quality Control Specialist', '487-891-0781', 'lshepherdson3@domainmarket.com');
insert into Employee (employeeNumber, firstName, lastName, title, phoneNumber, email) values (5, 'Kain', 'Berwick', 'Nuclear Power Engineer', '972-219-5137', 'kberwick4@stumbleupon.com');
insert into Employee (employeeNumber, firstName, lastName, title, phoneNumber, email) values (6, 'Millie', 'Henzley', 'Paralegal', '312-278-2301', 'mhenzley5@epa.gov');
insert into Employee (employeeNumber, firstName, lastName, title, phoneNumber, email) values (7, 'Philippe', 'Timmens', 'Civil Engineer', '866-912-7511', 'ptimmens6@woothemes.com');
insert into Employee (employeeNumber, firstName, lastName, title, phoneNumber, email) values (8, 'Denice', 'Dessent', 'Mechanical Systems Engineer', '960-653-9214', 'ddessent7@dot.gov');
insert into Employee (employeeNumber, firstName, lastName, title, phoneNumber, email) values (9, 'Thaine', 'Cody', 'Registered Nurse', '444-144-5702', 'tcody8@mail.ru');
insert into Employee (employeeNumber, firstName, lastName, title, phoneNumber, email) values (10, 'Vivian', 'MacLaren', 'Civil Engineer', '310-948-6364', 'vmaclaren9@google.com.au');
