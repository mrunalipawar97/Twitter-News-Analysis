package app.ml;

import app.model.Tweet;

/**
 * @author mrunalipawar
 */
public interface TweetClassifier {
    public boolean isRumor(Tweet tweet);
}
