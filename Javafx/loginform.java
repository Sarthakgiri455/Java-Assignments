import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.DepthTest;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
public class HelloApplication extends Application {
 @Override
 public void start(Stage stage) throws Exception {
 stage.setTitle("Conference Registration System");
 Label t1=new Label("Conference Registration Form");
 Label t2= new Label("Welcome to the Registration portal");
 t1.setFont(Font.font("Abyssinica SIL", FontWeight.BOLD, FontPosture.ITALIC,30));
 t2.setFont(Font.font("Abyssinica SIL", FontWeight.BOLD, FontPosture.REGULAR,20));
 Text t3= new Text("Name");
 t3.setFont(Font.font("TimesNewRoman", FontWeight.BOLD, FontPosture.ITALIC,15));
 TextField tf=new TextField();
 PasswordField pf= new PasswordField();
 Text t4= new Text("Emp_id");
 TextField t5= new TextField();
 GridPane root=new GridPane();
 Text email= new Text();
 email.setText("EMAIL");
 email.setFont(Font.font("TimesNewRoman", FontWeight.BOLD, FontPosture.ITALIC,15));
 Text password=new Text();
 password.setText("Password");
 password.setFont(Font.font("TimesNewRoman", FontWeight.BOLD, FontPosture.ITALIC,15));
 PasswordField f1= new PasswordField();
 f1.setPromptText("Enter your Password");
 TextField tx = new TextField();
 Label l3= new Label("Select your Gender");
 l3.setFont(Font.font("Abyssinica SIL", FontWeight.BOLD, FontPosture.ITALIC,20));
 RadioButton rb1= new RadioButton("Male");
 RadioButton rb2= new RadioButton("Female");
 RadioButton rb3= new RadioButton("Others");
 ToggleGroup tg= new ToggleGroup();
 Label error_label=new Label();
 password.setOnKeyReleased(new EventHandler<KeyEvent>() {
 @Override
 public void handle(KeyEvent keyEvent) {
 if(password.getText().length()>8)
 {
 }
 else
 {
 error_label.setStyle("-fx-text-fill: red");
 error_label.setText("Password length should be greater than 8");
 }
 }
 });
 Hyperlink hp=new Hyperlink("www.vit.ac.in");
 Label l4= new Label();
 hp.setOnAction(e->l4.setText("You pressed the website link"));
 hp.setFont(Font.font("TimesNewRoman",FontWeight.BOLD,FontPosture.ITALIC,15));
 Text hyperlink=new Text("Free to visit website through this link");
 hyperlink.setFill(Color.RED);
 hyperlink.setFont(Font.font("TimesNewRoman",FontWeight.BOLD,FontPosture.ITALIC,15));
 hp.setFont(Font.font("Arial", 20));
 rb1.setToggleGroup(tg);
 rb2.setToggleGroup(tg);
 rb3.setToggleGroup(tg);
 root.addRow(0,t1);
 root.addRow(1,t2);
 root.addRow(3, hyperlink, hp);
 root.addRow(4, t3, tf, t4, t5);
 root.addRow(5, email,tx, password, f1,error_label);
 root.addRow(6, l3, rb1,rb2, rb3);
 root.addRow(9,l4);
 root.setHgap(20);
 root.setVgap(30);
 root.setBackground(new Background(new BackgroundFill(Color.AQUA,CornerRadii.EMPTY, 
Insets.EMPTY)));
 Slider slider=new Slider(1,100,20);
 Text new1=new Text("Slide to your highest number of citations");
 new1.setFont(Font.font("Abyssinica SIL", FontWeight.BOLD, FontPosture.ITALIC,17));
 // enable the marks
 slider.setShowTickMarks(true);
 // enable the Labels
 slider.setShowTickLabels(true);
 // set Major tick unit
 slider.setMajorTickUnit(5f);
 // sets the value of the property
 // blockIncrement
 slider.setBlockIncrement(1f);
 Text sliding_value=new Text();
 slider.valueProperty().addListener(new ChangeListener<Number>() {
 public void changed(
 ObservableValue<? extends Number> observableValue,
 Number oldValue,
Number newValue) {
 System.out.println(slider.getValue());
 sliding_value.setText("Value is :: "+ Math.round(slider.getValue()));
 }
 });
 GridPane.setHalignment(hp, HPos.RIGHT);
 GridPane.setHalignment(l4, HPos.CENTER);
 root.addRow(11,new1, slider,sliding_value);
 Button file_choosing=new Button("Your research file");
 FileChooser file2= new FileChooser();
 Label file_description= new Label();
 file_choosing.setOnAction(
 new EventHandler<ActionEvent>() {
 @Override
 public void handle(ActionEvent actionEvent) {
 File file= file2.showOpenDialog(stage);
 if(file!=null)
 {
 file_description.setText("File Upload Successful");
 }
 else
 {
 file_description.setText("File Not able to Upload");
 }
 }
 }
 );
 Text button_result=new Text();
 Button b1 = new Button("Submit your Form");
 b1.setOnAction(e->button_result.setText("Successfully Submitted"));
 TextField age_wales= new TextField();
 Text age=new Text();
 age.setText("Your Date of Birth");
 age.setFont(Font.font("Abyssinica SIL", FontWeight.BOLD, FontPosture.ITALIC,15));
 Label paper_title=new Label();
 paper_title.setText("Enter the title");
 TextField paper_title2=new TextField();
 paper_title2.setPrefWidth(200);
 paper_title2.setPrefHeight(200);
 Label choose=new Label("Upload the paper you are presenting in the conference");
 choose.setFont(Font.font("Abyssinica SIL", FontWeight.BOLD, FontPosture.ITALIC,15));
 DatePicker datePicker= new DatePicker();
 datePicker.setOnAction(new EventHandler() {
 public void handle(Event t) {
 LocalDate date = datePicker.getValue();
 System.err.println("Selected date: " + date);
 LocalDate curDate=LocalDate.now();
 int a= Period.between(date, curDate).getYears();
 String x= String.valueOf(a);
 age_wales.setText(x);
 }
 });
 paper_title.setFont(Font.font("Abyssinica SIL", FontWeight.BOLD, FontPosture.ITALIC,15));
 Text abstract2=new Text();
 abstract2.setText("Enter your Abstract here");
 abstract2.setFont(Font.font("Abyssinica SIL", FontWeight.BOLD, FontPosture.ITALIC,15));
 TextField abstract_section=new TextField();
 abstract_section.setPrefHeight(300);
 abstract_section.setPrefWidth(300);
 root.addRow(14,choose, file_choosing,b1, button_result);
 Label age_done=new Label("Age");
 age_done.setFont(Font.font("Abyssinica SIL", FontWeight.BOLD, FontPosture.ITALIC,15));
 root.addRow(8, age,datePicker,age_done, age_wales);
 root.addRow(12, paper_title,paper_title2, abstract2, abstract_section);
 //Button b1=
 Scene s= new Scene(root, 200,300);
 stage.setScene(s);
 stage.show();
 }
 public static void main(String[] args) {
 launch();
 }
}
