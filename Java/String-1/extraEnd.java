public String extraEnd(String str) {
  String lastTwo = str.substring(str.length() - 2);
  return lastTwo + lastTwo + lastTwo;
}
