package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        GlobalConfigManager globalConfig = GlobalConfigManager.getInstance();

        System.out.println("Nome do usuario: " + globalConfig.getUser());
        System.out.println("URL do Banco de Dados: " + globalConfig.getDbUrl());
        System.out.println("Token da API: " + globalConfig.getApiToken());

        globalConfig.setUser("Vitor Machado");
        globalConfig.setDbUrl("jdbc:postgresql://localhost:5432/vitordatabase");
        globalConfig.setApiToken("dfBgVRe9zb_VNbdbMP8xD2aQ%3A17320");

        System.out.println("------ Nova Instância ------");

        GlobalConfigManager newInstance = GlobalConfigManager.getInstance();
        System.out.println("Nome do usuario: " + newInstance.getUser());
        System.out.println("URL do Banco de Dados: " + newInstance.getDbUrl());
        System.out.println("Token da API: " + newInstance.getApiToken());

        System.out.println("--------------------");

        System.out.println("É a mesma instância: " + (globalConfig == newInstance));
    }
}