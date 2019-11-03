
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Validation {
  public static boolean Hotel (String email)
  {
      boolean status=false;
      String email_Pattern="^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z]{2,})$";
      Pattern pattern=Pattern.compile(email_Pattern);
      Matcher matcher=pattern.matcher(email);
      if(matcher.matches())
      {
          status=true;
      }
      else
      {
          status=false;
      }
      return status;
  }
}
