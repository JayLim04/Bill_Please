package sg.edu.rp.c346.id21033869.billplease;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    EditText etAmt;
    EditText etPax;
    ToggleButton tbtnGst;
    ToggleButton tbtnSvc;
    EditText etDisc;
    TextView tvTotal;
    TextView tvSplit;
    ToggleButton svc;
    ToggleButton gst;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etAmt= findViewById(R.id.editTextAmt);
        etPax= findViewById(R.id.editTextPax);
        etDisc = findViewById(R.id.editTextDisc);
        tbtnGst = findViewById(R.id.toggleButtonGst);
        tbtnSvc = findViewById(R.id.toggleButtonSvc);
        tvTotal = findViewById(R.id.textViewTotal);
        tvSplit = findViewById(R.id.textViewSplit);
        svc = findViewById(R.id.toggleButtonSvc);
        gst = findViewById(R.id.toggleButtonGst);


        tbtnGst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(etAmt.getText().toString());
                int b = Integer.parseInt(etPax.getText().toString());

                double total = (double) a+b;
                double payable = (double) a/b;

                String payableString = tvTotal.getText().toString();

                gst.setOnCheckedChangeListener( new CompoundButton.OnCheckedChangeListener()
                {
                    @Override

                    public void onCheckedChanged(CompoundButton toggleButton, boolean isChecked)
                    {
                        if(isChecked == true){
                           double totaltax = ((a+b)/100)*107;
                        }
                        else if(isChecked == true && )
                            double totaltax = a+b;
                    }
                });
            });
        });
    }
}