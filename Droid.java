public class Droid {
  String name;
  int batteryLevel;
  int i; 
  public Droid(String droidName){
    name = droidName;
    batteryLevel = 100;
  }
  public String toString(){
    return "Hello, I’m the droid: " + name + "\n";
  }
  public void performTask(String task){
System.out.println("Old battery level was at: "+ batteryLevel+"%");
System.out.println(name + " is performing task: "+ task);
int newLevel = batteryLevel - 10;
batteryLevel = newLevel;
System.out.println("New battery level is: "+ batteryLevel +"%"+"\n");
i++;
  }
  public void energyReport(){
System.out.println("Energy report:");
System.out.println("There has been " + i+" tasks already on " + name);
System.out.println("At first the battery level was at 100%, but now it is at " + batteryLevel +"%");
System.out.println("The amount of battery used was " + (100 -batteryLevel) +"%");

  }
  public static void main(String[] args) {
Droid robot = new Droid("Codey");
System.out.println(robot);
robot.performTask("dancing");
robot.performTask("walking the dogs");
robot.energyReport();
robot.performTask("cooking");
robot.performTask("cleaning");
robot.performTask("babysitting");
robot.energyReport();
  }
}