// ////Linear Search and Binary Search
// public class Test {
//     public static int search(int arr[], int n, int x){
//         for(int i=0; i<n;i++){
//             if (arr[i]==x)
//                 return i;
//         }
//         return -1;
//     }
//     public static int binarySearch(int arr[], int n, int x){
//         int left = 0;
//         int right = n-1;
//         while (left <= right){
//             int mid = (left + right)/2;
//             if (arr[mid] == x)
//                 return mid;
//             else if (x > arr[mid])
//                 left = mid + 1;
//             else if (x < arr[mid])
//                 right = mid -1;
//         }
//         return -1;
//     }
//     public static void main (String [] args){
//         int arr[] = {4,5,6,7,3,1,0};
//         int x = 5;
//         int result = search(arr, arr.length, x);
//         if (result == -1)
//             System.out.println("Value does not exist in the array");
//         else
//             System.out.println("Value is found at index " + result );
//         int arr1[] = {0,1,2,3,4,5,6,9,11}; 
//         int resultBS = binarySearch(arr1, arr1.length, x);
//         if (resultBS == -1)
//             System.out.println("The value is not found in the array");
//         else 
//             System.out.println("The value is found at index " + resultBS);
//     }
// }


// public class Test {
//     public static void main (String [] args){
//         StringBuffer sb = new StringBuffer("KJ");
//         sb.append(" The GOAT");
//         String str = sb.toString();
//         System.out.println(str);    
//     }
// }


// class Mobile {
//     // instance variables
//     String brand;
//     int price;

//     //static var
//     static String name; // class member not an obj member

//     // Static block - called first and only once 
//     static {
//         name ="Phone";
//         System.out.println("in static block");
//     }
//     //Constructor to initialize the instance vars
//     // public Mobile() {
//     //     brand = "Pixel";
//     //     price = 50000;
//     //     System.out.println("in constructor");
//     // }

//     public void show() {
//         System.out.println(brand + " : " + price + " : " + name);
//     }

//     public static void show1() {
//         System.out.println("in static method");
//     }
// }


// public class Test {
//     public static void main(String a[]) {

//         // Class.forName("Mobile");    //to load the class

//         // Mobile obj = new Mobile();
//         // obj.brand = "Apple";
//         // obj.price = 100000;
//         // Mobile.name = "smartPhone"; // static vars should be accessed with class name not obj name

//         // Mobile obj2 = new Mobile();
//         // obj2.brand = "Samsung";
//         // obj2.price = 80000;

//         // obj.show();
//         // obj2.show();
//         Mobile.show1();
        
//     }
// }

// //Encapsulation, this keyword and Constructors
// class Human {
//     private int age;
//     private String name;
//     //Constructor(assigns default values) special method which has same name as class name, does not return anything
//     public Human() {    //default constructor
//         System.out.println("In Constructor");
//         age = 12;
//         name = "John";
//     }

//     public Human(int a, String n) { // parameterized constructor
//         age = a;
//         name = n;
//     }

//     public int getAge() {
//         return age;
//     }
//     public void setAge(int age) {
//         this.age = age;
//     }
//     public String getName() {
//         return name;
//     }
//     public void setName(String name) {
//         this.name = name;
//     }
// }

// class Test{
//     public static void main(String a[]) {
//         Human obj = new Human();
//         Human obj2 = new Human(11, "Kumar"); 
//         // obj.setAge(32);
//         // obj.setName("KJKJ");
//         System.out.println(obj.getAge() + " : " + obj.getName());
//         System.out.println(obj2.getAge() + " : " + obj2.getName());
//     }
// }

// class A extends Object{     //every class in Java extends Object
//     public A() {
//         super();
//         System.out.println("In A");
//     }
//     public A(int n){
//         System.out.println("In A int");
//     }
// }

// class B extends A {
//     public B() {
//         System.out.println("In B");
//     }
//     public B(int n) {
//         // super(7);           //default in every constructor
//         this();
//         System.out.println("in B int");
//     }
// }


// class Test {
//     public static void main(String [] Args) {
//         B obj = new B(5);
//         // System.out.println();
//     }
// } 


// class A {
//     public void show() {
//         System.out.println("In A show");
//     }
// }
// //Anonymous Inner Class Test$1 class file created after compilation
// public class Test{
//     public static void main(String [] Args){
//         A obj = new A(){
//             public void show() {
//                 System.out.println("In new show");
//             }
//         };
//         obj.show();
//     }
// }


//Anonymous Inner class can be used with abstract class as well
// abstract class A{
//     public abstract void show();
// }
// public class Test{
//     public static void main(String a[]){
//         A obj = new A() {
//             public void show() {
//             System.out.println("In anonymous inner class"); 
//             }
//         };
//         obj.show();
//     }
// }


// // Interview Ques Solved
// class Marker{
//     private String color;

//     public Marker(String color) {
//         this.color = color;
//     }

//     public String getColor() {
//         return color;
//     }

//     public void setColor(String color) {
//         this.color = color;
//     }
// }
// public class Test{
//     public static void main(String[] args) {
//         Marker[] markers = new Marker[8];

