package com.vistasoft.namesallah;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class AboutUsEnglish extends AppCompatActivity {
    private AdView mAdView;

  String text = "\nContact Us : " +
          "\n\n" +"Email : "+"\n"+"info@vistasoftit.org\nvistasoftit@gmail.com"+"\n\n"
          +"Website :"+"\n"+" http://www.vistasoftit.org/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);



        MobileAds.initialize(getApplicationContext(), "ca-app-pub-5910423341335020~3753993798");

        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        TextView textView = (TextView)findViewById(R.id.tvAboutUs);
        TextView tvmoreApps = (TextView) findViewById(R.id.tvMoreApp);
        tvmoreApps.setText(Html.fromHtml("<a href=http://www.vistasoftit.org/> Browse More Apps  "));
        tvmoreApps.setMovementMethod(LinkMovementMethod.getInstance());

        textView.setText(text);

    }
}
