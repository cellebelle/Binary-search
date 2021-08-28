
public class BinarySearch{
  //En algoritme for binary search
  public static int BinarySearch(int[] arr, int key, int low, int high) {
  
    //Returnere -1 hvis key ikke er til stede i vores array
    int index = -1;

    while (low <= high){ //Den sørger for at "high" ikke er lavest
        int mid = (low + high) / 2; //Her tager man gennemsnitet af low og high, for at finde midten
        
        if (key < arr[mid]){ //Her tager man tallet, som er i midten, og tjekker om den er højre end, mindre end eller er lig med
          high = mid - 1;
        }
        else if (key > arr[mid]){
          low = mid + 1;
        }
        else if (key == arr[mid]){
          index = mid;
          break; // Den sørger for at while ikke kører længere
      }
    }
    return index; // Den returner "mid" 

  }
public static void main(String[] args){ // void setup, 
int[] arr = {5,10,15,20,25,30,35,40}; //arrayliste med numre
int key = 35; //Key er det vi skal finde
int low = 0; //Grunden til at den er 0 er fordi, alle arraylister´s første plads er 0
int high = arr.length-1; //I arraylisten er der 8 pladser, og derfor kan man sige arr.length-1

int index = BinarySearch(arr, key, low, high); //her tjekker vi så, om BinarySearch har sat index til enten -1, eller et andet tal

if (index == -1){
  System.out.println(key+" ikke tilstede "); //hvis index = -1, så får vi af vide, at key ikke indgår i selve arraylisten
}
else 
  System.out.println(key+" er tilstede på plads nr.6 "+index); //ellers får vi af vide hvad tallet er, samt hvilket index(plads) det står på

}

}

//Noter v
//low og high er pladser på arraylisten
//Public betyder at metoden vil blive synlig og kan blive kaldt fra andre typer objekter
//Static betyder at metoden er associeret med klassen, ikke en specifik objekt fra klassen
//args: arguements - 
//