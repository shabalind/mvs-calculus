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
    std::vector<s0> p0;
    s1 p1;
    s2(std::vector<s0> v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s0 p0;
    std::vector<s1> p1;
    s3(s0 v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    s0 p0;
    std::vector<s1> p1;
    s4(s0 v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    std::vector<double> p0;
    std::vector<s2> p1;
    s5(std::vector<double> v0, std::vector<s2> v1): p0(v0), p1(v1) { }
  };
  struct s6 {
    std::vector<std::vector<s2>> p0;
    s3 p1;
    s6(std::vector<std::vector<s2>> v0, s3 v1): p0(v0), p1(v1) { }
  };
  struct s7 {
    s0 p0;
    s6 p1;
    s7(s0 v0, s6 v1): p0(v0), p1(v1) { }
  };
  s6 f24(const s6 &v0) {
    const std::vector<std::vector<s2>> v1 = v0.p0;
    s6 v5 = v0;
    v5.p0 = v1;
    v5 = v0;
    std::vector<std::vector<s2>> v9 = v1;
    const std::vector<std::vector<std::vector<s2>>> v7 { v9, v1 };
    v5.p0 = v9;
    v5.p0 = v9;
    const std::vector<std::vector<s2>> v16 = v7[0];
    s6 v23 = v0;
    const s3 v21 = v23.p1;
    v23.p0 = v16;
    v5.p1 = v21;
    return v5;
  }
  s6 f17(const s6 &v0) {
    const s6 v3 = f24(v0);
    const std::vector<std::vector<s2>> v1 = v3.p0;
    const std::vector<std::vector<s2>> v5 = v0.p0;
    const std::vector<s2> v7 = v5[1];
    std::vector<std::vector<s2>> v2 = v5;
    std::vector<std::vector<s2>> v4 = v1;
    const std::vector<s2> v8 = v4[0];
    v2[1] = v8;
    const s6 v22 = f24(v3);
    const s2 v21 = v8[0];
    v4[0] = v7;
    const std::vector<std::vector<s2>> v17 = v3.p0;
    v2[1] = v7;
    v4[1] = v8;
    const std::vector<std::vector<s2>> v13 = v0.p0;
    const std::vector<s2> v12 { v21 };
    const std::vector<s2> v16 = v4[0];
    std::vector<std::vector<s2>> v55 = v2;
    v55[1] = v8;
    v55[0] = v16;
    s6 v65 = v22;
    const std::vector<s2> v33 = v17[0];
    v4[0] = v33;
    v2[0] = v8;
    v65.p0 = v55;
    v55[0] = v33;
    v4[0] = v12;
    v65.p0 = v13;
    return v65;
  }
  double f12(const s7 &v0, const double &v1) {
    const s0 v3 = v0.p0;
    const std::vector<std::vector<double>> v17 = v3.p1;
    const std::vector<double> v28 = v17[0];
    const double v37 = v28[0];
    double v206 = v37;
    return v206;
  }
  s7 f8(const s7 &v0) {
    s7 v7 = v0;
    s7 v6 = v7;
    const s6 v3 = v0.p1;
    const s6 v1 = v6.p1;
    s7 v14 = v7;
    const s6 v16 = f17(v1);
    v7.p1 = v16;
    v6 = v14;
    s7 v78 = v7;
    v78.p1 = v3;
    return v78;
  }
  s7 f7(const s7 &v0, const s5 &v1) {
    const s7 v95 = f8(v0);
    return v95;
  }
  __attribute__((noinline))
  double f0(const s7 &v0, const s1 &v1, const std::vector<s5> &v2, const s4 &v3, const double &v4) {
    const s5 v7 = v2[0];
    const s7 v9 = f7(v0, v7);
    double v13 = v4;
    const double v43 = f12(v9, v4);
    const double v21 = v13 * v43;
    double v32 = v21;
    const double v54 = f12(v0, v32);
    return v54;
  }
  int main() {
    s7 v0({ { { { 0.0 }, { 1.0 } }, { { 2.0 } } }, { { { { { { { { 3.0 }, { 4.0 } }, { { 5.0 } } } }, { { { { 6.0 }, { 7.0 } }, { { 8.0 } } }, { { { 9.0 }, { 10.0 } }, { { 11.0 } } } } } }, { { { { { { 12.0 }, { 13.0 } }, { { 14.0 } } } }, { { { { 15.0 }, { 16.0 } }, { { 17.0 } } }, { { { 18.0 }, { 19.0 } }, { { 20.0 } } } } } } }, { { { { 21.0 }, { 22.0 } }, { { 23.0 } } }, { { { { { 24.0 }, { 25.0 } }, { { 26.0 } } }, { { { 27.0 }, { 28.0 } }, { { 29.0 } } } }, { { { { 30.0 }, { 31.0 } }, { { 32.0 } } }, { { { 33.0 }, { 34.0 } }, { { 35.0 } } } } } } } });
    s1 v1({ { { { 36.0 }, { 37.0 } }, { { 38.0 } } }, { { { 39.0 }, { 40.0 } }, { { 41.0 } } } });
    std::vector<s5> v2({ { { 42.0 }, { { { { { { 43.0 }, { 44.0 } }, { { 45.0 } } } }, { { { { 46.0 }, { 47.0 } }, { { 48.0 } } }, { { { 49.0 }, { 50.0 } }, { { 51.0 } } } } } } }, { { 52.0 }, { { { { { { 53.0 }, { 54.0 } }, { { 55.0 } } } }, { { { { 56.0 }, { 57.0 } }, { { 58.0 } } }, { { { 59.0 }, { 60.0 } }, { { 61.0 } } } } } } }, { { 62.0 }, { { { { { { 63.0 }, { 64.0 } }, { { 65.0 } } } }, { { { { 66.0 }, { 67.0 } }, { { 68.0 } } }, { { { 69.0 }, { 70.0 } }, { { 71.0 } } } } } } } });
    s4 v3({ { { { 72.0 }, { 73.0 } }, { { 74.0 } } }, { { { { { 75.0 }, { 76.0 } }, { { 77.0 } } }, { { { 78.0 }, { 79.0 } }, { { 80.0 } } } }, { { { { 81.0 }, { 82.0 } }, { { 83.0 } } }, { { { 84.0 }, { 85.0 } }, { { 86.0 } } } }, { { { { 87.0 }, { 88.0 } }, { { 89.0 } } }, { { { 90.0 }, { 91.0 } }, { { 92.0 } } } } } });
    double v4(93.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3, v4);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
