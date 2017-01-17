package com.example.mtsbu;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Mtsbu extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void search(View view) {
        EditText regno = (EditText) findViewById(R.id.regno);
        String url = "https://cbd.mtibu.kiev.ua/MTSBU_Pages/Parameters/SearchParams.aspx?ParamsName=SearchInsurerByVehicle&autoauth=true&FVehicle.RegNo=" + regno.getText();
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
}
