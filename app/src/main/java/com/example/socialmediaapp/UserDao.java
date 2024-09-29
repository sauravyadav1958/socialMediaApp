package com.example.socialmediaapp;


import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;

import kotlinx.coroutines.GlobalScope;

public class UserDao {
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    CollectionReference usersCollection = db.collection("users");

    public void addUser(User user){
        usersCollection.add(user);
    }
}
