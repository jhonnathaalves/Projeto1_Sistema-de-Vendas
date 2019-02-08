package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.function.Consumer;

import application.Main;
import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.VBox;

public class MainViewController implements Initializable {

	@FXML
	private MenuItem estoqueEntrada;

	@FXML
	private MenuItem estoqueSaida;

	@FXML
	private MenuItem cadastroClientes;

	@FXML
	private MenuItem cadastroFornecedores;

	@FXML
	private MenuItem cadastroProdutos;

	@FXML
	private MenuItem financeiroPagamentos;

	@FXML
	private MenuItem financeiroRecebimentos;

	@FXML
	private MenuItem relatorioClientes;

	@FXML
	private MenuItem relatorioVendas;

	@FXML
	private MenuItem relatorioEstoque;

	@FXML
	private MenuItem relatorioFornecedores;

	@FXML
	private MenuItem about;
	
	@FXML
	private void onMenuItemAboutAction() {
		loadView("/gui/About.fxml", x ->{});
	}

	@Override
	public void initialize(URL url, ResourceBundle rsb) {
	}
	
	private synchronized <T> void loadView(String absoluteName, Consumer <T> initializingAction) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName));
			VBox newVBox = loader.load();
			
			Scene mainScene = Main.getMainScene();
			VBox mainVbox = (VBox) ((ScrollPane) mainScene.getRoot()).getContent();
			
			Node mainMenu = mainVbox.getChildren().get(0);
			mainVbox.getChildren().clear();
			mainVbox.getChildren().add(mainMenu);
			mainVbox.getChildren().addAll(newVBox.getChildren());
			
			T controller = loader.getController();
			initializingAction.accept(controller);
		} catch (IOException e) {
			Alerts.showAlert("IO Exception", "Error load view", e.getMessage(), AlertType.ERROR);
		}
		
		
	}

}
