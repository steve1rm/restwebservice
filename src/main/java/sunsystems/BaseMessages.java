package sunsystems;

/**
 * Created by steve on 6/9/16.
 */
public class BaseMessages {
    protected String mUserId;
    protected String mExtNumber;
    protected String mVoiceId;
    protected String mVoiceStatus;
    protected String mVoiceDate;
    protected String mVoiceAni;
    protected String mVoiceUrl;

    public BaseMessages(String mUserId,
                         String mExtNumber,
                         String mVoiceId, 
                         String mVoiceStatus, 
                         String mVoiceDate, 
                         String mVoiceAni,
                         String mVoiceUrl) {
        this.mExtNumber = mExtNumber;
        this.mUserId = mUserId;
        this.mVoiceAni = mVoiceAni;
        this.mVoiceDate = mVoiceDate;
        this.mVoiceId = mVoiceId;
        this.mVoiceStatus = mVoiceStatus;
        this.mVoiceUrl = mVoiceUrl;
    }

    public String getmExtNumber() {
        return mExtNumber;
    }

    public String getmUserId() {
        return mUserId;
    }

    public String getmVoiceAni() {
        return mVoiceAni;
    }

    public String getmVoiceDate() {
        return mVoiceDate;
    }

    public String getmVoiceId() {
        return mVoiceId;
    }

    public String getmVoiceStatus() {
        return mVoiceStatus;
    }

    public String getmVoiceUrl() {
        return mVoiceUrl;
    }

    @Override
    public String toString() {
        return "UserId: " + mUserId + " VoiceAni: " + mVoiceAni + " URL: " + mVoiceUrl;
    }
}
