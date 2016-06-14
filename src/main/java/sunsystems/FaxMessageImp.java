package sunsystems;

import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import sunsystems.FaxMessage;

public class FaxMessageImp implements MessageContract<FaxMessage> {
    private List<FaxMessage> mFaxMessageList = Collections.emptyList();
    
    public FaxMessageImp() {
        mFaxMessageList = new ArrayList<>();
    }
    
    @Override
    public String createJSON() {

        if(!mFaxMessageList.isEmpty()) {
            JSONObject jsonObject = null;
            final JSONArray jsonArray = new JSONArray();

            for(FaxMessage faxMessage : mFaxMessageList) {
                jsonObject = new JSONObject();
                jsonObject.put("user_id", faxMessage.getmUserId());
                jsonObject.put("ext_num", faxMessage.getmExtNumber());
                jsonObject.put("voice_id", faxMessage.getmVoiceId());
                jsonObject.put("voice_status", faxMessage.getmVoiceStatus());
                jsonObject.put("voice_dttm", faxMessage.getmVoiceDate());
                jsonObject.put("voice_ani", faxMessage.getmVoiceAni());
                jsonObject.put("voice_url", faxMessage.getmVoiceUrl());

                jsonArray.add(jsonObject);
            }

            jsonObject = new JSONObject();
            jsonObject.put("get_fax_msg", jsonArray);

            return jsonObject.toJSONString();
        }
        else {
            return "";
        }
    }

    @Override
    public void createMessageList() {

        FaxMessage faxMessage =
            FaxMessage.getNewInstance("nutapong_fax",
                                        "555",
                                        "39",
                                        "1",
                                        "2015-04-24 03:37:53",
                                        "0000971001",
                                        "https://www.call-genie.com/users/voicemail/COMP_20140097/voice/rvoice/555201504022307384.tif");
        mFaxMessageList.add(faxMessage);

        faxMessage =
            FaxMessage.getNewInstance("suwat_fax",
                                        "553",
                                        "29",
                                        "4",
                                        "2016-04-24 03:37:53",
                                        "0000971001",
                                        "https://www.call-genie.com/users/voicemail/COMP_20140097/voice/rvoice/555201504022307384.tif");
        mFaxMessageList.add(faxMessage);

        faxMessage =
            FaxMessage.getNewInstance("somsak_fax",
                                        "553",
                                        "29",
                                        "4",
                                        "2016-04-24 03:37:53",
                                        "0000971001",
                                        "https://www.call-genie.com/users/voicemail/COMP_20140097/voice/rvoice/555201504022307384.tif");
        mFaxMessageList.add(faxMessage);
    }

}
