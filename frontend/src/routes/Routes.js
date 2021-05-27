import {BrowserRouter, Switch, Route} from 'react-router-dom';
import ListarInvestimentos from '../pages/ListarInvestimentos/index.js';
import CadastrarInvestimento from '../pages/CadastrarInvestimento/index.js';

export default function Routes() {
    return (
        <BrowserRouter>
            <Switch>
                <Route exact path="/" component={ListarInvestimentos}></Route>
                <Route exact path="/cadastrar-investimento" component={CadastrarInvestimento}></Route>
            </Switch>
        </BrowserRouter>
    );
}