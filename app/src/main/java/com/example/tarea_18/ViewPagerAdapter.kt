package com.example.tarea_18

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.pant2.view.*


class ViewPagerAdapter(private val boardList: List<Board>): RecyclerView.Adapter<ViewPagerAdapter.BoarViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BoarViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.pant2, parent, false)
        return BoarViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewPagerAdapter.BoarViewHolder, position: Int) {
        holder.bind(boardList[position])
    }

    override fun getItemCount(): Int {
        return boardList.size
    }
    inner class BoarViewHolder(
        itemView:View
    ):RecyclerView.ViewHolder(itemView){

        private val par2 = itemView.imgava
        private val photo = itemView.imageView
        private val tex = itemView.textView




        fun bind(board: Board)= with(itemView){
            par2.background = ContextCompat.getDrawable(context, board.font)
            photo.setImageResource(board.image)
            tex.text=board.title

        }
    }
}