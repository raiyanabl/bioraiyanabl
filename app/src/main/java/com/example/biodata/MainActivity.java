package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;


import com.example.biodata.R;

public class MainActivity extends AppCompatActivity {

    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void openWA(View view) {
        String number = "6281359578153";
        String url = "https://api.whatsapp.com/send?phone="+number;
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setPackage("com.whatsapp");
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void onButtonTap(View v){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[] {"raiyansal30@gmail.com"});
        intent.putExtra(Intent.EXTRA_SUBJECT, "Tentang Biodata");
        intent.putExtra(Intent.EXTRA_TEXT, "Halo, Raiyan ...");

        try {
            startActivity(Intent.createChooser(intent, "Ingin Mengirim Email ke Raiyan ?"));
        } catch (android.content.ActivityNotFoundException ex) {

        }
    }

    public void showMap(View view) {
        Uri uri = Uri.parse("geo:-7.152611, 111.578833q=");
        Intent it = new Intent (android.content.Intent.ACTION_VIEW, uri );
        startActivity(it);


    }

}