package sunsystems;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VoiceMessageController {

    /**
     * @brief Create a new chat group room on openfire
     * @param roomName name of the room you that will be created
     * @param naturalName name of the natural room that will be created
     * @param description the description of the room
     * @return nothing
     */
    @RequestMapping("/voiceMessages")
    public String getAllVoiceMessages() {
        final VoiceMessageContract voiceMessageControl = new VoiceMessageImp();

        voiceMessageControl.createVoiceMessageList();

        return voiceMessageControl.createJSON();
    }
}
