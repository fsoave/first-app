package com.support.android.designlibdemo.future.Adapter;

/**
 * Created by fabio on 06/11/15.
 *
 * Adapter for cardview
 *
 * http://code.tutsplus.com/tutorials/getting-started-with-recyclerview-and-cardview-on-android--cms-23465
 * https://github.com/tutsplus/Android-CardViewRecyclerView/blob/master/ListsAndCards/app/src/main/java/com/hathy/listsandcards/RVAdapter.java
 */
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.support.android.designlibdemo.R;
import com.support.android.designlibdemo.character.character_activity.BiopicData;
import com.support.android.designlibdemo.character.character_activity.Biopics;
import com.support.android.designlibdemo.character.character_activity.CharacterData;
import com.support.android.designlibdemo.character.character_activity.CharacterDetailActivity;
import com.support.android.designlibdemo.character.character_activity.Characters;

import java.util.List;
import java.util.Map;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.CharacterViewHolder> {

    public static class CharacterViewHolder extends RecyclerView.ViewHolder {

        public String mBoundString;
        public final View mView;

        public CardView cv;
        public final TextView personName;
        public final ImageView avatar;

        CharacterViewHolder(View itemView) {
            super(itemView);
            mView = itemView;
            cv = (CardView)itemView.findViewById(R.id.cv);
            personName = (TextView)itemView.findViewById(R.id.person_name);
            avatar = (ImageView)itemView.findViewById(R.id.avatar_circle);
        }
    }

    List<CharacterData> characters;

    public RVAdapter(List<CharacterData> characters){
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
    public void onBindViewHolder(final CharacterViewHolder characterViewHolder, final int i) {
        characterViewHolder.personName.setText(characters.get(i).getName());
        characterViewHolder.avatar.setImageResource(characters.get(i).getDrawableIcon());

        characterViewHolder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = v.getContext();
                Intent intent = new Intent(context, CharacterDetailActivity.class);
                intent.putExtra(CharacterDetailActivity.EXTRA_NAME, characters.get(i).getName()); //TODO: modificare quando covertlist fragment sarà modificata
                intent.putExtra("dialog_image", characters.get(i).getDrawableDialog());

                //attach biopic
                Map<String, BiopicData> biopics = Biopics.getBiopic();
                if (biopics.containsKey(characters.get(i).getName())){
                    characters.get(i).setBiopic(biopics.get(characters.get(i).getName()).getBio());
                    if (characters.get(i).getBiopic() == ""){
                        characters.get(i).setBiopic("Unknown data");
                    }
                    intent.putExtra("bio", characters.get(i).getBiopic());
                }else{
                    // if character is not in BiopicData
                    intent.putExtra("bio", "Unknown");
                }

                context.startActivity(intent);
            }
        });

        characterViewHolder.mView.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean onLongClick(View v) {
                Log.e("I've been", "longclicked");
                return true;
            }
        });
    }

    @Override
    public int getItemCount() {
        return characters.size();
    }
}
