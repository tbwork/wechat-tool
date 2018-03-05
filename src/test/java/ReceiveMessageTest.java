import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.tbwork.wechat.aes.WXBizMsgCrypt;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

public class ReceiveMessageTest {

public static void main(String[] args) throws Exception {
		
		String fromXML = "<xml><AppId><![CDATA[wx054fc52e42a2d758]]></AppId><Encrypt><![CDATA[yTHN3sBsPITDT+lrAN7cGwW5TKoCZT14RN6FyeEOnvcGDrot8wazId3kxCS/HY0QJze13RhxXsBJiBr49IvUi8sefjeHSEqf/jswFEpfZaNqxY1goxRWpWzbnyUdM+0cfiSxmc/NjfOBxr9gj6sbyoVRc28QyxAJl3VVwJOnW3iQ71dRWOWX29UsXDpe4MzzEBgelpjrGF9wFd2C8fL4ORprR27BwX9HlsjYU0BxCT8nk3X+Ct6+orfLKCnWSIPaQd6Zc+xUdgaJtxORkcYYP00r7dss6xjxndYLOtzZ/myHxRp9bYYWjJOKSs1GFmhbmXRXy6ydnYYFYwbFV29WMrz4Jo59c4RX7Xfp5Alw2JjvJAgi8AEkuH/iglSJ+IbhNue560SdwTv7AxxocCx8PNgTNCFvjtRVf12q3t+1qR1+AwEtu5s68rWXpTlEdyK3eKOq5x8gzIvBeq4r81u33g==]]></Encrypt> </xml> ";
		String fromXML2 = "<xml><AppId>wx054fc52e42a2d758</AppId><Encrypt>yTHN3sBsPITDT+lrAN7cGwW5TKoCZT14RN6FyeEOnvcGDrot8wazId3kxCS/HY0QJze13RhxXsBJiBr49IvUi8sefjeHSEqf/jswFEpfZaNqxY1goxRWpWzbnyUdM+0cfiSxmc/NjfOBxr9gj6sbyoVRc28QyxAJl3VVwJOnW3iQ71dRWOWX29UsXDpe4MzzEBgelpjrGF9wFd2C8fL4ORprR27BwX9HlsjYU0BxCT8nk3X+Ct6+orfLKCnWSIPaQd6Zc+xUdgaJtxORkcYYP00r7dss6xjxndYLOtzZ/myHxRp9bYYWjJOKSs1GFmhbmXRXy6ydnYYFYwbFV29WMrz4Jo59c4RX7Xfp5Alw2JjvJAgi8AEkuH/iglSJ+IbhNue560SdwTv7AxxocCx8PNgTNCFvjtRVf12q3t+1qR1+AwEtu5s68rWXpTlEdyK3eKOq5x8gzIvBeq4r81u33g==</Encrypt> </xml> ";
		String fromXML3 = "<note><to>George</to><from>John</from><heading>Reminder</heading><body>Don't forget the meeting!</body></note>";
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder(); 
		StringReader sr = new StringReader(fromXML);
		InputSource is = new InputSource(sr);
		Document document = db.parse(is);
		 
		//
		// 公众平台发送消息给第三方，第三方处理
		//

		// 第三方收到公众号平台发送的消息
		String token = "6z7nm0m0t";
		String encodingAesKey = "jxWGeNqw7SPFNnMJuDeNbjaeWEXUh8cWmu8AosCoQZ4";
		String appId = "wx054fc52e42a2d758";
		WXBizMsgCrypt pc = new WXBizMsgCrypt(token, encodingAesKey, appId); 
		String result2 = pc.decryptMsg("95792dacc5f3d57ccaafb58c2e710e855f7b2a3c", "1520229709", "525972269", fromXML2);
		System.out.println("解密后明文: " + result2);
//		
		
		
	}
}
