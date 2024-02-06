package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController1 {

	@GetMapping("/test1")
	public String test1() {
		
		String test;
		test = "<p>今回ご紹介するのはテレビ番組ではありませんが、</p>" +
				"<h1>恥を知れ！恥を！</h1>" +
				"というフレーズでお馴染みのYouTureチャンネル<br>" +
				"その名も「 安芸高田市公式チャンネル 」です。<br>" +
				"<br>" +
				"・私利私欲で動くチンピラ議員<br>" +
				"・国を揺さぶる教団メディア<br>" +
				"・気分で否決する最強のラスボス議会<br>" +
				"<br>" +
				"このような悪の組織に<br>" +
				"真っ向から立ち向かう一人の「 市長 」の姿がまぶたに焼き付く！！！<br>" +
				"<br>" +
				"一度見たらやめられない<br>" +
				"<h2>共に…悪魔の扉を開いてみませんか…！？<h2>"	;	
				

		return test;
//		return "冬は寒いので<br>全裸で踊ろう！";
		
		
	}

}
