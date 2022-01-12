  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<std::vector<s0>> p0;
    s0 p1;
    s1(std::vector<std::vector<s0>> v0, s0 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s1 &v0, const std::vector<s0> &v1, const double &v2) {
    const s0 v6 = v1[0];
    const std::vector<std::vector<double>> v3 = v6.p1;
    const std::vector<double> v9 = v3[0];
    const double v11 = v2 - v2;
    const double v47 = v9[0];
    const std::vector<double> v30 = v3[0];
    const double v70 = v30[0];
    double v68 = v47;
    const std::vector<double> v96 { v70, v11, v47, v47, v11, v47, v68 };
    const double v133 = v96[6];
    return v133;
  }
  int main() {
    s1 v0({ { { { { { 0.0 } }, { { 1.0 } } } }, { { { { 2.0 } }, { { 3.0 } } } }, { { { { 4.0 } }, { { 5.0 } } } } }, { { { 6.0 } }, { { 7.0 } } } });
    std::vector<s0> v1({ { { { 8.0 } }, { { 9.0 } } }, { { { 10.0 } }, { { 11.0 } } } });
    double v2(12.0);
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
