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
    std::vector<s0> p1;
    s2(s1 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s2 p0;
    std::vector<std::vector<s0>> p1;
    s3(s2 v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  std::vector<std::vector<s0>> f74(const std::vector<std::vector<s0>> &v0) {
    std::vector<std::vector<s0>> v8 = v0;
    const std::vector<s0> v1 = v8[1];
    std::vector<std::vector<s0>> v3 = v0;
    v3[0] = v1;
    const std::vector<s0> v5 = v0[1];
    v8[0] = v1;
    v3[0] = v1;
    v8[0] = v5;
    v3[1] = v1;
    v3 = v8;
    std::vector<s0> v6 = v1;
    std::vector<std::vector<s0>> v13 = v0;
    const std::vector<s0> v9 = v3[2];
    v3[1] = v9;
    const std::vector<s0> v19 = v8[1];
    const s0 v22 = v9[0];
    v8[1] = v19;
    std::vector<std::vector<s0>> v18 = v3;
    v18 = v13;
    v6[0] = v22;
    v18[2] = v6;
    return v18;
  }
  std::vector<std::vector<s0>> f57(const s3 &v0, const std::vector<std::vector<s0>> &v1) {
    const std::vector<std::vector<s0>> v3 = f74(v1);
    const std::vector<std::vector<s0>> v6 = f74(v3);
    const std::vector<std::vector<s0>> v17 = f74(v6);
    return v17;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s0>> &v0, const s3 &v1, const double &v2) {
    const std::vector<std::vector<s0>> v5 = f57(v1, v0);
    const std::vector<s0> v8 = v5[2];
    const s0 v13 = v8[0];
    const std::vector<std::vector<double>> v16 = v13.p1;
    const std::vector<double> v84 = v16[0];
    const double v81 = v84[0];
    double v110 = v81;
    return v110;
  }
  int main() {
    std::vector<std::vector<s0>> v0({ { { { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } } } }, { { { { 4.0 } }, { { 5.0 }, { 6.0 }, { 7.0 } } } }, { { { { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } } } });
    s3 v1({ { { { { { { 12.0 } }, { { 13.0 }, { 14.0 }, { 15.0 } } } }, { { { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } } }, { { { { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } }, { { { 24.0 } }, { { 25.0 }, { 26.0 }, { 27.0 } } } } }, { { { { { 28.0 } }, { { 29.0 }, { 30.0 }, { 31.0 } } } }, { { { { 32.0 } }, { { 33.0 }, { 34.0 }, { 35.0 } } } } } });
    double v2(36.0);
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
