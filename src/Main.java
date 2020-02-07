public class Main {
    public  void main(String[] args) throws Exception {
        Code c=new Code();
        c.setFileObject(new Input());
        boolean result=c.vowelOrConsonant();
        if(result){
            System.out.println("Vowel");
        }
        else{
          System.out.println("consonant");
       }
    }

}
