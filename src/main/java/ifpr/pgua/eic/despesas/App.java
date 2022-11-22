package ifpr.pgua.eic.despesas;

import ifpr.pgua.eic.despesas.controllers.TelaDespesas;
import ifpr.pgua.eic.despesas.controllers.TelaPrincipal;
import ifpr.pgua.eic.despesas.controllers.viewmodels.TelaDespesasViewModel;
import ifpr.pgua.eic.despesas.utils.Navigator.BaseAppNavigator;
import ifpr.pgua.eic.despesas.utils.Navigator.ScreenRegistryFXML;



/**
 * JavaFX App
 */
public class App extends BaseAppNavigator {


    @Override
    public void init() throws Exception {
        // TODO Auto-generated method stub
        super.init();
        
    }

    @Override
    public void stop() throws Exception {
        super.stop();

    }



    @Override
    public String getHome() {
        // TODO Auto-generated method stub
        return "PRINCIPAL";
    }

    @Override
    public String getAppTitle() {
        // TODO Auto-generated method stub
        return "Despesas";
    }

    @Override
    public void registrarTelas() {
        registraTela("PRINCIPAL", new ScreenRegistryFXML(getClass(), "fxml/principal.fxml", (o)->new TelaPrincipal()));
        registraTela("DESPESAS", new ScreenRegistryFXML(getClass(), "fxml/despesas.fxml", (o)->new TelaDespesas(new TelaDespesasViewModel())));  
    
    }


}