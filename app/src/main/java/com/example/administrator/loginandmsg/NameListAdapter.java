package com.example.administrator.loginandmsg;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2015/11/9 0009.
 */
public class NameListAdapter extends ArrayAdapter<NameList> {

    private int resourceId;

    public NameListAdapter(Context context, int textViewResourceId,
                           List<NameList> objects) {
        super(context, textViewResourceId, objects);
        resourceId = textViewResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        NameList nameList = getItem(position); //
        View view;
        ViewHolder viewHolder;
        if (convertView == null) {
            view = LayoutInflater.from(getContext()).inflate(resourceId, null);
            viewHolder = new ViewHolder();
            viewHolder.nameListImage = (ImageView) view.findViewById(R.id.namelist_image);
            viewHolder.nameListName = (TextView) view.findViewById(R.id.namelist_name);
            view.setTag(viewHolder);
        } else {
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }
        //ImageView nameListImage=(ImageView)view.findViewById(R.id.fruit_image);
        //TextView nameListName=(TextView)view.findViewById(R.id.fruit_name);
        viewHolder.nameListImage.setImageResource(nameList.getImageId());
        viewHolder.nameListName.setText(nameList.getName());
        return view;
    }

    class ViewHolder {
        ImageView nameListImage;
        TextView nameListName;
    }
}
