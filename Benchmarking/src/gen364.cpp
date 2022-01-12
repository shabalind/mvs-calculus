  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s0 p0;
    s0 p1;
    s2(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s2 p0;
    std::vector<s2> p1;
    s3(s2 v0, std::vector<s2> v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    std::vector<std::vector<s2>> p0;
    s2 p1;
    s0 p2;
    s5(std::vector<std::vector<s2>> v0, s2 v1, s0 v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s6 {
    s5 p0;
    double p1;
    s6(s5 v0, double v1): p0(v0), p1(v1) { }
  };
  struct s9 {
    s3 p0;
    s6 p1;
    s9(s3 v0, s6 v1): p0(v0), p1(v1) { }
  };
  s6 f5(const s6 &v0) {
    s6 v1 = v0;
    const std::vector<s6> v6 { v0, v0 };
    const s6 v4 = v6[0];
    const double v2 = v0.p1;
    const s6 v8 = v6[0];
    v1.p1 = v2;
    const double v7 = v8.p1;
    const double v3 = v1.p1;
    v1.p1 = v3;
    const s6 v12 = v6[0];
    v1.p1 = v7;
    const s6 v5 = v6[0];
    const s5 v11 = v5.p0;
    v1.p0 = v11;
    v1.p1 = v2;
    const s5 v15 = v12.p0;
    const double v17 = v4.p1;
    const s6 v35 = v6[0];
    s6 v18 = v0;
    const double v34 = v18.p1;
    const double v64 = v35.p1;
    v1.p1 = v64;
    const std::vector<s5> v32 { v11, v11, v11, v15 };
    const double v53 = v17 + v3;
    double v29 = v53;
    v18.p1 = v34;
    double v56 = v34;
    v18.p1 = v56;
    v18.p1 = v64;
    v18.p1 = v3;
    v18.p1 = v29;
    const s5 v84 = v32[0];
    const s6 v184(v84, v56);
    return v184;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s9>> &v0, const double &v1) {
    const std::vector<s9> v4 = v0[0];
    std::vector<s9> v5 = v4;
    const std::vector<s9> v3 = v0[0];
    const s9 v11 = v5[0];
    const s3 v7 = v11.p0;
    const s2 v6 = v7.p0;
    const s0 v10 = v6.p0;
    v5[0] = v11;
    const double v2 = v1 * v1;
    const s9 v22 = v4[0];
    const double v8 = v1 / v1;
    double v15 = v2;
    double v18 = v1;
    const s9 v14 = v3[0];
    s9 v43 = v22;
    v5[0] = v43;
    v43.p0 = v7;
    double v17 = v15;
    const s6 v29 = v14.p1;
    const std::vector<s6> v39 { v29, v29 };
    v43.p0 = v7;
    const std::vector<std::vector<double>> v37 = v10.p1;
    const s6 v135 = v39[0];
    const s6 v55 = f5(v135);
    const double v75 = v55.p1;
    const std::vector<double> v46 = v37[1];
    v17 = v8;
    const double v82 = v46[0];
    const std::vector<double> v116 { v8, v17, v75, v18, v75, v82, v2 };
    const double v96 = v116[4];
    return v96;
  }
  int main() {
    std::vector<std::vector<s9>> v0({ { { { { { { { 0.0 } }, { { 1.0 }, { 2.0 } } }, { { { 3.0 } }, { { 4.0 }, { 5.0 } } } }, { { { { { 6.0 } }, { { 7.0 }, { 8.0 } } }, { { { 9.0 } }, { { 10.0 }, { 11.0 } } } }, { { { { 12.0 } }, { { 13.0 }, { 14.0 } } }, { { { 15.0 } }, { { 16.0 }, { 17.0 } } } }, { { { { 18.0 } }, { { 19.0 }, { 20.0 } } }, { { { 21.0 } }, { { 22.0 }, { 23.0 } } } } } }, { { { { { { { { 24.0 } }, { { 25.0 }, { 26.0 } } }, { { { 27.0 } }, { { 28.0 }, { 29.0 } } } } } }, { { { { 30.0 } }, { { 31.0 }, { 32.0 } } }, { { { 33.0 } }, { { 34.0 }, { 35.0 } } } }, { { { 36.0 } }, { { 37.0 }, { 38.0 } } } }, 39.0 } } } });
    double v1(40.0);
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
