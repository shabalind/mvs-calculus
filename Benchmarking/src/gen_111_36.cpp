  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<double> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<double> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    s0 p0;
    std::vector<double> p1;
    s1(s0 v0, std::vector<double> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s1 p0;
    std::vector<s0> p1;
    s2(s1 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s0 &v0, const s2 &v1, const double &v2) {
    const std::vector<s0> v9 = v1.p1;
    const s0 v13 = v9[0];
    const std::vector<std::vector<double>> v27 = v13.p0;
    const std::vector<double> v14 = v27[0];
    const double v28 = v14[0];
    const std::vector<std::vector<double>> v77 = v13.p0;
    const std::vector<double> v167 = v77[2];
    double v108 = v28;
    const double v72 = v167[0];
    const double v252 = v108 / v72;
    return v252;
  }
  int main() {
    s0 v0({ { { 0.0 }, { 1.0 }, { 2.0 } }, { 3.0, 4.0, 5.0 } });
    s2 v1({ { { { { 6.0 }, { 7.0 }, { 8.0 } }, { 9.0, 10.0, 11.0 } }, { 12.0, 13.0 } }, { { { { 14.0 }, { 15.0 }, { 16.0 } }, { 17.0, 18.0, 19.0 } } } });
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
