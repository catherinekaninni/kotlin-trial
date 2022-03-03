fun main(){
    word()
    sum(15,20,25)
    multiply(25,5,10)
    me()
    world()
    future()
}
//write a function that takes in your full name and add a space before your first name  and after your last
// name,return and trim the spacebefore your first name
fun word(){
    var name = "Catherine"
    var last = "Kilonzi"
    var fullname =name+" "+last
    println(fullname)
}
//write a function that takes in 3 numbers and returns the sum of all the 3 numbers
fun sum(a:Int,b:Int,c:Int){
    var add = a+b+c
    println(add)

}
//write a function that takes in 3 numbers and returns the multiplication of all the 3 numbers
fun multiply(a:Int,b:Int,c:Int){
    var multiple = a*b*c
    println(multiple)

}
// write a function that takes in the current year and your birth and prints your current age.
fun me(){
    var year = 2022
    var birth = 2002
    var age = year-birth
    println(age)
}
//write a function that takes  in a statement that says "I am 20 years old"
fun world(){
    var statement = "I am 20 years old"
    println(statement)
}
/*write a function that takes in two statements.In the first statement replace the ceo to manager and for the
second statement make the statement upper case.*/
fun future(){
    var statement = "Mellisa is a ceo of jumia online market and lives in Europe"
    println(statement.replace("ceo","manager"))
    var statement2 = "The head director of Simba cement located in Africa"
    println(statement2.uppercase())
}






