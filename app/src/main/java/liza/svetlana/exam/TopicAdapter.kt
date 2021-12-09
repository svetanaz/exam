package liza.svetlana.exam

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class TopicAdapter(private val topicList: List<String>) : RecyclerView.Adapter<TopicViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopicViewHolder {
        val itemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.topic_list_item, parent, false)
        return TopicViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TopicViewHolder, position: Int) {
        val name = topicList[position]
        holder.bind(name)
    }

    override fun getItemCount(): Int {
        return topicList.size
    }
}