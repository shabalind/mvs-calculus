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
    const s0 v7 = v0[0];
    double v13 = v1;
    const std::vector<std::vector<double>> v9 = v7.p0;
    const std::vector<double> v20 = v9[1];
    v13 = v1;
    const std::vector<double> v41 { v13, v1 };
    std::vector<double> v49 = v41;
    const double v37 = v1 + v13;
    std::vector<double> v118 = v49;
    const double v127 = v20[0];
    v118[1] = v127;
    std::vector<double> v128 = v118;
    const double v179 = v128[0];
    v118[1] = v37;
    return v179;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 }, { 4.0 } } } });
    double v1(5.0);
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
