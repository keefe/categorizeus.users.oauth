package us.categorize.users.oauth;

import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.testing.http.MockHttpTransport;

public class OAuthTest {
	  /** Global instance of the HTTP transport. */
	  static final HttpTransport HTTP_TRANSPORT = new MockHttpTransport();

	  /** Global instance of the JSON factory. */
	  static final JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
