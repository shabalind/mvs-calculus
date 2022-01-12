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
    std::vector<s0> p1;
    s1(std::vector<s0> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<std::vector<s0>> p0;
    s0 p1;
    s2(std::vector<std::vector<s0>> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<s0> p0;
    s2 p1;
    s3(std::vector<s0> v0, s2 v1): p0(v0), p1(v1) { }
  };
  std::vector<s0> f80(const std::vector<s0> &v0) {
    const std::vector<std::vector<s0>> v2 { v0 };
    std::vector<std::vector<s0>> v8 = v2;
    std::vector<std::vector<s0>> v9 = v8;
    const std::vector<s0> v38 = v9[0];
    v9 = v8;
    v8[0] = v0;
    v8[0] = v38;
    v9 = v8;
    v8[0] = v0;
    const std::vector<s0> v49 = v8[0];
    return v49;
  }
  double f57(const double &v0, const s1 &v1) {
    const std::vector<s0> v5 = v1.p1;
    const std::vector<s0> v4 = f80(v5);
    const s0 v9 = v5[0];
    const s0 v13 = v4[1];
    const std::vector<std::vector<double>> v26 = v9.p0;
    const std::vector<std::vector<double>> v57 = v13.p0;
    std::vector<std::vector<double>> v51 = v57;
    const std::vector<std::vector<std::vector<double>>> v43 { v57, v51, v26, v51 };
    const std::vector<std::vector<double>> v124 = v43[2];
    const std::vector<double> v82 = v124[0];
    const double v120 = v82[0];
    return v120;
  }
  __attribute__((noinline))
  double f0(const s1 &v0, const s3 &v1, const double &v2) {
    const double v3 = f57(v2, v0);
    double v7 = v2;
    v7 = v3;
    double v39 = v7;
    return v39;
  }
  int main() {
    s1 v0({ { { { { 0.0 } }, { { 1.0 }, { 2.0 } } }, { { { 3.0 } }, { { 4.0 }, { 5.0 } } }, { { { 6.0 } }, { { 7.0 }, { 8.0 } } } }, { { { { 9.0 } }, { { 10.0 }, { 11.0 } } }, { { { 12.0 } }, { { 13.0 }, { 14.0 } } } } });
    s3 v1({ { { { { 15.0 } }, { { 16.0 }, { 17.0 } } } }, { { { { { { 18.0 } }, { { 19.0 }, { 20.0 } } } } }, { { { 21.0 } }, { { 22.0 }, { 23.0 } } } } });
    double v2(24.0);
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
