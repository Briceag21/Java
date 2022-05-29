package StudiulIndividual2.java;

import java.util.Comparator;

public class Aparateelectronice {
    int oficiu1[];
    public int oficiu ;
   public String nume;// versiunea aparatului electric
    public int anpro; //anul cand el a fost produs
    public int consumE; //consumul de energie/s
    public int putereW;//puterea maxima a aparatului electronic
public Aparateelectronice( int oficiu ,String nume,int anpro, int consumE, int putereW) {

    this.oficiu=oficiu;
    this.nume = nume;
    this.anpro = anpro;
    this.consumE = consumE;
    this.putereW = putereW; }
    public String getAE() {
        return "Nr oficiu:  "+oficiu+"  Aparatul: "+nume +"  Anul producerii: "+anpro +"  Consum energiei: "+consumE+"  Puterea : "+putereW ; }
    public String   getVolum() {
        return "Nr oficiu: "+oficiu+"  Aparatul: "+nume +"  Anul producerii: "+anpro +"  Consumul energiei timp de o ora :"+(consumE*60*60)+"  Puterea : "+putereW ;    }}
//*****************************************************************************************
        class  Calculator extends  Aparateelectronice{
    String oficiu1[];
   public  String numeBlockdeal ;// denumirea blocului de alimentare a calculatorului
    public Calculator(int oficiu,String nume, String numeBlockdeal, int anpro, int consumE, int putereW) {
        super(oficiu, nume,anpro, consumE, putereW );
        this.numeBlockdeal = numeBlockdeal; }
    public String getNB() { return "  Blocul de alimentare: "+numeBlockdeal; }}
//*****************************************************************************************
    class Boiler extends Aparateelectronice{
     public String numeBoiler;
     public int VolumulL ; //consumul de apa
        public int temp;//tmaxima;
        public Boiler(int oficiu,String numeBoiler,String nume,int VolumulL,int temp, int anpro, int consumE, int putereW) {
            super( oficiu,nume, anpro, consumE, putereW);
            this.numeBoiler=numeBoiler;
            this.VolumulL=VolumulL;
            this.temp =temp; }
        public String getNB() { return "  Denumirea boilerui: "+numeBoiler+"  Volumul in litri: "+VolumulL +"  Temperatura apei: "+temp  ; }}
class Frigider extends Aparateelectronice{
    public String numeFrigider;
 public int tempF;
    public Frigider(int oficiu, String nume, int anpro, int consumE, int putereW, String numeFrigider, int tempF) {
        super(oficiu, nume, anpro, consumE, putereW);
        this.numeFrigider = numeFrigider;
        this.tempF = tempF; }
    public String getNB() {
        return "  Denumirea frigiderului:"+numeFrigider+" Temperatura din interior: "+tempF;
    }}