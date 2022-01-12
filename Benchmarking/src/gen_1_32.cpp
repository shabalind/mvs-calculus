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
    const s0 v4 = v0[0];
    const std::vector<std::vector<double>> v6 = v4.p0;
    const std::vector<double> v8 = v6[1];
    const std::vector<std::vector<double>> v13 = v4.p0;
    std::vector<std::vector<double>> v25 = v13;
    const std::vector<double> v48 = v25[1];
    const double v27 = v8[0];
    const double v56 = v48[0];
    const double v62 = v56 * v56;
    const double v51 = v27 * v62;
    const double v228 = v27 * v27;
    const double v155 = v228 / v51;
    return v155;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } } }, { { { 4.0 }, { 5.0 }, { 6.0 } }, { { 7.0 } } } });
    double v1(8.0);
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
