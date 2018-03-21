package com.example.gustavobarbosab.minhassenhas.screens.home.components.dialog;

import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.gustavobarbosab.minhassenhas.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by tqi-udi on 21/03/18.
 */

public class HomeCreateEditDialog extends AlertDialog.Builder{

    @BindView(R.id.newSiteTxtEmail)
    TextView newSiteTxtEmail;

    @BindView(R.id.newSiteTxtName)
    TextView newSiteTxtName;

    @BindView(R.id.newSiteTxtPassword)
    TextView newSiteTxtPassword;

    @BindView(R.id.newSiteTxtUrl)
    TextView newSiteTxtUrl;

    public HomeCreateEditDialog(@NonNull Context context) {
        super(context);
        View view = View.inflate(context,R.layout.dialog_new_edit_site,null);
        ButterKnife.bind(this,view);
        this.setView(view);

        /* When negative (No/cancel) button is clicked*/
        this.setNegativeButton("Cancel", (dialog, which) -> {
            dialog.cancel();
        });
    }

    @Override
    public AlertDialog.Builder setView(View view) {
        super.setView(view);
        return this;
    }

    public TextView getNewSiteTxtEmail() {
        return newSiteTxtEmail;
    }

    public void setPositiveButtonEdit(){
        /* When positive (yes/ok) is clicked */
        this.setPositiveButton("Save", (dialog, which) -> {
            Toast.makeText(this.getContext(),newSiteTxtEmail.getText().toString(),Toast.LENGTH_LONG).show();
            dialog.cancel();
        });
    }

    public void setPositiveButtonCreate(){
        /* When positive (yes/ok) is clicked */
        this.setPositiveButton("Save", (dialog, which) -> {
            Toast.makeText(this.getContext(),newSiteTxtEmail.getText().toString(),Toast.LENGTH_LONG).show();
            dialog.cancel();
        });
    }
}
