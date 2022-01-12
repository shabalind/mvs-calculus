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
    std::vector<std::vector<s0>> p1;
    s1(std::vector<s0> v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s1 p0;
    std::vector<std::vector<s0>> p1;
    s2(s1 v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s6 {
    s0 p0;
    double p1;
    s6(s0 v0, double v1): p0(v0), p1(v1) { }
  };
  struct s7 {
    std::vector<s2> p0;
    std::vector<s6> p1;
    s7(std::vector<s2> v0, std::vector<s6> v1): p0(v0), p1(v1) { }
  };
  s0 f14(const s0 &v0) {
    const std::vector<s0> v6 { v0, v0 };
    const s0 v4 = v6[0];
    const std::vector<std::vector<double>> v7 = v4.p0;
    std::vector<std::vector<double>> v3 = v7;
    const std::vector<std::vector<double>> v1 = v4.p1;
    const s0 v2 = v6[0];
    const std::vector<double> v9 = v7[0];
    const std::vector<double> v8 = v1[0];
    const s0 v15 = v6[0];
    v3[0] = v8;
    const std::vector<std::vector<double>> v11 = v4.p1;
    std::vector<s0> v47 = v6;
    const std::vector<std::vector<double>> v32 = v2.p1;
    std::vector<s0> v24 = v47;
    const s0 v33 = v24[0];
    std::vector<std::vector<double>> v42 = v3;
    s0 v40 = v33;
    const std::vector<std::vector<double>> v59 = v33.p0;
    const std::vector<std::vector<double>> v28 = v15.p1;
    std::vector<double> v72 = v9;
    const std::vector<std::vector<double>> v46 = v33.p1;
    const s0 v67 = v6[0];
    v3[0] = v72;
    v40.p1 = v42;
    v47[0] = v67;
    const std::vector<double> v71 = v46[0];
    v40.p0 = v42;
    v40.p0 = v11;
    v40.p0 = v59;
    v72 = v71;
    v40.p0 = v32;
    v40.p0 = v28;
    return v40;
  }
  s0 f4(const s0 &v0) {
    const std::vector<std::vector<double>> v2 = v0.p1;
    const s0 v1 = f14(v0);
    const std::vector<std::vector<double>> v7 = v1.p1;
    const std::vector<double> v3 = v7[0];
    const std::vector<double> v8 = v2[0];
    const double v6 = v3[0];
    const double v4 = v8[0];
    const s0 v52 = f14(v0);
    const s6 v33(v52, v6);
    s6 v83 = v33;
    v83.p1 = v4;
    const s0 v160 = v83.p0;
    return v160;
  }
  __attribute__((noinline))
  double f0(const s0 &v0, const s7 &v1, const double &v2) {
    const s0 v6 = f4(v0);
    double v11 = v2;
    const std::vector<double> v13 { v11, v11, v11 };
    const std::vector<std::vector<double>> v16 = v6.p1;
    const std::vector<double> v12 = v16[0];
    const double v30 = v12[0];
    const double v21 = v13[0];
    const double v166 = v21 / v30;
    const double v57 = v12[0];
    const double v328 = v57 * v166;
    return v328;
  }
  int main() {
    s0 v0({ { { 0.0 } }, { { 1.0 } } });
    s7 v1({ { { { { { { { 2.0 } }, { { 3.0 } } }, { { { 4.0 } }, { { 5.0 } } } }, { { { { { 6.0 } }, { { 7.0 } } } }, { { { { 8.0 } }, { { 9.0 } } } }, { { { { 10.0 } }, { { 11.0 } } } } } }, { { { { { 12.0 } }, { { 13.0 } } } } } }, { { { { { { 14.0 } }, { { 15.0 } } }, { { { 16.0 } }, { { 17.0 } } } }, { { { { { 18.0 } }, { { 19.0 } } } }, { { { { 20.0 } }, { { 21.0 } } } }, { { { { 22.0 } }, { { 23.0 } } } } } }, { { { { { 24.0 } }, { { 25.0 } } } } } } }, { { { { { 26.0 } }, { { 27.0 } } }, 28.0 }, { { { { 29.0 } }, { { 30.0 } } }, 31.0 } } });
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
