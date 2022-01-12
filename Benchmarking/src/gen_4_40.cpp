  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    std::vector<std::vector<double>> p2;
    std::vector<std::vector<double>> p3;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1, std::vector<std::vector<double>> v2, std::vector<std::vector<double>> v3): p0(v0), p1(v1), p2(v2), p3(v3) { }
  };
  struct s1 {
    std::vector<s0> p0;
    std::vector<s0> p1;
    s1(std::vector<s0> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s1 &v0, const double &v1) {
    const std::vector<double> v3 { v1, v1, v1, v1, v1, v1 };
    const double v7 = v3[3];
    double v4 = v7;
    const double v10 = v4 + v7;
    const double v6 = v3[5];
    v4 = v6;
    const double v8 = v3[4];
    const double v68 = v8 + v1;
    double v163 = v68;
    const double v133 = v10 - v68;
    const double v285 = v163 + v133;
    return v285;
  }
  int main() {
    s1 v0({ { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 }, { 4.0 } }, { { 5.0 }, { 6.0 } }, { { 7.0 } } }, { { { 8.0 }, { 9.0 } }, { { 10.0 }, { 11.0 }, { 12.0 } }, { { 13.0 }, { 14.0 } }, { { 15.0 } } }, { { { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 }, { 20.0 } }, { { 21.0 }, { 22.0 } }, { { 23.0 } } } }, { { { { 24.0 }, { 25.0 } }, { { 26.0 }, { 27.0 }, { 28.0 } }, { { 29.0 }, { 30.0 } }, { { 31.0 } } } } });
    double v1(32.0);
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
