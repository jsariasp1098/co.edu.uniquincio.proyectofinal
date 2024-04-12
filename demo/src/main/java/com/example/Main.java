package com.example;

import java.util.ArrayList;

public class Main {

        private static ArrayList<Vuelo> vuelos= new ArrayList<Vuelo>();
        private static ArrayList<Piloto> pilotos = new ArrayList<Piloto>();
        private static ArrayList<TorreControl> torres = new ArrayList<TorreControl>();
        private static ArrayList<Aerolinea> aerolineas= new ArrayList<Aerolinea>();
        private static ArrayList<String> vuelosAsignadosp1 = new ArrayList<String>();
        private static ArrayList<String> vuelosAsignadosp2 = new ArrayList<String>();
        private static ArrayList<String> vuelosAsignadosp3 = new ArrayList<String>();
        private static ArrayList<String> asignarTorre1 = new ArrayList<String>();
        private static ArrayList<String> asignarTorre2 = new ArrayList<String>();
        private static ArrayList<String> asignarTorre3 = new ArrayList<String>();
        private static ArrayList<String> asignarTorre4 = new ArrayList<String>();

        public static void imprimirInformacion(ArrayList<String> vuelosAsignadosp1, ArrayList<String> vuelosAsignadosp2,
                                            ArrayList<String> vuelosAsignadosp3, ArrayList<String> asignarTorre1, 
                                            ArrayList<String> asignarTorre2, ArrayList<String> asignarTorre3, 
                                            ArrayList<String> asignarTorre4, ArrayList<Aerolinea> areolineas){
            System.out.println("Vuelos Piloto 1:");
            for (String asigandos1: vuelosAsignadosp1) {
                System.out.println(asigandos1);
            }
                System.out.println("Vuelos asignados Piloto 2: ");
            for (String asinados2 : vuelosAsignadosp2) {
                System.out.println( asinados2 );
            }
            System.out.println("Vuelos asignados Piloto 3: ");
            for (String asinados3 : vuelosAsignadosp3) {
                System.out.println( asinados3 );
            }
            System.out.println("Vuelos asignados Torre 1:");
            for (String asignado1 : asignarTorre1) {
                System.out.println(asignado1);
            }
            System.out.println("vuelos asignados Torre 2");
            for (String asignado2 : asignarTorre2) {
                System.out.println(asignado2);
            }
            System.out.println("vuelos asignados Torre 3");
            for (String asignado3 : asignarTorre3) {
                System.out.println(asignado3);
            }
            System.out.println("vuelos asignados Torre 4");
            for (String asignado4 : asignarTorre4) {
                System.out.println(asignado4);
            }
            System.out.println("Informacion Aerolinea");
            /*for (Aerolinea aerolinea : aerolineas) {
                System.out.println("Aerolinea: " + aerolinea.getNombreAerolinea() + " | Vuelos Programados: " +
                                    aerolinea.getVuelosProgramados() + " | Vuelos Operados: " + aerolinea.getVuelosOperados()
                                    + " | Vuelos Cancelados:" + aerolinea.getVuelosCancelados());
            }*/
            if(aerolineas.get(0).getVuelosProgramados() > aerolineas.get(0).getVuelosOperados()){
                if(aerolineas.get(0).getVuelosProgramados() > aerolineas.get(0).getVuelosCancelados()){
                    if(aerolineas.get(0).getVuelosOperados() > aerolineas.get(0).getVuelosCancelados()){
                        System.out.println("Aerolinea: " +aerolineas.get(0).getNombreAerolinea() + 
                        " | Vuelos Programados: " + + aerolineas.get(0).getVuelosProgramados() + 
                        " | Vuelos Operados: " + aerolineas.get(0).getVuelosOperados() + " | Vuelos Cancelados: "
                         + aerolineas.get(0).getVuelosCancelados());
                    }else{
                        System.out.println("Aerolinea: " +aerolineas.get(0).getNombreAerolinea() + 
                        " | Vuelos Programados: " + + aerolineas.get(0).getVuelosProgramados() +  
                        " | Vuelos Cancelados: " + aerolineas.get(0).getVuelosCancelados() + " | Vuelos Operados: " 
                        + aerolineas.get(0).getVuelosOperados());
                    }
                }else{
                    System.out.println("Aerolinea: " +aerolineas.get(0).getNombreAerolinea() +
                        " | Vuelos Cancelados: " + aerolineas.get(0).getVuelosCancelados() + 
                        " | Vuelos Programados: " + + aerolineas.get(0).getVuelosProgramados() +  
                         " | Vuelos Operados: " + aerolineas.get(0).getVuelosOperados());
                }
            }else if(aerolineas.get(0).getVuelosProgramados()>aerolineas.get(0).getVuelosCancelados()){
                    System.out.println("Aerolinea: " +aerolineas.get(0).getNombreAerolinea() +
                    " | Vuelos Operados: " + aerolineas.get(0).getVuelosOperados() + 
                        " | Vuelos Programados: " + + aerolineas.get(0).getVuelosProgramados() +  
                         " | Vuelos Cancelados: " + aerolineas.get(0).getVuelosCancelados() );
            }else if(aerolineas.get(0).getVuelosOperados() > aerolineas.get(0).getVuelosCancelados()){
                System.out.println("Aerolinea: " +aerolineas.get(0).getNombreAerolinea() + " | Vuelos Operados: " 
                        + aerolineas.get(0).getVuelosOperados() + " | Vuelos Cancelados: " + 
                        aerolineas.get(0).getVuelosCancelados() +  " | Vuelos Programados: " 
                        + aerolineas.get(0).getVuelosProgramados());
            }else{
                System.out.println("Aerolinea: " +aerolineas.get(0).getNombreAerolinea()  + " | Vuelos Cancelados: " + 
                        aerolineas.get(0).getVuelosCancelados() + " | Vuelos Operados: " 
                        + aerolineas.get(0).getVuelosOperados() +  " | Vuelos Programados: " 
                        + aerolineas.get(0).getVuelosProgramados());
            }
            if(aerolineas.get(1).getVuelosProgramados() > aerolineas.get(1).getVuelosOperados()){
                if(aerolineas.get(1).getVuelosProgramados() > aerolineas.get(1).getVuelosCancelados()){
                    if(aerolineas.get(1).getVuelosOperados() > aerolineas.get(1).getVuelosCancelados()){
                        System.out.println("Aerolinea: " +aerolineas.get(1).getNombreAerolinea() + 
                        " | Vuelos Programados: " + + aerolineas.get(1).getVuelosProgramados() + 
                        " | Vuelos Operados: " + aerolineas.get(1).getVuelosOperados() + " | Vuelos Cancelados: "
                         + aerolineas.get(1).getVuelosCancelados());
                    }else{
                        System.out.println("Aerolinea: " +aerolineas.get(1).getNombreAerolinea() + 
                        " | Vuelos Programados: " + + aerolineas.get(1).getVuelosProgramados() +  
                        " | Vuelos Cancelados: " + aerolineas.get(1).getVuelosCancelados() + " | Vuelos Operados: " 
                        + aerolineas.get(1).getVuelosOperados());
                    }
                }else{
                    System.out.println("Aerolinea: " +aerolineas.get(1).getNombreAerolinea() +
                        " | Vuelos Cancelados: " + aerolineas.get(1).getVuelosCancelados() + 
                        " | Vuelos Programados: " + + aerolineas.get(1).getVuelosProgramados() +  
                         " | Vuelos Operados: " + aerolineas.get(1).getVuelosOperados());
                }
            }else if(aerolineas.get(1).getVuelosProgramados()>aerolineas.get(1).getVuelosCancelados()){
                    System.out.println("Aerolinea: " +aerolineas.get(1).getNombreAerolinea() +
                    " | Vuelos Operados: " + aerolineas.get(1).getVuelosOperados() + 
                        " | Vuelos Programados: " + + aerolineas.get(1).getVuelosProgramados() +  
                         " | Vuelos Cancelados: " + aerolineas.get(1).getVuelosCancelados() );
            }else if(aerolineas.get(1).getVuelosOperados() > aerolineas.get(1).getVuelosCancelados()){
                System.out.println("Aerolinea: " +aerolineas.get(1).getNombreAerolinea() + " | Vuelos Operados: " 
                        + aerolineas.get(1).getVuelosOperados() + " | Vuelos Cancelados: " + 
                        aerolineas.get(1).getVuelosCancelados() +  " | Vuelos Programados: " 
                        + aerolineas.get(1).getVuelosProgramados());
            }else{
                System.out.println("Aerolinea: " +aerolineas.get(1).getNombreAerolinea()  + " | Vuelos Cancelados: " + 
                        aerolineas.get(1).getVuelosCancelados() + " | Vuelos Operados: " 
                        + aerolineas.get(1).getVuelosOperados() +  " | Vuelos Programados: " 
                        + aerolineas.get(1).getVuelosProgramados());
            }
        }

