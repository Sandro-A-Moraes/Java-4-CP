/*
# 2. Compactador de Sequências

**Dificuldade:** Médio

### Problema

Um sistema de transmissão comprime sequências consecutivas de caracteres.

Para cada grupo consecutivo:

- se o caractere aparecer apenas uma vez, mantenha somente o caractere;

- se aparecer mais de uma vez, escreva o caractere seguido da quantidade.
 */


public String compress(String s){
    StringBuilder result = new StringBuilder();
    char currentGroup =  s.charAt(0);
    int count = 1;

    for(int i = 1; i < s.length(); i++){

        if(s.charAt(i) == currentGroup){
            count++;
        } else {
            result.append(currentGroup);
            if(count > 1)
                result.append(count);
            currentGroup = s.charAt(i);
            count = 1;
        }
    }
    result.append(currentGroup);

    if(count > 1) result.append(count);

    return result.toString();

}

void main(){
    String s = IO.readln();

    IO.println(compress(s));
}
