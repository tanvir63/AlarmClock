package com.example.alarmclock;
import android.app.Activity;
import android.os.Bundle;

public class SettingsActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		try {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.settings_screen);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
