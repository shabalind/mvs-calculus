  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<s0> p0;
    s0 p1;
    s1(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s1 p0;
    std::vector<std::vector<s0>> p1;
    s2(s1 v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s2 &v0, const double &v1) {
    const std::vector<std::vector<s0>> v3 = v0.p1;
    const std::vector<s0> v5 = v3[2];
    const s0 v7 = v5[0];
    const std::vector<std::vector<double>> v9 = v7.p0;
    const std::vector<double> v15 = v9[0];
    const std::vector<double> v14 = v9[0];
    const double v24 = v15[0];
    const double v19 = v14[0];
    const double v35 = v1 / v19;
    const double v147 = v24 + v35;
    return v147;
  }
  int main() {
    s2 v0({ { { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 } } } }, { { { 4.0 }, { 5.0 } }, { { 6.0 }, { 7.0 } } } }, { { { { { 8.0 }, { 9.0 } }, { { 10.0 }, { 11.0 } } } }, { { { { 12.0 }, { 13.0 } }, { { 14.0 }, { 15.0 } } } }, { { { { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 } } } } } });
    double v1(20.0);
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
