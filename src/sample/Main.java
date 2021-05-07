package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    //アプリケーションがスタートするときの処理
    //stage = トップレベルコンテナ　GUIの組み込みの土台となるコンテナ

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        //画面の表示
        //画面の非表示「hide」
        primaryStage.show();
    }


    public static void main(String[] args) {
        //mainが受け取ったStringによりjavaFxを起動させる
        launch(args);
    }
}
