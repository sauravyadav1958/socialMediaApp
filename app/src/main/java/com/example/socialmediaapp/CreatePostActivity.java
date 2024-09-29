package com.example.socialmediaapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CreatePostActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_create_post);

        EditText createPost = findViewById(R.id.createPost);
        Button savePostButton = findViewById(R.id.savePostButton);

        savePostButton.setOnClickListener(v -> {
            FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
            FirebaseUser firebaseUser = firebaseAuth.getCurrentUser();

            String postText = createPost.getText().toString();
            String createdBy = firebaseUser.getDisplayName();
            Date createdAt = new Date();
            List<String> likedBy = new ArrayList<>();

            Post post = new Post(likedBy, createdAt, createdBy, postText);
            PostDao postDao = new PostDao();
            postDao.addPost(post);
        });



    }
}