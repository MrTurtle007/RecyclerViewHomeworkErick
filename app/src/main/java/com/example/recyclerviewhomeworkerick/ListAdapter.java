package com.example.recyclerviewhomeworkerick;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {
    private final List<ListElement> mRecipeList;
    private LayoutInflater mInflater;
    private Context context;

    public ListAdapter(List<ListElement> itemList, Context context){
        this.mInflater = LayoutInflater.from(context);
        this.context = context;
        this.mRecipeList = itemList;
    }

    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public final TextView nameItemView;
        public final TextView descriptionItemView;
        final ListAdapter mAdapter;

        public ViewHolder(View itemView, ListAdapter adapter) {
            super(itemView);
            nameItemView = itemView.findViewById(R.id.nameTextView);
            descriptionItemView = itemView.findViewById(R.id.descriptionTextView);
            this.mAdapter = adapter;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int position = getLayoutPosition();
            ListElement element = mRecipeList.get(position);
            Intent intent = new Intent(context, RecipeActivity.class);
            Bundle bundle = new Bundle();
            bundle.putSerializable("item", element);
            intent.putExtras(bundle);
            context.startActivity(intent);
        }
    }

    @NonNull
    @Override
    public ListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.list_element, parent, false);
        return new ViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull ListAdapter.ViewHolder holder, int position) {
        String mCurrentName = mRecipeList.get(position).getName();
        String mCurrentDescription = mRecipeList.get(position).getDescription();
        holder.nameItemView.setText(mCurrentName);
        holder.descriptionItemView.setText(mCurrentDescription);
    }

    @Override
    public int getItemCount() {
        return mRecipeList.size();
    }
}
