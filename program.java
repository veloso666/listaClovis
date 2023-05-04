// Programa exemplo de Lista - Listas de Pessoas (vetor estático)
package lista;
import java.util.Arrays;
import java.util.Scanner;
 public class program {
  public static void main(String[] args) {
  int[] cod = new int[10];
 String nome[] = new String[10];
 String email[] = new String[10];
 Arrays.fill(nome, ""); Arrays.fill(email, "");
 int opcao =0, ind =0,codpes =0;
 while (opcao < 7) {
 Scanner entrada = new Scanner(System.in);
 System.out.println("======================================");
 System.out.println("*** L I S T A D E P E S S O A S ***");
System.out.println("1 = Incluir na lista");
 System.out.println("2 = Excluir na lista");
 System.out.println("3 = Mostrar a Lista");
 System.out.println("4 = Organizar lista");
 System.out.println("5 = Alterar ");
 System.out.println("6 = total de elementos ");
 System.out.println("7 = Finalizar ");
 System.out.print("Digite sua Opção : ");
 opcao = entrada.nextInt();
 if (opcao == 1) {
  if((ind -1) >= 1) {
	  System.out.println("Lista cheia");
  }else {
	  cod[ind]=ind+1;
	  ind=ind+1;
	  System.out.println("Incluir Pessoa n."+ind);
	  System.out.print("Nome : ");
	  Scanner entrada2 = new Scanner(System.in);
	  nome[ind-1] = entrada2.nextLine();
	  System.out.print("Email: ");
	  Scanner entrada3 = new Scanner(System.in);
	  email[ind-1] = entrada3.nextLine();
  }
 } else if (opcao == 2) {
 System.out.print("Digite o Código da Pessoa para excluir : "
);
 codpes = entrada.nextInt();
 if (codpes > 0 && codpes < 11) {
 cod[codpes-1]=0;
 nome[codpes-1]="";
 email[codpes-1]="";
 System.out.println("Pessoa excluida da Lista !" );
 }
 } else if (opcao == 3) {
 System.out.println("Codigo Nome Email") ;
 System.out.println
("===========================================") ;
 for (int i=0; i<10; i++) {
 System.out.println(cod[i]+" "+nome[i]+" "+email[i]);
 }
 } else if (opcao == 4) {
 for (int i=0; i<10; i++) {


//Prog4.java quinta-feira, 4 de maio de 2023 13:20
 if (cod[i] == 0 ) {
 for (int y=i+1; y<10; y++) {
 if (cod[y] > 0) {
 cod [i] = cod[y];
 nome [i] = nome[y];
 email[i] = email[y];
 //**
 cod [y]=0;
 nome [y]="";
 email[y]="";
 }
 }
 }
 } System.out.println("Lista Organizada !" );
 }
 else if(opcao == 5) {
	 System.out.print("Digite o Código da Pessoa para excluir : " );
			  codpes = entrada.nextInt();
			  System.out.println("Codigo Nome Email") ;
			  System.out.println
			 ("===========================================") ;
			  System.out.println(cod[codpes]+" "+nome[codpes]+" "+email[codpes]);
			  System.out.println("Digite o novo nome: ");
			  nome[codpes] = entrada.next();
			  System.out.println("Digite o novo email: ");
			  email[codpes] = entrada.next();
			  	
 }
 else if(opcao == 6) {
	 System.out.println("total de elementos: "+cod[codpes +1]);
 }
 System.out.println("### Fim de Execução ###");
 } }}