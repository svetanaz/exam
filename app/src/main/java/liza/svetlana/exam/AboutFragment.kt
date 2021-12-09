package liza.svetlana.exam

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class AboutFragment : Fragment() {

    lateinit var topicRecyclerView: RecyclerView
    lateinit var homePageButton: Button


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_about, container, false)

        val topicList: List<String> = listOf("Лекция 1", "Лекция 2", "Лекция 3")


        homePageButton = view.findViewById(R.id.home_page_button)

        topicRecyclerView = view.findViewById(R.id.topic_recycler_view)
        topicRecyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        topicRecyclerView.adapter = TopicAdapter(topicList)


        homePageButton.setOnClickListener {
            val link = Uri.parse("https://tpu.ru/")
            val intent = Intent(Intent.ACTION_VIEW, link)
            context?.startActivity(intent)
        }

        return view
    }


}