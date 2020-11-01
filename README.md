# Homework2

Assuming you are inside /tomcat/lib and you have downloaded the mysql connector in the same file, compile with:
javac -cp  servlet-api.jar:mysql-connector-java-8.0.22.jar -d ../webapps/Homework2/WEB-INF/classes/ ../webapps/Homework2/WEB-INF/classes/*.java

MYSQL:
create database userdb;

use userdb;

create table product (
   PRODUCT_BARCODE varchar(100),
   NAME  varchar(50),
   COLOR varchar(50),
   DESCRIPTION varchar(200),
   primary key (PRODUCT_BARCODE));
