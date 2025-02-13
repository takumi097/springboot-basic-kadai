package com.example.springkadaiform.form;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class ContactForm {
	
	@NotBlank(message = "お名前を入力してください。")
	private String name;
	
	@NotBlank(message = "メールアドレスを入力してください。")
	@Email(message="メールアドレスの入力形式が正しくありません。")
	private String email;
	
	@NotBlank(message = "お問い合わせ内容を入力してください。")
	private String question;
}