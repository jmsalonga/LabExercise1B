package ph.edu.iicsust.salonga.josemari.labexercise1b;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button pressMeButton = (Button) findViewById(R.id.pressMeButton);
        pressMeButton.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
                for(int i=1; i<=20; i++){
                    if(i%2==0){
                        resultTextView.append(i+ " ");
                    }
                }
            }
        });

    }
}

