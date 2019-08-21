/*Using Clone() method, Clone 2 objects to have the same 
Integer, and String Value */
class MainCompiler{
    public static void main(String[] args) throws CloneNotSupportedException{
       
       CloneTest ct1 = new CloneTest();

       ct1.x1 = 50;
       ct1.y1 = "Hello!"; 
       ct1.clones.val1 = 42;
       ct1.clones.word1 = "What is the meaning of the universe?"; 


       CloneTest ct2 = (CloneTest)ct1.clone();

       ct2.x1 = 200;
       ct2.clones.word1 = "GoodBYE!"; 


       System.out.println(ct1.x1 + "\n" + ct1.y1 + "\n"+ ct1.clones.val1 + "\n" + ct1.clones.word1);
       System.out.println(ct2.x1 + "\n" + ct2.y1 + "\n" + ct2.clones.val1 + "\n");
   }
}

class Clone1{
    int val1;
    String word1;
}

class CloneTest implements Cloneable{
    int x1;
    String y1;

    Clone1 clones = new Clone1(); 

    public Object clone() throws CloneNotSupportedException{
            return super.clone();
    }
}