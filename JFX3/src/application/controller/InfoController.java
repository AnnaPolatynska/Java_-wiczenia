package application.controller;

	import java.io.FileNotFoundException;
import java.io.PrintWriter;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
	import javafx.scene.control.CheckBox;
	import javafx.scene.control.ComboBox;
	import javafx.scene.control.RadioButton;
import javafx.scene.control.SelectionModel;
import javafx.scene.control.TextField;
	import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;

	public class InfoController {
	    @FXML
	    private TextField tf_first;
	    @FXML
	    private TextField tf_last;
	    @FXML
	    private RadioButton rb1;
	    @FXML
	    private ToggleGroup pyt2;
	    @FXML
	    private RadioButton rb2;
	    @FXML
	    private RadioButton rb3;
	    @FXML
	    private CheckBox cb1;
	    @FXML
	    private CheckBox cb2;
	    @FXML
	    private CheckBox cb3;
	    @FXML
	    
	    //tu dodajemy tekst do combo box
	    private ComboBox<String> combo;//wstaw jakiego typu warto�ci
	    	    
	    @FXML
	    private Button btn_send;
	    @FXML
	    void sendAction(MouseEvent event) throws FileNotFoundException {
	    	
	    	String rb_sel= "";
	    	String cb_sel= "";
	    	String combo_sel= "";
	    	
	    	
	    	String info="dane ankietowanego: "+ tf_first.getText()+" , "+ tf_last.getText()+"\n";
	    	if(rb1.isSelected()){
	    		rb_sel = rb1.getText()+"\n";
	     	}else if(rb2.isSelected()){
	    		rb_sel = rb2.getText()+"\n";
	     	}else if(rb3.isSelected()){
	    		rb_sel = rb3.getText()+"\n";
	    		}
	    	info+= "znajomo�� jezyka angielskiego" + rb_sel +"\n";
	    	
	    	if(cb1.isSelected()){
	    		cb_sel+=cb1.getText();
	    	}
	    	if(cb2.isSelected()){
	    		cb_sel+=cb2.getText();
	    	}
	    	if(cb3.isSelected()){	    		
	    		cb_sel+=cb3.getText();}
	    	
	    	info+=" znajomo�� programowania"+ cb_sel+"\n";
	    	combo_sel= "wyb�r kursu"+combo.getSelectionModel().getSelectedItem()+"\n";	//zwraca warto�� tekstu
	    	info += combo_sel;
	    	
	    	if(tf_first.getText().equals("")|| tf_last.getText().equals("")){
	    		    	//klasa allert z javafx
    		Alert a = new Alert(AlertType.INFORMATION);//okno z informacj� o b��dzie
    		a.setContentText("nie poda�e� imienia lub nazwiska");
    		a.setHeaderText("Warning!");
    		a.setTitle("b��d");
    		a.showAndWait();
	    	}else{
    		PrintWriter pw= new PrintWriter("C:\\Users\\Ania\\Desktop\\BED_�wiczenia\\" + tf_first.getText() + tf_last.getText()+"txt");
    		pw.println(info);
	    	pw.close();
	    	Alert a = new Alert(AlertType.INFORMATION);//okno z informacj� o b��dzie
    		a.setContentText("dane zosta�y przes�ane");
    		a.setHeaderText("dzi�kujemy za wype�nienie ankiety");
    		a.setTitle("dzi�kujemy");
    		a.showAndWait();
	    	}
	    }
	   
		private SelectionModel<String> getSelectionModel() {
			// TODO Auto-generated method stub
			return null;
		}
		@FXML
	    private TextField tf_other;// jak inne j�zyki to pole aktywne
	    @FXML
	    void other(MouseEvent event) {
	    	tf_other.setDisable(false);
	    }
	    //metoda dopisuje nam do combo boxa
	   @FXML
	   public void initialize(){
	    	combo.getItems().add("Back-end-Dev ");
	    	combo.getItems().add("Front-end-Dev ");
	    	combo.getSelectionModel().select(0);//wywo�ujemy 1 indeks
	}
}