package com.example.informationchapchap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView banner;
    ImageView group;
String url = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        banner = findViewById(R.id.txt_banner);
        group = findViewById(R.id.imageView);
        group.setOnClickListener(this::openPage);
       /* url = "https://www.kma.go.ke/history/";

        Intent viewDetails = new Intent(Intent.ACTION_VIEW);

        viewDetails.setData(Uri.parse(url));
        startActivity(viewDetails);*/









    }

    public void openPage(View view) {

        url = "https://www.kma.go.ke/history/";

        Intent viewDetails = new Intent(Intent.ACTION_VIEW);

        viewDetails.setData(Uri.parse(url));
        startActivity(viewDetails);


    }
}
