package cperbony.com.app_01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText num1;
    private EditText num2;
    private Button btnSum;
    private Button btnSub;
    private Button btnMult;
    private Button btnDiv;
    private TextView lblResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.txt_num1);
        num2 = findViewById(R.id.txt_num2);
        btnSum = findViewById(R.id.btnSum);
        btnSub = findViewById(R.id.btnSub);
        btnMult = findViewById(R.id.btnMult);
        btnDiv = findViewById(R.id.btnDiv);
        lblResult = findViewById(R.id.result_txt);

        btnSum.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMult.setOnClickListener(this);
        btnDiv.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Double num1R = 0.0;
        Double num2R = 0.0;
        Double result = 0.0;

        num1R = Double.parseDouble(num1.getText().toString());
        num2R = Double.parseDouble(num2.getText().toString());

        switch (view.getId()){
            case R.id.btnSum:
                result = num1R + num2R;
                break;
            case R.id.btnSub:
                result = num1R - num2R;
                break;
            case R.id.btnMult:
                result = num1R * num2R;
                break;
            case R.id.btnDiv:
                result = num1R / num2R;
                break;
        }
        lblResult.setText(result.toString());

        Toast.makeText(this, "Botão clicado", Toast.LENGTH_SHORT).show();

    }



}

