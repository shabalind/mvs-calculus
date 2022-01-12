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
  struct s4 {
    s1 p0;
    std::vector<s1> p1;
    s4(s1 v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s4>> &v0, const double &v1) {
    const std::vector<s4> v12 = v0[0];
    const s4 v10 = v12[0];
    const s1 v15 = v10.p0;
    const s0 v20 = v15.p1;
    const std::vector<std::vector<double>> v28 = v20.p1;
    const std::vector<std::vector<double>> v29 = v20.p1;
    std::vector<std::vector<double>> v34 = v28;
    const std::vector<double> v49 = v29[0];
    const std::vector<double> v55 = v34[0];
    const double v58 = v55[0];
    v34 = v28;
    v34[0] = v49;
    return v58;
  }
  int main() {
    std::vector<std::vector<s4>> v0({ { { { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } } } }, { { { 4.0 }, { 5.0 }, { 6.0 } }, { { 7.0 } } } }, { { { { { { 8.0 }, { 9.0 }, { 10.0 } }, { { 11.0 } } } }, { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 } } } } } } } });
    double v1(16.0);
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
