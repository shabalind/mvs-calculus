  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<double> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<double> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<s0> p0;
    s0 p1;
    s1(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s1> p0;
    std::vector<std::vector<double>> p1;
    std::vector<std::vector<s0>> p2;
    s0 p3;
    std::vector<std::vector<s1>> p4;
    s2(std::vector<s1> v0, std::vector<std::vector<double>> v1, std::vector<std::vector<s0>> v2, s0 v3, std::vector<std::vector<s1>> v4): p0(v0), p1(v1), p2(v2), p3(v3), p4(v4) { }
  };
  struct s4 {
    std::vector<std::vector<s1>> p0;
    s0 p1;
    s4(std::vector<std::vector<s1>> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s6 {
    s2 p0;
    s1 p1;
    s6(s2 v0, s1 v1): p0(v0), p1(v1) { }
  };
  double f52(const double &v0) {
    double v7 = v0;
    double v4 = v7;
    const std::vector<double> v6 { v0, v7, v4, v0, v4 };
    std::vector<double> v11 = v6;
    const double v2 = v11[2];
    v7 = v2;
    v11 = v6;
    v11[4] = v7;
    v11[1] = v2;
    const double v17 = v11[4];
    v11[3] = v7;
    return v17;
  }
  std::vector<s0> f48(const std::vector<s0> &v0) {
    const s0 v2 = v0[0];
    std::vector<s0> v5 = v0;
    const s0 v7 = v0[0];
    v5[1] = v7;
    std::vector<s0> v14 = v0;
    const s0 v12 = v14[1];
    v14 = v5;
    v5[1] = v2;
    const s1 v61(v5, v12);
    const std::vector<s0> v126 = v61.p0;
    return v126;
  }
  s1 f42(const s0 &v0, const s1 &v1) {
    const std::vector<s1> v8 { v1, v1, v1, v1 };
    std::vector<s1> v6 = v8;
    v6[1] = v1;
    const s1 v9 = v6[1];
    v6 = v8;
    v6[3] = v1;
    std::vector<s1> v18 = v6;
    v18[1] = v1;
    v6 = v8;
    v6 = v18;
    v6[0] = v1;
    v18[2] = v1;
    return v9;
  }
  s1 f40(const s1 &v0) {
    s1 v7 = v0;
    s1 v8 = v7;
    const std::vector<s0> v1 = v7.p0;
    const std::vector<s0> v2 = f48(v1);
    const s0 v3 = v1[0];
    const s0 v4 = v2[0];
    v8 = v7;
    const std::vector<s1> v11 { v0, v8, v7 };
    const s1 v5 = f42(v3, v0);
    const s0 v18 = v0.p1;
    std::vector<s1> v14 = v11;
    const std::vector<s0> v17 { v4 };
    v7.p1 = v18;
    v8.p0 = v1;
    const s1 v24 = v14[0];
    v14[2] = v5;
    v8 = v7;
    const std::vector<s1> v49 { v24, v5, v5 };
    const s1 v27 = v14[0];
    const s0 v35 = v17[0];
    std::vector<s1> v43 = v49;
    const s1 v38 = f42(v35, v27);
    v43[2] = v0;
    v43[2] = v38;
    const s1 v90 = v43[1];
    return v90;
  }
  __attribute__((noinline))
  double f0(const s6 &v0, const s1 &v1, const std::vector<s4> &v2, const double &v3) {
    const s1 v4 = f40(v1);
    const std::vector<s0> v17 = v4.p0;
    const std::vector<s0> v23 = f48(v17);
    const std::vector<s0> v35 = f48(v23);
    const s0 v26 = v35[1];
    const std::vector<std::vector<double>> v43 = v26.p1;
    const std::vector<double> v51 = v43[0];
    const double v31 = v51[0];
    const double v41 = f52(v31);
    return v41;
  }
  int main() {
    s6 v0({ { { { { { { 0.0 }, { { 1.0 } } }, { { 2.0 }, { { 3.0 } } } }, { { 4.0 }, { { 5.0 } } } }, { { { { 6.0 }, { { 7.0 } } }, { { 8.0 }, { { 9.0 } } } }, { { 10.0 }, { { 11.0 } } } } }, { { 12.0 }, { 13.0 }, { 14.0 } }, { { { { 15.0 }, { { 16.0 } } } }, { { { 17.0 }, { { 18.0 } } } }, { { { 19.0 }, { { 20.0 } } } } }, { { 21.0 }, { { 22.0 } } }, { { { { { { 23.0 }, { { 24.0 } } }, { { 25.0 }, { { 26.0 } } } }, { { 27.0 }, { { 28.0 } } } } } } }, { { { { 29.0 }, { { 30.0 } } }, { { 31.0 }, { { 32.0 } } } }, { { 33.0 }, { { 34.0 } } } } });
    s1 v1({ { { { 35.0 }, { { 36.0 } } }, { { 37.0 }, { { 38.0 } } } }, { { 39.0 }, { { 40.0 } } } });
    std::vector<s4> v2({ { { { { { { { 41.0 }, { { 42.0 } } }, { { 43.0 }, { { 44.0 } } } }, { { 45.0 }, { { 46.0 } } } } }, { { { { { 47.0 }, { { 48.0 } } }, { { 49.0 }, { { 50.0 } } } }, { { 51.0 }, { { 52.0 } } } } }, { { { { { 53.0 }, { { 54.0 } } }, { { 55.0 }, { { 56.0 } } } }, { { 57.0 }, { { 58.0 } } } } } }, { { 59.0 }, { { 60.0 } } } } });
    double v3(61.0);
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
