package com.example.muheda.base_module.Utils;

import android.app.Activity;
import android.content.Intent;

/**
 * Created by 13660 on 2018/9/6.
 */

public class IntentToActivity {

    public static void skipToActivity(Activity activity,Class<? extends Activity> cls){
        activity.startActivity(new Intent(activity,cls));

    }
}
