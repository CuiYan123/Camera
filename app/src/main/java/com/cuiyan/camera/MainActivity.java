package com.cuiyan.camera;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = ((TextView) findViewById(R.id.text));
<<<<<<< HEAD
        textView.setText("小秦网吧打");
=======
        textView.setText("cuiyan");
>>>>>>> cff3a56e8ef4fb235cdaa49bca06dd1be4052213
    }
}
