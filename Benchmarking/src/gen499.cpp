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
    std::vector<s0> p1;
    s1(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s0> p0;
    std::vector<s1> p1;
    s2(std::vector<s0> v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  struct s7 {
    s2 p0;
    std::vector<s0> p1;
    s7(s2 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  s0 f28(const s0 &v0) {
    return v0;
  }
  s0 f19(const s0 &v0) {
    const s0 v3 = f28(v0);
    s0 v4 = v3;
    v4 = v3;
    const std::vector<std::vector<double>> v8 = v4.p1;
    v4.p1 = v8;
    v4.p0 = v8;
    return v4;
  }
  s0 f2(const s0 &v0) {
    const std::vector<std::vector<double>> v6 = v0.p0;
    const std::vector<double> v7 = v6[0];
    const s0 v3 = f19(v0);
    const std::vector<std::vector<double>> v5 = v3.p1;
    const std::vector<double> v4 = v5[0];
    const s0 v9 = f28(v0);
    std::vector<std::vector<double>> v12 = v5;
    v12[0] = v4;
    const double v31 = v7[0];
    std::vector<double> v40 = v7;
    v40 = v4;
    v12[0] = v40;
    v12[0] = v4;
    v40[0] = v31;
    v12[0] = v4;
    v40 = v7;
    const std::vector<std::vector<double>> v44 = v9.p1;
    const s0 v85(v12, v44);
    return v85;
  }
  __attribute__((noinline))
  double f0(const s2 &v0, const std::vector<s0> &v1, const std::vector<s7> &v2, const double &v3) {
    double v5 = v3;
    const s0 v4 = v1[0];
    const s0 v11 = f2(v4);
    const std::vector<std::vector<double>> v9 = v11.p1;
    std::vector<std::vector<double>> v8 = v9;
    std::vector<std::vector<double>> v17 = v9;
    const std::vector<double> v19 = v17[0];
    v17[0] = v19;
    const std::vector<double> v31 = v8[0];
    v17[0] = v19;
    const std::vector<double> v24 = v8[0];
    v17[0] = v31;
    const std::vector<double> v46 = v17[0];
    v8[0] = v19;
    const double v112 = v24[0];
    const double v72 = v5 - v112;
    v17[0] = v24;
    v8[0] = v46;
    const double v186 = v3 / v72;
    v8[0] = v24;
    return v186;
  }
  int main() {
    s2 v0({ { { { { 0.0 } }, { { 1.0 } } }, { { { 2.0 } }, { { 3.0 } } } }, { { { { { 4.0 } }, { { 5.0 } } }, { { { { 6.0 } }, { { 7.0 } } } } }, { { { { 8.0 } }, { { 9.0 } } }, { { { { 10.0 } }, { { 11.0 } } } } } } });
    std::vector<s0> v1({ { { { 12.0 } }, { { 13.0 } } }, { { { 14.0 } }, { { 15.0 } } }, { { { 16.0 } }, { { 17.0 } } } });
    std::vector<s7> v2({ { { { { { { 18.0 } }, { { 19.0 } } }, { { { 20.0 } }, { { 21.0 } } } }, { { { { { 22.0 } }, { { 23.0 } } }, { { { { 24.0 } }, { { 25.0 } } } } }, { { { { 26.0 } }, { { 27.0 } } }, { { { { 28.0 } }, { { 29.0 } } } } } } }, { { { { 30.0 } }, { { 31.0 } } }, { { { 32.0 } }, { { 33.0 } } } } }, { { { { { { 34.0 } }, { { 35.0 } } }, { { { 36.0 } }, { { 37.0 } } } }, { { { { { 38.0 } }, { { 39.0 } } }, { { { { 40.0 } }, { { 41.0 } } } } }, { { { { 42.0 } }, { { 43.0 } } }, { { { { 44.0 } }, { { 45.0 } } } } } } }, { { { { 46.0 } }, { { 47.0 } } }, { { { 48.0 } }, { { 49.0 } } } } } });
    double v3(50.0);
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
