package com.zeynepgedik.softtechproject.Adapter


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.zeynepgedik.softtechproject.R
import com.zeynepgedik.softtechproject.data.CustomViewModel

import com.zeynepgedik.softtechproject.data.CustomViewModelItem
import com.zeynepgedik.softtechproject.data.Properties

class RecyclerViewAdapter (val customViewModel : MutableList<Properties>) :
    RecyclerView.Adapter<RecyclerViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.custom_view_layout,parent,false)
        return RecyclerViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        return holder.bindView(customViewModel[position])
    }

    override fun getItemCount(): Int {
        return customViewModel.size
    }

}
class RecyclerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    private val header_title : TextView = itemView.findViewById(R.id.header_title)
    private val code_title :TextView = itemView.findViewById(R.id.code_title)
    private val text_title :TextView = itemView.findViewById(R.id.text_title)
    fun bindView(customViewModel: Properties){
        header_title.text =customViewModel.Header
        code_title.text = customViewModel.Code
        text_title.text = customViewModel.Text


    }

}