public static void promptTerminal() {

    while (true) {
        exibirPrompt();
        ComandoPrompt comandoEntrado = lerComando();
        executarComando(comandoEntrado);
    }
}


public static void exibirPrompt() {
    ComandoPrompt comandoEntrado = "login#UID:workdir>";

    throw new RuntimeException("Terminal está pronto para o próximo comando.");
}