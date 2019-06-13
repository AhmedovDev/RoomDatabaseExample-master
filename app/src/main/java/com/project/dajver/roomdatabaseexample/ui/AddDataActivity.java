package com.project.dajver.roomdatabaseexample.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

import com.project.dajver.roomdatabaseexample.App;
import com.project.dajver.roomdatabaseexample.R;
import com.project.dajver.roomdatabaseexample.db.DatabaseHelper;
import com.project.dajver.roomdatabaseexample.db.model.DataModel;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by gleb on 11/16/17.
 */

public class AddDataActivity extends AppCompatActivity {

    @BindView(R.id.title)
    EditText title;
    @BindView(R.id.description)
    EditText description;

    DatabaseHelper databaseHelper = App.getInstance().getDatabaseInstance();

    DataModel model = new DataModel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        ButterKnife.bind(this);
addline();

    }


    private void addline (){

        model.setTitle("1");
        model.setDescription("Ahmed");
        databaseHelper.getDataDao().insert(model);

        model.setTitle("dsc");
        model.setDescription("sdcds");
        databaseHelper.getDataDao().insert(model);


        model.setTitle("sdc");
        model.setDescription("sdvdvw");
        databaseHelper.getDataDao().insert(model);

        model.setTitle("fdvfev");
        model.setDescription("adsv");
        databaseHelper.getDataDao().insert(model);

        model.setTitle("dsvwecwec");
        model.setDescription("hjtbefc");
        databaseHelper.getDataDao().insert(model);

        model.setTitle("gfbefv");
        model.setDescription("hgnfcsdcwdc");
        databaseHelper.getDataDao().insert(model);


    }
    @OnClick(R.id.save)
    public void onSaveClick() {
        model.setTitle(title.getText().toString());
        model.setDescription(description.getText().toString());
        databaseHelper.getDataDao().insert(model);

        finish();
    }
}
