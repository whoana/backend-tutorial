
[H2Database]
h2 실행
    ${H2_HOME}/bin/h2.sh

browser 접속 
    최초 database 생성 시 다음 JDBC URL 접속 후 연결 종료 
         JDBC URL :  jdbc:h2~/test
         user : sa 
         password :
    다음 URL 로 다시 접속해 본다. 
        JDBC URL :  jdbc:h2:tcp://localhost/~/test 

    table 생성 & data 등록 
    CREATE TABLE USERS (
        ID   VARCHAR(20) NOT NULL PRIMARY KEY,
        NM   VARCHAR(20) NOT NULL
    );

    INSERT INTO USERS VALUES ('me', 'me');

    SELECT * FROM USERS;
