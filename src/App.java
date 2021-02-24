import java.util.ArrayList;
import java.util.List;
public class App {
    public static void main(String[] args){
        //Presentacion
        Vendedor vendedor1 = new Vendedor();
        vendedor1.nombre = "Yamir Rodas";
        vendedor1.id = "14FF2021";
        vendedor1.record = 15;

        System.out.println("Bienvenidos a Car's!.\nSoy "+ vendedor1.nombre+"! y te guiare en este tour...");
        System.out.println("Nuestros autos son: ");
        //Creacion de Autos
        Carro micarro1 = new Carro();
        micarro1.marca = "Audi";
        micarro1.modelo = "R8";
        micarro1.estado = "Nuevo";
        micarro1.placa = "HN777";
        micarro1.km = 0;
        micarro1.anio = 2021;
        System.out.println(micarro1.infoAuto());//Imprime Datos

        Carro micarro2 = new Carro();
        micarro2.marca = "Ford";
        micarro2.modelo = "F-150";
        micarro2.estado = "Usado";
        micarro2.placa = "HN123";
        micarro2.km = 35647;
        micarro2.anio = 2020;
        System.out.println(micarro2.infoAuto());//Imprime Datos

        Carro micarro3 = new Carro();
        micarro3.marca = "Nissan";
        micarro3.modelo = "Algo";
        micarro3.estado = "Usado";
        micarro3.placa = "Raaa";
        micarro3.km = 1234567;
        micarro3.anio = 1950;
        System.out.println(micarro3.infoAuto());//Imprime Datos

        Cliente cliente1 = new Cliente();
        cliente1.Nombre = "Mauricio Avila";
        cliente1.id = "0816";
        cliente1.edad = 42;
        cliente1.compr = 3;
        System.out.println("Nuestro cliente: "+cliente1.Nombre+"\nCon numero de id: "+cliente1.id+"\nY a la edad de: "+cliente1.edad+" anios.");
        System.out.println("Ha comprado "+cliente1.compr+" autos a: "+vendedor1.nombre+"\nCon id: "+vendedor1.id+" y record de venta de: "+vendedor1.record+" autos vendidos.");

    }
}
class Carro{
    String marca;
    String modelo;
    String estado;
    String placa;
    int km;
    short anio;

    public String infoAuto(){
        String infoCarro = "Marca: " + this.marca+"\n" + "Modelo: " + this.modelo+"\n"+
                            "Estado del carro: " + this.estado+"\n" + "Numero de placa: " + this.placa+"\n"+
                            "Kilometraje: " + this.km+"\n" + "Anio del auto: " + this.anio+"\n";
        return infoCarro;
    }

}
class Cliente{
    String Nombre;
    String id;
    short compr;
    short edad;

}
class Vendedor{
    String nombre;
    String id;
    short record;

}