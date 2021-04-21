import core.*

fun main(args: Array<String>)
{
    /*
        println("Hello Kotlin!")

        println(sumaV1(54,57))
        println(sumaV2(23,45))
        sumaV3(54,12)
        sumaV4(34,62)

        variablesOnlyForReading()
        variablesCanBeChanged()
        multiplication()
        usingStringTemplates()

        println(maxV1(10,10))
        println(maxV2(10,10))
        println(maxV3(10,10))
        maxV4(10,20)
        println("Max_v5: ${maxV5(10,11)}")

        typeCheckingCharStringIntBooleanV1(66)
        typeCheckingCharStringIntBooleanV1('5')
        typeCheckingCharStringIntBooleanV1("10000")
        typeCheckingCharStringIntBooleanV1(true)
        typeCheckingCharStringIntBooleanV1(println("\nHello Kotlin! )))"))

        val numbersV1: IntArray = intArrayOf(5,2,3,4,5,6)

        maximumNumberOfMatricesV1(numbersV1)

        println(typeCheckingV2(10))
        println(typeCheckingV2('1'))
        println(typeCheckingV2(10.10f))
        println(typeCheckingV2("Cristian"))
        println(typeCheckingV2(true))
        println(typeCheckingV2(10.10))

        usingIntervals()

        typeCheckingV3(10)
        typeCheckingV3('1')
        typeCheckingV3(10.10f)
        typeCheckingV3("Cristian")
        typeCheckingV3(true)
        typeCheckingV3(10.10)
        typeCheckingV3(Int)

        defaultValuesForFunctionParameters(20,"Cristian")
        defaultValuesForFunctionParameters(10)
        defaultValuesForFunctionParameters()

        startColorConversion()

        printMyObject1()

        typeCheckingV3(transformFromCharToInt('7'))

        val arrayForm = arrayOf("Form","9","8","4","3","57","11")
        var arrayTo = arrayOf("To","8","3","2","5","1","01")

        copyTheArrayToArray(arrayForm, arrayTo)
    */

    /*
        val _object0 = Person0()
        println("_object0: ${_object0.hashCode()}")
        println("_object0: ${_object0.toString()}")
        //rintln("_object0: ${_object0.equals()}")
        val _object1 = Person1()
        val _object2 = Person2("Cristian",25)
        val _object3 = Person3("Cristian",25)
        val _object4 = Person4("Cristian",25)
        val _object5 = Person5("Cristian",25)
        //val _object6 = Person6("Cristian",25)
        //val _object7 = Person7("Cristian",25)
        val _object8 = Person8("Cristian",25)
        val _object9 = Person9("Cristian",25)
        val _object10 = Person10("Cristian",25)
        val _object11 = Person11("Cristian",25)
        //Person12()
        //Person13()

        println("\n_object14:")
        val _object14 = Person14("Cristian",25)
        println("_object14 getName: ${_object14.getName()}")
        println("_object14 getAge: ${_object14.getAge()}")
        _object14.printlnSpaceGalaxy()

        println("\n_object15:")
        val _object15 = Person15("Cristian",25)
        println("_object15 getName: ${_object15.getName()}")
        println("_object15 getAge: ${_object15.getAge()}")
        _object15.printlnSpaceGalaxy()

        println("\n_object16:")
        val _object16 = Person16("Cristian",25)
        println("_object16 getName: ${_object16.getName()}")
        println("_object16 getAge: ${_object16.getAge()}")

        val _object17 = Person17()
        _object17.printlnSpaceGalaxy()

        Person17().PrintlnGalaxy("Home").printlnSpaceGalaxy()

        Person18("Man",20).Println().name().age()
        Person18("Man",20).displayOfBasicPeople()
        Person18("Man",20).printlnName()
        Person18("Man",20).printlnAge()
        Person18("Man",20).printlnName().printlnAge().displayOfBasicPeople()

        val obj1 = Person19.create()
        obj1.displayOfBasicPeople()

        val obj2 = Person19.create2()
        obj2.printlnSpaceGalaxy()

        val obj3 = Person20()
        obj3.oldFun("Salut")
        obj3.newFun("Salut")

        ///https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/
        if (Person20::class.isCompanion)
        {
            println("class: Person20 Această clasă are un obiect companion.")
        }

        obj3.weDisplayOddAndEvenNumbersFromTheList()

        val name = "Sanda"
        if (obj3.thisIsTheName(name))
        {
            println("Acest nume este: $name")
        }

        obj3.weCheckIfTheWordLengthIsEvenOrOdd()

        obj3.weCheckIfTheWordLengthIsEvenOrOdd2()

        val obj4 = Person21()
        obj4.function { Person20() }

        val obj5 = Person22()
        obj5.startLateinitWork()
        obj5.startLazyWork()

        val obj6 = Person23(10,10)
        println("obj6.stepNoOne: ${obj6.stepNoOne}")
        obj6.printlnNumberStep()
        obj6.printlnIndex1()
        obj6.printlnIndex2()
        obj6.printlnIndex3()

        val obj7 = Person24("Cristian",25)
        obj7.printlnName()
        obj7.printlnAge()
        obj7.printlnProfession()

        val obj8 = Person25("Cristian",25)
        obj8.printlnName()
        obj8.printlnAge()

        Person25("Cristiam",25).printlnName()
        Person25("Cristiam",25).printlnAge()
    */

    /*
    val obj9 = Person27("Cristian",25)
    obj9.caller(Person26())

    val obj10 = Person28("Cristian",25)

    val obj11 = obj10.copy(name = "Space Resolution", age = 30)
    println("obj11 name: ${obj11.name}")
    println("obj11 age: ${obj11.age}")

    val (name, age) = Person28("Cristian", 25)
    println("$name, $age years of age")

    val (name2, age2) = Person29("Space Resolution", 10)
    println("$name2, $age2 years of age")

    val object12 = Age0( 25)
    val object13 = SumAge(object12,object12)

    println("Age: ${checking(object12)}")
    println("SumAge: ${checking(object13)}")
    println("Person28 component2: ${checking(obj10)}")

    val object14 = Person31<String, Int>("Cristian",25)
    object14.printlnNameAge()

    val object15 = Person31("Cristian",25)
    object15.printlnNameAge()

    val object16 = Person31<Name, Age>(Name("Cristian"), Age(25))
    object16.printlnNameAge()

    val object17 = Person31(Name("Cristian"), Age(25))
    object17.printlnNameAge()
    */

    /*
    val object18 = Person32("Cristian", "25")
    println(object18.name(object18.getType()))
    println(object18.age(object18.getType()))

    val object19 = Person33<String, Int>("Cristian", 25)
    object19.test1(object19)
    object19.test2(object19)
    object19.test3(object19)
    object19.test4(object19)
    object19.test5(object19)
    object19.test6(object19)



    val Test = Test<String>()

    val Test1 = Test1()
    println(Test1.test1(Test))

    Workers()
    */

    println("\nCar1")
    val Car1 : Bus = Car(70.0f, "Space", "Bus-14384")
    Car1.printlnBus()
    Car1.BurningTemperature = 40.0f
    Car1.dieselFuel = 170
    Car1.StartingTheCar()
    Car1.StartingTheCar(false)
    Car1.StartingTheCar(true)

    println("\nCar2")
    val Car2 : Sedan = Car(140.0f, "VM", "Sedan-57763")
    Car2.printlnSedan()
    Car2.BurningTemperature = 50.0f
    Car2.gasolineFuel = 70
    Car2.StartingTheCar()
    Car2.StartingTheCar(false)
    Car2.StartingTheCar(true)

    println("\nCar3")
    val Car3 : Cabriolet = Car(200.0f, "STB", "Cabriolet-31374")
    Car3.printlnCabriolet()
    Car3.removeTheRoofFromTheCar()
    Car3.BurningTemperature = 70.0f
    Car3.gasolineFuel = 50
    Car3.StartingTheCar()
    Car3.StartingTheCar(false)
    Car3.StartingTheCar(true)

}