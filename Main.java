//public class Main{
//    int x = 5;
//
//    public static void main(String[] args){
//        Main myObj = new Main();
//        System.out.println(myObj.x);
//    }
//}

//public class Main{
//    int x = 5;
//    public static void main(String[] args){
//        Main myObj = new Main();
//        System.out.println(myObj.x);
//    }
//}

//public class Main{
//    static void myMethod(){
//        System.out.println("Hello World");
//    }
//
//    public static void main(String[] args){
//        myMethod();
//    }
//}

//public class Main{
//
//    public void fullThrottle(){
//        System.out.println("The car is going as fast as it can!");
//    }
//    public void speed(int maxSpeed){
//        System.out.println("Max speed is"+ maxSpeed);
//    }
//
//    public static void main(String[] args){
//            Main myCar = new Main();
//            myCar.fullThrottle();
//            myCar.speed(200);
//    }
//}

/*Constructors*/
//public class Main{
//    int x;
//    public Main(){
//        x = 5;
//    }
//    public static void main(String[] args){
//        Main myObj = new Main();
//        System.out.println(myObj.x);
//    }
//}
/*Constructor with Parameters*/
//public class Main{
//    int x;
//    public Main(int y){
//        x=y;
//    }
//    public static void main(String[] args){
//        Main myObj = new Main(6);
//        System.out.println(myObj.x);
//    }
//}

//public class Main{
//    int x;
//
//    public Main(int x){
//        this.x=x;
//    }
//    public static void main(String[] args){
//        Main myObj = new Main(10);
//        System.out.println("Value of x is:"+myObj.x);
//    }
//}

//public class Main{
//    int modelYear;
//    String modelName;
//
//    public Main(String modelName){
//        this(2022,modelName);
//    }
//
//    public Main(int modelYear,String modelName){
//        this.modelYear = modelYear;
//        this.modelName = modelName;
//    }
//
//    public void printInfo(){
//        System.out.println(modelYear + " " + modelName);
//    }
//
//    public static void main(String[] args){
//        Main car1 = new Main("Toyota");
//        Main car2 = new Main(2019,"Nissan");
//
//        car1.printInfo();
//        car2.printInfo();
//    }
//}

//class Person{
//    public String name = "Amayuru";
//    private int age = 26;
//}
//
//public class Main{
//    public static void main(String[] args){
//        Person p = new Person();
//        System.out.println(p.name);
//        System.out.println(p.age);
//    }
//}

/*Java Static*/
//public class Main{
//    static void myStaticMethod(){
//        System.out.println("Static methods can be called without creating objects");
//    }
//    public static void main(String[] args){
//        myStaticMethod();
//        Main.myStaticMethod();
//    }
//}

//abstract class Main{
//    public String fname = "Amayuru";
//    public int age = 24;
//    public abstract void study();
//}
//
//class Students extends Main{
//    public int graduationYear = 2025;
//    public void study(){
//        System.out.println("Study Amayuru Upanith Amarasinghe");
//    }
//    System.out.println(Students.fname);
//}

public class Main{
    public static class Person{
        private String name;

        public String getName(){
            return name;
        }
        public void setName(String newName ){
            this.name = newName;
        }
    }

    public static void main(String[] args){
        Person myObj = new Person();
        myObj.setName("Amayuru");
        System.out.println(myObj.getName());
    }
}