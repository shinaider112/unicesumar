/**
 * Created by UniCesumar on 07/03/2017.
 */
public class MoodyDriver {

    public static void main(String[] args){

        SadObject sadObject = new SadObject();
        HappyObject happyObject = new HappyObject();

        System.out.println("How does the Sad Object feels today?");
        sadObject.queryMood();
        sadObject.cry();
        System.out.println("How does the Happy Object feels today?");
        happyObject.queryMood();
        happyObject.laugh();


    }
}
