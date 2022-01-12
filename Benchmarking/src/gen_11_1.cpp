  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s0> p0;
    std::vector<s0> p1;
    s2(std::vector<s0> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<s2> p0;
    std::vector<s2> p1;
    s3(std::vector<s2> v0, std::vector<s2> v1): p0(v0), p1(v1) { }
  };
  std::vector<s0> f77(const std::vector<s0> &v0) {
    const s0 v6 = v0[1];
    s0 v3 = v6;
    const s0 v4 = v0[0];
    v3 = v6;
    std::vector<s0> v7 = v0;
    const std::vector<s0> v5 { v6, v4, v4, v3, v6 };
    const s0 v9 = v5[0];
    const s0 v1 = v5[0];
    const std::vector<std::vector<double>> v2 = v4.p1;
    const std::vector<std::vector<double>> v17 = v9.p0;
    v3.p0 = v17;
    v7[1] = v1;
    v3 = v9;
    v3.p1 = v2;
    v3.p1 = v2;
    v7[1] = v6;
    return v7;
  }
  s0 f64(const s0 &v0) {
    const std::vector<std::vector<double>> v4 = v0.p1;
    const std::vector<std::vector<double>> v8 = v0.p0;
    std::vector<std::vector<double>> v3 = v8;
    const std::vector<double> v7 = v4[1];
    std::vector<double> v6 = v7;
    const std::vector<double> v1 = v3[0];
    v3 = v8;
    v6 = v1;
    std::vector<std::vector<double>> v12 = v8;
    v3[0] = v7;
    const std::vector<double> v15 = v12[0];
    v3[0] = v15;
    const std::vector<std::vector<double>> v21 = v0.p1;
    s0 v13 = v0;
    const double v23 = v7[0];
    v6[0] = v23;
    const std::vector<double> v19 = v21[0];
    v6[0] = v23;
    s0 v25 = v13;
    const s0 v10(v3, v21);
    v3[0] = v6;
    v3[0] = v7;
    v3[0] = v15;
    const std::vector<s0> v28 { v0, v10, v0 };
    const std::vector<s0> v34 = f77(v28);
    const std::vector<std::vector<double>> v61 = v25.p0;
    const std::vector<double> v56 = v61[0];
    std::vector<s0> v50 = v34;
    const s0 v52 = v50[1];
    v12[0] = v56;
    v3[0] = v19;
    return v52;
  }
  __attribute__((noinline))
  double f0(const s3 &v0, const double &v1) {
    const std::vector<s2> v2 = v0.p0;
    const s2 v3 = v2[0];
    const std::vector<s0> v8 = v3.p0;
    const s0 v20 = v8[1];
    const s0 v27 = f64(v20);
    const std::vector<std::vector<double>> v52 = v27.p1;
    std::vector<std::vector<double>> v64 = v52;
    const std::vector<double> v95 = v64[1];
    const double v100 = v95[0];
    return v100;
  }
  int main() {
    s3 v0({ { { { { { { 0.0 } }, { { 1.0 }, { 2.0 } } }, { { { 3.0 } }, { { 4.0 }, { 5.0 } } }, { { { 6.0 } }, { { 7.0 }, { 8.0 } } } }, { { { { 9.0 } }, { { 10.0 }, { 11.0 } } }, { { { 12.0 } }, { { 13.0 }, { 14.0 } } }, { { { 15.0 } }, { { 16.0 }, { 17.0 } } } } } }, { { { { { { 18.0 } }, { { 19.0 }, { 20.0 } } }, { { { 21.0 } }, { { 22.0 }, { 23.0 } } }, { { { 24.0 } }, { { 25.0 }, { 26.0 } } } }, { { { { 27.0 } }, { { 28.0 }, { 29.0 } } }, { { { 30.0 } }, { { 31.0 }, { 32.0 } } }, { { { 33.0 } }, { { 34.0 }, { 35.0 } } } } } } });
    double v1(36.0);
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
