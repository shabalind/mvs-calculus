  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    s0(std::vector<std::vector<double>> v0): p0(v0) { }
  };
  struct s1 {
    std::vector<s0> p0;
    s0 p1;
    s1(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s1 p0;
    s1 p1;
    s2(s1 v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s0 p0;
    s0 p1;
    s3(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    s2 p0;
    std::vector<s2> p1;
    s5(s2 v0, std::vector<s2> v1): p0(v0), p1(v1) { }
  };
  struct s6 {
    std::vector<s2> p0;
    s6(std::vector<s2> v0): p0(v0) { }
  };
  s3 f25(const s3 &v0) {
    const s0 v2 = v0.p0;
    s0 v8 = v2;
    const std::vector<std::vector<double>> v6 = v2.p0;
    s3 v3 = v0;
    const s0 v9 = v3.p1;
    v3 = v0;
    s0 v7 = v2;
    v3.p1 = v9;
    v3.p1 = v7;
    const s0 v10 = v3.p0;
    const std::vector<std::vector<double>> v15 = v10.p0;
    const std::vector<std::vector<double>> v13 = v8.p0;
    s0 v21 = v8;
    v7.p0 = v6;
    const std::vector<std::vector<double>> v20 = v21.p0;
    const s0 v33 = v3.p1;
    s0 v24 = v9;
    v21.p0 = v13;
    v21.p0 = v6;
    v21 = v7;
    const std::vector<std::vector<double>> v22 = v2.p0;
    v21 = v10;
    v7.p0 = v22;
    v7.p0 = v20;
    v3.p0 = v24;
    const s0 v18 = v0.p1;
    s3 v48 = v3;
    v3.p1 = v7;
    s0 v47 = v33;
    v24.p0 = v13;
    const s0 v36 = v48.p0;
    const s3 v41(v36, v47);
    s0 v125 = v18;
    v3.p0 = v9;
    v7.p0 = v15;
    const std::vector<std::vector<double>> v85 = v125.p0;
    v3.p1 = v2;
    v47 = v21;
    v47.p0 = v6;
    v47.p0 = v85;
    return v41;
  }
  s3 f14(const s3 &v0) {
    const s3 v6 = f25(v0);
    const s3 v3 = f25(v6);
    const s3 v13 = f25(v3);
    const s3 v71 = f25(v13);
    const s3 v22 = f25(v71);
    const s3 v54 = f25(v22);
    return v54;
  }
  __attribute__((noinline))
  double f0(const s6 &v0, const s6 &v1, const std::vector<std::vector<s5>> &v2, const std::vector<s2> &v3, const s0 &v4, const s5 &v5, const s5 &v6, const s0 &v7, const double &v8) {
    const s3 v14(v7, v7);
    const s3 v22 = f14(v14);
    const s0 v33 = v22.p1;
    const std::vector<std::vector<double>> v35 = v33.p0;
    const std::vector<double> v38 = v35[0];
    const double v109 = v38[0];
    return v109;
  }
  int main() {
    s6 v0({ { { { { { { { 0.0 } } } }, { { { 1.0 } } } }, { { { { { 2.0 } } } }, { { { 3.0 } } } } } } });
    s6 v1({ { { { { { { { 4.0 } } } }, { { { 5.0 } } } }, { { { { { 6.0 } } } }, { { { 7.0 } } } } } } });
    std::vector<std::vector<s5>> v2({ { { { { { { { { 8.0 } } } }, { { { 9.0 } } } }, { { { { { 10.0 } } } }, { { { 11.0 } } } } }, { { { { { { { 12.0 } } } }, { { { 13.0 } } } }, { { { { { 14.0 } } } }, { { { 15.0 } } } } } } } }, { { { { { { { { 16.0 } } } }, { { { 17.0 } } } }, { { { { { 18.0 } } } }, { { { 19.0 } } } } }, { { { { { { { 20.0 } } } }, { { { 21.0 } } } }, { { { { { 22.0 } } } }, { { { 23.0 } } } } } } } } });
    std::vector<s2> v3({ { { { { { { 24.0 } } } }, { { { 25.0 } } } }, { { { { { 26.0 } } } }, { { { 27.0 } } } } }, { { { { { { 28.0 } } } }, { { { 29.0 } } } }, { { { { { 30.0 } } } }, { { { 31.0 } } } } } });
    s0 v4({ { { 32.0 } } });
    s5 v5({ { { { { { { 33.0 } } } }, { { { 34.0 } } } }, { { { { { 35.0 } } } }, { { { 36.0 } } } } }, { { { { { { { 37.0 } } } }, { { { 38.0 } } } }, { { { { { 39.0 } } } }, { { { 40.0 } } } } } } });
    s5 v6({ { { { { { { 41.0 } } } }, { { { 42.0 } } } }, { { { { { 43.0 } } } }, { { { 44.0 } } } } }, { { { { { { { 45.0 } } } }, { { { 46.0 } } } }, { { { { { 47.0 } } } }, { { { 48.0 } } } } } } });
    s0 v7({ { { 49.0 } } });
    double v8(50.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3, v4, v5, v6, v7, v8);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
