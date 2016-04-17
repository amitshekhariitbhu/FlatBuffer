package com.flatbuffer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.flatbuffer.flatmodel.PeopleList;
import com.flatbuffer.jsonmodel.PeopleListJson;
import com.flatbuffer.utils.Utils;
import com.google.gson.Gson;

import java.nio.ByteBuffer;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();
    private TextView textViewFlat, textViewJson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewFlat = (TextView) findViewById(R.id.textViewFlat);
        textViewJson = (TextView) findViewById(R.id.textViewJson);
    }

    public void loadFromFlatBuffer(View view) {
        byte[] buffer = Utils.readRawResource(getApplication(), R.raw.sample_flatbuffer);
        long startTime = System.currentTimeMillis();
        ByteBuffer bb = ByteBuffer.wrap(buffer);
        PeopleList peopleList = PeopleList.getRootAsPeopleList(bb);
        long timeTaken = System.currentTimeMillis() - startTime;
        String logText = "FlatBuffer : " + timeTaken + "ms";
        textViewFlat.setText(logText);
        Log.d(TAG, "loadFromFlatBuffer " + logText);
    }

    public void loadFromJson(View view) {
        String jsonText = new String(Utils.readRawResource(getApplication(), R.raw.sample_json));
        long startTime = System.currentTimeMillis();
        PeopleListJson peopleList = new Gson().fromJson(jsonText, PeopleListJson.class);
        long timeTaken = System.currentTimeMillis() - startTime;
        String logText = "Json : " + timeTaken + "ms";
        textViewJson.setText(logText);
        Log.d(TAG, "loadFromJson " + logText);
    }
}
