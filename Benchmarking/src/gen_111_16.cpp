  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    s0(std::vector<std::vector<double>> v0): p0(v0) { }
  };
  struct s1 {
    s0 p0;
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<s1> &v0, const double &v1) {
    const std::vector<double> v3 { v1, v1, v1, v1, v1 };
    std::vector<double> v7 = v3;
    const double v5 = v1 - v1;
    v7[2] = v1;
    const double v9 = v7[3];
    std::vector<double> v6 = v7;
    const double v13 = v5 - v9;
    const double v15 = v13 + v13;
    v7[3] = v1;
    v7[2] = v1;
    v7 = v3;
    v6[3] = v5;
    double v28 = v15;
    v6[2] = v5;
    v7 = v6;
    return v28;
  }
  int main() {
    std::vector<s1> v0({ { { { { 0.0 }, { 1.0 }, { 2.0 } } }, { { { 3.0 }, { 4.0 }, { 5.0 } } } }, { { { { 6.0 }, { 7.0 }, { 8.0 } } }, { { { 9.0 }, { 10.0 }, { 11.0 } } } } });
    double v1(12.0);
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
