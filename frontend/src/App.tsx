import BarChart from "components/BarChart";
import NavBar from "components/NavBar";
import Footer from "components/Footer";
import DataTable from "components/DataTable";
import DonutChart from "components/DonutChart";

function App() {
  return (
    <>
        <NavBar />
        <div className="container"></div>
        <h1 className="text-primary py-3">DashBoard De Vendas</h1>

        <div className="row px-3">
        <div className="col-sm-6">

        <h5 className="text-center test-secondary ">Taxa de sucesso(%) </h5>
          <BarChart/>
        </div>
        <div className="col-sm-6">

        <h5 className="text-center test-secondary "> Todas Vendas </h5>
          <DonutChart/>
        </div>


        </div>

        <div className="py-3">
          <h2 className="text-center"> Todas Vendas </h2>
              
        </div>

        <DataTable />
        <div></div>
        <Footer/>
    </>
  );
}

export default App;