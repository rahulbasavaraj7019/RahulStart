public class charac {
    public static void main(String[] args) {
        
    
    String su="surya surya";
    int mid= su.length()/2 ;
    if(mid>su.length()){
        System.out.println("");
    }
    if(mid<su.length()){
        for(int i=mid;i< su.length();i++)
      if(Character.isUpperCase(su.charAt(i))){
        System.out.println(i);
      }
    }
}




    
}
