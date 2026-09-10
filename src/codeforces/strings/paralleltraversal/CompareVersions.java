
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

public int compareVersion(String version1, String version2) {
    String[] v1 = version1.split("\\.");
    String[] v2 = version2.split("\\.");

    int maxLength = Math.max(v1.length, v2.length);

    for (int i = 0; i < maxLength; i++) {
        int n1 = i < v1.length ? Integer.parseInt(v1[i]) : 0;
        int n2 = i < v2.length ? Integer.parseInt(v2[i]) : 0;

        if (n1 > n2) {
            return 1;
        }

        if (n1 < n2) {
            return -1;
        }
    }

    return 0;
}

void main() {
    String version1 = IO.readln();
    String version2 = IO.readln();

    IO.println(compareVersion(version1, version2));
}
