package broadcast.codetutor.youtube.edu.samplebrtutorialcode;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by anildeshpande on 12/09/16.
 */
public class MainActivity extends AppCompatActivity {

    private BroadcastReceiver broadcastReceiver;
    private Button buttonBroadcastIntent;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main_activty);
        buttonBroadcastIntent=(Button)findViewById(R.id.buttonBroadcastIntent);
        broadcastReceiver=new MyBroadcastReceiver();

        buttonBroadcastIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                intent.addCategory(Intent.CATEGORY_DEFAULT);
                intent.setAction("my.custom.action.tag.fordemo");
                sendBroadcast(intent);
            }
        });


    }

    @Override
    protected void onStart() {
        super.onStart();
        IntentFilter intentFilter=new IntentFilter("my.custom.action.tag.fordemo");
        intentFilter.addCategory(Intent.CATEGORY_DEFAULT);
        registerReceiver(broadcastReceiver,intentFilter);

    }

    @Override
    protected void onStop() {
        super.onStop();
       unregisterReceiver(broadcastReceiver);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }
}
