package dio.colecao.list;
/*
         * Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
         * "Telefonou para a vítima?"
         * "Esteve no local do crime?"
         * "Mora perto da vítima?"
         * "Devia para a vítima?"
         * "Já trabalhou com a vítima?" O programa deve no final emitir uma classificação sobre a participação da pessoa no crime.
         * Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como "Assassino".
         * Caso contrário, ele será classificado como "Inocente".
         */
    import java.util.Scanner;

       public class sobreumcrime {
       public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String telefonou, localCrime, moraPerto, devia, trabalhou;
        int classificacao = 0;

        System.out.println("Responda as perguntas abaixo com S (sim) ou N (nao)");

        System.out.println("Você telefonou para a vítima?");
        telefonou = input.nextLine().trim().toLowerCase();

        System.out.println("Você esteve no local do crime?");
        localCrime = input.nextLine().trim().toLowerCase();

        System.out.println("Você mora perto da vítima?");
        moraPerto = input.nextLine().trim().toLowerCase();

        System.out.println("Você devia para a vítima?");
        devia = input.nextLine().trim().toLowerCase();

        System.out.println("Você trabalhou para a vítima?");
        trabalhou = input.nextLine().trim().toLowerCase();

        if (telefonou.equals("s")) {
        classificacao += 1;
        }
        if (localCrime.equals("s")){
        classificacao += 1;
        }

        if (moraPerto.equals("s")){
        classificacao += 1;
        }

        if (devia.equals("s")){
        classificacao += 1;
        }

        if (trabalhou.equals("s")){
        classificacao += 1;
        }

        if (classificacao < 2) {
        System.out.println("Inocente");
        } else if (classificacao == 2) {
        System.out.println("Suspeito");
        } else if (classificacao <= 4) {
        System.out.println("Cúmplice");
        }
        else {
        System.out.println("Assassino");
        }

        input.close();
        }
        }