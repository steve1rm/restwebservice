package sunsystems;

/**
 * Created by steve on 6/9/16.
 */
public class VoiceMessage {
    private String mUserId;
    private String mExtNumber;
    private String mVoiceId;
    private String mVoiceStatus;
    private String mVoiceDate;
    private String mVoiceAni;
    private String mVoiceSize;
    private String mVoiceDuration;
    private String mVoiceUrl;

    private VoiceMessage(String mUserId,
                         String mExtNumber,
                         String mVoiceId, 
                         String mVoiceStatus, 
                         String mVoiceDate, 
                         String mVoiceAni,
                         String mVoiceSize, 
                         String mVoiceDuration, 
                         String mVoiceUrl) {
        this.mExtNumber = mExtNumber;
        this.mUserId = mUserId;
        this.mVoiceAni = mVoiceAni;
        this.mVoiceDate = mVoiceDate;
        this.mVoiceDuration = mVoiceDuration;
        this.mVoiceId = mVoiceId;
        this.mVoiceSize = mVoiceSize;
        this.mVoiceStatus = mVoiceStatus;
        this.mVoiceUrl = mVoiceUrl;
    }

    public static VoiceMessage getNewInstance(String mUserId,
                                              String mExtNumber,
                                              String mVoiceId, 
                                              String mVoiceStatus, 
                                              String mVoiceDate, 
                                              String mVoiceAni,
                                              String mVoiceSize, 
                                              String mVoiceDuration, 
                                              String mVoiceUrl) {
        return new VoiceMessage(mUserId,
                                mExtNumber,
                                mVoiceId, 
                                mVoiceStatus, 
                                mVoiceDate, 
                                mVoiceAni,
                                mVoiceSize, 
                                mVoiceDuration, 
                                mVoiceUrl);
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

    public String getmVoiceDuration() {
        return mVoiceDuration;
    }

    public String getmVoiceId() {
        return mVoiceId;
    }

    public String getmVoiceSize() {
        return mVoiceSize;
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
