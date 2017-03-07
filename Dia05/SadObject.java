/**
 * Created by UniCesumar on 07/03/2017.
 */
public class SadObject extends MoodyObject{

    @Override
    public String getMood(){
        return "sad";
    }

    public void cry(){
        System.out.println("boo hoo");
    }

}
