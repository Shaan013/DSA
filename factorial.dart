
int factorial  (int num, [int res = 1] ){
    
    if (num <=1 ){
        return res;
    }
    res  *= num;
   return  factorial(num-1,res);
}

void main() {
  print("Start small. Ship something.");
 int res = factorial(5);
 print(res );
}