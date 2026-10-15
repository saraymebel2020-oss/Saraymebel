package com.saraymebel.app;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setPadding(40, 60, 40, 40);
        layout.setBackgroundColor(Color.WHITE);

        TextView title = new TextView(this);
        title.setText("SARAY MEBEL");
        title.setTextSize(28);
        title.setTextColor(Color.BLACK);
        title.setGravity(Gravity.CENTER);
        layout.addView(title);

        Button clients = new Button(this);
        clients.setText("Клиенты");
        layout.addView(clients);

        Button orders = new Button(this);
        orders.setText("Заказы");
        layout.addView(orders);

        Button payments = new Button(this);
        payments.setText("Платежи");
        layout.addView(payments);

        clients.setOnClickListener(v ->
            Toast.makeText(this, "Клиенты", Toast.LENGTH_SHORT).show()
        );

        orders.setOnClickListener(v ->
            Toast.makeText(this, "Заказы", Toast.LENGTH_SHORT).show()
        );

        payments.setOnClickListener(v ->
            Toast.makeText(this, "Платежи", Toast.LENGTH_SHORT).show()
        );

        setContentView(layout);
    }
}
