  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s0 &v0, const std::vector<std::vector<s0>> &v1, const double &v2) {
    const std::vector<std::vector<double>> v10 = v0.p0;
    const std::vector<double> v18 = v10[2];
    const double v14 = v18[0];
    const std::vector<std::vector<double>> v28 = v0.p1;
    std::vector<std::vector<double>> v41 = v28;
    const double v15 = v14 - v14;
    const std::vector<double> v21 = v41[1];
    std::vector<double> v72 = v21;
    v72[0] = v14;
    v72[0] = v14;
    double v183 = v14;
    v72[0] = v15;
    const double v79 = v72[0];
    v72[0] = v79;
    const double v148 = v14 + v79;
    const std::vector<double> v87 { v148, v183, v183 };
    const double v236 = v87[2];
    return v236;
  }
  int main() {
    s0 v0({ { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 } } });
    std::vector<std::vector<s0>> v1({ { { { { 5.0 }, { 6.0 }, { 7.0 } }, { { 8.0 }, { 9.0 } } } }, { { { { 10.0 }, { 11.0 }, { 12.0 } }, { { 13.0 }, { 14.0 } } } }, { { { { 15.0 }, { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 } } } } });
    double v2(20.0);
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
