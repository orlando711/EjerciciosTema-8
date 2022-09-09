package com.open_bootcamp;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setEdad(42);
        persona.setNombre("Juan Perez");
        persona.setTelefono(381,5573889);

        System.out.println(persona.getEdad());
        System.out.println(persona.getNombre());
        System.out.println(persona.getCodearea() +"-"+ persona.getTelefono());

    }
}

    class Persona{

        private int edad;
        private String nombre;
        private int codearea, telefono;

        public void setEdad(int edad){
            this.edad=edad;
        }

        public int getEdad(){
            return this.edad;
        }

        public void setNombre(String nombre){
            this.nombre=nombre;
        }

        public String getNombre(){
            return this.nombre;
        }

        public void setTelefono(int codearea, int telefono){
            this.codearea=codearea;
            this.telefono=telefono;
        }

        public int getTelefono(){
            return this.telefono;
        }
        public int getCodearea(){
            return this.codearea;
        }
    }