//         String[] colors = {"Red","Blue","Green","Yellow","Orange","Cyan","Violet","Black"};

//         for(int i=0; i< markers.length;i++){
//             markers[i] = new Marker(colors[i]);
//         }

//         for(int i=0; i<markers.length;i++){
//             System.out.println("Marker " + i + ": " + markers[i].getColor());
//         }
//     }
// }

// //Interface
// interface Computer{
//     void run();
// }

// class Laptop implements Computer{
//     public void run(){
//         System.out.println("In Laptop");
//     }
// }
// class Desktop implements Computer{
//     public void run(){
//         System.out.println("In Desktop");
//     }
// }

// class Developer{
//     public void devApp(Computer desktop){
//         desktop.run();
//     }
// }

// public class Test{
//     public static void main(String[] args) {
//         Computer lap = new Laptop();
//         Computer desk = new Desktop();
        
//         Developer dev = new Developer();
//         dev.devApp(desk);
//     }
// }
//All vars in interface are by default final and static
//All methods in interface are by default public and abstract
//Interface can extend another interface
//Class can implement multiple interfaces - you need to define all methods

// //Enums - named constants
// enum Status{
//     Running, Success, Failed, Loading;
// }
// public class Test{
//     public static void main(String[] args) {
//         // Status s = Status.Running;
//         // System.out.println(s.ordinal());
//         // Status[] s1 = Status.values();
//         // for(Status ss : s1)
//         // System.out.println(ss + " : " + ss.ordinal());
//         Status s = Status.Success;
//         System.out.println(s.getClass().getSuperclass());
//         switch (s) {
//             case Running:
//                 System.out.println("Code is running");
//                 break;
//             case Failed:
//                 System.out.println("Try again");
//                 break;
//             case Loading:
//                 System.out.println("Please Wait");
//             default:
//                 System.out.println("Done");
//                 break;
//         }
//     }
// }

// enum Laptop{
//     Apple(2000), Dell(), HP(1850);
    
//     private int price;

//     private Laptop(int price) {
//         this.price = price;
//     }

//     private Laptop() {
//         this.price = 900;
//     }

//     public int getPrice() {
//         return price;
//     }

//     public void setPrice(int price) {
//         this.price = price;
//     }
// }
// public class Test{
//     public static void main(String[] args) {
//         Laptop lap = Laptop.Dell;
//         // System.out.println(lap + " : " + lap.getPrice());
//         lap.setPrice(1000);
//         for (Laptop l : Laptop.values())
//         System.out.println(l + " : " + l.getPrice());
//     }
// }

// //Types of Interfaces
// @FunctionalInterface
// interface A {
//     // void show(int i, double j);
//     // void run(String s);
//     void sing();
// }
// public class Test{
//     public static void main(String[] args) {
//         // -> lambda expression(works with only with the Functional Interface) implementing anonymous inner class - does not create Test$1 class file
//         // A obj = (k, l) -> System.out.println("Hey " + k + l); 
//         // obj.show(5, 7);
//         // A obj1 = string -> System.out.println("Hey it's me... " + string);
//         // obj1.run("KJ");
//         A obj2 = () -> System.out.println("Kumar Sanu... 'Hey Hey' ");
//         obj2.sing();
//     }
// }

//Exceptions - try,catch, throw, inbuilt exceptions and custom made exceptions
// class KJException extends Exception{
//     public KJException(String s){
//         super(s);
//     }
// }
// public class Test{
//     public static void main(String[] args) {
//         int i = 20;
//         int j = 0;
//         try {
//             j = 18/i;
//             if (j==0){
//                 throw new KJException("YOYO");
//             }
//         }
//         catch(KJException e) {
//             System.out.println("Oops");
//             System.out.println(e);
//         }
//         // catch(Exception e){
//         //     System.out.println("Something Went Wrong " + e);
//         // }

//         System.out.println(j);
//         System.out.println("End");
//     }
// }

//throws - ducking the exception temporarily
// class A{
//     public int show(int i, int j) throws ArithmeticException {
//         int k = 0;
//         k = i/j;
//         return k;
//     }
// }
// public class Test{
//     public static void main(String[] args) {
//         A obj = new A();
//         try{
//             obj.show(5,0);        
//         }
//         catch(ArithmeticException e){
//             System.out.println("Arrr... " + e);
//             // e.printStackTrace(); //shows the method calls
//         }
//     }
// }

//Taking input 
//1. System.in
// import java.io.IOException;
// public class Test{
//     public static void main(String[] args) {
//         System.out.println("Enter a number: ");
//         try {
//             int num = System.in.read();
//             System.out.println(num);
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }
// }
//2. Buffered Reader - it is a resource, so always close it after use
// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// public class Test {
//     public static void main(String[] args) {
//         try{
//             InputStreamReader isr = new InputStreamReader(System.in);
//             BufferedReader br = new BufferedReader(isr);
//             System.out.println("Enter a number");
//             int num = Integer.parseInt(br.readLine());
//             System.out.println(num);
//             br.close();
//         }
//         catch(Exception e){
//             System.out.println(e);
//         }
//     }
// }
//3. Scanner
// import java.util.Scanner;

