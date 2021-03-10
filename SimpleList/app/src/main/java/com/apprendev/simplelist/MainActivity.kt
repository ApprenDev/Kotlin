package com.apprendev.simplelist

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), AdapterView.OnItemClickListener {

    private val names = listOf("Name one", "Name two", "Name three", "Name four", "Name five")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val namesAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, names)
        lvNames.adapter = namesAdapter
        lvNames.onItemClickListener = this

    }

    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        Toast.makeText(this, names[position], Toast.LENGTH_SHORT).show()
    }

}