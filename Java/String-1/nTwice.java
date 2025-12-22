public String nTwice(String str, int n) {
  int last = str.length() - n;
  return str.substring(0, n) + str.substring(last);
}
