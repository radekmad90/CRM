package database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class MeetingsDB extends CrmDBBase {

	
	private static final String MEETINGS_TABLE_NAME = "meetings";
	private static final String ID = "id";
	private static final String DATE = "date";
	private static final String COMPANY = "company";
	private static final String DESCRIPTION = "description";
	
	private static final String MEETINGS_TABLE_CREATE =  
			"CREATE TABLE " + MEETINGS_TABLE_NAME + " ( "
			+ ID + "," + DATE + "," + COMPANY + ", " + DESCRIPTION;
	private SQLiteDatabase database;
	
	MeetingsDB(Context context) {
		super(context);
		
	}
	@Override
	public void onCreate(SQLiteDatabase db) {
		this.database=db;
		database.execSQL(MEETINGS_TABLE_CREATE);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		

	}

}
