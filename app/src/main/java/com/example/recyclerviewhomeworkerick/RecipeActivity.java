package com.example.recyclerviewhomeworkerick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecipeActivity extends AppCompatActivity {

    TextView name, ingre, prepa;
    ImageView image;
    String numRecipe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        ListElement recipe = (ListElement) getIntent().getSerializableExtra("item");
        name = (TextView) findViewById(R.id.txtName);
        image = (ImageView) findViewById(R.id.recipeImage);
        ingre = (TextView) findViewById(R.id.txtIngredientes);
        prepa = (TextView) findViewById(R.id.txtProcedimiento);

        name.setText(recipe.getName());
        numRecipe = recipe.getImage();
        ingre.setText(recipe.getIngredients());
        prepa.setText(recipe.getPreparation());

        int id = getResources().getIdentifier(numRecipe, "drawable", getPackageName());
        image.setImageResource(id);
    }
}