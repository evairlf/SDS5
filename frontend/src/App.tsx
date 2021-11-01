import DataTable from "components/data_table";
import Footer from "components/footer";
import NavBar from "components/navBar";


function App() {
  return (
    <>
      <NavBar />
      <div className="container">
        <h1 className="text-primary">Hello World!</h1>

      </div>
      <DataTable />
      <Footer />
    </>

  );
}

export default App;
