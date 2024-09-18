package com.example.a2praktos;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);

       setInitialData();
       RecyclerView recyclerView = findViewById(R.id.list);

       StateAdapter adapter = new StateAdapter(this, states);
       recyclerView.setAdapter(adapter);
        };

    private void setInitialData(){
        states.add(new State ("Россия", "Москва", R.drawable.Russia));
        states.add(new State ("Китай", "Пекин", R.drawable.China));
        states.add(new State ("Индия", "Нью-Дели", R.drawable.India));

    }
    }
