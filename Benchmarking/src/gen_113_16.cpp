  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    s0 p0;
    std::vector<s0> p1;
    s1(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s0> p0;
    s1 p1;
    s2(std::vector<s0> v0, s1 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s2 &v0, const std::vector<s1> &v1, const double &v2) {
    const s1 v5 = v1[0];
    const std::vector<s0> v9 = v5.p1;
    const s0 v10 = v9[0];
    double v4 = v2;
    const std::vector<std::vector<double>> v11 = v10.p1;
    std::vector<std::vector<double>> v8 = v11;
    std::vector<std::vector<double>> v12 = v8;
    const std::vector<double> v13 = v12[0];
    const double v35 = v13[0];
    const std::vector<std::vector<double>> v34 = v10.p1;
    v8 = v34;
    const double v53 = v35 - v4;
    return v53;
  }
  int main() {
    s2 v0({ { { { { 0.0 }, { 1.0 } }, { { 2.0 } } }, { { { 3.0 }, { 4.0 } }, { { 5.0 } } } }, { { { { 6.0 }, { 7.0 } }, { { 8.0 } } }, { { { { 9.0 }, { 10.0 } }, { { 11.0 } } } } } });
    std::vector<s1> v1({ { { { { 12.0 }, { 13.0 } }, { { 14.0 } } }, { { { { 15.0 }, { 16.0 } }, { { 17.0 } } } } } });
    double v2(18.0);
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
