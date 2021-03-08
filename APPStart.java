
/**
 * Escreva a descrição da classe APPStart aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class APPStart
{
    public static void main(String[] args) {
        Size copo = Size.MEDIUM;

        System.out.println("Name       : MEDIUM");
        System.out.println("toString() : " + copo.toString());
        System.out.println("Ordem      : " + 1);
        System.out.println("Valor min  : " + copo.getMinValue());
        System.out.println("Valor max  : " + copo.getMaxValue());
        System.out.println("Código     : " + copo.getCode());
    }
}

