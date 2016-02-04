package com.support.android.designlibdemo;

/**
 * Created by fabio on 06/11/15.
 *
 * Adapter for cardview
 */
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.support.android.designlibdemo.database.MiniCharacter2;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.CharacterViewHolder> {

    public static class CharacterViewHolder extends RecyclerView.ViewHolder {

        CardView cv;
        TextView personName;
        CircleImageView avatar;

        CharacterViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cv);
            personName = (TextView)itemView.findViewById(R.id.person_name);
            avatar = (CircleImageView)itemView.findViewById(R.id.avatar);
        }
    }

    List<MiniCharacter2> characters;

    public RVAdapter(List<MiniCharacter2> characters){
        this.characters = characters;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public CharacterViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.character_cardlist, viewGroup, false);
        CharacterViewHolder pvh = new CharacterViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(CharacterViewHolder characterViewHolder, int i) {
        characterViewHolder.personName.setText(characters.get(i).name);
        //characterViewHolder.avatar.set  fill with image
    }

    @Override
    public int getItemCount() {
        return characters.size();
    }
}
