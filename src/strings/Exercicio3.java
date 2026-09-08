
/*
Você recebe duas versões de software:

version1
version2

Cada versão é formada por números separados por `.`.

Compare cada componente numericamente.

Zeros à esquerda devem ser ignorados.

Componentes ausentes devem ser considerados `0`.

Retorne:

-1 se version1 < version2
 0 se version1 == version2
 1 se version1 > version2

 */

public int compareVersion(String version1, String version2){
    String[] newVersion1 = version1.split("\\.");//
    String[] newVersion2 = version2.split("\\.");

    IO.println(Arrays.toString(newVersion1));
    IO.println(Arrays.toString(newVersion2));

    for(int i =0; i < newVersion1.length; i++){

    }
    return 0;
}


void main(){
    String version1 = IO.readln();
    String version2 = IO.readln();

    IO.println(compareVersion(version1, version2));
}