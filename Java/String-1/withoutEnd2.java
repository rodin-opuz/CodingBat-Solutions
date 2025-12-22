public String withouEnd2(String str) {
  if (str.length() >= 2) {
    int end = str.length() - 1;
    return str.substring(1, end);
  } else {
    return "";
  }
}
