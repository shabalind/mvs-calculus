  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<s0> &v0, const s0 &v1, const double &v2) {
    const s0 v7 = v0[0];
    double v6 = v2;
    const std::vector<std::vector<double>> v14 = v7.p0;
    const std::vector<double> v11 = v14[1];
    double v29 = v2;
    const double v26 = v11[0];
    const std::vector<double> v47 = v14[0];
    std::vector<double> v61 = v47;
    v61[0] = v29;
    v61[0] = v6;
    v29 = v26;
    v61[0] = v6;
    const double v88 = v61[0];
    return v88;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 } } }, { { { 4.0 }, { 5.0 } }, { { 6.0 }, { 7.0 } } }, { { { 8.0 }, { 9.0 } }, { { 10.0 }, { 11.0 } } } });
    s0 v1({ { { 12.0 }, { 13.0 } }, { { 14.0 }, { 15.0 } } });
    double v2(16.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
