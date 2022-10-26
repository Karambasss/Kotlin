package com.example.listviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.core.util.size
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val my_list = MutableList(5) { "Hello, $it" }
        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_multiple_choice, my_list)
        //val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_single_choicee_choice, my_list)
        listVIEW.adapter = arrayAdapter
        listVIEW.choiceMode = ListView.CHOICE_MODE_MULTIPLE
        //listVIEW.choiceMode = ListView.CHOICE_MODE_SINGLE
        listVIEW.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "${(view as TextView).text}", Toast.LENGTH_LONG).show()
            textView.text = arrayAdapter.getItem(position)
        }

        button.setOnClickListener {
            var sbArray = listVIEW.checkedItemPositions
            for (i in 0 until sbArray.size){
                val key = sbArray.keyAt(i) // позиция выбранного checkedItem
                if (sbArray.get(key)){ // если item выделен
                    my_list.add(my_list[key])
                    listVIEW.setItemChecked(key,false) // делаем ячейку не выбранной
                }
            }
            arrayAdapter.notifyDataSetChanged()


//            my_list.add(my_list[listVIEW.checkedItemPositions])
//            arrayAdapter.notifyDataSetChanged()
        }
    }
}