
public class Compstr {
    String s = "AAAAABBBBCCCDFGG";
    String s1;
    int count = 0;
    for(char i = 'A'; i <= 'Z'; i++) {
        char c = s.charAt(i);
        if(i == 'C'){
            count++;
        }
        
    }
    s1  = s1 + i + count;
}
