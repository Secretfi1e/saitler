public class Main {
    public static void main(String[] args) {


        String [] saitler={"a","ı","o","u","e","ə","i","ö","ü"};

        for (int i=0;i<saitler.length;i++){

            switch(saitler[i]){
                case "a","o","e","ə","ö":
                    System.out.println("qapali");
                    break;
                case"ı","u","i","ü":
                    System.out.println("aciq");
                 break;




        }












    }
}}