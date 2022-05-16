import java.util.HashMap;



import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class JavaFXTemplate extends Application {
	College student = new College("","", "", 0);
	HighSchool student2 = new HighSchool("","","",0);
	TextField s1,s2,s3,s4, c1;
	Button b1,b2,b3, return2;
	HBox r1,r2,r3,r4,r5;
	VBox Box,Box2;
	Scene startScene,vewingScene;
	BorderPane startPane, secondPane;
	Label n1, n2, n3, n4;
	Image a,b,c;
	ImageView d,f,g;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	//feel free to remove the starter code from this method
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.setTitle("Storing Credits");
		
		System.out.println("Use either A or B for the Student name. All other names will give you an error.");
		
		//creating each text box that will be used to type up 
		//the credit information that either student A or B recieved.
		s1 = new TextField();
		s2 = new TextField();
		s3 = new TextField();
		s4 = new TextField();
		
		//these help by labeling which textbox will store what information.
		// I would like to mention the spacing are padding that will make sure,
		//the textbox are close to each other.
		n1 = new Label("Student Name:           ");
		n2 = new Label("Class Name:                ");
		n3 = new Label("Credit Type:                ");
		n4 = new Label("Credit Number Value: ");
		n1.setStyle("-fx-font-family: Time New Roman; -fx-font-size: 15pt; -fx-text-fill: red;");
		n2.setStyle("-fx-font-family: Time New Roman; -fx-font-size: 15pt; -fx-text-fill: red;");
		n3.setStyle("-fx-font-family: Time New Roman; -fx-font-size: 15pt; -fx-text-fill: red;");
		n4.setStyle("-fx-font-family: Time New Roman; -fx-font-size: 15pt; -fx-text-fill: red;");
		
		//these help in combining labels and textbox together.
		r1 = new HBox(n1,s1);
		r2 = new HBox(n2,s2);
		r3 = new HBox(n3,s3);
		r4 = new HBox(n4,s4);
		
		//once all the HBoxes are created, then Box a Vbox will store
		//then in a vertical formation
		Box = new VBox(r1,r2,r3,r4);
		
		//creating the buttons and placing them into an HBox and combing 
		// both the Box and r5 to a VBox known as Box2.
		b1 = new Button();
		b2 = new Button();
		r5 = new HBox(b1,b2);
		Box2 = new VBox(Box,r5);
		
		//implementing images into buttons .
		a = new Image("submit.png");
		d = new ImageView(a);
		d.setFitHeight(60);
		d.setPreserveRatio(true);
		b = new Image("veiw.png");
		f = new ImageView(b);
		f.setFitHeight(60);
		f.setPreserveRatio(true);
		c = new Image("background.png");
		g = new ImageView(c);
		g.setFitHeight(80);
		g.setPreserveRatio(true);
		
		
		b2.setGraphic(f);
		b1.setGraphic(d);
		
		//setting up the border panel. 
		startPane = new BorderPane();
		startPane.setCenter(Box2);
		
		//setting up the view button setonaction.
		b1.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent a) {
				String i = s3.getText();
				if( i.equals("College")) {student.add(s1.getText(),s2.getText(),s3.getText(),Integer.parseInt(s4.getText()));}
				else if (i.equals("High School")) {student2.add(s1.getText(),s2.getText(),s3.getText(),Integer.parseInt(s4.getText()));}
				else {System.out.println("Error must select either College or High School credit.");}
				
				//Clearing existing text. 
				s1.clear();
				s2.clear();
				s3.clear();
				s4.clear();
			}
		});;

		startPane.setStyle("-fx-background-image:url(background.png);");
		
		Scene scene = new Scene(startPane, 350,201);
		
		//when view button is press. 
		b2.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent a) {
				secondPane = new BorderPane();
			
				
				//customizing return button and setting it to previous version.
				return2 = new Button("Return");
				return2.setStyle("-fx-background-color:green;");
				//when return2 button is press. 
				return2.setOnAction(new EventHandler<ActionEvent>() {
					public void handle(ActionEvent a) {
						
						primaryStage.setScene(scene);
						primaryStage.show();
					}
				});
				secondPane.setStyle("-fx-background-image:url(background.png);");
				secondPane.setCenter(return2);
				Scene scene2 = new Scene(secondPane, 75,75);
				primaryStage.setScene(scene2);
				primaryStage.show();
				student.printALL();
				student2.printALL();
			}
		});;
		

		
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	
	
}
