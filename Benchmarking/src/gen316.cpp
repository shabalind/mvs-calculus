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
    std::vector<double> p0;
    s2(std::vector<double> v0): p0(v0) { }
  };
  struct s3 {
    s2 p0;
    s0 p1;
    s3(s2 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    s2 p0;
    std::vector<s2> p1;
    s4(s2 v0, std::vector<s2> v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    s0 p0;
    s0 p1;
    std::vector<s2> p2;
    s1 p3;
    std::vector<s2> p4;
    s5(s0 v0, s0 v1, std::vector<s2> v2, s1 v3, std::vector<s2> v4): p0(v0), p1(v1), p2(v2), p3(v3), p4(v4) { }
  };
  std::vector<s3> f31(const std::vector<s3> &v0) {
    std::vector<s3> v2 = v0;
    const std::vector<std::vector<s3>> v7 { v2, v2 };
    const std::vector<s3> v5 = v7[1];
    std::vector<s3> v21 = v5;
    v21 = v0;
    v21 = v2;
    v2 = v0;
    const s3 v81 = v2[2];
    v21[1] = v81;
    return v21;
  }
  std::vector<s1> f29(const std::vector<s1> &v0) {
    std::vector<s1> v7 = v0;
    const std::vector<std::vector<s1>> v10 { v7, v7, v0 };
    v7 = v0;
    const std::vector<s1> v44 = v10[2];
    return v44;
  }
  s3 f25(const s3 &v0) {
    const std::vector<s3> v6 { v0, v0, v0, v0, v0, v0, v0 };
    s3 v2 = v0;
    const s2 v5 = v2.p0;
    const std::vector<double> v9 = v5.p0;
    const s3 v7 = v6[1];
    const double v13 = v9[1];
    const s0 v14 = v2.p1;
    v2.p1 = v14;
    const double v4 = v9[1];
    std::vector<double> v25 = v9;
    double v17 = v4;
    const double v35 = v9[1];
    const double v15 = v9[0];
    s2 v18 = v5;
    double v36 = v35;
    v25[0] = v36;
    std::vector<double> v41 = v25;
    s3 v12 = v7;
    const s3 v16 = v6[2];
    v18.p0 = v25;
    v25[1] = v13;
    const double v21 = v41[0];
    v41[1] = v17;
    v2 = v16;
    v12.p0 = v18;
    v2.p1 = v14;
    v25[1] = v21;
    v41[1] = v15;
    v18.p0 = v9;
    return v12;
  }
  s1 f16(const s1 &v0) {
    s1 v1 = v0;
    s1 v5 = v1;
    v5 = v1;
    const s0 v3 = v0.p1;
    v5.p1 = v3;
    s1 v2 = v5;
    return v2;
  }
  double f5(const double &v0, const s3 &v1) {
    const s2 v2 = v1.p0;
    const std::vector<double> v3 = v2.p0;
    const std::vector<std::vector<double>> v11 { v3, v3, v3, v3, v3, v3 };
    const std::vector<double> v16 = v11[4];
    std::vector<std::vector<double>> v14 = v11;
    v14[4] = v16;
    const std::vector<double> v22 = v14[5];
    const std::vector<double> v15 = v14[1];
    const double v44 = v22[1];
    const std::vector<double> v119 = v14[0];
    v14[0] = v15;
    v14[3] = v16;
    std::vector<double> v184 = v119;
    v14[5] = v184;
    v14[0] = v3;
    return v44;
  }
  __attribute__((noinline))
  double f0(const std::vector<s3> &v0, const std::vector<std::vector<s4>> &v1, const std::vector<s5> &v2, const double &v3) {
    const s5 v6 = v2[0];
    const s3 v4 = v0[1];
    const s1 v5 = v6.p3;
    s3 v11 = v4;
    const std::vector<s1> v18 { v5, v5 };
    const std::vector<s1> v14 = f29(v18);
    const std::vector<s3> v32 = f31(v0);
    const s3 v29 = f25(v11);
    const s5 v59 = v2[0];
    const s1 v47 = v14[0];
    const double v33 = f5(v3, v29);
    const s3 v60 = v32[1];
    const s0 v85 = v59.p1;
    const s1 v70 = f16(v47);
    v11.p1 = v85;
    const s3 v74 = f25(v60);
    const double v174 = f5(v33, v74);
    const s0 v165 = v70.p1;
    v11.p1 = v165;
    return v174;
  }
  int main() {
    std::vector<s3> v0({ { { { 0.0, 1.0 } }, { { { 2.0 }, { 3.0 }, { 4.0 } }, { { 5.0 } } } }, { { { 6.0, 7.0 } }, { { { 8.0 }, { 9.0 }, { 10.0 } }, { { 11.0 } } } }, { { { 12.0, 13.0 } }, { { { 14.0 }, { 15.0 }, { 16.0 } }, { { 17.0 } } } } });
    std::vector<std::vector<s4>> v1({ { { { { 18.0, 19.0 } }, { { { 20.0, 21.0 } }, { { 22.0, 23.0 } }, { { 24.0, 25.0 } } } } }, { { { { 26.0, 27.0 } }, { { { 28.0, 29.0 } }, { { 30.0, 31.0 } }, { { 32.0, 33.0 } } } } } });
    std::vector<s5> v2({ { { { { 34.0 }, { 35.0 }, { 36.0 } }, { { 37.0 } } }, { { { 38.0 }, { 39.0 }, { 40.0 } }, { { 41.0 } } }, { { { 42.0, 43.0 } }, { { 44.0, 45.0 } } }, { { { { { 46.0 }, { 47.0 }, { 48.0 } }, { { 49.0 } } }, { { { 50.0 }, { 51.0 }, { 52.0 } }, { { 53.0 } } } }, { { { 54.0 }, { 55.0 }, { 56.0 } }, { { 57.0 } } } }, { { { 58.0, 59.0 } }, { { 60.0, 61.0 } }, { { 62.0, 63.0 } } } } });
    double v3(64.0);
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
