package com.example;

import com.example.GUI.TheStage;
import javafx.application.Application;
import javafx.stage.Stage;

import static com.example.Start.Flag;
import static com.example.Tools.Instrument.thealert;

public class Main extends Application {
    public static long interval=0L;
    public static int LIVE=0;
    @Override
    public void start(Stage primaryStage) {
        if(Flag==1)
        {
            thealert("配置下载失败,无法登录",0);
        }
        else {
            com.example.GUI.TheStage.RSApublickey = "自己的公钥1024位";
            com.example.GUI.TheStage.RSAprivatekey = "自己的私钥1024位";
            TheStage.login();
        }
    }
}
