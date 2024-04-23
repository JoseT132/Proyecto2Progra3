package proyecto_2;

import java.util.Scanner;

public class Proyecto_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MatrizOrtogonal matrizOrtogonal = new MatrizOrtogonal();
        int x, y, xEliminar, yEliminar, opcionBusqueda;
        String placa, color, linea, modelo, propietario, propiedadBusqueda, valorBusqueda;
        int opcion;
        do {
            System.out.println("----- Menu -----");
            System.out.println("1. Insertar ");
            System.out.println("2. Eliminar ");
            System.out.println("3. Buscar ");
            System.out.println("4. Salir");
            System.out.print("Ingrese su opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese los datos del vehículo a insertar:");
                    System.out.print("Placa: ");
                    placa = scanner.next();
                    System.out.print("Color: ");
                    color = scanner.next();
                    System.out.print("Linea: ");
                    linea = scanner.next();
                    System.out.print("Modelo: ");
                    modelo = scanner.next();
                    System.out.print("Propietario: ");
                    propietario = scanner.next();
                    System.out.print("Coordenada X: ");
                    x = scanner.nextInt();
                    System.out.print("Coordenada Y: ");
                    y = scanner.nextInt();

                    // Crear un objeto nodoOrtogonal con los datos ingresados
                    nodoOrtogonal vehiculo = new nodoOrtogonal(x, y);
                    vehiculo.setPlaca(placa);
                    vehiculo.setColor(color);
                    vehiculo.setLinea(linea);
                    vehiculo.setModelo(modelo);
                    vehiculo.setPropietario(propietario);

                    // Insertar el nodo en la matriz ortogonal
                    matrizOrtogonal.insertarNodo(vehiculo);
                    System.out.println("Vehículo insertado correctamente.");
                    break;

                case 2:
                    System.out.println("Ingrese los datos del vehículo a eliminar:");
                    System.out.println("1. Placa");
                    System.out.println("2. Color");
                    System.out.println("3. Linea");
                    System.out.println("4. Modelo");
                    System.out.println("5. Propietario");
                    System.out.print("Seleccione la opcion para eliminar: ");
                    opcionBusqueda = scanner.nextInt();

                    // Inicializar la propiedad de busqueda y pedir el valor
                    switch (opcionBusqueda) {
                        case 1:
                            propiedadBusqueda = "placa";
                            System.out.print("Ingrese la placa del vehículo a eliminar: ");
                            valorBusqueda = scanner.next();
                            break;
                        case 2:
                            propiedadBusqueda = "color";
                            System.out.print("Ingrese el color del vehículo a eliminar: ");
                            valorBusqueda = scanner.next();
                            break;
                        case 3:
                            propiedadBusqueda = "linea";
                            System.out.print("Ingrese la línea del vehículo a eliminar: ");
                            valorBusqueda = scanner.next();
                            break;
                        case 4:
                            propiedadBusqueda = "modelo";
                            System.out.print("Ingrese el modelo del vehículo a eliminar: ");
                            valorBusqueda = scanner.next();
                            break;
                        case 5:
                            propiedadBusqueda = "propietario";
                            System.out.print("Ingrese el propietario del vehículo a eliminar: ");
                            valorBusqueda = scanner.next();
                            break;
                        default:
                            System.out.println("Opción no válida.");
                            continue; // Regresar al inicio del ciclo
                    }

                    // Realizar la eliminación basada en la propiedad y el valor
                    matrizOrtogonal.eliminarNodo(propiedadBusqueda, valorBusqueda);
                    break;

                case 3:
                    System.out.println("Seleccione la propiedad para buscar:");
                    System.out.println("1. Placa");
                    System.out.println("2. Color");
                    System.out.println("3. Linea");
                    System.out.println("4. Modelo");
                    System.out.println("5. Propietario");
                    System.out.print("Ingrese su opción: ");
                    opcionBusqueda = scanner.nextInt();

                    propiedadBusqueda = "";
                    switch (opcionBusqueda) {
                        case 1:
                            propiedadBusqueda = "placa";
                            System.out.print("Ingrese el valor de la placa a buscar: ");
                            valorBusqueda = scanner.next();
                            break;
                        case 2:
                            propiedadBusqueda = "color";
                            System.out.print("Ingrese el valor del color a buscar: ");
                            valorBusqueda = scanner.next();
                            break;
                        case 3:
                            propiedadBusqueda = "linea";
                            System.out.print("Ingrese el valor de la línea a buscar: ");
                            valorBusqueda = scanner.next();
                            break;
                        case 4:
                            propiedadBusqueda = "modelo";
                            System.out.print("Ingrese el valor del modelo a buscar: ");
                            valorBusqueda = scanner.next();
                            break;
                        case 5:
                            propiedadBusqueda = "propietario";
                            System.out.print("Ingrese el nombre del propietario a buscar: ");
                            valorBusqueda = scanner.next();
                            break;
                        default:
                            System.out.println("Opción no válida.");
                            continue; // Regresar al inicio del ciclo
                    }

                    // Realizar la búsqueda en la matriz ortogonal
                    nodoOrtogonal vehiculoEncontrado = matrizOrtogonal.buscarnodo(propiedadBusqueda, valorBusqueda);

                    if (vehiculoEncontrado != null) {
                        System.out.println("Vehículo encontrado:");
                        System.out.println("Placa: " + vehiculoEncontrado.getPlaca());
                        System.out.println("Color: " + vehiculoEncontrado.getColor());
                        System.out.println("Linea: " + vehiculoEncontrado.getLinea());
                        System.out.println("Modelo: " + vehiculoEncontrado.getModelo());
                        System.out.println("Propietario: " + vehiculoEncontrado.getPropietario());
                        System.out.println("Coordenada X: " + vehiculoEncontrado.getX());
                        System.out.println("Coordenada Y: " + vehiculoEncontrado.getY());
                    } else {
                        System.out.println("Vehículo no encontrado.");
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor ingrese una opción válida.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}
