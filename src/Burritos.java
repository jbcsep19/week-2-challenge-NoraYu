import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Burritos {
    public static void main(String[] args) {
        Random r = new Random();
        HashMap<String, ArrayList<String>> ingredient = new HashMap<>();
        ArrayList<String> category =new ArrayList<>();
        int r_num1=r.nextInt(5)+5;
        //int r_num2=r.nextInt(a.size())+1;
        ingredients();
        categories();


    }









    private static String burrito(HashMap<String, ArrayList<String>> ingredient){
        Random r = new Random();
        int r_num1=r.nextInt(5)+5;
        for(int i=0;i<r_num1;i++){


        }

    }

    private static int random_unrepeated_items(Integer r_num1){

    }




    private static HashMap<Integer, String>  categories() {
        HashMap<Integer, String> categories = new HashMap<>();
        categories.put(1,"Rice");
        categories.put(2,"Meat");
        categories.put(3,"Beans");
        categories.put(4,"Salsa");
        categories.put(5,"Veggies");
        categories.put(6,"Cheese");
        categories.put(7,"Guac");
        categories.put(8,"Queso");
        categories.put(9,"Sour cream");
        for(Integer k:categories.keySet()){
            System.out.print(k);
            System.out.println(": "+categories.get(k));
        }
        return categories;
    }



    private static ArrayList<String> string_to_Arraylist(String s){
        ArrayList<String> a =new ArrayList<>();
        for(String i:s.split(",")){
            a.add(i);
        }
        return a;
    }

    private static String arraylist_to_string(ArrayList<String> a){
        String s="";
        for(String i:a){
            s=i+" ";
        }
        return s;
    }




    private static HashMap<String, ArrayList<String>> ingredients() {
        HashMap<String, ArrayList<String>> ingredient = new HashMap<>();
        ArrayList<String> category1 =new ArrayList<>();
        ArrayList<String> category2 =new ArrayList<>();
        ArrayList<String> category3 =new ArrayList<>();
        ArrayList<String> category4 =new ArrayList<>();
        ArrayList<String> category5 =new ArrayList<>();
        ArrayList<String> category6 =new ArrayList<>();
        ArrayList<String> category7 =new ArrayList<>();
        ArrayList<String> category8 =new ArrayList<>();
        ArrayList<String> category9 =new ArrayList<>();
        String Rice="white, brown, none, all";
        String Meat= "chicken, steak, carnidas, chorizo, sofritas, veggies, none, all";
        String Beans="pinto, black, none";
        String Salsa="mild, medium, hot, none, all";
        String Veggies="lettuce, fajita veggies, none, all";
        String Cheese="yes no";
        String Guac="yes no";
        String Queso="yes no";
        String Sour_cream="yes no";

        category1=string_to_Arraylist(Rice);
        category2=string_to_Arraylist(Meat);
        category3=string_to_Arraylist(Beans);
        category4=string_to_Arraylist(Salsa);
        category5=string_to_Arraylist(Veggies);
        category6=string_to_Arraylist(Cheese);
        category7=string_to_Arraylist(Guac);
        category8=string_to_Arraylist(Queso);
        category9=string_to_Arraylist(Sour_cream);
        ingredient.put("Rice",category1);
        ingredient.put("Meat",category2);
        ingredient.put("Beans",category3);
        ingredient.put("Salsa",category4);
        ingredient.put("Veggies",category5);
        ingredient.put("Cheese",category6);
        ingredient.put("Guac",category7);
        ingredient.put("Queso",category8);
        ingredient.put("Sour cream",category9);
        for(String k:ingredient.keySet()){
            System.out.println(k+": "+ingredient.get(k));
        }

        return ingredient;

    }
}
