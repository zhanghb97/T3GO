package AST;

public class Symbol {
	public static enum Type {tMODULE, tINVALID, tVOID, tINT, tFLOAT, tBOOL, tTIMER, tRECORD,}

    String name;      // All symbols at least have a name
    Type type;
    Scope scope;      // All symbols know what scope contains them.

    public Symbol(String name) { this.name = name; }
    public Symbol(String name, Type type) { this(name); this.type = type; }
    public String getName() { return name; }

    public String toString() {
        if ( type!=Type.tINVALID ) return '<'+getName()+":"+type+'>';
        return getName();
    }
}
