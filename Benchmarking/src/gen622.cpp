  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    s0(std::vector<std::vector<double>> v0): p0(v0) { }
  };
  std::vector<s0> f66(const std::vector<s0> &v0) {
    std::vector<s0> v36 = v0;
    return v36;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s0>> &v0, const double &v1) {
    const std::vector<s0> v7 = v0[1];
    double v4 = v1;
    double v6 = v4;
    const std::vector<s0> v2 = f66(v7);
    const s0 v9 = v2[0];
    const std::vector<std::vector<double>> v10 = v9.p0;
    const std::vector<double> v22 = v10[0];
    const double v48 = v22[0];
    const double v34 = v48 * v6;
    return v34;
  }
  int main() {
    std::vector<std::vector<s0>> v0({ { { { { 0.0 }, { 1.0 } } } }, { { { { 2.0 }, { 3.0 } } } } });
    double v1(4.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
