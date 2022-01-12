  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  double f20(const std::vector<double> &v0, const double &v1) {
    std::vector<double> v4 = v0;
    std::vector<double> v3 = v4;
    const std::vector<std::vector<double>> v5 { v3, v0, v3, v4 };
    const std::vector<double> v8 = v5[3];
    const std::vector<std::vector<double>> v15 { v3, v0, v4, v8, v4 };
    const double v17 = v0[0];
    v4[0] = v17;
    std::vector<std::vector<double>> v41 = v15;
    const std::vector<double> v42 = v41[4];
    const double v166 = v42[0];
    const double v105 = v17 * v166;
    v41[4] = v4;
    return v105;
  }
  __attribute__((noinline))
  double f0(const std::vector<s0> &v0, const std::vector<std::vector<s0>> &v1, const double &v2) {
    std::vector<std::vector<s0>> v12 = v1;
    const std::vector<s0> v15 = v12[0];
    std::vector<s0> v21 = v15;
    const s0 v24 = v21[0];
    v21[0] = v24;
    const std::vector<std::vector<double>> v20 = v24.p0;
    const std::vector<double> v38 = v20[1];
    const double v52 = f20(v38, v2);
    return v52;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 }, { 5.0 } } }, { { { 6.0 }, { 7.0 }, { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } } });
    std::vector<std::vector<s0>> v1({ { { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 }, { 16.0 }, { 17.0 } } } }, { { { { 18.0 }, { 19.0 }, { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } } } });
    double v2(24.0);
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
