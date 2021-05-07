package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    //�A�v���P�[�V�������X�^�[�g����Ƃ��̏���
    //stage = �g�b�v���x���R���e�i�@GUI�̑g�ݍ��݂̓y��ƂȂ�R���e�i

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        //��ʂ̕\��
        //��ʂ̔�\���uhide�v
        primaryStage.show();
    }


    public static void main(String[] args) {
        //main���󂯎����String�ɂ��javaFx���N��������
        launch(args);
    }
}
