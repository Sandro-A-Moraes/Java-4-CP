
/*
Uma plataforma recebe nomes de usuários escritos livremente. Você deve transformá-los em identificadores válidos.

Um identificador deve obedecer às seguintes regras:

     - letras devem ser convertidas para minúsculas;

     - dígitos devem permanecer iguais;

     - qualquer sequência de um ou mais caracteres que **não sejam letras nem dígitos** deve ser substituída por exatamente `_`;

     - o resultado não pode começar nem terminar com `_`;

     - se nenhum caractere válido permanecer, retorne uma string vazia.
 */

//Resposta
/*
public String normalizeIdentifier(String s) {
    StringBuilder result = new StringBuilder();

    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);

        if (Character.isLetterOrDigit(c)) {
            result.append(Character.toLowerCase(c));
        } else if (!result.isEmpty() && result.charAt(result.length() - 1) != '_') {
            result.append('_');
        }
    }

    if (!result.isEmpty() && result.charAt(result.length() - 1) == '_') {
        result.deleteCharAt(result.length() - 1);
    }

    return result.toString();
}
 */

public String normalizeIdentifier(String s){
    StringBuilder result = new StringBuilder();

    for(char c : s.toCharArray()){
        if(Character.isLetterOrDigit(c)){
            result.append(Character.toLowerCase(c));
        } else if(!result.isEmpty() && result.charAt(result.length() - 1) != '_'){
            result.append('_');
        }
    }

    if(!result.isEmpty() && result.charAt(result.length() - 1) == '_'){
        result.deleteCharAt(result.length() - 1);
    }

    return result.toString();
}

void main(){
     String s = IO.readln();

     IO.println(normalizeIdentifier(s));
}