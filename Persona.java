public abstract class Persona {
  private String apellido;
  public String getApellido() {
    return apellido;
  }
  public void setApellido(String apellido) {
    this.apellido = apellido;
  }
  public Persona(String apellido) {
    super();
    this.apellido = apellido;
  }
  
  public abstract int  ejercitarse() ;
}