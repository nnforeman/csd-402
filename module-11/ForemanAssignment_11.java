/*
Name: Natasha Foreman
Course: CSD 402 – Java for Programmers
Date: March 8, 2026
Assignment: Module 11
Purpose: Demonstrate how BorderPane can structure a window into regions (top/left/bottom/center), and how GridPane can be used to build an aligned form inside the center region.
*/
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ForemanAssignment_11 {

    // Form controls (kept as fields so multiple methods can access them)
    private TextField nameField;
    private TextField emailField;
    private ComboBox<String> deptBox;
    private Label statusLabel;

    @Override
    public void start(Stage stage) {

        // ----- BorderPane: root "app frame" -----
        BorderPane root = new BorderPane();
        root.setPadding(new Insets(10));

        // TOP region: title
        Label title = new Label("Employee Intake Form (BorderPane + GridPane Demo)");
        title.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");
        root.setTop(title);
        BorderPane.setMargin(title, new Insets(0, 0, 10, 0));

        // LEFT region: simple navigation/actions (VBox)
        VBox nav = buildLeftMenu();
        root.setLeft(nav);
        BorderPane.setMargin(nav, new Insets(0, 10, 0, 0));

        // CENTER region: GridPane form
        GridPane form = buildGridForm();
        root.setCenter(form);

        // BOTTOM region: status bar
        statusLabel = new Label("Status: Ready");
        root.setBottom(statusLabel);
        BorderPane.setMargin(statusLabel, new Insets(10, 0, 0, 0));

        // Show scene
        Scene scene = new Scene(root, 650, 320);
        stage.setTitle("JavaFX Layout Demo");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Builds a VBox menu for the LEFT region of the BorderPane.
     */
    private VBox buildLeftMenu() {
        VBox nav = new VBox(8);
        nav.setPadding(new Insets(8));
        nav.setStyle("-fx-background-color: #f4f4f4; -fx-border-color: #cccccc;");

        Label menuLabel = new Label("Actions");
        menuLabel.setStyle("-fx-font-weight: bold;");

        Button showDataBtn = new Button("Show Current Data");
        showDataBtn.setMaxWidth(Double.MAX_VALUE);
        showDataBtn.setOnAction(e -> updateStatusWithFormData());

        Button clearBtn = new Button("Clear Form");
        clearBtn.setMaxWidth(Double.MAX_VALUE);
        clearBtn.setOnAction(e -> clearForm());

        nav.getChildren().addAll(menuLabel, showDataBtn, clearBtn);
        return nav;
    }

    /**
     * Builds the GridPane used in the CENTER region for an aligned input form.
     */
    private GridPane buildGridForm() {
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10));
        grid.setHgap(10);
        grid.setVgap(10);

        // Initialize controls
        nameField = new TextField();
        emailField = new TextField();

        deptBox = new ComboBox<>();
        deptBox.getItems().addAll("Operations", "Quality", "IT", "Finance", "HR");
        deptBox.setPromptText("Select a department");

        // Row 0
        grid.add(new Label("Name:"), 0, 0);
        grid.add(nameField, 1, 0);

        // Row 1
        grid.add(new Label("Email:"), 0, 1);
        grid.add(emailField, 1, 1);

        // Row 2
        grid.add(new Label("Department:"), 0, 2);
        grid.add(deptBox, 1, 2);

        // Row 3 (buttons aligned in the grid)
        Button submitBtn = new Button("Submit");
        submitBtn.setOnAction(e -> statusLabel.setText("Status: Submitted (demo)"));

        Button resetBtn = new Button("Reset");
        resetBtn.setOnAction(e -> clearForm());

        grid.add(submitBtn, 0, 3);
        grid.add(resetBtn, 1, 3);

        return grid;
    }

    /**
     * Updates the status label to show the form data.
     */
    private void updateStatusWithFormData() {
        String dept = (deptBox.getValue() == null) ? "(none)" : deptBox.getValue();
        statusLabel.setText("Status: Name=" + nameField.getText()
                + ", Email=" + emailField.getText()
                + ", Dept=" + dept);
    }

    /**
     * Clears the form controls.
     */
    private void clearForm() {
        nameField.clear();
        emailField.clear();
        deptBox.setValue(null);
        statusLabel.setText("Status: Cleared");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
