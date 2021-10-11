package rob.myappcompany.listviewstylecolordemo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayAdapter arrayAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listView = findViewById(R.id.listView_item);

        String[] fruits = new String[] {
                "African mango",
                "Ambarella",
                "American Black Elderberry",
                "Ackee",
                "American persimmon",
                "Babaco"
        };


        arrayAdapter = new ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, fruits){
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                //Get the Item from ListView
                View view = super.getView(position, convertView, parent);
                //Initialize a TextView for ListView each Item
                TextView textView = view.findViewById(android.R.id.text1);
                //Set the text color of TextView (ListView Item)
                textView.setTextColor(Color.RED);
                textView.setBackgroundColor(Color.GREEN);

                //Generate ListView Item using TextView
                return view;
            }
        };

        listView = findViewById(R.id.listView_item);
        listView.setAdapter(arrayAdapter);
    }
}