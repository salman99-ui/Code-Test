import java.util.Scanner;

public class Test {
    static int getValue(char x){
        int value = 0 ;
        switch(x){
            case 'I' :
                value = 1 ;
                break ;
            case 'V' :
                value = 5 ;
                break ;
            case 'X' :
                value = 10 ;
                break ;
            case 'L' :
                value = 50 ;
                break ;
            case 'C' :
                value = 100 ;
                break ;
            case 'D' :
                value = 500 ;
                break ;
            case 'M' :
                value = 1000 ;
                break ;
        }

        return value ;
    }
    public static void main(String[] args){
        byte pointer = 0 ;
        int result = 0 ;
        String Value = "" ;
        Scanner input = new Scanner(System.in) ;

        System.out.print("Input : ");
        Value = input.nextLine() ;


        while(pointer < Value.length()){

            if(Value.charAt(pointer) == 'I'){

                if(pointer + 1 < Value.length()){

                    if(Value.charAt(pointer + 1) == 'V'){
                        result = result + ( Test.getValue('V') - Test.getValue('I') );
                        pointer += 2 ;
                        continue;
                    }else if(Value.charAt(pointer + 1) == 'X'){
                        result = result + ( Test.getValue('X') - Test.getValue('I') );
                        pointer += 2 ;
                        continue;
                    }

                }else{
                    result += Test.getValue('I') ;
                    pointer++;
                    continue;
                }


            }else if(Value.charAt(pointer) == 'X'){

                if(pointer + 1 < Value.length()){

                    if(Value.charAt(pointer + 1) == 'L'){
                        result = result + ( Test.getValue('L') - Test.getValue('X') );
                        pointer += 2 ;
                        continue;
                    }else if(Value.charAt(pointer + 1) == 'C'){
                        result = result + ( Test.getValue('C') - Test.getValue('X') );
                        pointer += 2 ;
                        continue;
                    }

                }else{
                    result += Test.getValue('X') ;
                    pointer++;
                    continue;
                }


            }else if(Value.charAt(pointer) == 'C'){

                if(pointer + 1 < Value.length()){

                    if(Value.charAt(pointer + 1) == 'D'){
                        result = result + ( Test.getValue('D') - Test.getValue('C') );
                        pointer += 2 ;
                        continue;
                    }else if(Value.charAt(pointer + 1) == 'M'){
                        result = result + ( Test.getValue('M') - Test.getValue('C') );
                        pointer += 2 ;
                        continue;
                    }

                }else{
                    result += Test.getValue('C') ;
                    pointer++;
                    continue;
                }

            }

            result += Test.getValue(Value.charAt(pointer));
            pointer ++ ;


        }

        System.out.println("Output : " + result);

    }
}
