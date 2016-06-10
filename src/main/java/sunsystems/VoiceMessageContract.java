package sunsystems;

import java.util.List;

import sunsystems.VoiceMessage;

public interface VoiceMessageContract<T> {
    void createVoiceMessageList();
    String createJSON();
}
