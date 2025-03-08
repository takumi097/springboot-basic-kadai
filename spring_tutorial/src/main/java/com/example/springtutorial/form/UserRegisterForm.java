package com.example.springtutorial.form;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import lombok.Data;

@Data
public class UserRegisterForm {
    // ユーザー名
    @NotBlank(message = "ユーザー名を入力してください。")
    private String userName;

    // パスワード
    @NotBlank(message = "パスワードを入力してください。")
    @Size(min = 8, message = "パスワードは少なくとも8文字は必要です。")
    private String password;

    // ロールID
    @NotNull(message = "ロールを正しく取得できませんでした。")
    private Integer roleId;
}