// 0,1,1,2,3,5,8
void fibonacci(int num) {
  int currnet = 0, next = 1;
  if (num == 1){
    print( )
  }
  for (int i = 0; i < num; i++) {
    int temp = currnet + next;
    print("here your res ${temp}");
    currnet = next;
    next = temp;
  }
}

void main() {
  fibonacci(10);
}
