package com.example.yaya.tp5_exo2;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.annotation.ColorInt;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static android.util.TypedValue.COMPLEX_UNIT_SP;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView taille=(TextView)findViewById(R.id.taille);
        final TextView couleur=(TextView)findViewById(R.id.couleur);
        final TextView police=(TextView)findViewById(R.id.police);
        final TextView style=(TextView)findViewById(R.id.style);
        final TextView menu=(TextView)findViewById(R.id.menu);
        final TextView login=(TextView)findViewById(R.id.login);
        final Button btnlogin=findViewById(R.id.btnlogin);
        final EditText nom=(EditText)findViewById(R.id.nom);
        final EditText prenom=(EditText)findViewById(R.id.prenom);
        final Typeface f1=Typeface.createFromAsset(getAssets(),"SaginawMedium.ttf");
        final Typeface f2=Typeface.createFromAsset(getAssets(),"Auriol LT Black.ttf");
        final Typeface f3=Typeface.createFromAsset(getAssets(),"Auriol LT Bold Italic.ttf");
        final Typeface f4=Typeface.createFromAsset(getAssets(),"Auriol LT Bold.ttf");
        final Typeface f5=Typeface.createFromAsset(getAssets(),"Auriol LT.ttf");
        final Typeface f6=Typeface.createFromAsset(getAssets(),"SaginawBold.ttf");
        final Typeface f7=Typeface.createFromAsset(getAssets(),"SaginawLight.ttf");
        final Typeface f8=Typeface.createFromAsset(getAssets(),"Splendid ES.ttf");

        final Spinner sp=(Spinner)findViewById(R.id.spinner);
        final Spinner sp2=(Spinner)findViewById(R.id.spinner2);
        final Spinner sp3=(Spinner)findViewById(R.id.spinner3);
        final Spinner sp4=(Spinner)findViewById(R.id.spinner4);

        List<String> list=new ArrayList<>();
        list.add("24 sp");
        list.add("18 sp");
        list.add("14 sp");
        list.add("12 sp");
        list.add("10 sp");
        list.add("8 sp");

        List<String> list2=new ArrayList<>();
        list2.add("WHITE");
        list2.add("Red");
        list2.add("BLUE");
        list2.add("YELLOW");
        list2.add("GREEN");
        list2.add("GRAY");
        list2.add("BLACK");
        list2.add("DKGRAY");
        list2.add("TRANSPARENT");
        list2.add("MAGENTA");
        list2.add("LTGRAY");


        List<String> list3=new ArrayList<>();
        list3.add("Auriol LT Bold");
        list3.add("SaginawBold");
        list3.add("SaginawMedium");
        list3.add("Auriol LT Black");
        list3.add("Auriol LT Bold Italic");
        list3.add("Auriol LT");
        list3.add("SaginawLight");
        list3.add("Splendid ES");


        List<String> list4=new ArrayList<>();
        list4.add("Normal");
        list4.add("Bold");
        list4.add("Italic");

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,list);
        final ArrayAdapter<String> adapter1=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,list2);
        ArrayAdapter<String> adapter2=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,list3);
        ArrayAdapter<String> adapter3=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,list4);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        sp.setAdapter(adapter);
        sp2.setAdapter(adapter1);
        sp3.setAdapter(adapter2);
        sp4.setAdapter(adapter3);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String taille1=sp.getSelectedItem().toString();
                switch (taille1) {
                    case "24 sp":
                        taille.setTextSize(TypedValue.COMPLEX_UNIT_SP,24);
                        menu.setTextSize(TypedValue.COMPLEX_UNIT_SP,24);
                        taille.setTextSize(TypedValue.COMPLEX_UNIT_SP,24);
                        style.setTextSize(TypedValue.COMPLEX_UNIT_SP,24);
                        police.setTextSize(TypedValue.COMPLEX_UNIT_SP,24);
                        login.setTextSize(TypedValue.COMPLEX_UNIT_SP,24);
                        btnlogin.setTextSize(TypedValue.COMPLEX_UNIT_SP,24);
                        nom.setTextSize(TypedValue.COMPLEX_UNIT_SP,24);
                        prenom.setTextSize(TypedValue.COMPLEX_UNIT_SP,24);
                        couleur.setTextSize(TypedValue.COMPLEX_UNIT_SP,24);

                        break;
                    case "18 sp":
                        taille.setTextSize(TypedValue.COMPLEX_UNIT_SP,18);
                        menu.setTextSize(TypedValue.COMPLEX_UNIT_SP,18);
                        taille.setTextSize(TypedValue.COMPLEX_UNIT_SP,18);
                        style.setTextSize(TypedValue.COMPLEX_UNIT_SP,18);
                        police.setTextSize(TypedValue.COMPLEX_UNIT_SP,18);
                        login.setTextSize(TypedValue.COMPLEX_UNIT_SP,18);
                        btnlogin.setTextSize(TypedValue.COMPLEX_UNIT_SP,18);
                        nom.setTextSize(TypedValue.COMPLEX_UNIT_SP,18);
                        prenom.setTextSize(TypedValue.COMPLEX_UNIT_SP,18);
                        couleur.setTextSize(TypedValue.COMPLEX_UNIT_SP,18);

                        break;
                    case "14 sp":
                        taille.setTextSize(TypedValue.COMPLEX_UNIT_SP,14);
                        menu.setTextSize(TypedValue.COMPLEX_UNIT_SP,14);
                        taille.setTextSize(TypedValue.COMPLEX_UNIT_SP,14);
                        style.setTextSize(TypedValue.COMPLEX_UNIT_SP,14);
                        police.setTextSize(TypedValue.COMPLEX_UNIT_SP,14);
                        login.setTextSize(TypedValue.COMPLEX_UNIT_SP,14);
                        btnlogin.setTextSize(TypedValue.COMPLEX_UNIT_SP,14);
                        nom.setTextSize(TypedValue.COMPLEX_UNIT_SP,14);
                        prenom.setTextSize(TypedValue.COMPLEX_UNIT_SP,14);
                        couleur.setTextSize(TypedValue.COMPLEX_UNIT_SP,14);

                        break;
                    case "12 sp":
                        taille.setTextSize(TypedValue.COMPLEX_UNIT_SP,12);
                        menu.setTextSize(TypedValue.COMPLEX_UNIT_SP,12);
                        taille.setTextSize(TypedValue.COMPLEX_UNIT_SP,12);
                        style.setTextSize(TypedValue.COMPLEX_UNIT_SP,12);
                        police.setTextSize(TypedValue.COMPLEX_UNIT_SP,12);
                        login.setTextSize(TypedValue.COMPLEX_UNIT_SP,12);
                        btnlogin.setTextSize(TypedValue.COMPLEX_UNIT_SP,12);
                        nom.setTextSize(TypedValue.COMPLEX_UNIT_SP,12);
                        prenom.setTextSize(TypedValue.COMPLEX_UNIT_SP,12);
                        couleur.setTextSize(TypedValue.COMPLEX_UNIT_SP,12);

                        break;
                    case "10 sp":
                        taille.setTextSize(TypedValue.COMPLEX_UNIT_SP,10);
                        menu.setTextSize(TypedValue.COMPLEX_UNIT_SP,10);
                        taille.setTextSize(TypedValue.COMPLEX_UNIT_SP,10);
                        style.setTextSize(TypedValue.COMPLEX_UNIT_SP,10);
                        police.setTextSize(TypedValue.COMPLEX_UNIT_SP,10);
                        login.setTextSize(TypedValue.COMPLEX_UNIT_SP,10);
                        btnlogin.setTextSize(TypedValue.COMPLEX_UNIT_SP,10);
                        nom.setTextSize(TypedValue.COMPLEX_UNIT_SP,10);
                        prenom.setTextSize(TypedValue.COMPLEX_UNIT_SP,10);
                        couleur.setTextSize(TypedValue.COMPLEX_UNIT_SP,10);

                        break;
                    case "8 sp":
                        taille.setTextSize(TypedValue.COMPLEX_UNIT_SP,8);
                        menu.setTextSize(TypedValue.COMPLEX_UNIT_SP,8);
                        taille.setTextSize(TypedValue.COMPLEX_UNIT_SP,8);
                        style.setTextSize(TypedValue.COMPLEX_UNIT_SP,8);
                        police.setTextSize(TypedValue.COMPLEX_UNIT_SP,8);
                        login.setTextSize(TypedValue.COMPLEX_UNIT_SP,8);
                        btnlogin.setTextSize(TypedValue.COMPLEX_UNIT_SP,8);
                        nom.setTextSize(TypedValue.COMPLEX_UNIT_SP,8);
                        prenom.setTextSize(TypedValue.COMPLEX_UNIT_SP,8);
                        couleur.setTextSize(TypedValue.COMPLEX_UNIT_SP,8);

                        break;



                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {


            }
        });



        sp2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String couleur1=sp2.getSelectedItem().toString();

                switch (couleur1){
                    case "Red" :
                        menu.setTextColor(Color.RED);
                        taille.setTextColor(Color.RED);
                        style.setTextColor(Color.RED);
                        police.setTextColor(Color.RED);
                        login.setTextColor(Color.RED);
                        btnlogin.setTextColor(Color.RED);
                        nom.setTextColor(Color.RED);
                        prenom.setTextColor(Color.RED);
                        couleur.setTextColor(Color.RED);


                        break;
                    case "BLUE" :
                        menu.setTextColor(Color.BLUE);
                        taille.setTextColor(Color.BLUE);
                        style.setTextColor(Color.BLUE);
                        police.setTextColor(Color.BLUE);
                        login.setTextColor(Color.BLUE);
                        btnlogin.setTextColor(Color.BLUE);
                        nom.setTextColor(Color.BLUE);
                        prenom.setTextColor(Color.BLUE);
                        couleur.setTextColor(Color.BLUE);

                        break;
                    case "YELLOW" :
                        menu.setTextColor(Color.YELLOW);
                        taille.setTextColor(Color.YELLOW);
                        style.setTextColor(Color.YELLOW);
                        police.setTextColor(Color.YELLOW);
                        login.setTextColor(Color.YELLOW);
                        btnlogin.setTextColor(Color.YELLOW);
                        nom.setTextColor(Color.YELLOW);
                        prenom.setTextColor(Color.YELLOW);
                        couleur.setTextColor(Color.YELLOW);

                        break;
                    case "GRAY" :
                        menu.setTextColor(Color.GRAY);
                        taille.setTextColor(Color.GRAY);
                        style.setTextColor(Color.GRAY);
                        police.setTextColor(Color.GRAY);
                        login.setTextColor(Color.GRAY);
                        btnlogin.setTextColor(Color.GRAY);
                        nom.setTextColor(Color.GRAY);
                        prenom.setTextColor(Color.GRAY);
                        couleur.setTextColor(Color.GRAY);

                        break;
                    case "GREEN" :
                        menu.setTextColor(Color.GREEN);
                        taille.setTextColor(Color.GREEN);
                        style.setTextColor(Color.GREEN);
                        police.setTextColor(Color.GREEN);
                        login.setTextColor(Color.GREEN);
                        btnlogin.setTextColor(Color.GREEN);
                        nom.setTextColor(Color.GREEN);
                        prenom.setTextColor(Color.GREEN);
                        couleur.setTextColor(Color.GREEN);

                        break;
                    case "BLACK" :
                        menu.setTextColor(Color.BLACK);
                        taille.setTextColor(Color.BLACK);
                        style.setTextColor(Color.BLACK);
                        police.setTextColor(Color.BLACK);
                        login.setTextColor(Color.BLACK);
                        btnlogin.setTextColor(Color.BLACK);
                        nom.setTextColor(Color.BLACK);
                        prenom.setTextColor(Color.BLACK);
                        couleur.setTextColor(Color.BLACK);

                        break;
                    case "WHITE" :
                        menu.setTextColor(Color.WHITE);
                        taille.setTextColor(Color.WHITE);
                        style.setTextColor(Color.WHITE);
                        police.setTextColor(Color.WHITE);
                        login.setTextColor(Color.WHITE);
                        btnlogin.setTextColor(Color.WHITE);
                        nom.setTextColor(Color.WHITE);
                        prenom.setTextColor(Color.WHITE);
                        couleur.setTextColor(Color.WHITE);
                        break;

                    case "MAGENTA" :
                        menu.setTextColor(Color.MAGENTA);
                        taille.setTextColor(Color.MAGENTA);
                        style.setTextColor(Color.MAGENTA);
                        police.setTextColor(Color.MAGENTA);
                        login.setTextColor(Color.MAGENTA);
                        btnlogin.setTextColor(Color.MAGENTA);
                        nom.setTextColor(Color.MAGENTA);
                        prenom.setTextColor(Color.MAGENTA);
                        couleur.setTextColor(Color.MAGENTA);

                        break;

                    case "TRANSPARENT" :
                        menu.setTextColor(Color.TRANSPARENT);
                        taille.setTextColor(Color.TRANSPARENT);
                        style.setTextColor(Color.TRANSPARENT);
                        police.setTextColor(Color.TRANSPARENT);
                        login.setTextColor(Color.TRANSPARENT);
                        btnlogin.setTextColor(Color.TRANSPARENT);
                        nom.setTextColor(Color.TRANSPARENT);
                        prenom.setTextColor(Color.TRANSPARENT);
                        couleur.setTextColor(Color.TRANSPARENT);
                        break;
                    case "LTGRAY" :
                        menu.setTextColor(Color.LTGRAY);
                        taille.setTextColor(Color.LTGRAY);
                        style.setTextColor(Color.LTGRAY);
                        police.setTextColor(Color.LTGRAY);
                        login.setTextColor(Color.LTGRAY);
                        btnlogin.setTextColor(Color.LTGRAY);
                        nom.setTextColor(Color.LTGRAY);
                        prenom.setTextColor(Color.LTGRAY);
                        couleur.setTextColor(Color.LTGRAY);
                        break;
                    case "DKGRAY" :
                        menu.setTextColor(Color.DKGRAY);
                        taille.setTextColor(Color.DKGRAY);
                        style.setTextColor(Color.DKGRAY);
                        police.setTextColor(Color.DKGRAY);
                        login.setTextColor(Color.DKGRAY);
                        btnlogin.setTextColor(Color.DKGRAY);
                        nom.setTextColor(Color.DKGRAY);
                        prenom.setTextColor(Color.DKGRAY);
                        couleur.setTextColor(Color.DKGRAY);

                        break;


                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        sp3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String couleur2 = sp3.getSelectedItem().toString();


                switch (couleur2) {
                    case "SaginawMedium":
                        menu.setTypeface(f1);
                        taille.setTypeface(f1);
                        style.setTypeface(f1);
                        police.setTypeface(f1);
                        login.setTypeface(f1);
                        btnlogin.setTypeface(f1);
                        nom.setTypeface(f1);
                        prenom.setTypeface(f1);
                        couleur.setTypeface(f1);
                        break;
                    case "Auriol LT Black":
                        menu.setTypeface(f2);
                        taille.setTypeface(f2);
                        style.setTypeface(f2);
                        police.setTypeface(f2);
                        login.setTypeface(f2);
                        btnlogin.setTypeface(f2);
                        nom.setTypeface(f2);
                        prenom.setTypeface(f2);
                        couleur.setTypeface(f2);
                        break;
                    case "Auriol LT Bold Italic":
                        menu.setTypeface(f3);
                        taille.setTypeface(f3);
                        style.setTypeface(f3);
                        police.setTypeface(f3);
                        login.setTypeface(f3);
                        btnlogin.setTypeface(f3);
                        nom.setTypeface(f3);
                        prenom.setTypeface(f3);
                        couleur.setTypeface(f3);
                        break;


                    case "Auriol LT Bold":
                        menu.setTypeface(f4);
                        taille.setTypeface(f4);
                        style.setTypeface(f4);
                        police.setTypeface(f4);
                        login.setTypeface(f4);
                        btnlogin.setTypeface(f4);
                        nom.setTypeface(f4);
                        prenom.setTypeface(f4);
                        couleur.setTypeface(f4);

                        break;
                    case "Auriol LT":
                        menu.setTypeface(f5);
                        taille.setTypeface(f5);
                        style.setTypeface(f5);
                        police.setTypeface(f5);
                        login.setTypeface(f5);
                        btnlogin.setTypeface(f5);
                        nom.setTypeface(f5);
                        prenom.setTypeface(f5);
                        couleur.setTypeface(f5);
                        break;
                    case "SaginawBold":
                        menu.setTypeface(f6);
                        taille.setTypeface(f6);
                        style.setTypeface(f6);
                        police.setTypeface(f6);
                        login.setTypeface(f6);
                        btnlogin.setTypeface(f6);
                        nom.setTypeface(f6);
                        prenom.setTypeface(f6);
                        couleur.setTypeface(f6);


                        break;
                    case "SaginawLight":
                        menu.setTypeface(f7);
                        taille.setTypeface(f7);
                        style.setTypeface(f7);
                        police.setTypeface(f7);
                        login.setTypeface(f7);
                        btnlogin.setTypeface(f7);
                        nom.setTypeface(f7);
                        prenom.setTypeface(f7);
                        couleur.setTypeface(f7);


                        break;
                    case "Splendid ES":
                        menu.setTypeface(f8);
                        taille.setTypeface(f8);
                        style.setTypeface(f8);
                        police.setTypeface(f8);
                        login.setTypeface(f8);
                        btnlogin.setTypeface(f8);
                        nom.setTypeface(f8);
                        prenom.setTypeface(f8);
                        couleur.setTypeface(f8);

                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        sp4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String couleur3=sp4.getSelectedItem().toString();
                switch (couleur3){
                    case "Italic":
                        menu.setTypeface(Typeface.defaultFromStyle(2));
                        taille.setTypeface(Typeface.defaultFromStyle(2));
                        style.setTypeface(Typeface.defaultFromStyle(2));
                        police.setTypeface(Typeface.defaultFromStyle(2));
                        login.setTypeface(Typeface.defaultFromStyle(2));
                        btnlogin.setTypeface(Typeface.defaultFromStyle(2));
                        nom.setTypeface(Typeface.defaultFromStyle(2));
                        prenom.setTypeface(Typeface.defaultFromStyle(2));
                        couleur.setTypeface(Typeface.defaultFromStyle(2));
                        break;
                    case "Bold":
                        menu.setTypeface(Typeface.defaultFromStyle(1));
                        taille.setTypeface(Typeface.defaultFromStyle(1));
                        style.setTypeface(Typeface.defaultFromStyle(1));
                        police.setTypeface(Typeface.defaultFromStyle(1));
                        login.setTypeface(Typeface.defaultFromStyle(1));
                        btnlogin.setTypeface(Typeface.defaultFromStyle(1));
                        nom.setTypeface(Typeface.defaultFromStyle(1));
                        prenom.setTypeface(Typeface.defaultFromStyle(1));
                        couleur.setTypeface(Typeface.defaultFromStyle(1));
                        break;
                    case "Normal":
                        menu.setTypeface(Typeface.defaultFromStyle(0));
                        taille.setTypeface(Typeface.defaultFromStyle(0));
                        style.setTypeface(Typeface.defaultFromStyle(0));
                        police.setTypeface(Typeface.defaultFromStyle(0));
                        login.setTypeface(Typeface.defaultFromStyle(0));
                        btnlogin.setTypeface(Typeface.defaultFromStyle(0));
                        nom.setTypeface(Typeface.defaultFromStyle(0));
                        prenom.setTypeface(Typeface.defaultFromStyle(0));
                        couleur.setTypeface(Typeface.defaultFromStyle(0));
                        break;
                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });



    }

}
