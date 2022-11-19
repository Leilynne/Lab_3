public class EightCase{
    public static void main(String[] args){
        char[] arr = new char[10];
        String vowels = "AEIOU";
        char symbol = 'A';

        for(int i = 0; i < 10; i++){
            while (vowels.indexOf(symbol) != -1){
                symbol++;
            }
            arr[i] = symbol++;
        }
        System.out.println(arr);
    }
}
