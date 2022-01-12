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
  struct s2 {
    s1 p0;
    std::vector<s0> p1;
    std::vector<s1> p2;
    s1 p3;
    s2(s1 v0, std::vector<s0> v1, std::vector<s1> v2, s1 v3): p0(v0), p1(v1), p2(v2), p3(v3) { }
  };
  struct s3 {
    s0 p0;
    std::vector<s1> p1;
    s3(s0 v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  s3 f115(const s3 &v0, const s0 &v1) {
    s3 v3 = v0;
    const std::vector<std::vector<double>> v6 = v1.p0;
    const std::vector<double> v2 = v6[1];
    const std::vector<std::vector<double>> v8 = v1.p1;
    v3.p0 = v1;
    const std::vector<std::vector<double>> v5 = v1.p0;
    std::vector<std::vector<double>> v11 = v5;
    const std::vector<double> v9 = v11[0];
    v11[0] = v2;
    const s0 v34 = v0.p0;
    std::vector<std::vector<double>> v17 = v8;
    v3.p0 = v1;
    const std::vector<std::vector<double>> v25 = v34.p0;
    v17[0] = v9;
    v3.p0 = v34;
    v3.p0 = v34;
    const s0 v43(v25, v17);
    v11[1] = v9;
    s3 v49 = v3;
    v49.p0 = v43;
    return v49;
  }
  __attribute__((noinline))
  double f0(const s3 &v0, const s2 &v1, const double &v2) {
    const s0 v3 = v0.p0;
    const s3 v7 = f115(v0, v3);
    const std::vector<s1> v8 = v7.p1;
    const s1 v14 = v8[1];
    const std::vector<s0> v13 = v14.p0;
    const s0 v18 = v13[0];
    const std::vector<std::vector<double>> v51 = v18.p0;
    const std::vector<double> v60 = v51[0];
    const double v41 = v60[0];
    return v41;
  }
  int main() {
    s3 v0({ { { { 0.0 }, { 1.0 } }, { { 2.0 } } }, { { { { { { 3.0 }, { 4.0 } }, { { 5.0 } } }, { { { 6.0 }, { 7.0 } }, { { 8.0 } } } } }, { { { { { 9.0 }, { 10.0 } }, { { 11.0 } } }, { { { 12.0 }, { 13.0 } }, { { 14.0 } } } } } } });
    s2 v1({ { { { { { 15.0 }, { 16.0 } }, { { 17.0 } } }, { { { 18.0 }, { 19.0 } }, { { 20.0 } } } } }, { { { { 21.0 }, { 22.0 } }, { { 23.0 } } }, { { { 24.0 }, { 25.0 } }, { { 26.0 } } } }, { { { { { { 27.0 }, { 28.0 } }, { { 29.0 } } }, { { { 30.0 }, { 31.0 } }, { { 32.0 } } } } }, { { { { { 33.0 }, { 34.0 } }, { { 35.0 } } }, { { { 36.0 }, { 37.0 } }, { { 38.0 } } } } } }, { { { { { 39.0 }, { 40.0 } }, { { 41.0 } } }, { { { 42.0 }, { 43.0 } }, { { 44.0 } } } } } });
    double v2(45.0);
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
