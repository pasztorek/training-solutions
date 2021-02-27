 CREATE TABLE activities (
	ID BIGINT(20) NOT NULL AUTO_INCREMENT,
	activity_desc VARCHAR(50),
	activity_type VARCHAR(50),
    start_time TIMESTAMP, PRIMARY KEY (`ID`));