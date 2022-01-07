#include <vector>
#include <cstdlib>
#include <cstdio>
#include <cassert>
#include <chrono>

__attribute__((always_inline))
int64_t now() {
  auto now = std::chrono::high_resolution_clock::now();
  auto duration = now.time_since_epoch();
  auto nanoseconds =
      std::chrono::duration_cast<std::chrono::nanoseconds>(duration);
  return nanoseconds.count();
}

__attribute__((noinline))
void verify(std::vector<int> &results, int expected) {
  for (auto result : results) {
    assert(result == expected);
  }
}

__attribute__((noinline))
void dump(std::vector<int> &times) {
  for (auto time : times) {
    printf("%d\n", time);
  }
}

int run(int);

int main(int argc, char *argv[]) {
  int measurements = atoi(argv[1]);
  int input        = atoi(argv[2]);
  int expected     = atoi(argv[3]);

  assert(measurements >= 1);

  std::vector<int> times(measurements, 0);
  std::vector<int> results(measurements, 0);

  for (int i = 0; i < measurements; i++) {
    int start = now();
    int result = run(input);
    int end = now();
    results[i] = result;
    times[i] = end - start;
  }

  verify(results, expected);
  dump(times);
}
