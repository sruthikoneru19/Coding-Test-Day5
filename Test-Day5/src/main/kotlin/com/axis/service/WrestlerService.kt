package com.axis.service
import com.axis.database.WrestlerDb


class WrestlerService
{
    var wrestlerDb=WrestlerDb()
    var wrest=wrestlerDb.wrestler
    fun displayAge35()
    {
        var countAge=0
        println("Display all whose age is greater than 35")
        for(wres in wrest)
        {
            if(wres.age>35){
                countAge=countAge+1
                println("${wres.name}   ${wres.age}   ${wres.height}   ${wres.weight}")
                println()
            }
        }
        println("Count of wrestler age greater than 35: ${countAge}")
    }
    fun displayWeight200gt()
    {
        var countWeight=0
        println("Records whose weight is greater than 200")
        for(wres in wrest)
        {
            if(wres.weight>200){
                countWeight=countWeight+1
                println("${wres.name}  ${wres.age}  ${wres.height}  ${wres.weight}")
            }
        }
        println(countWeight)
    }
    fun displayAll()
    {
        println()
        println("Display all wrestlers")
        for(wres in wrest)
        {
            println("${wres.name}  ${wres.age}  ${wres.height}  ${wres.weight}")
        }
    }
}