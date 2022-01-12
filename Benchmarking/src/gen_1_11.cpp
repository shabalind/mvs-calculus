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
    s1 p0;
    s2(s1 v0): p0(v0) { }
  };
  struct s3 {
    s2 p0;
    s2 p1;
    s0 p2;
    s3(s2 v0, s2 v1, s0 v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s8 {
    s3 p0;
    std::vector<s1> p1;
    s8(s3 v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  s8 f14(const s8 &v0) {
    s8 v1 = v0;
    s8 v3 = v0;
    const std::vector<s1> v7 = v3.p1;
    v1.p1 = v7;
    const std::vector<s1> v15 = v0.p1;
    v1.p1 = v15;
    const s3 v118 = v1.p0;
    v3.p0 = v118;
    v3 = v0;
    return v1;
  }
  __attribute__((noinline))
  double f0(const s8 &v0, const double &v1) {
    const s8 v4 = f14(v0);
    const std::vector<s1> v7 = v4.p1;
    const s1 v12 = v7[0];
    const s0 v18 = v12.p1;
    const std::vector<std::vector<double>> v10 = v18.p1;
    const std::vector<double> v16 = v10[0];
    const double v27 = v16[0];
    const double v19 = v16[0];
    const double v31 = v16[0];
    const double v39 = v27 + v19;
    const double v49 = v39 * v31;
    return v49;
  }
  int main() {
    s8 v0({ { { { { { { 0.0 }, { 1.0 } }, { { 2.0 } } }, { { { 3.0 }, { 4.0 } }, { { 5.0 } } } } }, { { { { { 6.0 }, { 7.0 } }, { { 8.0 } } }, { { { 9.0 }, { 10.0 } }, { { 11.0 } } } } }, { { { 12.0 }, { 13.0 } }, { { 14.0 } } } }, { { { { { 15.0 }, { 16.0 } }, { { 17.0 } } }, { { { 18.0 }, { 19.0 } }, { { 20.0 } } } } } });
    double v1(21.0);
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
