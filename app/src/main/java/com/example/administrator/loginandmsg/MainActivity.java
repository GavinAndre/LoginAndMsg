package com.example.administrator.loginandmsg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {

    private List<NameList> nameListList = new ArrayList<NameList>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button forceOffline = (Button) findViewById(R.id.force_offline);
        forceOffline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        "com.example.administrator.loginandmsg.FORCE_OFFLINE");
                sendBroadcast(intent);
            }
        });

        initNames();
        NameListAdapter adapter = new NameListAdapter(MainActivity.this,
                R.layout.name_item, nameListList);


        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                NameList nameList = nameListList.get(position);
                Toast.makeText(MainActivity.this, nameList.getName(),
                        Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,
                        MsgActivity.class);
                intent.putExtra("name_list", nameList.getName());
                startActivity(intent);
            }
        });

    }

    private void initNames() {
        NameList john = new NameList("John", R.mipmap.john_pic);
        nameListList.add(john);
        NameList thomas = new NameList("Thomas", R.mipmap.thomas_pic);
        nameListList.add(thomas);
        NameList gavin = new NameList("Gavin", R.mipmap.gavin_pic);
        nameListList.add(gavin);
        NameList jane = new NameList("Jane", R.mipmap.jane_pic);
        nameListList.add(jane);
        NameList george = new NameList("George", R.mipmap.george_pic);
        nameListList.add(george);
        NameList grape = new NameList("Grape", R.mipmap.grape_pic);
        nameListList.add(grape);
        NameList gloria = new NameList("Gloria", R.mipmap.gloria_pic);
        nameListList.add(gloria);
        NameList dolly = new NameList("Dolly", R.mipmap.dolly_pic);
        nameListList.add(dolly);
        NameList robert = new NameList("Robert", R.mipmap.robert_pic);
        nameListList.add(robert);
        NameList shirley = new NameList("Shirley", R.mipmap.shirley_pic);
        nameListList.add(shirley);
    }

}
