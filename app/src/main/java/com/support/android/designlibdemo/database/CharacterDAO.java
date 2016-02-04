package com.support.android.designlibdemo.database;

/**
 * Created by fabio on 03/11/15.
 */

import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public class CharacterDAO {

    private SQLiteDatabase database;
    private MySQLiteHelper dbHelper;
    private String[] allColumns = { MySQLiteHelper.COLUMN_ID,
            MySQLiteHelper.COLUMN_NAME, MySQLiteHelper.COLUMN_TYPE };

    public CharacterDAO(Context context) {
        dbHelper = new MySQLiteHelper(context);
    }

    public void open() throws SQLException {
        database = dbHelper.getWritableDatabase();
    }

    public void close() {
        dbHelper.close();
    }

    public List<MiniCharacter> getAllMiniCharacters() {
        List<MiniCharacter> characters = new ArrayList<MiniCharacter>();

        Cursor cursor = database.query(MySQLiteHelper.TABLE_CHARACTER,
                allColumns, null, null, null, null, null);

        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            MiniCharacter character = cursorToCharacter(cursor);
            characters.add(character);
            cursor.moveToNext();
        }
        // make sure to close the cursor
        cursor.close();
        return characters;
    }

    private MiniCharacter cursorToCharacter(Cursor cursor) {
        MiniCharacter character = new MiniCharacter();
        character.setId(cursor.getLong(0));
        character.setName(cursor.getString(1));
        character.setType(cursor.getString(2));
        return character;
    }

}
