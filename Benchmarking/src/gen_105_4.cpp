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
  struct s2 {
    std::vector<s0> p0;
    s1 p1;
    s2(std::vector<s0> v0, s1 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<s2> &v0, const s1 &v1, const std::vector<s0> &v2, const double &v3) {
    const s0 v7 = v2[0];
    double v6 = v3;
    const std::vector<std::vector<double>> v13 = v7.p0;
    double v12 = v3;
    const std::vector<double> v18 = v13[0];
    std::vector<double> v35 = v18;
    std::vector<std::vector<double>> v45 = v13;
    double v70 = v3;
    double v33 = v70;
    const std::vector<double> v50 = v45[1];
    v45[0] = v35;
    v45 = v13;
    v12 = v33;
    const double v106 = v50[0];
    v35[0] = v12;
    v35[0] = v6;
    v35[0] = v12;
    return v106;
  }
  int main() {
    std::vector<s2> v0({ { { { { { 0.0 }, { 1.0 } }, { { 2.0 } } }, { { { 3.0 }, { 4.0 } }, { { 5.0 } } } }, { { { { 6.0 }, { 7.0 } }, { { 8.0 } } }, { { { 9.0 }, { 10.0 } }, { { 11.0 } } } } } });
    s1 v1({ { { { 12.0 }, { 13.0 } }, { { 14.0 } } }, { { { 15.0 }, { 16.0 } }, { { 17.0 } } } });
    std::vector<s0> v2({ { { { 18.0 }, { 19.0 } }, { { 20.0 } } } });
    double v3(21.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
