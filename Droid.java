public class Droid {

  String name;
  int batteryLevel;


public Droid(String droidName) {

name = droidName;
batteryLevel = 100;

 }


 public String toString() {
   return "Ahoy there, my name is " + name; 
 }


 public void performTask(String task){

    System.out.println(name + " is currently performing this task: " + task);
    batteryLevel -= 10;

 }



  public static void main(String[] args) {

    Droid marvin = new Droid("Marvin");


    System.out.println(marvin);

    System.out.println(marvin.batteryLevel);
    marvin.performTask("self-isolating");
    System.out.println(marvin.batteryLevel);


  }

}