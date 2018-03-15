package ca.ualberta.cs.lonelytweet;

import java.util.Date;

public class ImportantLonelyTweet extends LonelyTweet {

	public ImportantLonelyTweet(String text) {
	}

	public ImportantLonelyTweet(String text, Date date) {
		this.tweetDate = date;
		this.tweetBody = text;
	}

	@Override
	public boolean isValid() {
		return !(tweetBody.trim().length() == 0
				|| tweetBody.trim().length() > 20); // simplify this if statement to a return.
	}

	@Override
	public String toString() {

		Log.i("importantLonelyTweet", getTweetDate() + " | " + getTweetBody());
		return getTweetDate() + " | " + getTweetBody() ;
	}

	// simplified to make this private.
	private String getTweetBody() {
        return tweetBody;
    }
}