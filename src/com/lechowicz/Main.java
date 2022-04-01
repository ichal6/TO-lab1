package com.lechowicz;

public class Main {

    public static void main(String[] args) {
        Catalog listOfSubject = new Catalog("List of subject", null);

        Catalog term6 = new Catalog("Term 6", listOfSubject);

        Catalog term5 = new Catalog("Term 5", listOfSubject);

        Catalog TO = new Catalog("Technologie Obiektowe", term6);

        Catalog JS = new Catalog("Języki Symboliczne", term5);

        File noteLab1 = new File("Note", TO, "Notatka z zajęć 20.03.2022".getBytes());

        File noteLab2 = new File("Note", TO, "Notatka z zajęć 20.03.2022".getBytes());

        File noteLab3 = new File("Note", JS, "Notaka z poprzedniego semstru".getBytes());

        TO.addElement(noteLab1);
        TO.addElement(noteLab2);
        JS.addElement(noteLab3);

        System.out.println(JS.getElement(noteLab3).getName());
        NodeProxy nodeProxy1 = new NodeProxy(noteLab1);

        nodeProxy1.setName("Inny");

        nodeProxy1.setParent(term5);

        NodeProxy nodeProxy2 = new NodeProxy(JS);


        System.out.println(JS.getName());
        nodeProxy2.setName("JS");
        System.out.println(nodeProxy2.getName());
        System.out.println(JS.getName());
    }
}
