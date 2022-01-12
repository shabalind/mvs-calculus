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
    std::vector<s1> p0;
    s1 p1;
    s2(std::vector<s1> v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s2 p0;
    s0 p1;
    s3(s2 v0, s0 v1): p0(v0), p1(v1) { }
  };
  s2 f97(const s2 &v0) {
    const std::vector<s2> v8 { v0, v0 };
    const s2 v11 = v8[0];
    return v11;
  }
  s2 f92(const s2 &v0) {
    const s2 v6 = f97(v0);
    const s2 v15 = f97(v6);
    const std::vector<s2> v46 { v15, v15 };
    const s2 v44 = v46[1];
    const s2 v83 = f97(v44);
    const s2 v136 = f97(v83);
    return v136;
  }
  double f68(const double &v0) {
    const double v7 = v0 / v0;
    double v4 = v0;
    const std::vector<double> v6 { v7 };
    std::vector<double> v2 = v6;
    const double v1 = v6[0];
    const double v5 = v2[0];
    v2[0] = v4;
    const double v9 = v2[0];
    const std::vector<double> v8 { v5, v0 };
    v2[0] = v7;
    const double v18 = v2[0];
    v2[0] = v1;
    std::vector<double> v10 = v8;
    v10[1] = v9;
    const double v16 = v10[0];
    v4 = v5;
    v2[0] = v18;
    double v42 = v16;
    return v42;
  }
  s2 f48(const s2 &v0) {
    const std::vector<s1> v1 = v0.p0;
    const s1 v5 = v0.p1;
    const s2 v7(v1, v5);
    std::vector<s1> v6 = v1;
    const s1 v3 = v1[0];
    s2 v4 = v7;
    v4.p0 = v6;
    const s1 v22 = v1[0];
    s1 v14 = v22;
    v6[0] = v22;
    const s1 v18 = v1[0];
    const std::vector<std::vector<s1>> v15 { v1 };
    v6[0] = v14;
    const s0 v16 = v18.p0;
    const std::vector<s1> v28 = v15[0];
    const std::vector<s1> v20 = v4.p0;
    v4.p1 = v3;
    const s1 v38 = v28[0];
    v6 = v20;
    const s2 v40(v6, v38);
    v14.p0 = v16;
    const s0 v37 = v22.p0;
    v6[0] = v18;
    const s3 v81(v40, v37);
    const s2 v148 = v81.p0;
    const s2 v91 = f92(v148);
    return v91;
  }
  __attribute__((noinline))
  double f0(const s2 &v0, const double &v1) {
    const std::vector<s1> v6 = v0.p0;
    std::vector<s1> v4 = v6;
    const s1 v5 = v4[1];
    s2 v3 = v0;
    v3.p1 = v5;
    const s1 v8 = v0.p1;
    const std::vector<s1> v9 = v3.p0;
    const s2 v2 = f48(v0);
    const s2 v17 = f97(v0);
    v4[0] = v5;
    const s1 v11 = v2.p1;
    v4[0] = v11;
    const std::vector<s1> v19 = v17.p0;
    v3.p1 = v5;
    v4 = v19;
    const std::vector<s0> v27 = v5.p1;
    const s0 v36 = v27[2];
    const std::vector<std::vector<double>> v23 = v36.p1;
    v3.p1 = v5;
    v3.p1 = v8;
    v3 = v17;
    v3.p0 = v9;
    const std::vector<double> v76 = v23[0];
    v4 = v9;
    v4 = v6;
    const double v211 = v76[0];
    double v98 = v211;
    v4[0] = v11;
    const double v191 = f68(v98);
    return v191;
  }
  int main() {
    s2 v0({ { { { { { 0.0 }, { 1.0 } }, { { 2.0 } } }, { { { { 3.0 }, { 4.0 } }, { { 5.0 } } }, { { { 6.0 }, { 7.0 } }, { { 8.0 } } }, { { { 9.0 }, { 10.0 } }, { { 11.0 } } } } }, { { { { 12.0 }, { 13.0 } }, { { 14.0 } } }, { { { { 15.0 }, { 16.0 } }, { { 17.0 } } }, { { { 18.0 }, { 19.0 } }, { { 20.0 } } }, { { { 21.0 }, { 22.0 } }, { { 23.0 } } } } } }, { { { { 24.0 }, { 25.0 } }, { { 26.0 } } }, { { { { 27.0 }, { 28.0 } }, { { 29.0 } } }, { { { 30.0 }, { 31.0 } }, { { 32.0 } } }, { { { 33.0 }, { 34.0 } }, { { 35.0 } } } } } });
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
