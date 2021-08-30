package com.biraj.playmewearos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class DashBoardActivity : AppCompatActivity() {
//    private lateinit var rvArtist: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dash_board)
//        rvArtist=findViewById(R.id.rvArtist)

//        loadUserAdapter()

    }

//    private fun loadUserAdapter() {
//        CoroutineScope(Dispatchers.IO).launch {
////            try {
//                val productRepository= postRepo()
//                val response = productRepository.getAllArtist()
//                if (response.success == true) {
//                    // Put all the student details in lstStudents
//                    val listUsers: Array<Challenges>? = response.data
//                    Log.d("response",response.toString());
//                    withContext(Dispatchers.Main) {
//                        val adapter= WearAdapter( this@DashBoardActivity,listUsers!!)
//                        rvArtist.layoutManager= LinearLayoutManager(this@DashBoardActivity)
//                        rvArtist.adapter=adapter
//                    }
//                }
////            } catch (ex: Exception) {
////                withContext(Dispatchers.Main) {
////                    Toast.makeText(
////                        this@DashBoardActivity,
////                        "Error : ${ex.toString()}", Toast.LENGTH_SHORT
////                    ).show()
////                }
////            }
//        }
//    }
}