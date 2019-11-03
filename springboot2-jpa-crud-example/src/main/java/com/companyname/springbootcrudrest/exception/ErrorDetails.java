package com.companyname.springbootcrudrest.exception;

import java.util.Date;

public class ErrorDetails {
	
  String mensagem;
  String detalhes;
	
   public ErrorDetails ( Date  timestamp , String mensagem , String  detalhes ) {
       super ();
      // isso.registro de data e hora = registro de data e hora;
      // isso.mensagem = mensagem;
       //isso.detalhes = detalhes;
   }

    public Date getTimestamp () {
        return getTimestamp();
   }

   public  String  getMessage () {
		return mensagem;
   }

   public  String  getDetails () {
		return detalhes;
   }
}