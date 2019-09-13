import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Burritos {
    public static void main(String[] args) {
        HashMap ingredients=ingredients();
        for(int i=1;i<26;i++){
        System.out.println("burrito "+i+": "+burrito(ingredients));}


    }









    private static String burrito(HashMap<String, ArrayList<String>> ingredient){
        String result;
        float price;
        Random r = new Random();
        //5-9的随机数的种类
        do{
            result="";
            price=3;
        int r_num1=r.nextInt(5)+5;
        ArrayList i_list=random_unrepeated_list(r_num1);
        //for(int i=0;i<random_unrepeated_list(r_num1).size();i++){
        for(int i=0;i<i_list.size();i++){
            //选种类
            String c=categories().get(i_list.get(i));
            //有以下内容
            HashMap<String,Integer> items=ingredients().get(c);
            //随机选一种
            int r_num2=r.nextInt(items.size());
            int counter=0;
            for(String k:items.keySet()){
                if(counter==r_num2){
                result+=k+"; ";
                price+=0.5*items.get(k);
                break;}
                else{
                    counter++;
                }
            }}}
            while(price>7.5);
        //System.out.println("price is: $"+price);
        result+="\nprice: $"+price;
        return result;
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
        /*
        for(Integer k:categories.keySet()){
            System.out.print(k);
            System.out.println(": "+categories.get(k));
        }
         */
        return categories;
    }








    private static HashMap<String, HashMap<String,Integer>> ingredients() {
        HashMap<String, HashMap<String,Integer>> ingredient = new HashMap<>();
        HashMap<String,Integer> category1 =new HashMap<String,Integer>();
        HashMap<String,Integer> category2 =new HashMap<String,Integer>();
        HashMap<String,Integer> category3 =new HashMap<String,Integer>();
        HashMap<String,Integer> category4 =new HashMap<String,Integer>();
        HashMap<String,Integer> category5 =new HashMap<String,Integer>();
        HashMap<String,Integer> category6 =new HashMap<String,Integer>();
        HashMap<String,Integer> category7 =new HashMap<String,Integer>();
        HashMap<String,Integer> category8 =new HashMap<String,Integer>();
        HashMap<String,Integer> category9 =new HashMap<String,Integer>();
        String Rice="white, brown, none, all";
        String Meat= "chicken, steak, carnidas, chorizo, sofritas, veggies, none, all";
        String Beans="pinto, black, none";
        String Salsa="mild, medium, hot, none, all";
        String Veggies="lettuce, fajita veggies, none, all";
        String Cheese="yes no";
        String Guac="yes no";
        String Queso="yes no";
        String Sour_cream="yes no";


        category1.put("white rice",1);
        category1.put("brown rice",1);
        category1.put("no rice",0);
        category1.put("brown rice, white rice",2);
        category2.put("chicken",1);
        category2.put("steak",1);
        category2.put("carnidas",1);
        category2.put("chorizo",1);
        category2.put("sofritas",1);
        category2.put("veggies",1);
        category2.put("no meat",0);
        category2.put("chicken, steak, carnidas, chorizo, sofritas, veggies",6);
        category3.put("pinto beans",1);
        category3.put("black beans",1);
        category3.put("no beans",0);
        category4.put("mild salsa",1);
        category4.put("medium salsa",1);
        category4.put("hot salsa",1);
        category4.put("no salsa",0);
        category4.put("mild salsa, medium salsa, hot salsa",3);
        category5.put("lettuce, fajita veggies",2);
        category5.put("lettuce",1);
        category5.put("fajita veggie",1);
        category5.put("no Veggies",0);
        category6.put("Cheese",1);
        category6.put("no Cheese",0);
        category7.put("no Guac",0);
        category7.put("Guac",1);
        category8.put("Queso",1);
        category8.put("no Queso",0);
        category9.put("Sour cream",1);
        category9.put("no Sour cream",0);



        ingredient.put("Rice",category1);
        ingredient.put("Meat",category2);
        ingredient.put("Beans",category3);
        ingredient.put("Salsa",category4);
        ingredient.put("Veggies",category5);
        ingredient.put("Cheese",category6);
        ingredient.put("Guac",category7);
        ingredient.put("Queso",category8);
        ingredient.put("Sour cream",category9);
        /*
        for(String k:ingredient.keySet()){
            System.out.println(k+": "+ingredient.get(k));
        }
         */
        return ingredient;

    }
    //  有r_num1个 内容为1-9 的整数array
    private static ArrayList<Integer> random_unrepeated_list(Integer r_num1){
        Random r=new Random();
        int r_item=r.nextInt(9)+1;
        ArrayList<Integer>  i_list=new ArrayList<Integer>();
        ArrayList<Integer> base=new ArrayList<>();
        //generate 1-9 int list
        for(int i=1;i<10;i++){
            base.add(i);
        }
        while(i_list.size()<r_num1){
            //1-9的随机数作为内容
            r_item=r.nextInt(9)+1;
            //System.out.println("r_item"+r_item);
            if(base.contains(r_item)){
                i_list.add(r_item);
                //System.out.println("i_list size: "+i_list.size());
                //要删除的不是index。是内容
                base.remove(new Integer(r_item));
                //System.out.println("base size: "+base.size());
            }
            else{continue;
            }
        }
        /*
        for(int i=0;i<i_list.size();i++){
            System.out.print(i_list.get(i));}
         */
        return i_list;
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
}
