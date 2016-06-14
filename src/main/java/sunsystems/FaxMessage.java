package sunsystems;

/**
 * Created by steve on 6/9/16.
 */
public class FaxMessage extends BaseMessages {
    private FaxMessage(String mUserId,
                         String mExtNumber,
                         String mVoiceId, 
                         String mVoiceStatus, 
                         String mVoiceDate, 
                         String mVoiceAni,
                         String mVoiceUrl) {

        super(mUserId, mExtNumber, mVoiceId, mVoiceStatus, mVoiceDate, mVoiceAni, mVoiceUrl);
    }

    /**
     * @brief Factory that create a new object of VoiceMessage
     */
    public static FaxMessage getNewInstance(String mUserId,
                                            String mExtNumber,
                                            String mVoiceId, 
                                            String mVoiceStatus, 
                                            String mVoiceDate, 
                                            String mVoiceAni,
                                            String mVoiceUrl) {
        return new FaxMessage(mUserId,
                              mExtNumber,
                              mVoiceId, 
                              mVoiceStatus, 
                              mVoiceDate, 
                              mVoiceAni,
                              mVoiceUrl);
    }

    @Override
    public String toString() {
        return "UserId: " + mUserId + " VoiceAni: " + mVoiceAni + " URL: " + mVoiceUrl;
    }
}
