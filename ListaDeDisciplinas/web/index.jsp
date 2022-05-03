<%-- 
    Document   : index
    Created on : 2 de mai. de 2022, 21:15:39
    Author     : Fatec
--%>

<%@page import="java.util.Calendar"%>
<%@page import="java.util.ArrayList"%>
<%@page import="disciplinas.Disciplina"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%  
   
    Disciplina poo = new Disciplina("ILP007", "Programação Orientada a Objeto", "JAVA,JSP,SERVLETS", "Segunda-Feira", "19:00");
    Disciplina meto = new Disciplina("TTG001", "Metodologia da Pesquisa Cientifica Tecnologica", "ABNT, Pesquisa Cientifica, Artigo Cientifico", "Sexta-Feira", "19:00");
    Disciplina banco = new Disciplina("IBD002", "Bando de dados", "Modelo conceitual, lógico e físico. SQL Oracle", "Sabado", "08:00");
    Disciplina so = new Disciplina("ISO200", "Sistemas Operacionais II", "Linux, Open-Source, Android, Mac OSX", "Terça-Feira", "19:00");
    Disciplina eng = new Disciplina("IES300", "Engenharia de Software III ", "Arquitetura de Software", "Quinta-Feira", "19:00");
    Disciplina ingles = new Disciplina("LIN400", "Inglês IV ", "Simple Past, Speaking, Job Apply", "Sexta-Feira", "21:00");
    Disciplina ling = new Disciplina("ILP512", "Linguagem de Programação IV ", "PHP", "Quarta-Feira", "19:00");
    
    ArrayList<Disciplina> lista = new ArrayList();
    lista.add(poo);
    lista.add(so);
    lista.add(ling);
    lista.add(eng);
    lista.add(meto);
    lista.add(ingles);
    lista.add(banco);
    
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lista de Disciplinas</h1>
        <div>

    <%Date agora = new Date();%>

        <div>
        <% out.print(agora);%>
        <hr/>
        </div>

            <h1>Nome:</h1>
            <h4>Hugo Sergio Alves de Souza</h4>
            <h4>Edhoni Bergue Gois Oliveira</h4>
        </div>
            
            <table border="1">
            <tr>
                <th>Sigla</th>
                <th>Nome</th>
                <th>Ementa</th>
                <th>Dia da Semana</th>
                <th>Horario</th>
            </tr>
            <%for(Disciplina p: lista){%>
            <tr>
                <td><%= (p.getNome()!=null)?p.getNome():"" %></td>
                <td><%= (p.getSigla()!=null)?p.getSigla() :"" %></td>
                <td><%= (p.getEmenta() !=null)? p.getEmenta() : "" %></td>
                <td><%= (p.getDiaDaSemana()!=null)?p.getDiaDaSemana() : "" %></td>
                <td><%= (p.getHorario()!=null)?p.getHorario() :"" %></td>
            </tr>
            <%}%>
        </table>
    </body>
</html>
