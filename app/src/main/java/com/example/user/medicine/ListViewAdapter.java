package com.example.user.medicine;

import android.view.LayoutInflater;
import android.widget.BaseAdapter;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import android.content.Context;
import android.widget.TextView;

public class ListViewAdapter extends BaseAdapter {
    private ArrayList<ListViewItem> listViewItemList = new ArrayList<ListViewItem>();

    @Override
    public int getCount() {
        return listViewItemList.size();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final int pos = position;
        final Context context = parent.getContext();

        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.activity_button_three_item, parent, false);
        }

        TextView titleTextView1 = (TextView) convertView.findViewById(R.id.text1) ;
        TextView titleTextView2 = (TextView) convertView.findViewById(R.id.text2) ;
        TextView titleTextView3 = (TextView) convertView.findViewById(R.id.text3) ;

        ListViewItem listViewItem = listViewItemList.get(position);

        // 아이템 내 각 위젯에 데이터 반영
        titleTextView1.setText(listViewItem.getTitle1());
        titleTextView2.setText(listViewItem.getTitle2());
        titleTextView3.setText(listViewItem.getTitle3());

        return convertView;
    }

    @Override
    public long getItemId(int position) {
        return position ;
    }

    @Override
    public Object getItem(int position) {
        return listViewItemList.get(position) ;
    }

    public void addItem(String title1, String title2, String title3) {
        ListViewItem item = new ListViewItem();

        item.setTitle1(title1);
        item.setTitle2(title2);
        item.setTitle3(title3);

        listViewItemList.add(item);
    }
}



