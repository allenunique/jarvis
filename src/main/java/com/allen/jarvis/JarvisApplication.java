package com.allen.jarvis;

import com.mpush.api.push.*;
import com.mpush.client.MPushClient;
import com.mpush.client.push.PushClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.FutureTask;

//@SpringBootApplication
@Controller
@EnableAutoConfiguration
public class JarvisApplication {
	@RequestMapping("/")
	@ResponseBody
	String home() {
		PushSender pushSender = PushSender.create();
		pushSender.start().join();

//		PushClient pushClient = new PushClient();
//		pushClient.setMPushContext(new MPushClient());

		PushMsg pushMsg = PushMsg.build(MsgType.NOTIFICATION,"hello android");
		pushMsg.setMsgId("1");
		PushContext context = PushContext.build(pushMsg)
				.setAckModel(AckModel.AUTO_ACK)
				.setUserId("user-0")
				.setBroadcast(false)
				//.setTags(Sets.newHashSet("test"))
				//.setCondition("tags&&tags.indexOf('test')!=-1")
				//.setUserIds(Arrays.asList("user-0", "user-1"))
				.setTimeout(2000)
				.setCallback(new PushCallback() {
					@Override
					public void onResult(PushResult result) {
						System.err.println("\n\n" + result);
					}
				});
		FutureTask<PushResult> future = pushSender.send(context);

		return future.toString();
	}
	public static void main(String[] args) {
		SpringApplication.run(JarvisApplication.class, args);
	}
}
