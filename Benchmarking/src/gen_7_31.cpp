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
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    std::vector<s0> p0;
    s1 p1;
    s4(std::vector<s0> v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    s0 p0;
    std::vector<s1> p1;
    s5(s0 v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  struct s6 {
    std::vector<s4> p0;
    std::vector<s0> p1;
    s6(std::vector<s4> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s9 {
    s6 p0;
    s0 p1;
    s9(s6 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s10 {
    s9 p0;
    s5 p1;
    s10(s9 v0, s5 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s10>> &v0, const s6 &v1, const double &v2) {
    double v9 = v2;
    const std::vector<s0> v8 = v1.p1;
    const s0 v14 = v8[0];
    const std::vector<std::vector<double>> v18 = v14.p1;
    const std::vector<double> v93 = v18[0];
    const std::vector<double> v64 = v18[0];
    const double v66 = v93[0];
    const double v96 = v64[0];
    std::vector<double> v82 = v93;
    v82[0] = v66;
    v82[0] = v96;
    const double v98 = v82[0];
    v82[0] = v9;
    return v98;
  }
  int main() {
    std::vector<std::vector<s10>> v0({ { { { { { { { { { { 0.0 } }, { { 1.0 } } }, { { { 2.0 } }, { { 3.0 } } } }, { { { { 4.0 } }, { { 5.0 } } }, { { { 6.0 } }, { { 7.0 } } } } } }, { { { { 8.0 } }, { { 9.0 } } } } }, { { { 10.0 } }, { { 11.0 } } } }, { { { { 12.0 } }, { { 13.0 } } }, { { { { { 14.0 } }, { { 15.0 } } }, { { { 16.0 } }, { { 17.0 } } } }, { { { { 18.0 } }, { { 19.0 } } }, { { { 20.0 } }, { { 21.0 } } } } } } } } });
    s6 v1({ { { { { { { 22.0 } }, { { 23.0 } } }, { { { 24.0 } }, { { 25.0 } } } }, { { { { 26.0 } }, { { 27.0 } } }, { { { 28.0 } }, { { 29.0 } } } } } }, { { { { 30.0 } }, { { 31.0 } } } } });
    double v2(32.0);
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
