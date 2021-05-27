import "antd/dist/antd.css";
import { Table, Button, message, Layout, Menu } from "antd";
import {Link} from 'react-router-dom';
import { useState } from 'react';
const { Header, Content, Footer } = Layout;
const { Column } = Table;

export default function ListarInvestimentos() {

    const [investimentos, setInvestimentos] = useState([]);

    function remove(record) {
        message.success("Investimento deletado com sucesso!"); 
    }

    return (
        <div className="container">
            <Layout className="layout">
                <Header>
                    <div className="logo" />
                    <Menu theme="dark" mode="horizontal" defaultSelectedKeys={['2']}>
                        <Menu.Item key="1">
                            <Link to="/cadastrar-investimento">
                                Cadastrar Investimento
                            </Link>
                        </Menu.Item>
                        <Menu.Item key="2">
                            <Link to="/listar-investimentos">
                                Listar Investimentos
                            </Link>
                        </Menu.Item>
                    </Menu>
                </Header>
                <Content style={{ padding: '0 50px' }}>
                    <div className="site-layout-content">Content</div>
                    <h2>Investimentos</h2>
                    <Table dataSource={investimentos}>
                        <Column title="Código do Ativo" dataIndex="codigoAtivo" key="codigoAtivo" />
                        <Column title="Código do Ativo" dataIndex="codigoAtivo" key="codigoAtivo" />
                        <Column title="Código do Ativo" dataIndex="codigoAtivo" key="codigoAtivo" />
                        <Column title="Código do Ativo" dataIndex="codigoAtivo" key="codigoAtivo" />
                        <Column title="Código do Ativo" dataIndex="codigoAtivo" key="codigoAtivo" />
                        <Column title="Remover" key="atualizar"
                            render={(text, record) => (<Button onClick={() => remove(record)}
                                type="primary">Remover</Button>)}
                        />
                    </Table>

                </Content>
                <Footer style={{ textAlign: 'center' }}>Invest Tools ©2021 Created by Joedes Developer</Footer>
            </Layout>
        </div>
    )
}
