fun main(args: Array<String>){
    println("შეიყვანეთ a: ")
    val a = Integer.valueOf(readLine())
    println("შეიყვანეთ b: ")
    val b = Integer.valueOf(readLine())
    println("შეიყვანეთ c")
    val c = Integer.valueOf(readLine())
    val d = b * b - 4.0 * a * c
    val x1: Double
    val x2: Double
    x1 = (-b + Math.sqrt(d))/2*a
    x2 = (-b - Math.sqrt(d))/2*a

    if (d > 0 ){
        println("განტოლებას აქვს ორი ამონახსნი")
        println("X1 ტოლია = $x1")
        println("X2 ტოლია = $x2")
    }
    else if (d == 0.0){
        println("განტოლებას აქვს ერთი ნამდვილი ამონახსნი")
        println("X = $x1")
    }
    else {
        println("განტოლებას არ აქვს ამონახსნი")
    }

}

