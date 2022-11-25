package com.axis.database
import com.axis.model.Wrestler

class WrestlerDb
{
    var wrestler=mutableListOf<Wrestler>()
    init
    {
        wrestler.add(Wrestler("Sruthi",22,5.11f,56.0))
        wrestler.add(Wrestler("Swetha",38,5.4f,202.0))
        wrestler.add(Wrestler("Harika",21,5.2f,88.0))
    }
    fun wrestler1():MutableList<Wrestler>
    {
        return wrestler
    }
}