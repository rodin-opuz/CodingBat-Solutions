public String makeOutWord(String out, String word) {
  String left = out.substring(0, 2);
  String right = out.substring(2, 4);
  return left + word + right;
}
