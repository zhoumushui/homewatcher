package com.zms.homewatcher;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.WindowManager;

public class Main extends Activity {
    public static final int FLAG_HOMEKEY_DISPATCHED = 0x80000000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.getWindow().setFlags(FLAG_HOMEKEY_DISPATCHED, FLAG_HOMEKEY_DISPATCHED);
        setContentView(R.layout.main);
    }

    @Override
    protected void onUserLeaveHint() {
        //super.onUserLeaveHint();
        Intent intent = new Intent(Main.this, Main.class);  // ToDo:Modify Here
        startActivity(intent);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        //  KeyEvent.KEYCODE_HOME  KeyEvent.KEYCODE_APP_SWITCH
        if (keyCode == KeyEvent.KEYCODE_BACK || keyCode == KeyEvent.KEYCODE_HOME)
            return true;
        else
            return super.onKeyDown(keyCode, event);
    }
}
