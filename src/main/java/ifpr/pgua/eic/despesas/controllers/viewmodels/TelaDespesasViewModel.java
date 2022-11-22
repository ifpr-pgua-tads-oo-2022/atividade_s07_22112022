package ifpr.pgua.eic.despesas.controllers.viewmodels;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import ifpr.pgua.eic.despesas.model.entities.Despesa;
import ifpr.pgua.eic.despesas.model.results.Result;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.SingleSelectionModel;

public class TelaDespesasViewModel {

    private StringProperty tituloProperty = new SimpleStringProperty();
    private ObjectProperty<SingleSelectionModel<String>> tipoProperty = new SimpleObjectProperty<>();
    private StringProperty valorProperty = new SimpleStringProperty();
    private ObjectProperty<LocalDate> dataProperty = new SimpleObjectProperty<>();
    private ObjectProperty<Result> alertProperty = new SimpleObjectProperty<>();

    private ObservableList<DespesaRow> despesas = FXCollections.observableArrayList();

    //idealmente viria de um banco de dados
    //a lista de tipos
    private ObservableList<String> tipos = FXCollections
                                           .observableArrayList("Alimentação",
                                                                "Lazer",
                                                                "Transporte",
                                                                "Sobrevivência");

    public StringProperty tituloProperty() {
        return tituloProperty;
    }

    public ObjectProperty<SingleSelectionModel<String>> tipoProperty() {
        return tipoProperty;
    }

    public StringProperty valorProperty() {
        return valorProperty;
    }

    public ObjectProperty<LocalDate> dataProperty() {
        return dataProperty;
    }


    public ObjectProperty<Result> alertProperty() {
        return alertProperty;
    }

    public void updateList() {
        despesas.clear();
        
        alertProperty.setValue(Result.fail("BUSCAR DO BANCO DE DADOS"));

    }

    public void cadastrar() {

        String titulo = tituloProperty.getValue();
        String tipo = tipoProperty.getValue().getSelectedItem();
        String sValor = valorProperty.getValue();
        LocalDate data = dataProperty.getValue();

        Double valor = Double.valueOf(sValor);

        LocalDateTime dataHora = LocalDateTime.of(data, LocalTime.now());



        limpar();

        alertProperty.setValue(Result.fail("INSERIR NO BANCO DE DADOS!!!"));
    }

    public void limpar() {
        tituloProperty.setValue("");
        tipoProperty.getValue().clearSelection();
        valorProperty.setValue("");
        dataProperty.setValue(null);
    }

    public ObservableList<DespesaRow> getDespesas() {
        return despesas;
    }

    public ObservableList<String> getTipos(){
        return tipos;
    }
    
}
