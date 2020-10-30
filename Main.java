import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("What year were your born?");
    int x = scan.nextInt();

    if(x%12 == 0){
      System.out.println("Your zodiac is Monkey.\nMonkey is sharp, smart, and curious.");
    }else if(x%12 == 1){
      System.out.println("Your zodiac is Rooster.\nRooster is observant, hardworking, and courageous");
    }else if(x%12 == 2){
      System.out.println("Your zodiac is Dog. \nDog is lovely, honest, and prudent.");
    }else if(x%12 == 3){
      System.out.println("Your zodiac is Pig. \nPig is compassion, generous, and diligent");
    }else if(x%12 == 4){
      System.out.println("Your zodiac is Rat. \nRat is quick-witted, resourceful, versatile, and kind.");
    }else if(x%12 == 5){
      System.out.println("Your zodiac is Ox. \nOx is diligent, dependable, strong, and  determined");
    }else if(x%12 == 6){
      System.out.println("Your zodiac is Tiger. \nTiger is brave, confident, and competitive");
    }else if(x%12 == 7){
      System.out.println("Your zodiac is Rabbit. \n Rabbit is quiet, elegant, kind, and responsible.");
    }else if(x%12 == 8){
      System.out.println("Your zodiac is Dragon. \nDragon is confident, intelligent, and enthusiastic.");
    }else if(x%12 == 9){
      System.out.println("Your zodiac is Snake. \nSnake is enigmatic, intelligent, and wise.");
    }else if(x%12 == 10){
      System.out.println("Your zodiac is Horse. \nHorse is animated, active, and energetic.");
    }else if(x%12 == 11){
      System.out.println("Your zodiac is Goat. \nGoat is calm, gentle, and sympathetic.");
    }
    
    
    
    
    
    
    
    

    
    
    
    
    


  }
}