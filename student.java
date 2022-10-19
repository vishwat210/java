class student{
String name;
int id;
String college;
void completed4thsem(){
System.out.println(name+" "+id+" completed 4th sem..");
}
void completedwithAgrade(){
System.out.println(name+" "+id+ " completed with A grade..");
}
public static void main(String[] args){
student sham=new student();
sham.name="sham";
sham.id=103;
sham.college="kle";

sham.completed4thsem();
sham.completedwithAgrade();

student ram=new student();
ram.name="ram";
ram.id=100;
ram.college="kle";

ram.completed4thsem();
ram.completedwithAgrade();
}
}