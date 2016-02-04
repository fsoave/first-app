package com.support.android.designlibdemo.character.lockbox;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.support.android.designlibdemo.R;
import com.support.android.designlibdemo.character.character_activity.CharacterDetailActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fabio on 22/10/15.
 *
 * quando funzionerà il db, spero di poter usare una sola activity con 6 tab che contengano sia buoni che cattivi
 */

public class LockboxesListFragment extends Fragment {

    public String[] type;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        RecyclerView rv = (RecyclerView) inflater.inflate(
                R.layout.fragment_character_list, container, false);
        rv.setHasFixedSize(true); //improove performance

        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String classType = bundle.getString("class");
            if (classType.equals("Bruiser")){ type = Lockboxes.sLockboxesBruiser;}
            if (classType.equals("Blaster")){ type = Lockboxes.sLockboxesBlaster;}
            if (classType.equals("Scrapper")){ type = Lockboxes.sLockboxesScrapper;}
            if (classType.equals("Infiltrator")){ type = Lockboxes.sLockboxesInfiltrator;}
            if (classType.equals("Tactical")){ type = Lockboxes.sLockboxesTactical;}
            if (classType.equals("Generalist")){ type = Lockboxes.sLockboxesGeneralist;}
        }else{
            type = null;
        }

        setupRecyclerView(rv);
        return rv;
    }

    private void setupRecyclerView(RecyclerView recyclerView) {
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(new SimpleStringRecyclerViewAdapter(getActivity(),
                Lockboxes.getList(type)));
    }

    /*private List<String> getList(String[] array) {
        //Arrays.sort(array)
        ArrayList<String> list = new ArrayList<>(array.length);
        int i = 0;
        while (list.size() < array.length) {
            list.add(array[i]);
            i++;
        }
        return list;
    }*/

    public static class SimpleStringRecyclerViewAdapter
            extends RecyclerView.Adapter<SimpleStringRecyclerViewAdapter.ViewHolder> {

        private final TypedValue mTypedValue = new TypedValue();
        private int mBackground;
        private List<String> mValues;

        public static class ViewHolder extends RecyclerView.ViewHolder {
            public String mBoundString;

            public final View mView;
            public final ImageView mImageView;
            public final TextView mTextView;

            public ViewHolder(View view) {
                super(view);
                mView = view;
                mImageView = (ImageView) view.findViewById(R.id.avatar);
                mTextView = (TextView) view.findViewById(android.R.id.text1);
            }

            @Override
            public String toString() {
                return super.toString() + " '" + mTextView.getText();
            }
        }

        public String getValueAt(int position) {
            return mValues.get(position);
        }

        public SimpleStringRecyclerViewAdapter(Context context, List<String> items) {
            context.getTheme().resolveAttribute(R.attr.selectableItemBackground, mTypedValue, true);
            mBackground = mTypedValue.resourceId;
            mValues = items;
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.list_item, parent, false);
            view.setBackgroundResource(mBackground);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(final ViewHolder holder, int position) {
            holder.mBoundString = mValues.get(position);
            holder.mTextView.setText(mValues.get(position));

            holder.mView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Context context = v.getContext();
                    Intent intent = new Intent(context, CharacterDetailActivity.class);
                    intent.putExtra(CharacterDetailActivity.EXTRA_NAME, holder.mBoundString);
                    intent.putExtra("character_type", "lockbox");

                    context.startActivity(intent);
                }
            });

            Glide.with(holder.mImageView.getContext())
                    .load(Lockboxes.getRandomDrawable())
                    .fitCenter()
                    .into(holder.mImageView);
        }

        @Override
        public int getItemCount() {
            return mValues.size();
        }
    }
}
