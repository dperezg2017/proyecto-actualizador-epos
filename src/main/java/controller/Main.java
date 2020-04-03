package controller;

import javafx.application.Application;
import javafx.stage.Stage;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.helpers.Loader;

import java.io.Serializable;
import java.net.URL;
public class Main extends Application implements Serializable {

    static Logger logger = Logger.getLogger(Main.class);


    public Main(){
        try {
            URL url = Loader.getResource("log4j.properties");
            PropertyConfigurator.configure(url);
            logger.info("Inicio del Actualizador - Main111111111111111");
        }catch (Exception e){
            e.printStackTrace();
            logger.error(e);
        }
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            logger.info("Inicio del Actualizador - start22222222222");
        } catch(Exception e) {
            e.printStackTrace();
            logger.error(e);
        }
    }
}
