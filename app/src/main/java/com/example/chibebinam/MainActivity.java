package com.example.chibebinam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {


    Button action_btn;
    Button crime_btn;
    Button drama_btn;
    Button biography_btn;
    Button horror_btn;
    Button comedy_btn;
    Button adventure_btn;
    Button animation_btn;
    Button mystery_btn;
    Button filmnoir_btn;
    Button family_btn;
    Button fantasy_btn;
    Button western_btn;
    Button scifi_btn;
    Button music_btn;

    //is clicked variable for each button
    boolean action_clicked = false;
    boolean crime_clicked = false;
    boolean drama_clicked = false;
    boolean biography_clicked = false;
    boolean horror_clicked = false;
    boolean comedy_clicked = false;
    boolean adventure_clicked = false;
    boolean animation_clicked = false;
    boolean mystery_clicked = false;
    boolean filmnoir_clicked = false;
    boolean family_clicked = false;
    boolean fantasy_clicked = false;
    boolean western_clicked = false;
    boolean scifi_clicked = false;
    boolean music_clicked = false;

    //auxiliary variables
    int genre_nums = 0;
    ArrayList<String> genres_list = new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //get refrence to all the buttons
        action_btn = findViewById(R.id.actionbtn);
        crime_btn = findViewById(R.id.crimebtn);
        drama_btn = findViewById(R.id.dramabtn);
        biography_btn = findViewById(R.id.biographybtn);
        horror_btn = findViewById(R.id.horrorbtn);
        comedy_btn = findViewById(R.id.comedybtn);
        adventure_btn = findViewById(R.id.adventurebtn);
        animation_btn = findViewById(R.id.animationbtn);
        mystery_btn = findViewById(R.id.mysterybtn);
        filmnoir_btn = findViewById(R.id.filmnoirbtn);
        family_btn = findViewById(R.id.familybtn);
        fantasy_btn = findViewById(R.id.fantasybtn);
        western_btn = findViewById(R.id.westernbtn);
        scifi_btn = findViewById(R.id.scifibtn);
        music_btn = findViewById(R.id.musicbtn);


        //get refrence to all the drawable buttons backgrounds
       final Drawable drawable_clicked = getResources().getDrawable(R.drawable.clicked_bg);
        final Drawable gradient_bg = getResources().getDrawable(R.drawable.gradient_bg);
        final Drawable gradient_bg2 = getResources().getDrawable(R.drawable.gradient_bg2);
        final Drawable gradient_bg3 = getResources().getDrawable(R.drawable.gradient_bg3);
        final Drawable gradient_bg4 = getResources().getDrawable(R.drawable.gradient_bg4);
        final Drawable gradient_bg5 = getResources().getDrawable(R.drawable.gradient_bg5);
        final Drawable gradient_bg6 = getResources().getDrawable(R.drawable.gradient_bg6);
        final Drawable gradient_bg7 = getResources().getDrawable(R.drawable.gradient_bg7);
        final Drawable gradient_bg8 = getResources().getDrawable(R.drawable.gradient_bg8);
        final Drawable gradient_bg9 = getResources().getDrawable(R.drawable.gradient_bg9);
        final Drawable gradient_bg10 = getResources().getDrawable(R.drawable.gradient_bg10);
        final Drawable gradient_bg11 = getResources().getDrawable(R.drawable.gradient_bg11);
        final Drawable gradient_bg12 = getResources().getDrawable(R.drawable.gradient_bg12);
        final Drawable gradient_bg13 = getResources().getDrawable(R.drawable.gradient_bg13);
        final Drawable gradient_bg14 = getResources().getDrawable(R.drawable.gradient_bg14);
        final Drawable gradient_bg15 = getResources().getDrawable(R.drawable.gradient_bg15);



        //setOnClickListener methods for changing background of buttons and adding the user favorite genres to a list
        action_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(action_clicked){
                    changeColor(action_btn, gradient_bg, "#f5f5f5");
                    action_clicked = false;
                    genre_nums -= 1;
                    genres_list.remove(new String("Action"));
                }
                else{
                    changeColor(action_btn, drawable_clicked, "#121212");
                    action_clicked = true;
                    genre_nums += 1;
                    genres_list.add("Action");
                    if(genre_nums == 3) {
                        goToMovieSuggestion();
                    }
                }


            }
        });

        crime_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(crime_clicked){
                    changeColor(crime_btn, gradient_bg2, "#f5f5f5");
                    crime_clicked = false;
                    genre_nums -= 1;
                    genres_list.remove(new String("Crime"));
                }
                else{
                    changeColor(crime_btn, drawable_clicked, "#121212");
                    crime_clicked = true;
                    genre_nums += 1;
                    genres_list.add("Crime");
                    if(genre_nums == 3) {
                        goToMovieSuggestion();
                    }
                }

            }
        });

        drama_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(drama_clicked){
                    changeColor(drama_btn, gradient_bg3, "#f5f5f5");
                    drama_clicked = false;
                    genre_nums -= 1;
                    genres_list.remove(new String("Drama"));
                }
                else{
                    changeColor(drama_btn, drawable_clicked, "#121212");
                    drama_clicked = true;
                    genre_nums += 1;
                    genres_list.add("Drama");
                    if(genre_nums == 3) {
                        goToMovieSuggestion();
                    }
                }
            }
        });

        biography_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(biography_clicked){
                    changeColor(biography_btn, gradient_bg4, "#f5f5f5");
                    biography_clicked = false;
                    genre_nums -= 1;
                    genres_list.remove(new String("Biography"));
                }
                else{
                    changeColor(biography_btn, drawable_clicked, "#121212");
                    biography_clicked = true;
                    genre_nums += 1;
                    genres_list.add("Biography");
                    if(genre_nums == 3) {
                        goToMovieSuggestion();
                    }
                }
            }
        });

        horror_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(horror_clicked){
                    changeColor(horror_btn, gradient_bg5, "#f5f5f5");
                    horror_clicked = false;
                    genre_nums -= 1;
                    genres_list.remove(new String("Horror"));
                }
                else{
                    changeColor(horror_btn, drawable_clicked, "#121212");
                    horror_clicked = true;
                    genre_nums += 1;
                    genres_list.add("Horror");
                    if(genre_nums == 3) {
                        goToMovieSuggestion();
                    }
                }
            }
        });
        comedy_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(comedy_clicked){
                    changeColor(comedy_btn, gradient_bg6, "#f5f5f5");
                    comedy_clicked = false;
                    genre_nums -= 1;
                    genres_list.remove(new String("Comedy"));
                }
                else{
                    changeColor(comedy_btn, drawable_clicked, "#121212");
                    comedy_clicked = true;
                    genre_nums += 1;
                    genres_list.add("Comedy");
                    if(genre_nums == 3) {
                        goToMovieSuggestion();
                    }
                }
            }
        });
        adventure_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(adventure_clicked){
                    changeColor(adventure_btn, gradient_bg7, "#f5f5f5");
                    adventure_clicked = false;
                    genre_nums -= 1;
                    genres_list.remove(new String("Adventure"));
                }
                else{
                    changeColor(adventure_btn, drawable_clicked, "#121212");
                    adventure_clicked = true;
                    genre_nums += 1;
                    genres_list.add("Adventure");
                    if(genre_nums == 3) {
                        goToMovieSuggestion();
                    }
                }
            }
        });
        animation_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(animation_clicked){
                    changeColor(animation_btn, gradient_bg8, "#f5f5f5");
                    animation_clicked = false;
                    genre_nums -= 1;
                    genres_list.remove(new String("Animation"));
                }
                else{
                    changeColor(animation_btn, drawable_clicked, "#121212");
                    animation_clicked = true;
                    genre_nums += 1;
                    genres_list.add("Animation");
                    if(genre_nums == 3) {
                        goToMovieSuggestion();
                    }
                }
            }
        });
        mystery_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mystery_clicked){
                    changeColor(mystery_btn, gradient_bg9, "#f5f5f5");
                    mystery_clicked = false;
                    genre_nums -= 1;
                    genres_list.remove(new String("Mystery"));
                }
                else{
                    changeColor(mystery_btn, drawable_clicked, "#121212");
                    mystery_clicked = true;
                    genre_nums += 1;
                    genres_list.add("Mystery");
                    if(genre_nums == 3) {
                        goToMovieSuggestion();
                    }
                }
            }
        });
        filmnoir_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(filmnoir_clicked){
                    changeColor(filmnoir_btn, gradient_bg10, "#f5f5f5");
                    filmnoir_clicked = false;
                    genre_nums -= 1;
                    genres_list.remove(new String("Film-Noir"));
                }
                else{
                    changeColor(filmnoir_btn, drawable_clicked, "#121212");
                    filmnoir_clicked = true;
                    genre_nums += 1;
                    genres_list.add("Film-Noir");
                    if(genre_nums == 3) {
                        goToMovieSuggestion();
                    }
                }
            }
        });
        family_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(family_clicked){
                    changeColor(family_btn, gradient_bg11, "#f5f5f5");
                    family_clicked = false;
                    genre_nums -= 1;
                    genres_list.remove(new String("Family"));
                }
                else{
                    changeColor(family_btn, drawable_clicked, "#121212");
                    family_clicked = true;
                    genre_nums += 1;
                    genres_list.add("Family");
                    if(genre_nums == 3) {
                        goToMovieSuggestion();
                    }
                }
            }
        });
        fantasy_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(fantasy_clicked){
                    changeColor(fantasy_btn, gradient_bg12, "#f5f5f5");
                    fantasy_clicked = false;
                    genre_nums -= 1;
                    genres_list.remove(new String("Fantasy"));
                }
                else{
                    changeColor(fantasy_btn, drawable_clicked, "#121212");
                    fantasy_clicked = true;
                    genre_nums += 1;
                    genres_list.add("Fantasy");
                    if(genre_nums == 3) {
                        goToMovieSuggestion();
                    }
                }
            }
        });
        western_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(western_clicked){
                    changeColor(western_btn, gradient_bg13, "#f5f5f5");
                    western_clicked = false;
                    genre_nums -= 1;
                    genres_list.remove(new String("Western"));
                }
                else{
                    changeColor(western_btn, drawable_clicked, "#121212");
                    western_clicked = true;
                    genre_nums += 1;
                    genres_list.add("Western");
                    if(genre_nums == 3) {
                        goToMovieSuggestion();
                    }
                }
            }
        });
        scifi_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(scifi_clicked){
                    changeColor(scifi_btn, gradient_bg14, "#f5f5f5");
                    scifi_clicked = false;
                    genre_nums -= 1;
                    genres_list.remove(new String("Sci-Fi"));
                }
                else{
                    changeColor(scifi_btn, drawable_clicked, "#121212");
                    scifi_clicked = true;
                    genre_nums += 1;
                    genres_list.add("Sci-Fi");
                    if(genre_nums == 3) {
                        goToMovieSuggestion();
                    }
                }
            }
        });
        music_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(music_clicked){
                    changeColor(music_btn, gradient_bg15, "#f5f5f5");
                    music_clicked = false;
                    genre_nums -= 1;
                    genres_list.remove(new String("Music"));
                }
                else{
                    changeColor(music_btn, drawable_clicked, "#121212");
                    music_clicked = true;
                    genre_nums += 1;
                    genres_list.add("Music");
                    if(genre_nums == 3) {
                        goToMovieSuggestion();
                    }
                }

            }
        });




    }
    //change color of buttons
    public void changeColor(Button b, Drawable d , String c ){
        b.setBackground(d);
        b.setTextColor(Color.parseColor(c));
    }
    //will go to movie suggestion Activity
    public void goToMovieSuggestion(){
        Intent intent = new Intent(MainActivity.this, MovieSuggestionActivity.class);
        //extras
        intent.putExtra("genres_list",genres_list);
        startActivity(intent);
    }

}