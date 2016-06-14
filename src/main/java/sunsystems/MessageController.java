package sunsystems;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    /**
     * @brief Retrieves all the voice messages in json format
     * @return the json string of all voice messages
     */
    @RequestMapping("/voiceMessages")
    public String getAllVoiceMessages() {
        final MessageContract voiceMessageControl = new VoiceMessageImp();

        voiceMessageControl.createMessageList();

        return voiceMessageControl.createJSON();
    }

    /**
     * @brief Retrieves all the fax messages in json format
     * @return the json string of all fax messages
     */
    @RequestMapping("/faxMessages")
    public String getAllFaxMessages() {
        return "";
    }
}
