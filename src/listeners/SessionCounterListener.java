package listeners;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
 
public class SessionCounterListener implements HttpSessionListener {
 
  private static int totalActiveSessions = 0;
 
  @Override
  public void sessionCreated(HttpSessionEvent event) {
	totalActiveSessions++;
  }
 
  @Override
  public void sessionDestroyed(HttpSessionEvent event) {
	totalActiveSessions--;

	// Additional check to prevent cases where browsers are open, but server gets restarted
	if (totalActiveSessions < 0) {
		totalActiveSessions = 0;
	}
  }

  public static int getTotalActiveSession(){
	return totalActiveSessions;
  }
}