    public static void main(String[] args) {

        // CReando Aerolineas
        aerolineas.add(new Aerolinea("Armenia Airline", 0, 0, 0));
        aerolineas.add(new Aerolinea("Bogota Airline", 0, 0, 0));

        //Creando pilotos
        Piloto p1 = new Piloto(null, "123456", "Calos", "Carga");
        p1.setNombreAerolinea("Armenia Airline");
        pilotos.add(p1);
        Piloto p2 = new Piloto(null, "123567", "Pablo", "Internacional");
        p2.setNombreAerolinea("Bogota Airline");
        pilotos.add(p2);
        Piloto p3 = new Piloto(null, "124567", "Camilo", "Domestico");
        p3.setNombreAerolinea("Armenia Airline");
        pilotos.add(p3);
       
        // Creando torres

        torres.add(new TorreControl(0, "Armenia", "armenia@armenia.com", "3123333333"));
        torres.add(new TorreControl(1, "Bogota", "bogota@bogota.com", "312555555"));
        torres.add(new TorreControl(2, "Ciudad de Panama", "ciudadpanama@ciudadpanama.com", "315244444"));
        torres.add(new TorreControl(3, "New York", "newyork@newyorka.com", "3141223333"));
        
        //creando vuelos

        Vuelo v1 = new Vuelo(null,"A3654", "Armenia-Bogota", "Armenia", "1","23/12/2023-10:00", "23/12/2023-11:00",  
                            "Cancelado", 0, 0);
        v1.setTipoLicencia("Carga");
        v1.setIdTorreControl(0);
        vuelos.add(v1); //vuelo de carga
        Vuelo v2 = new Vuelo(null, "A3655", "Bogota-Armenia", "Bogota", "1","23/12/2023-08:00", "23/12/2023-09:00",  
                            "Programado", 110, 1);
        v2.setTipoLicencia("Domestica");
        v2.setIdTorreControl(1);
        vuelos.add(v2); //vuelo domestico
        Vuelo v3 = new Vuelo(null, "A3656", "Bogota-Ciudad de Panama", "Bogota", "2","23/12/2023-06:00", "23/12/2023-11:00",  
                            "Programado", 200, 1);
        v3.setTipoLicencia("Internacional");
        v3.setIdTorreControl(1);
        vuelos.add(v3); //vuelo internacional
        Vuelo v4 = new Vuelo(null, "A3657", "New York-Armenia", "New York", "5","23/12/2023-06:00", "23/12/2023-12:00",  
                            "Despego", 100, 3);
        v4.setTipoLicencia("Internacional");
        v4.setIdTorreControl(3);
        vuelos.add(v4);
        Vuelo v5 = new Vuelo(null, "A3658", "Armenia-Medellin", "Armenia", "2","23/12/2023-10:00", "23/12/2023-11:00",  
                            "Programado", 80, 0);
        v5.setTipoLicencia("Domestica");
        v5.setIdTorreControl(0);
        vuelos.add(v5);
        Vuelo v6 = new Vuelo(null, "A3659", "Armenia-Bogota", "Armenia", "1","23/12/2023-10:00", "23/12/2023-11:00",  
                            "Programado", 150, 0);
        v6.setTipoLicencia("Domestica");
        v6.setIdTorreControl(0);
        vuelos.add(v6);
        Vuelo v7 = new Vuelo(null, "A3660", "Bogota-Medellin", "Bogota", "1","23/12/2023-14:00", "23/12/2023-15:00",  
                            "Cancelado", 200, 0);
        v7.setTipoLicencia("Domestica");
        v7.setIdTorreControl(1);
        vuelos.add(v7);
        Vuelo v8 = new Vuelo(null, "A3661", "Medellin-Armenia", "Armenia", "1","23/12/2023-10:00", "23/12/2023-11:00",  
                            "Aterrizo", 100, 0);
        v8.setTipoLicencia("Domestica");
        v8.setIdTorreControl(1);
        vuelos.add(v8);
        Vuelo v9 = new Vuelo(null, "A3662", "Ciudad de Panama-Bogota", "Ciudad de Panama", "3","23/12/2023-14:00", "23/12/2023-19:00",  
                            "Cancelado", 250, 0);
        v9.setTipoLicencia("Internacional");
        v9.setIdTorreControl(2);
        vuelos.add(v9);
        Vuelo v10 = new Vuelo(null, "A3663", "Armenia-New York", "Armenia", "2","23/12/2023-14:00", "23/12/2023-18:00",  
                            "Aterrizo", 100, 0);
        v10.setTipoLicencia("Internacional");
        v10.setIdTorreControl(1);
        vuelos.add(v10);
       
        int prog=0, operados=0, cancelado=0;

        //saber que vuelos se asignan a cada piloto      
        for (int i = 0; i < vuelos.size(); i++) {
            if(vuelos.get(i).getTipoLicencia()=="Domestica"){
                for(int j=0; j< pilotos.size(); j++){
                    if(pilotos.get(j).getTipoLicencia() == "Domestico"){
                        vuelosAsignadosp3.add(vuelos.get(i).getNumVuelo());
                    }
                }
            }else if(vuelos.get(i).getTipoLicencia()== "Internacional"){
                for(int j=0; j< pilotos.size(); j++){
                    if(pilotos.get(j).getTipoLicencia() == "Internacional"){
                        vuelosAsignadosp2.add(vuelos.get(i).getNumVuelo());
                    }
                }
            }else {
                for(int j=0; j< pilotos.size(); j++){
                    if(pilotos.get(j).getTipoLicencia() == "Internacional"){
                        vuelosAsignadosp1.add(vuelos.get(i).getNumVuelo());
                    }
                }
            }
        }
        //Agregar vuelos a aerolineas
        for(int i=0; i<vuelosAsignadosp1.size(); i++){
            for(int j=0; j<vuelos.size(); j++){
                if(vuelosAsignadosp1.get(i) == vuelos.get(j).getNumVuelo()){
                    if(vuelos.get(j).getEstado()=="Programado"){
                        prog ++;
                    }else if((vuelos.get(j).getEstado()=="Despego")||(vuelos.get(j).getEstado()=="Aterrizo")||(vuelos.get(j).getEstado()=="En el aire")){
                        operados ++;
                    }else{
                        cancelado ++;
                    }
                }
            }
        }
        for(int i=0; i<vuelosAsignadosp3.size(); i++){
            for(int j=0; j<vuelos.size(); j++){
                if(vuelosAsignadosp3.get(i) == vuelos.get(j).getNumVuelo()){
                    if(vuelos.get(j).getEstado()=="Programado"){
                        prog ++;
                    }else if((vuelos.get(j).getEstado()=="Despego")||(vuelos.get(j).getEstado()=="Aterrizo")||(vuelos.get(j).getEstado()=="En el aire")){
                        operados ++;
                    }else{
                        cancelado ++;
                    }
                }
            }
        }
       
        aerolineas.get(0).setVuelosProgramados(prog);
        aerolineas.get(0).setVuelosOperados(operados);
        aerolineas.get(0).setVuelosCancelados(cancelado);

        prog =0;
        operados =0;
        cancelado =0;

        for(int i=0; i<vuelosAsignadosp2.size(); i++){
            for(int j=0; j<vuelos.size(); j++){
                if(vuelosAsignadosp2.get(i) == vuelos.get(j).getNumVuelo()){
                    if(vuelos.get(j).getEstado()=="Programado"){
                        prog ++;
                    }else if((vuelos.get(j).getEstado()=="Despego")||(vuelos.get(j).getEstado()=="Aterrizo")||(vuelos.get(j).getEstado()=="En el aire")){
                        operados ++;
                    }else{
                        cancelado ++;
                    }
                }
            }
        }

        aerolineas.get(1).setVuelosProgramados(prog);
        aerolineas.get(1).setVuelosOperados(operados);
        aerolineas.get(1).setVuelosCancelados(cancelado);
    
        //saber que vuelos tiene asignados cada torre

        for(int i=0; i<vuelos.size(); i++){
            if(vuelos.get(i).getIdTorreControl() == 0){
                asignarTorre1.add(vuelos.get(i).getNumVuelo());
            }else if(vuelos.get(i).getIdTorreControl() == 1){
                asignarTorre2.add(vuelos.get(i).getNumVuelo());
            }else if(vuelos.get(i).getIdTorreControl() == 2){
                asignarTorre3.add(vuelos.get(i).getNumVuelo());
            }else {
                asignarTorre4.add(vuelos.get(i).getNumVuelo());
            }
        }
        imprimirInformacion(vuelosAsignadosp1, vuelosAsignadosp2, vuelosAsignadosp3, asignarTorre1, 
                            asignarTorre2, asignarTorre3, asignarTorre4, aerolineas);
    }
}