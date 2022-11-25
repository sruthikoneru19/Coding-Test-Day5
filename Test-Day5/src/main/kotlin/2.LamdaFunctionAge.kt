import java.util.Scanner


var age= fun(age: Int) : String
{
    if(age<18)
        return ("Not an Adult")
    else if (age>=18 && age<=55)
        return ("You are an adult")
    else
        return ("Senior Citizen")
}
fun main()
{
    var sc= Scanner(System.`in`)
    print("Enter the age to check: ")
    var age=sc.nextInt()
    val result = age(age)
    println(result)
}