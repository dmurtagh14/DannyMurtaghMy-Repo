/**This is how you make java doc
 * Order of tags
 * 
 * @author -->author
 * @version -->version
 * @param --> parameter
 * @return --> returns a description
 * 
 * @exception InterupptedException
 * 
 * @since days
 * 
 * @see
 * 
 * in terminal use javadoc <filename>.java
 */

 import java.util.*;

 public class JavaDocCodingChallenge{
     int forrestGump;
     int months = 0;

     void method()throws InterruptedException{
        while(true){
            months++;
            System.out.println("Forrest gump is running");
        }
     }
 }