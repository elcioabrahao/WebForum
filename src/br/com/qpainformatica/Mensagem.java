package br.com.qpainformatica;


import java.io.*;
import java.sql.*;
import java.util.*;
import java.math.*;

 /**
  * Mensagem Value Object.
  * This class is value object representing database table forum_mensagem
  * This class is intented to be used together with associated Dao object.
  */

 /**
  * This sourcecode has been generated by FREE DaoGen generator version 2.4.1.
  * The usage of generated code is restricted to OpenSource software projects
  * only. DaoGen is available in http://titaniclinux.net/daogen/
  * It has been programmed by Tuomo Lukka, Tuomo.Lukka@iki.fi
  *
  * DaoGen license: The following DaoGen generated source code is licensed
  * under the terms of GNU GPL license. The full text for license is available
  * in GNU project's pages: http://www.gnu.org/copyleft/gpl.html
  *
  * If you wish to use the DaoGen generator to produce code for closed-source
  * commercial applications, you must pay the lisence fee. The price is
  * 5 USD or 5 Eur for each database table, you are generating code for.
  * (That includes unlimited amount of iterations with all supported languages
  * for each database table you are paying for.) Send mail to
  * "Tuomo.Lukka@iki.fi" for more information. Thank you!
  */



public class Mensagem implements Cloneable, Serializable {

    /** 
     * Persistent Instance variables. This data is directly 
     * mapped to the columns of database table.
     */
    private int id;
    private int idCliente;
    private String nomeCliente;
    private String data;
    private String mensagem;



    /** 
     * Constructors. DaoGen generates two constructors by default.
     * The first one takes no arguments and provides the most simple
     * way to create object instance. The another one takes one
     * argument, which is the primary key of the corresponding table.
     */

    public Mensagem () {

    }

    public Mensagem (int idIn) {

          this.id = idIn;

    }


    /** 
     * Get- and Set-methods for persistent variables. The default
     * behaviour does not make any checks against malformed data,
     * so these might require some manual additions.
     */

    public int getId() {
          return this.id;
    }
    public void setId(int idIn) {
          this.id = idIn;
    }

    public int getIdCliente() {
          return this.idCliente;
    }
    public void setIdCliente(int idClienteIn) {
          this.idCliente = idClienteIn;
    }

    public String getNomeCliente() {
          return this.nomeCliente;
    }
    public void setNomeCliente(String nomeClienteIn) {
          this.nomeCliente = nomeClienteIn;
    }

    public String getData() {
          return this.data;
    }
    public void setData(String dataIn) {
          this.data = dataIn;
    }

    public String getMensagem() {
          return this.mensagem;
    }
    public void setMensagem(String mensagemIn) {
          this.mensagem = mensagemIn;
    }



    /** 
     * setAll allows to set all persistent variables in one method call.
     * This is useful, when all data is available and it is needed to 
     * set the initial state of this object. Note that this method will
     * directly modify instance variales, without going trough the 
     * individual set-methods.
     */

    public void setAll(int idIn,
          int idClienteIn,
          String nomeClienteIn,
          String dataIn,
          String mensagemIn) {
          this.id = idIn;
          this.idCliente = idClienteIn;
          this.nomeCliente = nomeClienteIn;
          this.data = dataIn;
          this.mensagem = mensagemIn;
    }


    /** 
     * hasEqualMapping-method will compare two Mensagem instances
     * and return true if they contain same values in all persistent instance 
     * variables. If hasEqualMapping returns true, it does not mean the objects
     * are the same instance. However it does mean that in that moment, they 
     * are mapped to the same row in database.
     */
    public boolean hasEqualMapping(Mensagem valueObject) {

          if (valueObject.getId() != this.id) {
                    return(false);
          }
          if (valueObject.getIdCliente() != this.idCliente) {
                    return(false);
          }
          if (this.nomeCliente == null) {
                    if (valueObject.getNomeCliente() != null)
                           return(false);
          } else if (!this.nomeCliente.equals(valueObject.getNomeCliente())) {
                    return(false);
          }
          if (this.data == null) {
                    if (valueObject.getData() != null)
                           return(false);
          } else if (!this.data.equals(valueObject.getData())) {
                    return(false);
          }
          if (this.mensagem == null) {
                    if (valueObject.getMensagem() != null)
                           return(false);
          } else if (!this.mensagem.equals(valueObject.getMensagem())) {
                    return(false);
          }

          return true;
    }



    /**
     * toString will return String object representing the state of this 
     * valueObject. This is useful during application development, and 
     * possibly when application is writing object states in textlog.
     */
    public String toString() {
        StringBuffer out = new StringBuffer(this.getDaogenVersion());
        out.append("\nclass Mensagem, mapping to table forum_mensagem\n");
        out.append("Persistent attributes: \n"); 
        out.append("id = " + this.id + "\n"); 
        out.append("idCliente = " + this.idCliente + "\n"); 
        out.append("nomeCliente = " + this.nomeCliente + "\n"); 
        out.append("data = " + this.data + "\n"); 
        out.append("mensagem = " + this.mensagem + "\n"); 
        return out.toString();
    }


    /**
     * Clone will return identical deep copy of this valueObject.
     * Note, that this method is different than the clone() which
     * is defined in java.lang.Object. Here, the retuned cloned object
     * will also have all its attributes cloned.
     */
    public Object clone() {
        Mensagem cloned = new Mensagem();

        cloned.setId(this.id); 
        cloned.setIdCliente(this.idCliente); 
        if (this.nomeCliente != null)
             cloned.setNomeCliente(new String(this.nomeCliente)); 
        if (this.data != null)
             cloned.setData(new String(this.data)); 
        if (this.mensagem != null)
             cloned.setMensagem(new String(this.mensagem)); 
        return cloned;
    }



    /** 
     * getDaogenVersion will return information about
     * generator which created these sources.
     */
    public String getDaogenVersion() {
        return "DaoGen version 2.4.1";
    }

}
