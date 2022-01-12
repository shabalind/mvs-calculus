  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<double> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<double> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    s0 p0;
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s1 p0;
    std::vector<std::vector<s0>> p1;
    s2(s1 v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s2 p0;
    std::vector<std::vector<double>> p1;
    s3(s2 v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  s3 f53(const s3 &v0) {
    return v0;
  }
  double f51(const double &v0) {
    double v5 = v0;
    double v1 = v5;
    v1 = v5;
    double v6 = v0;
    double v3 = v1;
    double v2 = v6;
    double v9 = v6;
    double v10 = v2;
    const std::vector<double> v18 { v2, v0, v10, v3 };
    const std::vector<std::vector<double>> v13 { v18, v18, v18, v18, v18, v18 };
    const std::vector<double> v21 = v13[2];
    v1 = v9;
    const double v58 = v21[3];
    v9 = v2;
    return v58;
  }
  s2 f41(const s2 &v0) {
    const s1 v5 = v0.p0;
    s2 v4 = v0;
    const std::vector<std::vector<s0>> v2 = v0.p1;
    v4.p0 = v5;
    const std::vector<s0> v7 = v2[2];
    const s0 v13 = v5.p1;
    v4.p0 = v5;
    const std::vector<s0> v1 = v2[2];
    const std::vector<std::vector<s0>> v9 = v4.p1;
    const s0 v11 = v5.p1;
    std::vector<std::vector<s0>> v6 = v2;
    const std::vector<s0> v8 = v6[2];
    v4.p1 = v6;
    v6[2] = v8;
    v6 = v9;
    const std::vector<std::vector<s0>> v17 = v4.p1;
    const std::vector<std::vector<s0>> v31 = v0.p1;
    v4.p1 = v31;
    v6[1] = v7;
    s0 v18 = v11;
    const s1 v102 = v0.p0;
    s1 v104 = v102;
    v104.p0 = v13;
    const s2 v95(v104, v17);
    v104.p1 = v18;
    v6[0] = v1;
    const std::vector<std::vector<double>> v149 = v18.p0;
    v18.p0 = v149;
    return v95;
  }
  s3 f39(const s3 &v0, const s2 &v1) {
    const s2 v4 = f41(v1);
    const s2 v10 = f41(v4);
    const std::vector<std::vector<s0>> v8 = v10.p1;
    const std::vector<s0> v13 = v8[1];
    const s0 v16 = v13[0];
    const s3 v42 = f53(v0);
    const std::vector<std::vector<double>> v77 = v16.p0;
    s3 v51 = v42;
    const s3 v119 = f53(v51);
    v51.p1 = v77;
    return v119;
  }
  __attribute__((noinline))
  double f0(const s2 &v0, const std::vector<s3> &v1, const double &v2) {
    const s3 v8 = v1[1];
    const s3 v6 = v1[1];
    const s3 v7 = f39(v6, v0);
    const s3 v9 = f39(v7, v0);
    s3 v12 = v8;
    const s3 v16 = f39(v12, v0);
    const std::vector<std::vector<double>> v23 = v16.p1;
    v12.p1 = v23;
    const std::vector<double> v25 = v23[0];
    const double v18 = f51(v2);
    const double v37 = v25[0];
    std::vector<double> v40 = v25;
    const std::vector<std::vector<double>> v36 = v9.p1;
    const double v85 = v40[0];
    v12.p1 = v36;
    const double v122 = v37 / v85;
    v40[0] = v18;
    return v122;
  }
  int main() {
    s2 v0({ { { { { 0.0 } }, { 1.0, 2.0 } }, { { { 3.0 } }, { 4.0, 5.0 } } }, { { { { { 6.0 } }, { 7.0, 8.0 } } }, { { { { 9.0 } }, { 10.0, 11.0 } } }, { { { { 12.0 } }, { 13.0, 14.0 } } } } });
    std::vector<s3> v1({ { { { { { { 15.0 } }, { 16.0, 17.0 } }, { { { 18.0 } }, { 19.0, 20.0 } } }, { { { { { 21.0 } }, { 22.0, 23.0 } } }, { { { { 24.0 } }, { 25.0, 26.0 } } }, { { { { 27.0 } }, { 28.0, 29.0 } } } } }, { { 30.0 } } }, { { { { { { 31.0 } }, { 32.0, 33.0 } }, { { { 34.0 } }, { 35.0, 36.0 } } }, { { { { { 37.0 } }, { 38.0, 39.0 } } }, { { { { 40.0 } }, { 41.0, 42.0 } } }, { { { { 43.0 } }, { 44.0, 45.0 } } } } }, { { 46.0 } } } });
    double v2(47.0);
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
