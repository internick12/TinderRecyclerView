package com.galosoft.tinderrecyclerview.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.athbk.avatarview.adapter.ItemVH;
import com.athbk.avatarview.adapter.TinderRVAdapter;
import com.galosoft.tinderrecyclerview.Interface.IFinishDrag;
import com.galosoft.tinderrecyclerview.Model.Item;
import com.galosoft.tinderrecyclerview.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends TinderRVAdapter<Item, CustomAdapter.CustomViewHolder> {

    List<Item> lstData;
    Context context;
    IFinishDrag iFinishDrag;

    public void setiFinishDrag(IFinishDrag iFinishDrag) {
        this.iFinishDrag = iFinishDrag;
    }

    public CustomAdapter(List<Item> lstData, Context context) {
        this.lstData = lstData;
        this.context = context;
    }

    @Override
    protected List<Item> getListItem() {
        return lstData;
    }

    @Override
    protected CustomViewHolder onCreateItemViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.item_view, viewGroup, false);
        return new CustomViewHolder(itemView);
    }

    @Override
    protected void onBindItemViewHolder(CustomViewHolder vh, int i) {
        Picasso.with(context).load(lstData.get(i).getImgLink()).into(vh.imageView);
        vh.textView.setTextColor(lstData.get(i).getIndex());

    }

    class CustomViewHolder extends ItemVH {

        FrameLayout frameLayout;
        ImageView imageView;
        TextView textView;


        public CustomViewHolder(View itemView) {
            super(itemView);
            frameLayout = itemView.findViewById(R.id.layout);
            imageView = itemView.findViewById(R.id.image_view);
            textView = itemView.findViewById(R.id.text_view);

        }

        @Override
        public void onItemSelected() {
            super.onItemSelected();
            frameLayout.setAlpha(0.5f);
        }

        @Override
        public void onItemClear() {
            super.onItemClear();
            frameLayout.setAlpha(1f);
            if(iFinishDrag != null)
                iFinishDrag.updateListData((ArrayList<Item>) getListItem());
        }
    }
}
