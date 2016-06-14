package sunsystems;

/**
 * Created by steve on 6/9/16.
 */
public class VoiceMessage extends BaseMessages {
    private String mVoiceSize;
    private String mVoiceDuration;

    private VoiceMessage(String mUserId,
                         String mExtNumber,
                         String mVoiceId, 
                         String mVoiceStatus, 
                         String mVoiceDate, 
                         String mVoiceAni,
                         String mVoiceSize, 
                         String mVoiceDuration, 
                         String mVoiceUrl) {
        super(mUserId, mExtNumber, mVoiceId, mVoiceStatus, mVoiceDate, mVoiceAni, mVoiceUrl);

        this.mVoiceDuration = mVoiceDuration;
        this.mVoiceSize = mVoiceSize;
    }

    /**
     * @brief Factory that create a new object of VoiceMessage
     */
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

    public String getmVoiceDuration() {
        return mVoiceDuration;
    }

    public String getmVoiceSize() {
        return mVoiceSize;
    }

    @Override
    public String toString() {
        return "UserId: " + mUserId + " VoiceAni: " + mVoiceAni + " URL: " + mVoiceUrl;
    }
}
