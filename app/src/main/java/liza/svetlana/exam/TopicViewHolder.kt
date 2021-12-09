package liza.svetlana.exam

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TopicViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val topicListTextView: TextView=itemView.findViewById(R.id.topic_list_text_view)

    fun bind (name:String) {

        topicListTextView.text = name


    }

}