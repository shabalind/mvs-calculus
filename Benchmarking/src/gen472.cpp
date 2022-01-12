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
    s1(s0 v0): p0(v0) { }
  };
  struct s2 {
    s1 p0;
    s0 p1;
    s2(s1 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s1 p0;
    s0 p1;
    s3(s1 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    std::vector<double> p0;
    std::vector<s2> p1;
    s4(std::vector<double> v0, std::vector<s2> v1): p0(v0), p1(v1) { }
  };
  s4 f78(const s4 &v0) {
    s4 v1 = v0;
    const std::vector<double> v5 = v0.p0;
    v1.p0 = v5;
    const std::vector<s2> v9 = v1.p1;
    const std::vector<s4> v2 { v1 };
    const s4 v13 = v2[0];
    v1.p1 = v9;
    return v13;
  }
  __attribute__((noinline))
  double f0(const s4 &v0, const std::vector<s3> &v1, const double &v2) {
    const s4 v6 = f78(v0);
    const s4 v17 = f78(v6);
    const std::vector<double> v16 = v17.p0;
    const double v25 = v16[2];
    const double v50 = v16[2];
    const double v60 = v50 * v25;
    const double v101 = v60 * v25;
    double v87 = v101;
    double v103 = v87;
    return v103;
  }
  int main() {
    s4 v0({ { 0.0, 1.0, 2.0 }, { { { { { { 3.0 }, { 4.0 } }, { { 5.0 } } } }, { { { 6.0 }, { 7.0 } }, { { 8.0 } } } }, { { { { { 9.0 }, { 10.0 } }, { { 11.0 } } } }, { { { 12.0 }, { 13.0 } }, { { 14.0 } } } } } });
    std::vector<s3> v1({ { { { { { 15.0 }, { 16.0 } }, { { 17.0 } } } }, { { { 18.0 }, { 19.0 } }, { { 20.0 } } } }, { { { { { 21.0 }, { 22.0 } }, { { 23.0 } } } }, { { { 24.0 }, { 25.0 } }, { { 26.0 } } } } });
    double v2(27.0);
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
