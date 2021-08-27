  package com.biraj.playme

import com.biraj.playme.Entity.Detailsss


var listUsers = arrayListOf<Detailsss>()
var users = mutableMapOf<Int, Detailsss>( 0 to Detailsss( ))
var loggedIn: Detailsss? = null
class Storage (){
    fun appendUsers(student: Detailsss){
        listUsers.add(student)
        println(listUsers.size)
    }
    fun returnStudent():ArrayList<Detailsss>{
        return listUsers
    }
    fun deleteStudent(student: Detailsss){
        listUsers.remove(student)
    }
    public fun setLoggedIn(id: Detailsss?){
        println(id)
        loggedIn = id
    }
    public fun getLoggedIn(): Detailsss? {
        return loggedIn
    }

    public fun hasUsername(u: String?): Detailsss? {
        var found: Detailsss? = null
        for(i in users){
            if(u == i.value.name) {
                found = i.value
                break
            }
        }
        return found
    }

}