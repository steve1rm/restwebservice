package sunsystems;

import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import sunsystems.VoiceMessage;

public class VoiceMessageImp implements MessageContract<VoiceMessage> {
    private List<VoiceMessage> mVoiceMessageList = Collections.emptyList();
    
    public VoiceMessageImp() {
        mVoiceMessageList = new ArrayList<>();
    }
    
    @Override
    public String createJSON() {

        if(!mVoiceMessageList.isEmpty()) {
            JSONObject jsonObject = null;
            final JSONArray jsonArray = new JSONArray();

            for(VoiceMessage voiceMessage : mVoiceMessageList) {
                jsonObject = new JSONObject();
                jsonObject.put("user_id", voiceMessage.getmUserId());
                jsonObject.put("ext_num", voiceMessage.getmExtNumber());
                jsonObject.put("voice_id", voiceMessage.getmVoiceId());
                jsonObject.put("voice_status", voiceMessage.getmVoiceStatus());
                jsonObject.put("voice_dttm", voiceMessage.getmVoiceDate());
                jsonObject.put("voice_ani", voiceMessage.getmVoiceAni());
                jsonObject.put("voice_size", voiceMessage.getmVoiceSize());
                jsonObject.put("voice_duration", voiceMessage.getmVoiceDuration());
                jsonObject.put("voice_url", voiceMessage.getmVoiceUrl());

                jsonArray.add(jsonObject);
            }

            jsonObject = new JSONObject();
            jsonObject.put("get_voicemall_msg", jsonArray);
            return jsonObject.toJSONString();
        }
        else {
            return "";
        }
    }

    @Override
    public void createMessageList() {

        VoiceMessage voiceMessage =
            VoiceMessage.getNewInstance("nutapong",
                                        "555",
                                        "39",
                                        "1",
                                        "2015-04-24 03:37:53",
                                        "0000971001",
                                        "112128",
                                        "7707",
                                        "https://www.call-genie.com/users/voicemail/COMP_20140097/voice/rvoice/555201504022307384.wav");
        mVoiceMessageList.add(voiceMessage);

        voiceMessage =
            VoiceMessage.getNewInstance("suwat",
                                        "553",
                                        "29",
                                        "4",
                                        "2016-04-24 03:37:53",
                                        "0000971001",
                                        "112128",
                                        "7707",
                                        "https://www.call-genie.com/users/voicemail/COMP_20140097/voice/rvoice/555201504022307384.wav");
        mVoiceMessageList.add(voiceMessage);

        voiceMessage =
            VoiceMessage.getNewInstance("somsak",
                                        "553",
                                        "29",
                                        "4",
                                        "2016-04-24 03:37:53",
                                        "0000971001",
                                        "112128",
                                        "7707",
                                        "https://www.call-genie.com/users/voicemail/COMP_20140097/voice/rvoice/555201504022307384.wav");
        mVoiceMessageList.add(voiceMessage);
    }

}
