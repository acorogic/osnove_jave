package p09_19_2023.Zadatak2;

import java.util.ArrayList;

public class Disciplina  {

private Atleticar atleticar;
    private String discipline;
    private String disciplineType; //run or jump

     private ArrayList <Atleticar> atleticari ;

    public Disciplina(String discipline, String disciplineType) {
        this.discipline = discipline;
        this.disciplineType = disciplineType;
        this.atleticari= new ArrayList<>();
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public String getDisciplineType() {
        return disciplineType;
    }

    public void setDisciplineType(String disciplineType) {
        this.disciplineType = disciplineType;
    }

    public ArrayList<Atleticar> getAtleticari() {
        return atleticari;
    }

    public void setAtleticari(ArrayList<Atleticar> atleticari) {
        this.atleticari = atleticari;
    }
    public void addAtleticar(Atleticar atleticar) {
        this.atleticari.add(atleticar);
    }

    public void disqualifyAtleticar(String disqualifyName)
    {
        for (int i = 0; i <atleticari.size() ; i++) {
            if (atleticari.get(i).getName().equals(disqualifyName)) {this.atleticari.remove(i);}


        }
    }

    public Atleticar bestAteleticar () {
        Atleticar najboljiAtleta= this.atleticari.get(0);
        double najboljiRezultat=0;
        for (int i = 0; i < this.atleticari.size(); i++) {
            Double rezultat=atleticari.get(i).result;

            if (najboljiRezultat>rezultat) {najboljiRezultat=rezultat;
                najboljiAtleta= this.atleticar;}





        }

        return najboljiAtleta;
}
}
