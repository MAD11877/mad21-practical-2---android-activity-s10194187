package sg.edu.np.s10194187_practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        TextView hello = findViewById(R.id.hello);
//        TextView description = findViewById(R.id.description);
        Button followbtn = findViewById(R.id.followbtn);

        User tom = new User();
        tom.followed = false;

        followbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!tom.followed){
                    followbtn.setText("Unfollow");
                    tom.followed = true;
                }
                else {
                    followbtn.setText("Follow");
                    tom.followed = false;
                }
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("debug","start");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("debug","stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("debug","destroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("debug","pause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("debug","resume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("debug","restart");
    }


}