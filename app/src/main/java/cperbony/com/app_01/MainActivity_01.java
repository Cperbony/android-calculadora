package cperbony.com.app_01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity_01 extends AppCompatActivity {

    private String msg = "C Android -> ";
    private EditText txtName;
    private TextView lbl_text;
    private Button btnDo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtName = findViewById(R.id.txt_name);
        btnDo = findViewById(R.id.btn_do);

        //Java 7
//        btnDo.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Log.d(msg, "Clicked from EventListener - setOnClickListener(new View.OnClickListener()");
//            }
//        });

        //JAVA 8 - Lambdas
        btnDo.setOnClickListener(view -> {
            if (txtName.getText() != null) {
                lbl_text.setText("Hello " + txtName.getText());
                Toast.makeText(this, "btnDo Clicked",
                        Toast.LENGTH_SHORT).show();
            }

        });
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d(msg, "onStart() method");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(msg, "onResume() method");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(msg, "onStop() method");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(msg, "onDestroy() method");
    }

//    public void doAction(View view) {
//        Log.d(msg, "Action Loaded");
//    }
    //android:onClick="doAction"
}

