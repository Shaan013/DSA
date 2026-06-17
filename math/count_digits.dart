int countDigits(double num, [int count = 0]) {
  if (num < 1) {
    return count;
  }
  count++;
  num = num / 10;
  print("here num ${num}");
  return countDigits(num, count);
}

void main() {
  print("here you count digit program ");
  int res = countDigits(12345);
  print("you result ${res}");
}
