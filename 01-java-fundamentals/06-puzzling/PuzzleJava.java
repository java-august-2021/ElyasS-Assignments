import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class PuzzleJava {
    public ArrayList<Integer> randomNum (int num){
        ArrayList<Integer> rand_int = new ArrayList<Integer>(); 
        Random rand= new Random();
        
        for(int i=0; i< num; i++){
            rand_int.add(rand.nextInt(20)+1);
            
        }
        return rand_int;
        
    } 


    public String randomAlphabets() {
        Random rand=new Random();
        String alphabeString = "abcdefghijklmnopqrstuvwxyz";
        char randomChar = alphabeString.charAt(rand.nextInt(26));
        return String.valueOf(randomChar);
    }


    public String generatePass(){
        String password = "";
        for(int i = 0; i<8; i++){
            password = password + randomAlphabets();
        }
        return password;
    }


    public ArrayList<String> getNewPass(int length){
        ArrayList<String> passSet = new ArrayList<String>();
        for(int i = 0; i< length; i++){
            passSet.add(generatePass());
        }
        return passSet;
    }
}