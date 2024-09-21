public class Controlstatement {
  public static void main(String args[]) {
    // int x = 10 ;
    // int y = 12 ;
    // // if statement
    // if ( x + y > 20 ){
    // System.out.println(" x + y is greater than 20 ");
    // }
    // // if else statement
    // if ( x + y < 10 ){
    // System.out.println(" x + y is less than 20 ");
    // }
    // else {
    // System.out.println(" x + y is greater than 20");
    // }

    // if elseif ladder

    // String city = "Delhi";
    // if ( city == "Meerut"){
    // System.out.println("City is Meerut");
    // }
    // else if ( city == "Prayagraj"){
    // System.out.println("City is Prayagraj");
    // }
    // else if ( city == "Gurgaon"){
    // System.out.println("City is Gurgaon");
    // }
    // else {
    // System.out.println(city);
    // }

    // Nested if else
    // 
    
    //Switch Statement
    int month = 4;
    String season;

    switch (month){
      case 12:
      case 1:
      case 2:
      season = "winter";
      break;
      case 3:
      case 4:
      case 5:
      season = "spring";
      break;
      case 6:
      case 7:
      case 8:
      season = "summer";
      break;
      case 9:
      case 10:
      case 11:
      season = "autumn";
      break;
      default:
      season = "Invalid Match";
      break;
    }
System.out.println(season);
  }
}
