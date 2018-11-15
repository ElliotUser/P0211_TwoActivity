package robot.mr.p0211_twoactivity;

import android.content.Intent;
import android.icu.lang.UCharacter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.bthActTwo);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.bthActTwo:
                Intent intent = new Intent(this, ActivityWT.class);
                startActivity(intent);
                break;
                default:
                    break;
        }
    }
}
