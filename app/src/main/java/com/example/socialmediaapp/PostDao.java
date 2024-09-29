package com.example.socialmediaapp;

import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class PostDao {
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    CollectionReference usersCollection = db.collection("posts");

    public void addPost(Post post){
        usersCollection.add(post);
    }
}
