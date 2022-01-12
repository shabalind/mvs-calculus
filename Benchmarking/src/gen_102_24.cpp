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
  struct s2 {
    s0 p0;
    s1 p1;
    s2(s0 v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    std::vector<s0> p0;
    s2 p1;
    s4(std::vector<s0> v0, s2 v1): p0(v0), p1(v1) { }
  };
  double f49(const double &v0) {
    const double v3 = v0 + v0;
    double v5 = v3;
    double v4 = v3;
    v4 = v5;
    double v7 = v0;
    v4 = v5;
    const std::vector<double> v10 { v4, v7, v7 };
    std::vector<double> v20 = v10;
    const double v32 = v20[2];
    return v32;
  }
  __attribute__((noinline))
  double f0(const std::vector<s4> &v0, const double &v1) {
    double v2 = v1;
    const double v20 = f49(v2);
    const double v17 = v20 / v1;
    return v17;
  }
  int main() {
    std::vector<s4> v0({ { { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 }, { 4.0 } }, { { 5.0 } } } }, { { { { 6.0 }, { 7.0 } }, { { 8.0 }, { 9.0 }, { 10.0 } }, { { 11.0 } } }, { { { { 12.0 }, { 13.0 } }, { { 14.0 }, { 15.0 }, { 16.0 } }, { { 17.0 } } }, { { { { { 18.0 }, { 19.0 } }, { { 20.0 }, { 21.0 }, { 22.0 } }, { { 23.0 } } } }, { { { { 24.0 }, { 25.0 } }, { { 26.0 }, { 27.0 }, { 28.0 } }, { { 29.0 } } } } } } } } });
    double v1(30.0);
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
