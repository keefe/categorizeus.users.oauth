ON HOLD due to annoying java api split due to google+ impl, revisit this later with a proper implementation and put the initial into naive.users

note to self, servlet version differences cause this dream :


2019-01-04 17:48:27.790:WARN:oejs.HttpChannel:qtp1919892312-17: //localhost:8080/
java.lang.NoSuchMethodError: javax.servlet.http.HttpServletRequest.isAsyncStarted()Z
	at org.eclipse.jetty.servlet.ServletHandler.doHandle(ServletHandler.java:687)
	at org.eclipse.jetty.server.session.SessionHandler.doHandle(SessionHandler.java:224)
	at org.eclipse.jetty.server.handler.ContextHandler.doHandle(ContextHandler.java:1174)
	at org.eclipse.jetty.servlet.ServletHandler.doScope(ServletHandler.java:511)
	at org.eclipse.jetty.server.session.SessionHandler.doScope(SessionHandler.java:185)
	at org.eclipse.jetty.server.handler.ContextHandler.doScope(ContextHandler.java:11


# categorizeus.users.oauth
OAuth2 authentication package, first implementation google api

# Auth Overview

# Google implementation

https://developers.google.com/api-client-library/java/google-api-java-client/oauth2#web_server_applications

https://developers.google.com/api-client-library/java/

There's some heinous confusion going on with google implementation due to Google+ deprecation let's just leave this as it is incidental to the main project.

!$^)(&#)$^(&@#$^(& come back to this later

## Instructions

  1. Setup Google OAuth2 Account
