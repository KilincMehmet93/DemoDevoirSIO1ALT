package sio.devoir1sioa;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;

public class DevoirController implements Initializable {
nnzjvqznblJFBNzjnv
    DecimalFormat df;
    @FXML
    private Button btnExo1;
    @FXML
    private AnchorPane apExo1;
    @FXML
    private AnchorPane apExo2;
    @FXML
    private AnchorPane apExo3;
    @FXML
    private Button btnExo2;
    @FXML
    private Button btnExo3;
    @FXML
    private TextField txtMontantReel;
    @FXML
    private TextField txtMontantSouhaite;
    @FXML
    private Button btnCalculerCommission;
    @FXML
    private Spinner spAnneesExperience;
    @FXML
    private Label lblResultatExo1;
    @FXML
    private TextField txtTauxCroissance;
    @FXML
    private Label lblResultatExo3;
    @FXML
    private Button btnCalculerPopulation;
    @FXML
    private TextField txtPopulationReelle;
    @FXML
    private TextField txtPopulationSouhaitee;
    @FXML
    private Button btnDessiner;
    @FXML
    private Slider sldLosange;
    @FXML
    private TextArea txtLosange;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        apExo1.toFront();
        df = new DecimalFormat("#.##");
        SpinnerValueFactory spinnerValueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1,10,1,1) ;
        spAnneesExperience.setValueFactory(spinnerValueFactory);
    }

    @FXML
    public void btnExosMenuClicked(Event event)
    {
        if(event.getSource() == btnExo1)
        {
            apExo1.toFront();
        }
        else if(event.getSource() == btnExo2)
        {
            apExo2.toFront();
        }
        else
        {
            apExo3.toFront();;
        }
    }

    // Exercice n°1
    @FXML
    public void btnCalculerCommissionClicked(Event event)
    {
        // A vous de jouer
        
    }

    // Exercice n°2
    @FXML
    public void btnDessinerClicked(Event event)
    {

        // A vous de jouer

    }

    // Exercice n°3
    @FXML
    public void btnCalculerPopulationClicked(Event event)
    {

        // A vous de jouer

    }
}