// public class Test{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         System.out.println(num);
//         sc.close();
//     }   
// }

// //finally - to close the resources
// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// public class Test{
//     public static void main(String[] args) throws NumberFormatException, IOException {
//         BufferedReader br = null;
//         int num = 0;
//         try {
//             br = new BufferedReader(new InputStreamReader(System.in));
//             num = Integer.parseInt(br.readLine());
//             System.out.println(num);
//         }
//         finally{
//             br.close();
//         }
//         // try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) //this syntax auto closes resources(here br)
//         // {
//         //     System.out.println("Enter a number ");
//         //     int num = Integer.parseInt(br.readLine());
//         //     System.out.println(num);
//         // }
//     }
// }

// //Threads
// class A extends Thread{
//     public void run() {
//         for(int i=1; i<=100; i++)
//         System.out.println("Hey ");
//         try {
//             Thread.sleep(500);
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }
//     }
// }
// class B extends Thread{
//     public void run() {
//         for(int i=1; i<=100; i++)
//         System.out.println("Hi ");
//         try {
//             Thread.sleep(500);
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }
//     }
// }
// public class Test{
//     public static void main(String[] args) {
//         A obj = new A();
//         B obj2 = new B();

//         obj.start();
//         obj2.start();
//     }
// }
//Threads Running in Parallel using Runnable
// public class Test{
//     public static void main(String[] args) {
//         Runnable obj = () -> {
//             for(int i=1;i<5;i++)
//             System.out.println("Hey");
//         };
//         Runnable obj2 = () -> {
//             for(int i=1;i<5;i++)
//             System.out.println("Hi");
//         };

//         Thread t1 = new Thread(obj);
//         Thread t2 = new Thread(obj2);
//         t1.start();
//         t2.start();
//     }
// }

//Hashtable is synchronized HashMap. If you need to run multiple threads with HashMap, use synchronized externally
// import java.util.HashMap;
// import java.util.Map;
// public class Test {
//     public static void main(String [] Args){
//         Map<String, Integer> students = new HashMap<String, Integer>();
//         students.put("KJ", 123);
//         students.put("AY", 456);
//         students.put("YK", 789);

//         System.out.println(students.keySet());
//         for(String name : students.keySet())
//         System.out.println(name + " " + students.get(name));

//     }
// }

// //Comparator 
// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Comparator;
// import java.util.List;

// class Student{
//     int age;
//     String name;

//     public Student(int age, String name) {
//         this.age = age;
//         this.name = name;
//     }

//     @Override
//     public String toString() {
//         return "Student [age=" + age + ", name=" + name + "]";
//     }   
// }

// public class Test{
//     public static void main(String[] args) {
//         // Comparator<Student> com = new Comparator<Student>(){
//         //     public int compare(Student s1, Student s2) {
//         //         if(s1.age > s2.age)
//         //             return 1;
//         //         else 
//         //             return -1;
//         //     }
//         // };
//         //Reducing Code using Lambda Expression since Comparator is Functional Interface
//         Comparator<Student> com = (Student s1, Student s2) -> s1.age > s2.age?1:-1;
//         List<Student> studs = new ArrayList<>();
//         studs.add(new Student(80,"KJ"));
//         studs.add(new Student(30,"NR"));
//         studs.add(new Student(10,"GB"));
//         Collections.sort(studs, com);
//         for(Student s : studs)
//         System.out.println(s);
//     }
// }

//Comparable
// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.List;

// class Student implements Comparable<Student>{
//     int age;
//     String name;

//     public Student(int age, String name) {
//         this.age = age;
//         this.name = name;
//     }

//     @Override
//     public String toString() {
//         return "Student [age=" + age + ", name=" + name + "]";
//     }

//     @Override
//     public int compareTo(Student o) {
//         if(this.age > o.age)
//             return 1;
//         else
//             return -1;
//     }   
// }

// public class Test{
//     public static void main(String[] args) {
//         List<Student> studs = new ArrayList<>();
//         studs.add(new Student(80,"KJ"));
//         studs.add(new Student(30,"NR"));
//         studs.add(new Student(10,"GB"));
//         Collections.sort(studs);
//         for(Student s : studs)
//         System.out.println(s);
//     }
// }

// import java.util.Arrays;
// import java.util.List;
// import java.util.stream.Stream;

// public class Test {
//     public static void main(String [] args) {
//         List<Integer> list = Arrays.asList(2,4,1,3,7,9);
//         // Stream<Integer> s = list.stream();
//         // Stream<Integer> s1 = s.filter(t -> t%2==0);
//         // Stream<Object> s2 = s1.map(x -> Math.pow(x, 3));
//         // s2.forEach(n -> System.out.println(n));
//         // int s = list.stream()
//         //     .filter(n -> n%2==0)
//         //     .map(x -> x+1)
//         //     .reduce(0, (a,b)-> a+b);
//         // System.out.println(s);
//     }
// }

public class Test{
    public static void main(String[] args) {
        System.out.println("Git Revision");
    }
   
    @Override
    public String toString() {
        return "Test []";
    }
}

//experiment
