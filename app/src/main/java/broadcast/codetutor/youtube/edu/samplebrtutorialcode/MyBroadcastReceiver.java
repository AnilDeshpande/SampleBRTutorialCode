package broadcast.codetutor.youtube.edu.samplebrtutorialcode;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by anildeshpande on 14/09/16.
 */
public class MyBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"Broadcast Receiver Triggered",Toast.LENGTH_SHORT).show();
    }
}
