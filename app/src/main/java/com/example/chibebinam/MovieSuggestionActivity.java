package com.example.chibebinam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MovieSuggestionActivity extends AppCompatActivity {

    ListView suggestion_listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movie_suggestion);

        //get the extras from mainActivity including three selected genres by user
        Intent intent = getIntent();
        ArrayList<String> genres_list = intent.getStringArrayListExtra("genres_list");

        //declaring a list view for showing top 10 suggested movies
        suggestion_listView = (ListView) findViewById(R.id.suggestion_list);
        ArrayList<String> suggestion_list = new ArrayList<>();

        HashMap<String,Integer> moviesMap = new HashMap<>();

        //opening imdb500 csv file
        InputStream inputStream = getResources().openRawResource(R.raw.imdb500);
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, Charset.forName("UTF-8")));
        String line = "";


        //reading the csv file for imdb 500 movies and add them to a HashMap
        try{
            while ((line = reader.readLine()) != null){
                String[] tokens = line.split(",");
                int rank = 0;
                for(String movie : genres_list){
                    if(movie.equals(tokens[9])) {
                       // Log.i("test5", tokens[9]);
                        rank += Integer.parseInt(tokens[12]);
                    }
                    if(movie.equals(tokens[10])){
                        rank += Integer.parseInt(tokens[12]);
                    }
                    if(movie.equals(tokens[11])){
                        rank += Integer.parseInt(tokens[12]);
                    }
                }
                moviesMap.put(tokens[0],rank);
            }
           // Log.i("testmap", String.valueOf(Arrays.asList(moviesMap) ));
        }
        catch (Exception e) {
            e.printStackTrace();
            //Log.i("testcsv", String.valueOf(e));
        }
        int i = 0;
        Map<String,Integer> sorted_suggestion = sortByValue(moviesMap);

        for (Map.Entry<String, Integer> en : sorted_suggestion.entrySet()) {
            if(i == 10){
                break;
            }
            suggestion_list.add(en.getKey());
            Log.i("testsort",i+"Key = " + en.getKey() +
                    ", Value = " + en.getValue());
            i++;
        }


        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,suggestion_list);
        suggestion_listView.setAdapter(arrayAdapter);

    }

    //sort the moviesMap hashmap by reverse order
    public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<String, Integer> > list =
                new LinkedList<Map.Entry<String, Integer> >(hm.entrySet());

        // Sort the list
        Collections.sort(list, Collections.reverseOrder(new Comparator<Map.Entry<String, Integer> >() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        }));

        // put data from sorted list to hashmap
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
}