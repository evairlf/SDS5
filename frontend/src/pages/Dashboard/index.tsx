import BarChart from "components/BarChart";
import DataTable from "components/data_table";
import DonutChart from "components/DonutChart";
import Footer from "components/footer";
import NavBar from "components/navBar";

const Dashboard = () => {
    return (
        <>
            <NavBar />
            <div className="container">
                <h1 className="text-primary py-3">Dashboard de vendas</h1>

                <div className="row px-3">
                    <div className="col-sm-6">

                        <h5 className="text-center text-secondary">Taxa de Sucesso</h5>
                        <BarChart />
                    </div>
                    <div className="col-sm-6">

                        <h5 className="text-center text-secondary">Todas Vendas</h5>
                        <DonutChart />
                    </div>
                    
                </div>
                <div className="py-3">
                <h2 className="text-primary">Todas As Vendas</h2>
                <DataTable />
            </div>
           
            
            </div>
            <Footer />
        </>
    );
}

export default Dashboard;