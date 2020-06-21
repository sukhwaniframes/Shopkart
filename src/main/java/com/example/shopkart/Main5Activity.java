package com.example.shopkart;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        Button b1, b2,b3;
        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button3);
        Button alertdialog =(Button)findViewById(R.id.button3); alertdialog.setOnClickListener(new View.OnClickListener() { @Override public void onClick(View v) {  AlertDialog.Builder adb = new AlertDialog.Builder(Main5Activity.this); adb.setTitle("Alert"); adb.setMessage("Do you want to call?"); adb.setCancelable(false); String yesButtonText = "Yes"; String noButtonText = "No"; adb.setPositiveButton(yesButtonText, new DialogInterface.OnClickListener() { @Override public void onClick(DialogInterface dialog, int which){Intent Call_ms1 = new Intent(Intent.ACTION_CALL);
            Call_ms1.setData(Uri.parse("tel:0"));

            startActivity(Call_ms1); } }); adb.setNegativeButton(noButtonText, new DialogInterface.OnClickListener(){ @Override public void onClick(DialogInterface dialog, int which){ } }); adb.show();
        } });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSePqCeOO95dDrz6dym_R1jLu7RnA6scHW8xPqHEHPAf0ixrow/viewform"));
                startActivity(intent);
            }
        });
        b3 = findViewById(R.id.button);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main5Activity.this,Main3Activity.class);
                startActivity(intent);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.abc, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected (MenuItem item) {
        switch (item.getItemId()) {

            case R.id.item3:
                Intent intent3 = new Intent(this, MainActivity.class);
                startActivity(intent3);
                return true;
            case R.id.item4:
                Intent intent1 = new Intent(this, Main4Activity.class);
                startActivity(intent1);
                return true;
            case R.id.item5:
                Intent intent2 = new Intent(this, Main5Activity.class);
                startActivity(intent2);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}