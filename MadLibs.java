public class MadLibs {
  /*
  This program generates a mad libbed story.
  */
  	public static void main(String[] args){
      
      String name1 = "Michael";
      String adjective1 = "self-isolated";
      String adjective2 = "quarantine kind of";
      String adjective3 = "sad";
      String verb1 = "cough";

      String noun1 = "Thug";
      String noun2 = "Literally Anything";
      String noun3 = "BeeGee";
      String noun4 = "Doctor";
      String noun5 = "Toilet paper";
      String noun6 = "Coronavirus";

      String name2 = "Anne";

      int number = 3000;

      String place1 = "Guatemala";


      
      //The template for the story
      String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";


      System.out.println(story);

    }       
}