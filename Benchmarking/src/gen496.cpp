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
    std::vector<std::vector<double>> p0;
    s0 p1;
    s1(std::vector<std::vector<double>> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s1 p0;
    s0 p1;
    s2(s1 v0, s0 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s2>> &v0, const double &v1) {
    const std::vector<s2> v3 = v0[0];
    const s2 v5 = v3[0];
    const s0 v10 = v5.p1;
    const std::vector<std::vector<double>> v2 = v10.p0;
    std::vector<std::vector<double>> v18 = v2;
    const std::vector<double> v25 = v18[0];
    const double v35 = v25[0];
    v18[1] = v25;
    const double v43 = v25[0];
    const double v100 = v43 + v35;
    const double v92 = v35 + v100;
    return v92;
  }
  int main() {
    std::vector<std::vector<s2>> v0({ { { { { { 0.0 } }, { { { 1.0 }, { 2.0 }, { 3.0 } }, { { 4.0 } }, { { 5.0 } } } }, { { { 6.0 }, { 7.0 }, { 8.0 } }, { { 9.0 } }, { { 10.0 } } } } }, { { { { { 11.0 } }, { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 } }, { { 16.0 } } } }, { { { 17.0 }, { 18.0 }, { 19.0 } }, { { 20.0 } }, { { 21.0 } } } } } });
    double v1(22.0);
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
