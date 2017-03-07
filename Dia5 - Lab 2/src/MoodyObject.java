/**
 * Created by UniCesumar on 07/03/2017.
 */
public abstract class MoodyObject {

    protected abstract String getMood();

    public void queryMood(){
        System.out.println("I fell "+getMood()+" today!");
    }

}
