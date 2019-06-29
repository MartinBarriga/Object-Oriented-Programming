#include <iostream>
#include <stdlib.h>
#include <string.h>
using namespace std;
// Nombre, capacidad, tipo de archivo y cuanto cuanta capacidad tienes en uso en la memoria

//propiedades
//formatear
//cambiar nombre
/* Programa con el sig. menu: 
	
	1.- USB1 (Nombre, capacidad, etc)
	2.- USB2 (Nombre, capacidad, etc)
	3.- USB3 (Nombre, capacidad, etc)
	4.- Salir
	
	Submenú:
	
	1.- Cambiar el nombre
	2.- Formatear
	3.- Regresar
	
	Arreglo con 3 structs usb, inicializados automáticamente
	
	usar system("cls") en windows
*/
struct usb{
	string nombre;
	float capacidad;
	string tipoArchivo;
	float capacidadEnUso;
	
};

void inicializar_arreglo(struct usb*);
void cambiar_nombre(struct usb*, string, int);
void formatear(struct usb*, string, string, int);

int main(int argc, char** argv) {
	
	int opcion, numMemoria;
	string nuevoNombre, nuevoFormato;
	struct usb ar[3];
	inicializar_arreglo(ar);
	
	do{
		cout << "Indica la Memoria en la que quieres trabajar, o en todo caso la opcion para salir.\n" << endl;
		cout << "1.- " << ar[0].nombre << " " << ar[0].capacidad << " " << ar[0].tipoArchivo  << " " << ar[0].capacidadEnUso << endl; 
		cout << "2.- " << ar[1].nombre  << " " <<  ar[1].capacidad  << " " << ar[1].tipoArchivo  << " " << ar[1].capacidadEnUso << endl; 
		cout << "3.- " <<ar[2].nombre  << " "<< ar[2].capacidad << " " << ar[2].tipoArchivo << " " << ar[2].capacidadEnUso << endl; 
		cout << "4.- Salir \n" << endl;
		cout << "Ingresa tu opcion: ";
		cin >> numMemoria;
		if((numMemoria > 3) || (numMemoria <1))  break;
		system("cls");
		numMemoria--;
		do {
			cout << "SUBMENU\n" << endl;
			cout << "1.- Cambiar el nombre." << endl;
			cout << "2.- Formatear." << endl;
			cout << "3.- Regresar." << endl;
			cout << "Ingresa tu opcion: ";
			cin >>  opcion;
			if( opcion == 1)
			{
				cout << "Ingresa el nuevo nombre: ";
				cin >> nuevoNombre;
				cambiar_nombre(ar, nuevoNombre, numMemoria);
				
			}
			else if( opcion == 2)
			{
				cout << "Ingresa el nuevo nombre: ";
				cin >> nuevoNombre;
				cout << "Ingresa el tipo de formato: ";
				cin >> nuevoFormato;
				formatear(ar, nuevoNombre, nuevoFormato, numMemoria);
				
			}
		} while(opcion != 3);
		
		system("cls");
		
	}while(1);
	
	return 0;
}

void inicializar_arreglo(struct usb *ar)
{
	ar[0].nombre = "USB1";
	ar[0].capacidad = 8;
	ar[0].tipoArchivo = "NTFS";
	ar[0].capacidadEnUso = 5;
	
	ar[1].nombre = "USB2";
	ar[1].capacidad = 4;
	ar[1].tipoArchivo = "FAT32";
	ar[1].capacidadEnUso = 2;
	
	ar[2].nombre = "USB3";
	ar[2].capacidad = 1;
	ar[2].tipoArchivo = "FAT";
	ar[2].capacidadEnUso = 0.5;	
}

void cambiar_nombre(struct usb *ar, string nuevoNombre, int numeroMemoria)
{

	ar[numeroMemoria].nombre = nuevoNombre;
	
	cout << "\nA tu memoria se le ha hecho un cambio en el nombre" << endl;
	cout <<"Presiona una tecla para continuar"<< endl;
	getchar();
	getchar();
	system("cls");
}

void formatear(struct usb *ar, string nuevoNombre, string nuevoFormato, int numeroMemoria)
{

	ar[numeroMemoria].nombre = nuevoNombre;
	ar[numeroMemoria].capacidadEnUso = 0;
	ar[numeroMemoria].tipoArchivo = nuevoFormato;
	cout << "Tu memoria ha sido formateada" << endl;
	cout << "Persiona cualquier tecla para continuar";
	getchar();
	getchar();
	system("cls");
}
