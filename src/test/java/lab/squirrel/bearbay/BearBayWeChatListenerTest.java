package lab.squirrel.bearbay;

import lab.squirrel.pojo.CallbackMsgText;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BearBayWeChatListenerTest {
    @Test
    public void onFollowing() throws Exception {
        BearBayWeChatListener bearBay = new BearBayWeChatListener();
        CallbackMsgText msg = (CallbackMsgText) bearBay.onFollowing("id", true);
        assertEquals("id:欢迎, 我们有最年轻的海鲜", msg.getContent());
    }

}
