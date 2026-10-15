package com.saraymebel.app;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import org.json.JSONArray;
import org.json.JSONObject;
import java.util.ArrayList;

public class MainActivity extends Activity {

    LinearLayout layout;
    ArrayList<String> clients = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        showHome();
    }

    void showHome() {
        layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setPadding(30, 40, 30, 30);

        TextView title = new TextView(this);
        title.setText("SARAY MEBEL");
        title.setTextSize(28);
        layout.addView(title);

        Button clientsButton = new Button(this);
        clientsButton.setText("Клиенты");
        layout.addView(clientsButton);

        Button ordersButton = new Button(this);
        ordersButton.setText("Заказы");
        layout.addView(ordersButton);

        Button paymentsButton = new Button(this);
        paymentsButton.setText("Платежи");
        layout.addView(paymentsButton);

        clientsButton.setOnClickListener(v -> showClients());
        ordersButton.setOnClickListener(v ->
            Toast.makeText(this, "Раздел заказов скоро", Toast.LENGTH_SHORT).show());
        paymentsButton.setOnClickListener(v ->
            Toast.makeText(this, "Раздел платежей скоро", Toast.LENGTH_SHORT).show());

        setContentView(layout);
    }

    void showClients() {
        LinearLayout page = new LinearLayout(this);
        page.setOrientation(LinearLayout.VERTICAL);
        page.setPadding(30, 30, 30, 30);

        Button back = new Button(this);
        back.setText("Назад");
        page.addView(back);
        back.setOnClickListener(v -> showHome());

        Button add = new Button(this);
        add.setText("Добавить клиента");
page.addView(add);

add.setOnClickListener(v ->
    Toast.makeText(this, "Добавление клиента скоро", Toast.LENGTH_SHORT).show()
);

setContentView(page);
    }
}
