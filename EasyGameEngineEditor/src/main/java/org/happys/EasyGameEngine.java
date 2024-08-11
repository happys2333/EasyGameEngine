package org.happys;

import javafx.application.Application;
import javafx.stage.Stage;
import org.happys.util.ConfigLoader;

import java.util.LinkedList;
import java.util.Queue;

public class EasyGameEngine extends Application {
    private Queue<Stage> stageQueue;
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle(ConfigLoader.getInstance().uiText.editorMain.title);
        stage.show();
    }

    public EasyGameEngine() {
        this.stageQueue = new LinkedList<Stage>();
    }
}
