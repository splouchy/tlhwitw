import java.util.List;
import java.util.ArrayList;
public class TheLongestHelloWorldInTheWorld{
  public static void main(String[] aRgumenti){
    System.out.println(new TheLongestHelloWorldInTheWorld().getText());
    return;
  }
  public String getText(){
    if(fText.size()>0){
    return fText.get(fText.size()-1);
    }else{
      return "Hello nobody";
    }
  }
  TheLongestHelloWorldInTheWorld(){
    fText.add("Hi world, how are you today?");
    return;
  }
  private List<String> fText = new ArrayList<String>();
}