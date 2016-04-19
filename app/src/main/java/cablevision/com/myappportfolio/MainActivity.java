package cablevision.com.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnPopularMoviesClick(View view) {
        Toast.makeText(this, "This Button will launch the Popular Movies app", Toast.LENGTH_SHORT).show();
    }

    public void onBtnStockHawkClick(View view) {
        Toast.makeText(this, "This Button will launch the Stock Hawk app", Toast.LENGTH_SHORT).show();
    }

    public void onBtnBuildBiggerClick(View view) {
        Toast.makeText(this, "This Button will launch the Build it Bigger app", Toast.LENGTH_SHORT).show();
    }

    public void onBtnMakeMaterialClick(View view) {
        Toast.makeText(this, "This Button will launch the Make it Material app", Toast.LENGTH_SHORT).show();
    }

    public void onBtnUbiquitousClick(View view) {
        Toast.makeText(this, "This Button will launch the Go Ubiquitous app", Toast.LENGTH_SHORT).show();
    }

    public void onBtnCapstoneClick(View view) {
        Toast.makeText(this, "This Button will launch the Capstone app", Toast.LENGTH_SHORT).show();
    }
}
