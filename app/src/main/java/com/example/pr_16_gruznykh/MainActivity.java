package com.example.pr_16_gruznykh;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private TextView textView;
    private Bundle savedIns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedIns);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);
        Button buttonSave = findViewById(R.id.buttonSave);
        Button buttonLoad = findViewById(R.id.buttonLoad);

        buttonSave.setOnClickListener(new View.OnClickListener() { //для сохранения текста
            @Override
            public void onClick(View v) {
                // Обработка нажатия на кнопку "Save"
                String inputText = editText.getText().toString();
                // Здесь вы можете сохранить введенный текст
            }
        });

        buttonLoad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Обработка нажатия на кнопку "Load"
                // Здесь вы можете загрузить текст и отобразить его в textView
            }
        });
    }
}