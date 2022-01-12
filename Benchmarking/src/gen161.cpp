  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    std::vector<std::vector<double>> p2;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1, std::vector<std::vector<double>> v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s1 {
    s0 p0;
    std::vector<std::vector<s0>> p1;
    s1(s0 v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s1 &v0, const double &v1) {
    double v7 = v1;
    const s0 v5 = v0.p0;
    const std::vector<std::vector<double>> v2 = v5.p1;
    const std::vector<double> v9 = v2[0];
    const double v3 = v9[0];
    v7 = v3;
    double v14 = v3;
    const double v13 = v9[0];
    const double v24 = v14 * v7;
    const double v101 = v13 * v24;
    return v101;
  }
  int main() {
    s1 v0({ { { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } }, { { 4.0 } } }, { { { { { 5.0 } }, { { 6.0 }, { 7.0 }, { 8.0 } }, { { 9.0 } } } }, { { { { 10.0 } }, { { 11.0 }, { 12.0 }, { 13.0 } }, { { 14.0 } } } } } });
    double v1(15.0);
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
