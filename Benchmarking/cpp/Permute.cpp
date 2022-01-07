#include <cstdio>
#include <vector>

void swap(std::vector<int> &arr, int i, int j) {
  int tmp = arr[i];
  arr[i] = arr[j];
  arr[j] = tmp;
}

void permute(int &count, std::vector<int> &arr, int n) {
  count += 1;
  if (n != 0) {
    int n1 = n - 1;
    permute(count, arr, n1);
    int i = n1;
    while (i >= 0) {
      swap(arr, n1, i);
      permute(count, arr, n1);
      swap(arr, n1, i);
      i -= 1;
    }
  }
}

int run(int n) {
  int count = 0;
  std::vector<int> arr(n, 0);
  permute(count, arr, n);
  return count;
}

int main() {
  // 8660
  printf("%d", run(6));
  return 0;
}
