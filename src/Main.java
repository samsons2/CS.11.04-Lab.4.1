public class Main {

    // 1. parenthesesCheck
    public static boolean parenthesesCheck(String str){
        int count = 0;
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i)=='('){
                count++;
            }else if(str.charAt(i)==')' && count == 0){
                return false;
            }else if(str.charAt(i)==')' && count > 0){
                count--;
            }
        }if(count==0){
            return true;
        }return false;
    }


    // 2. reverseInteger
    public static String reverseInteger(int num){
        String toString = Integer.toString(num);
        String output = "";
        char add = ' ';
        for(int i = toString.length()-1; i>-1; i--){
            add = toString.charAt(i);
            output = output + add;
        }
        return output;
    }


    // 3. encryptThis
    public static String encryptThis(String str){
        String output = "";
        String holder = "";
        str = str + " ";
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i)== ' '){
                output = output + (int)holder.charAt(0);
                output = output + holder.charAt(holder.length()-1);
                if(holder.length()>2){
                    output = output + holder.substring(2,holder.length()-1);
                    output = output + holder.charAt(1);
                }if(i!=str.length()-1){
                    output = output + " ";
                    holder = "";
                }
            }else{
                holder = holder + str.charAt(i);
            }
        }
        return output;
    }

    // 4. decipherThis
    public static String decipherThis(String str) {
        String output = "";
        String holder = "";
        str = str + " ";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                int num = 0;
                int place = 0;
                for (int x = 0; x < holder.length(); x++) {
                    if (holder.charAt(x) >= '0' && holder.charAt(x) <= '9') {
                        num = num*10;
                        num = num + Integer.parseInt(holder.substring(x, x + 1));
                        place = x;
                    } else {
                        break;
                    }
                }
                output = output + (char) num;
                output = output + holder.charAt(holder.length() - 1);
                if (holder.length() - 1 > 1 + place) {
                    output = output + holder.substring(place + 2, holder.length() - 1);
                    output = output + holder.charAt(place + 1);
                }
                if (i != str.length() - 1) {
                    output = output + " ";
                }
                holder = "";
            } else {
                holder = holder + str.charAt(i);
            }
        } return output;
    }

    }


