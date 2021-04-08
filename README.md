# springboot-crud-app

# 概要
* SpringBootでCRUDをするサンプルアプリ
* 随時機能を足していく予定

## MySQLの設定方法

```
$ sudo  mysql -u root -p
mysql> use accountdb;
mysql> CREATE TABLE `account` (
    -> `id` int(11) NOT NULL AUTO_INCREMENT,
    -> `mail` varchar(45) NOT NULL,
    -> `name` varchar(45) NOT NULL,
    -> `description` varchar(100) NOT NULL,
    -> PRIMARY KEY (`id`)
    ->  ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
mysql> grant all on accountdb.* to accountuser@localhost;
mysql -u accountuser -pPassword123!
mysql> use accountdb;
mysql> insert into account (mail, name, description) values
    ->  ('sample001@example.com', 'muraoka', 'test_dayo'),
    -> ('sample002@example.com', 'muraoka2', 'test_dayo2'),
    ->  ('sample003@example.com', 'muraoka3', 'test_dayo3');
```

## 実行方法
```
cd ~/crud-app
mvn spring:run

-> localhost:8080にアクセスすれば初期画面が表示されるはず
```
