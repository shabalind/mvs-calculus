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
    s1(std::vector<s0> v0): p0(v0) { }
  };
  std::vector<s1> f17(const std::vector<s1> &v0) {
    const s1 v3 = v0[1];
    const s1 v5 = v0[1];
    const std::vector<s0> v4 = v5.p0;
    const std::vector<s0> v9 = v3.p0;
    const s1 v22(v9);
    std::vector<s1> v77 = v0;
    s1 v78 = v22;
    v78.p0 = v4;
    v77[1] = v78;
    return v77;
  }
  __attribute__((noinline))
  double f0(const std::vector<s1> &v0, const double &v1) {
    const std::vector<s1> v6 = f17(v0);
    const s1 v8 = v6[0];
    const std::vector<s0> v7 = v8.p0;
    const std::vector<s0> v11 = v8.p0;
    const s0 v13 = v7[2];
    const std::vector<std::vector<double>> v14 = v13.p1;
    const s0 v33 = v11[2];
    const std::vector<double> v73 = v14[0];
    const std::vector<std::vector<double>> v47 = v33.p0;
    const double v145 = v73[0];
    std::vector<std::vector<double>> v102 = v47;
    const std::vector<double> v96 = v102[1];
    const double v211 = v96[0];
    const double v109 = v211 - v145;
    return v109;
  }
  int main() {
    std::vector<s1> v0({ { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } } }, { { { 4.0 }, { 5.0 }, { 6.0 } }, { { 7.0 } } }, { { { 8.0 }, { 9.0 }, { 10.0 } }, { { 11.0 } } } } }, { { { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 } } }, { { { 16.0 }, { 17.0 }, { 18.0 } }, { { 19.0 } } }, { { { 20.0 }, { 21.0 }, { 22.0 } }, { { 23.0 } } } } } });
    double v1(24.0);
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
