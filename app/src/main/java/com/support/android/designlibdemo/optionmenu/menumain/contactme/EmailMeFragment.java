package com.support.android.designlibdemo.optionmenu.menumain.contactme;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.bumptech.glide.Glide;
import com.support.android.designlibdemo.R;
import com.support.android.designlibdemo.character.character_activity.CharacterActivity;

import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;


public class EmailMeFragment extends Fragment {

    Button buttonSend;
    EditText textSubject;
    EditText textMessage;
    ImageView image;

    String myEmail = "fabio.soave3@gmail.com";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View myFragmentView = inflater.inflate(R.layout.emailme_fragment, container, false);

        buttonSend = (Button) myFragmentView.findViewById(R.id.buttonSend);
        textSubject = (EditText) myFragmentView.findViewById(R.id.editTextSubject); //create a hint
        textMessage = (EditText) myFragmentView.findViewById(R.id.editTextMessage); //create a hint
        image = (ImageView) myFragmentView.findViewById(R.id.imageView);

        image.setImageResource(R.drawable.hulk_dial);

        /* Because when the EditText is first touched it calls the focus event and
           on second touch it call the click event so you have to disable
           the focus event first.
         */
        textSubject.setInputType(InputType.TYPE_NULL); //disable keyboard
        textSubject.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                final String subjects[] = {
                        "Possibile improovement", "Bug", "Typo", "Missing character", "Missing alt"
                };

                AlertDialog.Builder builder =
                        new AlertDialog.Builder(getActivity());

                builder.setTitle("Choose one");
                builder.setItems(subjects, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // The 'which' argument contains the index position
                        // of the selected item
                        textSubject.setText(subjects[which]);
                    }
                });
                builder.show();
            }});

        buttonSend.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                String subject = textSubject.getText().toString();
                String message = textMessage.getText().toString();

                if (subject.isEmpty() || message.isEmpty()) {
                    Snackbar.make(v, "Insert both the field", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                } else {
                    String uriText =
                            "mailto:" + myEmail +
                                    "?subject=" + Uri.encode(subject) +
                                    "&body=" + Uri.encode(message);

                    Uri uri = Uri.parse(uriText);
                    Intent sendIntent = new Intent(Intent.ACTION_SENDTO);
                    sendIntent.setData(uri);
                    startActivity(Intent.createChooser(sendIntent, "Choose an Email client :"));
                    cleanFormData(textMessage, textSubject);
                }
            }
        });

        return myFragmentView;
    }

    private void cleanFormData (EditText a, EditText b){
        a.setText("", TextView.BufferType.EDITABLE);
        b.setText("", TextView.BufferType.EDITABLE);
    }


}
