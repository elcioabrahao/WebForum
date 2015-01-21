package br.com.qpainformatica;

import com.google.gson.Gson;

public class GeraGson {

	public static void main(String[] args) {
		
		Mensagem m = new Mensagem();
		m.setAll(0, 1,"Elcio", "20/01/2015", "Alô Mundo !");
		Gson gson = new Gson();
		System.out.println(gson.toJson(m));

	}

}
