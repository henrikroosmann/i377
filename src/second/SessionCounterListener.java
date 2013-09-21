package second;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
 
public class SessionCounterListener implements HttpSessionListener {
 
  private static int totalActiveSessions = 0;
 
  public static int getTotalActiveSession(){
	return totalActiveSessions;
  }
 
  @Override
  public void sessionCreated(HttpSessionEvent event) {
	totalActiveSessions++;
  }
 
  @Override
  public void sessionDestroyed(HttpSessionEvent event) {
	totalActiveSessions--;
  }	
}