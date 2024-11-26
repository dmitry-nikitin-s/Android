package ru.mirea.nikitinds.buttonclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView tvOut;
    private Button btnWhoAmI;
    private Button btnItIsNotMe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvOut = findViewById(R.id.tvOut);
        btnWhoAmI = findViewById(R.id.btnWhoAmI);
        btnItIsNotMe = findViewById(R.id.btnItIsNotMe);
    }
    public void onBtnWhoAmIClick(View view)
    {
        tvOut.setText("Мой номер по списку № 8");
        // выводим сообщение
        Toast.makeText(this, "Ещё один способ!", Toast.LENGTH_SHORT).show();
    }
    public void onBtnItIsNotMe(View view)
    {
        tvOut.setText("Это не я сделал");
        // выводим сообщение
        Toast.makeText(this, "Ещё один способ!", Toast.LENGTH_SHORT).show();
    }
}