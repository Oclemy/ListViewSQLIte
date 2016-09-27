package com.tutorials.hp.listviewsqlite.mDataBase;

/**
 * Created by Oclemmy on 5/5/2016 for ProgrammingWizards Channel and http://www.Camposha.com.
 */
public class Constants {
    //COLUMNS
    static final String ROW_ID="id";
    static final String NAME="name";


    //DB PROPERTIES
    static final String DB_NAME="hh_DB";
    static final String TB_NAME="hh_TB";
    static final int DB_VERSION=1;

    //CREATE TB STMT
    static final String CREATE_TB="CREATE TABLE hh_TB(id INTEGER PRIMARY KEY AUTOINCREMENT,"
            + "name TEXT NOT NULL);";


    //DROP TB STMT
    static final String DROP_TB="DROP TABLE IF EXISTS "+TB_NAME;
}
