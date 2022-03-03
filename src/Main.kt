fun main(){
    String()
    nameage()
    length()
    ifelse("Catherine Kilonzi")

}
/*Given a String "AkiraChix".Write a function that prints out a String composed of the first,third and
fourth characters of the String*/
fun String(){
    var name = "AkiraChix"
    println(name[1].toString()+name[3]+name[4])


}
/*Write a function that takes in 2 parameter's,name and age and return a String with this structure "Hi,my
name x and i am y years old"*/
fun nameage(){
    var name = "Catherine"
    var age = 20
    var statement = "Hi,my name is $name and am $age years old"
    println(statement)
}
/*Write a function that takes in a String and returns its length*/
fun length(){
    var name = "AkiraChix"
    println(name.length)
}
/*Write a function that takes in a name and prints out "That's me!"when your name is passed to it,otherwise
it prints"I don't know who that is"*/

fun ifelse(name:String){
    if(name=="Catherine Kilonzi"){
        println("That's me!")}
    else
        println("I don't know who that is")
}









