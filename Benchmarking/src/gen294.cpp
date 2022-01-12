  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  std::vector<s0> f25(const s0 &v0, const std::vector<s0> &v1, const s0 &v2) {
    const s0 v10 = v1[0];
    std::vector<s0> v5 = v1;
    v5[2] = v2;
    std::vector<s0> v13 = v5;
    v5[1] = v10;
    std::vector<s0> v140 = v13;
    const std::vector<std::vector<s0>> v111 { v140 };
    std::vector<std::vector<s0>> v120 = v111;
    const std::vector<s0> v184 = v120[0];
    return v184;
  }
  __attribute__((noinline))
  double f0(const std::vector<s0> &v0, const s0 &v1, const s0 &v2, const double &v3) {
    const std::vector<s0> v24 = f25(v1, v0, v1);
    const s0 v16 = v24[2];
    const std::vector<std::vector<double>> v73 = v16.p0;
    const std::vector<double> v61 = v73[0];
    const double v46 = v61[0];
    double v129 = v46;
    return v129;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 } }, { { 1.0 } } }, { { { 2.0 } }, { { 3.0 } } }, { { { 4.0 } }, { { 5.0 } } } });
    s0 v1({ { { 6.0 } }, { { 7.0 } } });
    s0 v2({ { { 8.0 } }, { { 9.0 } } });
    double v3(10.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
