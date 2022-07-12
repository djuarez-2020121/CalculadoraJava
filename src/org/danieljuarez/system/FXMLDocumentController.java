
package org.danieljuarez.system;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;



public class FXMLDocumentController implements Initializable {
    /*------------Variables---------*/
    
    double dato1=0,dato2=0,resul=0;
    int op;
    
    /*-----------Referencia a JavaFX para los botones----------*/
    @FXML private Button btnUno;
    @FXML private Button btnDos;
    @FXML private Button btnTres;
    @FXML private Button btnCuatro;
    @FXML private Button btnCinco;
    @FXML private Button btnSeis;
    @FXML private Button btnSiete;
    @FXML private Button btnOcho;
    @FXML private Button btnNueve;
    @FXML private Button btnCero;
    @FXML private Button btnMasOMenos; 
    @FXML private Button btnPunto;
    @FXML private Button btnRaiz;
    @FXML private Button btnAbsol;
    @FXML private Button btnElevado;
    @FXML private Button btnPorcen;
    @FXML private Button btnCe;
    @FXML private Button btnC;
    @FXML private Button btnSuma;
    @FXML private Button btnResta;
    @FXML private Button btnMultiplicacion;
    @FXML private Button btnDivision; 
    @FXML private Button btnIgual;
    
    @FXML private TextField txtPantalla;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        /*-------------Eventos de los botones--------------*/
        
        /*--------Numeros de 0-9 ----------*/
        if(event.getSource()==btnUno)
            txtPantalla.setText(txtPantalla.getText()+"1");
        else if(event.getSource()==btnDos)
            txtPantalla.setText(txtPantalla.getText()+"2");
        else if(event.getSource()==btnTres)
            txtPantalla.setText(txtPantalla.getText()+"3");
        else if(event.getSource()==btnCuatro)
            txtPantalla.setText(txtPantalla.getText()+"4");
        else if(event.getSource()==btnCinco)
            txtPantalla.setText(txtPantalla.getText()+"5");
        else if(event.getSource()==btnSeis)
            txtPantalla.setText(txtPantalla.getText()+"6");
        else if(event.getSource()==btnSiete)
             txtPantalla.setText(txtPantalla.getText()+"7");
        else if(event.getSource()==btnOcho)
             txtPantalla.setText(txtPantalla.getText()+"8");
        else if(event.getSource()==btnNueve)
             txtPantalla.setText(txtPantalla.getText()+"9");
        else if(event.getSource()==btnCero)
            txtPantalla.setText(txtPantalla.getText()+"0");
        
        /*------Boton Suma----*/
        else if(event.getSource()==btnSuma){
            dato1=Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            op=1;
        }
        /*------Boton Resta----*/
        else if(event.getSource()==btnResta){
            dato1=Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            op=2;
        }
        /*------Boton Multiplicacion----*/
        else if(event.getSource()==btnMultiplicacion){
            dato1=Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            op=3;
        }
        /*------Boton Division----*/
        else if(event.getSource()==btnDivision){
            dato1=Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            op=4;
            
        }
        /*------Boton Elevado----*/
        else if(event.getSource()==btnElevado){
            dato1=Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            op=5;
        }
        /*------Boton Igual----*/
        if(event.getSource()==btnIgual){
            dato2=Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            switch(op){
                /*---------- Opereraciones aritmeticas +,-,*,/ y boton elvado-*/
                case 1:{
                    resul=dato1+dato2;
                    txtPantalla.setText(String.valueOf(resul));
                }break;
                case 2:{
                    resul=dato1-dato2;
                    txtPantalla.setText(String.valueOf(resul));
                }break;
                case 3:{
                    resul=dato1*dato2;
                    txtPantalla.setText(String.valueOf(resul));
                }break;
                case 4:{
                    resul=dato1/dato2;
                    txtPantalla.setText(String.valueOf(resul));
                }break;
                case 5:{
                    resul=Math.pow(dato1, dato2);
                    txtPantalla.setText(String.valueOf(resul));
                }
            }
           
          
        }
        /*------Boton C----*/
        else if(event.getSource()==btnC){
            dato1=0;
            dato2=0;
            resul=0;
            txtPantalla.clear();
        }
        /*------Boton CE----*/
        else if(event.getSource()== btnCe)
            txtPantalla.clear();
        else if(event.getSource()==btnRaiz){
            dato1=Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            resul=Math.sqrt(dato1);
            txtPantalla.setText(String.valueOf(resul));
        }
        /*------Boton Porcentaje----*/
        else if(event.getSource()==btnPorcen){
            dato2=Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            resul=dato1*dato2/100;
            txtPantalla.setText(String.valueOf(resul));
        }
        /*------Boton Mas o menos +/- ----*/
        else if(event.getSource()==btnMasOMenos){
            if(Double.parseDouble(txtPantalla.getText())>0)
                txtPantalla.setText(String.valueOf(Double.parseDouble(txtPantalla.getText())*-1));
            else
                txtPantalla.setText(String.valueOf(Double.parseDouble(txtPantalla.getText())*-1));
                
        }
        /*------Boton Punto----*/
        else if(event.getSource()==btnPunto){
            if(txtPantalla.getText().length()<=0)
                txtPantalla.setText("0.");
            else if(!(txtPantalla.getText().contains(".")))
                txtPantalla.setText(txtPantalla.getText()+".");      
        }
        /*------Boton  de valor Av¿bsoluto----*/
        else if(event.getSource()==btnAbsol){
            if(Double.parseDouble(txtPantalla.getText())>0)
                txtPantalla.setText(txtPantalla.getText());
            else
                txtPantalla.setText(String.valueOf(Double.parseDouble(txtPantalla.getText())*-1));
                
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    
    
}
