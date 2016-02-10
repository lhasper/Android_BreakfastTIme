package wmich.edu.ex2lhaspe0925;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioButton rdoOmlette=(RadioButton)findViewById(R.id.rdobtnOmlette);
        RadioButton rdoPancake=(RadioButton)findViewById(R.id.rdobtnPancakes);
        RadioButton rdoFrTst=(RadioButton)findViewById(R.id.rdobtnFrTst);
        Button btnSubmit=(Button)findViewById(R.id.btnSubmit);
    }
}
