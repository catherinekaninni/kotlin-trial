fun main(){
    var come = String("AkiraChix")
    println (come)
    var word = nameage("Catherine Kanini",20)
    println(word)
    var greet = length("AkiraChix")
    println(greet)
    ifelse("Catherine Kilonzi")

}
/*Given a String "AkiraChix".Write a function that prints out a String composed of the first,third and
fourth characters of the String*/
fun String(name:String):String{
    var stmt = (name[1].toString()+name[3]+name[4])
    return stmt


}
/*Write a function that takes in 2 parameter's,name and age and return a String with this structure "Hi,my
name x and i am y years old"*/
fun nameage(name:String,age:Int):String{
    var statement = "Hi,my name is $name and am ${age.toString()} years old"
    return statement
}
/*Write a function that takes in a String and returns its length*/
fun length(name:String):Int{
    var name = name.length
    return name
}
/*Write a function that takes in a name and prints out "That's me!"when your name is passed to it,otherwise
it prints"I don't know who that is"*/

fun ifelse(name:String){
    if(name=="Catherine Kilonzi"){
        println("That's me!")}
    else
        println("I don't know who that is")
}









