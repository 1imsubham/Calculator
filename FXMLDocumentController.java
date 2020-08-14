/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 *
 * @author subha
 */
public class FXMLDocumentController implements Initializable {
    
   // @FXML
    //private Label label;
    Float data =0f;
    int opearation = -1;
    
    @FXML
    private TextField Display;

    @FXML
    private Button clear;

    @FXML
    private Button divide;

    @FXML
    private Button eight;

    @FXML
    private Button equals;

    @FXML
    private Button five;

    @FXML
    private Button four;

    @FXML
    private Button minus;

    @FXML
    private Button multiply;

    @FXML
    private Button nine;

    @FXML
    private Button one;

    @FXML
    private Button plus;

    @FXML
    private Button seven;

    @FXML
    private Button six;

    @FXML
    private Button three;

    @FXML
    private Button two;

    @FXML
    private Button zero;
    
    @FXML
    private Button one_by_x;
     
    @FXML
    private Button square;

    @FXML
    private Button square_root;
    
    @FXML
    private Button cube;

    @FXML
    void handleButtonAction(ActionEvent event) throws IOException, InterruptedException 
    {
        if(event.getSource()==two)
        {
          
        }
        else if(event.getSource()==three)
        {
            Display.setText(Display.getText()+"3");
        }
        else if(event.getSource()==four)
        {
            Display.setText(Display.getText()+"4");
        }
        else if(event.getSource()==five)
        {
            Display.setText(Display.getText()+"5");
        }
        else if(event.getSource()==six)
        {
            Display.setText(Display.getText()+"6");
        }else if(event.getSource()==one)
        {
            Display.setText(Display.getText()+"1");
        }else if(event.getSource()==seven)
        {
            Display.setText(Display.getText()+"7");
        }else if(event.getSource()==eight)
        {
            Display.setText(Display.getText()+"8");
        }else if(event.getSource()==nine)
        {
            Display.setText(Display.getText()+"9");
        }else if(event.getSource()==zero)
        {
            Display.setText(Display.getText()+"0");
        }
        else if(event.getSource()==clear)
        {

            Platform.exit();
        	Process p = Runtime.getRuntime().exec("python C:\\Users\\subha\\Downloads\\Face_Project\\face_rec.py");
            //p.waitFor();
            Display.setText("");
        }
        else if(event.getSource()==plus)
        {
            data = Float.parseFloat(Display.getText());
            opearation =1;
            Display.setText("");
        }
        else if(event.getSource()==minus)
        {
            data = Float.parseFloat(Display.getText());
            opearation =2;
            Display.setText("");
        }
        else if(event.getSource()==multiply)
        {
            data = Float.parseFloat(Display.getText());
            opearation =3;
            Display.setText("");
        }
        else if(event.getSource()==divide)
        {
            data = Float.parseFloat(Display.getText());
            opearation =4;
            Display.setText("");
        }
        else if(event.getSource()==square)
        {
            data=Float.parseFloat(Display.getText());
            Float ans= data * data;
            Display.setText(String.valueOf(ans));
        }
        else if(event.getSource()==cube)
        { 
            data=Float.parseFloat(Display.getText());
            Float ans=data*data*data;
            Display.setText(String.valueOf(ans));
            opearation=6;
        }
        else if(event.getSource()==square_root)
        {
            data=Float.parseFloat(Display.getText());
            double a=Math.sqrt(data.doubleValue());
            Display.setText(String.valueOf(a));
            opearation=7;
        }
        else if(event.getSource()==one_by_x)
        {
            data=Float.parseFloat(Display.getText());
            Float ans=0f;
            try{
                ans=1/data;
            }
            catch(Exception e)
            {
                Display.setText("Error");
            }
            Display.setText(String.valueOf(ans));
        }
        else if(event.getSource()==equals)
        {
            Float data1 = Float.parseFloat(Display.getText());
            switch(opearation)
            {
                case 1:
                    Float ans=data + data1;
                    Display.setText(String.valueOf(ans));
                    break;
                case 2:
                    ans=data - data1;
                    Display.setText(String.valueOf(ans));
                    break;
                case 3:
                    ans=data * data1;
                    Display.setText(String.valueOf(ans));
                    break;
                case 4:
                    ans=0f;
                    try {
                    ans=data / data1;}
                    catch(Exception e){
                        Display.setText("Error");
                    }
                    Display.setText(String.valueOf(ans));
            }
        }
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
