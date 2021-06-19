package be.unamur.info.b314.compiler;

public class VariableModel {
    private String type;
    private String nom;
    private Kind kind;
    private Object valueReturn;
    private Object valeur;

    public VariableModel(String _type, String _nom) {
        this.setType(_type);
        this.nom = _nom;
        this.valeur = null;
        this.setKind(Kind.FIELD);
    }

    public Object getValeur() {
        return valeur;
    }

    public void setValeur(Object _valeur) {
        this.valeur = _valeur;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Kind getKind() {
        return kind;
    }

    public void setKind(Kind kind) {
        this.kind = kind;
    }

    public Object getValueReturn() {
        return valueReturn;
    }

    public void setValueReturn(Object valueReturn) {
        this.valueReturn = valueReturn;
    }
}
