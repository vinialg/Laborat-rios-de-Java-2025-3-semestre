package construtores;

public class Data {
	/*
	 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
	 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
	 */

	/**
	 *
	 * @author unievgimenez
	 */
	private int ano;
	private int mes;
	private int dia;
	private int diaj;
	private String mes_ext;
	
	public Data(){
	    /*this.dia = 2;
	this.mes = 27;
	this.ano = 2025;  */     
	}

   /*public Data(){
        this.dia = 2;
        this.mes = 27;
        this.ano = 2025;       
   */

	public int getDia(){
	    return dia;
	}
	
	public int getMes(){
	    return mes;
	}
	
	public int getAno(){
	    return ano;
	}
	
	public void setDia(int dia){
	    this.dia = dia;
	}
	
	public void setDiaj(int diaj){
	    this.diaj = diaj;
	}
	public void setMes(int mes){
	    this.mes = mes;
	}
	
	public void setAno(int ano){
	    this.ano = ano;
	}
	
	public void setMes_ext(String mes_ext){
	    this.mes_ext = mes_ext;
	}
	
	public void exibicaoGreg1(){
	    System.out.println(mes + "/" + dia + "/" + ano);
	}
	
	public void exibicaoGreg2(){
	    System.out.println(mes_ext + " " + dia + " " + ano);
	}
	
	public void exibicaoGreg3(){
	    System.out.println(diaj + "/" + ano);
	}
	
	
	public Data(int dia, int mes, int ano){
	    this.dia = dia;
	    this.mes = mes;
	    this.ano = ano;
	    
	}
	
	public Data(int dia, String mes_ext, int ano){
	    this.dia = dia;
	    this.mes_ext = mes_ext;
	    this.ano = ano;
	    
	}
	
	public Data(int diaj, int ano){
	    this.diaj = diaj;
	    this.ano = ano;
	}
	
	public void mesParanum(String mes_ext, int dia, int ano){
	    this.dia = dia;
	    this.ano = ano;
	    switch (mes_ext) {
	        case "Janeiro":
	    this.mes = 1;
	    break;
		case "Fevereiro":
		    this.mes = 2;
		    break;
		case "Março":
		    this.mes = 3;
		    break;
		case "Abril":
		    this.mes = 4;
		    break;
		case "Maio":
		    this.mes = 5;
		    break;
		case "Junho":
		    this.mes = 6;
		    break;
		case "Julho":
		    this.mes = 7;
		    break;
		case "Agosto":
		    this.mes = 8;
		    break;
		case "Setembro":
		    this.mes = 9;
		    break;
		case "Outubro":
		    this.mes = 10;
		    break;
		case "Novembro":
		    this.mes = 11;
		    break;
		case "Dezembro":
            this.mes = 12;
            break;
        default:
            this.mes = 1;
            break;
	    }
	}
	  
	    
	    /*1 certo*/
	public void dataAbrevia(int mes, int ano, int dia){
	    this.dia = dia;
	    this.ano = ano;
	    switch (mes) {
	        case 1:
	            this.mes_ext = "JAN";
	            System.out.println(this.mes_ext);
	            break;
			case 2:
			    this.mes_ext = "FEV";
			    System.out.println(this.mes_ext);
			    break;
			case 3:
			    this.mes_ext = "MAR";
			    System.out.println(this.mes_ext);
			    break;
			case 4:
			    this.mes_ext = "ABR";
			    System.out.println(this.mes_ext);
			    break;
			case 5:
			    this.mes_ext = "MAIO";
			    System.out.println(this.mes_ext);
			    break;
			case 6:
			    this.mes_ext = "JUN";
			    System.out.println(this.mes_ext);
			    break;
			case 7:
			    this.mes_ext = "JUL";
			    System.out.println(this.mes_ext);
			    break;
			case 8:
			    this.mes_ext = "AUG";
			    System.out.println(this.mes_ext);
			    break;
			case 9:
			    this.mes_ext = "SET";
			    System.out.println(this.mes_ext);
			    break;
			case 10:
			    this.mes_ext = "OUT";
			    System.out.println(this.mes_ext);
			    break;
			case 11:
			    this.mes_ext = "NOV";
			    System.out.println(this.mes_ext);
			    break;
			case 12:
			    this.mes_ext = "DEZ";
			    System.out.println(this.mes_ext);
			    break;
			default:
			    this.mes_ext = "JAN";
			    System.out.println(this.mes_ext);
			    break;
		}
	}

    public void diaMes(int dia, int ano){
        if(dia <= 0){
            this.dia = 1;
            this.mes = 1;
        } else if(dia <= 31){
            this.dia = dia;
            this.mes =1;
        } else if(dia <= 59){
            this.dia = dia-31;
            this.mes = 2;
        } else if(dia <= 90){
            this.dia = dia-59;
            this.mes = 3;
        } else if (dia <= 120){
            this.dia = dia - 59;
            this.mes = 4;
        } else if (dia <= 151){
            this.dia = dia - 120;
            this.mes = 5;
        } else if (dia <= 181){
            this.dia = dia - 151;
            this.mes = 6;
        } else if (dia <= 212){
            this.dia = dia - 181;
            this.mes = 7;
        } else if (dia <= 243){
            this.dia = dia - 212;
            this.mes = 8;
        } else if (dia <= 273){
            this.dia = dia - 243;
            this.mes = 9;
        } else if(dia <= 304){
            this.dia = dia - 273;
            this.mes = 10;
        } else if(dia <= 334){
            this.dia = dia - 304;
            this.mes = 11;
        } else if(dia <= 365){
            this.dia = dia - 334;
            this.mes = 12;
        } else{
            this.dia = 1;
            this.mes = 1;
        }
        this.ano = ano;
    }
    public void diaJuliano(int dia) {
	    if(dia <= 31) {
	        this.mes = 1;
	        this.diaj = dia;
	    } else if(dia <= 60) {
	        this.mes = 2;
	        this.diaj = 31 + this.dia;
	    } else if(dia <= 91) {
	        this.mes = 3;
	        this.diaj = 60 + this.dia;
	    } else if(dia <= 121) {
	        this.mes = 4;
	        this.diaj = 91 + this.dia;
	    } else if(dia <= 152) {
	        this.mes = 5;
	        this.diaj = 121 + this.dia;
	    } else if(dia <= 182) {
	        this.mes = 6;
	        this.diaj = 152 + this.dia;
	    } else if(dia <= 213) {
	        this.mes = 7;
	        this.diaj = 182 + this.dia;
	    } else if(dia <= 244) {
	        this.mes = 8;
	        this.diaj = 213 + this.dia;
	    } else if(dia <= 274) {
	        this.mes = 9;
	        this.diaj = 244 + this.dia;
	    } else if(dia <= 305) {
	        this.mes = 10;
	        this.diaj = 274 + this.dia;
	    } else if(dia <= 335) {
	        this.mes = 11;
	        this.diaj = 305 + this.dia;
	    } else {
	        this.mes = 12;
	        this.diaj = 335 + this.dia;
	    }
    }
}

    




