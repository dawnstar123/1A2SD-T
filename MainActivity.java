
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    String TAG = "gg";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate");
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(MainActivity.this);
    }

    @Override
    public void onClick(View v) {
        Intent myIntent = new Intent(v.getContext(), Water.class);
        startActivity(myIntent);
    }
}
