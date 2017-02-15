object FuncEx {
   def main(args: Array[String]) = {
     functionExample(25, multiplyBy2)                   // passing a function as parameter
    }
    def functionExample(a:Int, f:Int=>AnyVal):Unit = {
        println(f(a))                                   // calling that function
    }
    def multiplyBy2(a:Int):Int = {
        a*2
    }
}