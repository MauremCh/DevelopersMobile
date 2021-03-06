package com.example.cortinapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ExpandableListView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TaskAdapter (private val datos: ArrayList<Task>, private val clickListener: (Task) -> Unit ):
        RecyclerView.Adapter<TaskAdapter.TaskViewHolder>() {

        class TaskViewHolder (val layout:View) : RecyclerView.ViewHolder(layout)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        val layout = LayoutInflater.from(parent.context)
            .inflate(R.layout.task_list_items, parent, false)
        return TaskViewHolder(layout)
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        val task = datos[position]
        val textViewArticle: TextView = holder.layout.findViewById(R.id.textViewarticle)
        val textViewDay: TextView = holder.layout.findViewById(R.id.textViewday)
        textViewArticle.text = task.article
        textViewDay.text = task.day
        holder.layout.setOnClickListener{clickListener(task) }
    }

    override fun getItemCount(): Int {
        return datos.size
    }
}