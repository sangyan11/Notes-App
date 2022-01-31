package com.sangyan.notesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val item = ArrayList<Notes>()
        item.add(
            Notes(
                R.drawable.pdf,
                "System Design",
                "https://firebasestorage.googleapis.com/v0/b/online-learning-ea8c0.appspot.com/o/Uploads%2FSystem%20Design%20Basics%20Handbook%20-8.pdf?alt=media&token=084ec8ce-598a-4a14-ad7c-61003e509af6"
            )
        )
        item.add(
            Notes(
                R.drawable.pdf,
                "DBMS",
                "https://firebasestorage.googleapis.com/v0/b/online-learning-ea8c0.appspot.com/o/Uploads%2Fdbms_tutorial%20(1).pdf?alt=media&token=7e8a8500-5c94-4b03-a088-3b071d8b35e1"
            )
        )
        item.add(
            Notes(
                R.drawable.pdf,
                "C Notes",
                "https://firebasestorage.googleapis.com/v0/b/online-learning-ea8c0.appspot.com/o/Uploads%2F%5BStudycrux.com%5D%20Let%20us%20C%20by%20Yashwant%20Kanetkar%20(1).pdf?alt=media&token=671c6f65-26f1-4524-ac23-66e321aa5db1"
            )
        )
        item.add(
            Notes(
                R.drawable.pdf,
                "Resume",
                "https://firebasestorage.googleapis.com/v0/b/online-learning-ea8c0.appspot.com/o/Uploads%2F%5BStudycrux.com%5D%20Let%20us%20C%20by%20Yashwant%20Kanetkar%20(1).pdf?alt=media&token=671c6f65-26f1-4524-ac23-66e321aa5db1"
            )
        )
  val recycler_view  = findViewById<RecyclerView>(R.id.recycler_view)
        recycler_view.layoutManager = LinearLayoutManager(applicationContext)
        val adapter = NotesAdapter(item,this)
        recycler_view.adapter = adapter

    }
}