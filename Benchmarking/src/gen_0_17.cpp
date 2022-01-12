  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<s0> &v0, const double &v1) {
    double v4 = v1;
    const s0 v12 = v0[0];
    const std::vector<std::vector<double>> v8 = v12.p0;
    const double v18 = v1 + v4;
    const std::vector<double> v17 = v8[1];
    double v44 = v4;
    v44 = v18;
    const double v88 = v17[0];
    const double v58 = v4 - v44;
    const double v109 = v88 + v58;
    return v109;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 }, { 1.0 } }, { { 2.0 } } } });
    double v1(3.0);
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
