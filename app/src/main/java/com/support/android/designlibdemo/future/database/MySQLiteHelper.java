package com.support.android.designlibdemo.future.database;

/**
 * Created by fabio on 03/11/15.
 */
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MySQLiteHelper extends SQLiteOpenHelper {

    public static final String TABLE_CHARACTER = "character";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_TYPE = "type";

    private static final String DATABASE_NAME = "characterdb.db";
    private static final int DATABASE_VERSION = 1;

    private final Context myContext;

    private static String DB_PATH = "/data/data/com.support.android.designlibdemo/databases/";

    private SQLiteDatabase myDataBase;

    // Database creation sql statement
    private static final String DATABASE_CREATE = "create table "
            + TABLE_CHARACTER + "(" + COLUMN_ID
            + " integer primary key autoincrement, " + COLUMN_NAME
            + " text not null, " + COLUMN_TYPE + "text not null);";

    public MySQLiteHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.myContext = context;
    }

    @Override
    public void onCreate(SQLiteDatabase database) {
        //database.execSQL(DATABASE_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        /*Log.w(MySQLiteHelper.class.getName(),
                "Upgrading database from version " + oldVersion + " to "
                        + newVersion + ", which will destroy all old data");
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_CHARACTER);
        onCreate(db);*/
    }


}
