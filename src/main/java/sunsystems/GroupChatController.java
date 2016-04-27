package sunsystems;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sunsystems.xmppRestAPI.GroupChat;
import com.sunsystems.xmppRestAPI.RestXmppGroup;

@RestController
public class GroupChatController {

    /**
     * @brief Create a new chat group room on openfire
     * @param roomName name of the room you that will be created
     * @param naturalName name of the natural room that will be created
     * @param description the description of the room
     * @return nothing
     */
    @RequestMapping("/createGroupChatRoom")
    public GroupChat createGroupChatRoom(@RequestParam(value="roomName", defaultValue="") String roomName,
                                         @RequestParam(value="naturalName", defaultValue="") String naturalName,
                                         @RequestParam(value="description", defaultValue="") String description) {

        new RestXmppGroup().createGroupChatRoom(roomName, naturalName, description);
        
        return new GroupChat(roomName, naturalName, description);
    }

    /**
     * @brief delete a group chat room
     * @param roomName room that will be deleted
     */
    @RequestMapping("/deleteGroupChatRoom")
    public void deleteGroupChatRoom(@RequestParam(value="roomName", defaultValue="") String roomName) {
        new RestXmppGroup().deleteGroupChatRoom(roomName);
    }

    /**
     * @brief Add user with the role 'member' to the chat room
     * @param roomName the name of the group chat room
     * @param userName the username that will be added to the chat room
     * @return nothing
     */
    @RequestMapping("/addMemberToChatRoom")
    public void addMemberToChatRoom(@RequestParam(value="roomName", defaultValue="") String roomName,
                                    @RequestParam(value="username", defaultValue="") String username) {
        new RestXmppGroup().addMemberToChatRoom(roomName, username);
    }

    /**
     * @brief Add user with the role 'outcast' to the chat room
     * @param roomName the name of the group chat room
     * @param userName the username that will be added to the chat room
     * @return nothing
     */
    @RequestMapping("/addOutcastToChatRoom")
    public void addOutcastToChatRoom(@RequestParam(value="roomName", defaultValue="") String roomName,
                                    @RequestParam(value="username", defaultValue="") String username) {
        new RestXmppGroup().addOutcastToChatRoom(roomName, username);
    }
    
}
