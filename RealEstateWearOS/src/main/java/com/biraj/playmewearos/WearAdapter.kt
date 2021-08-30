package com.biraj.playmewearos

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

// All finished

class WearAdapter (

    private val context: Context,
    private val listChallenges: Array<Challenges>


): RecyclerView.Adapter<WearAdapter.StoryViewHolder>() {

    class StoryViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val tvGame: TextView
        val tvChallenge : TextView
        val tvUsername : TextView
        val tvLive : TextView
        val tvdes : TextView
        val tvRate : TextView
        val btnbuy:ImageButton
        val btnfav:ImageButton

        init{

            tvGame= view.findViewById(R.id.tvGame)
            tvChallenge= view.findViewById(R.id.tvChallenge)
            tvdes= view.findViewById(R.id.tvdes)
            tvLive= view.findViewById(R.id.tvLive)
            tvUsername = view.findViewById(R.id.tvUsername)
            tvRate = view.findViewById(R.id.tvRate)
            btnbuy = view.findViewById(R.id.btnbuy)
            btnfav = view.findViewById(R.id.btnfav)


        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoryViewHolder{
        val view = LayoutInflater.from(parent.context).inflate(R.layout.weardesign, parent, false)

        return StoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: StoryViewHolder, position: Int) {
        val artist = listChallenges[position]
//        println(artist)
        holder.tvGame.text = artist.Game
        holder.tvUsername.text = artist.Username
        holder.tvLive.text = artist.Livelink
        holder.tvRate.text=artist.Challengerate
        holder.tvdes.text = artist.Description
        holder.tvChallenge.text=artist.Challengetitle
        holder.btnfav.setOnClickListener {
            Toast.makeText(context," Challenge Added to WatchList !!", Toast.LENGTH_SHORT).show()
        }
//        holder.btnbuy.setOnClickListener({
//            context.startActivity(Intent(context,HireArtist::class.java))
//        })
    }

    override fun getItemCount(): Int {
        return listChallenges.size

    }




}