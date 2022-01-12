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
  struct s3 {
    s0 p0;
    s3(s0 v0): p0(v0) { }
  };
  struct s4 {
    s0 p0;
    std::vector<s3> p1;
    std::vector<s0> p2;
    s4(s0 v0, std::vector<s3> v1, std::vector<s0> v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s6 {
    s4 p0;
    std::vector<s1> p1;
    s6(s4 v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  s3 f96(const s3 &v0) {
    const s0 v6 = v0.p0;
    const s0 v1 = v0.p0;
    s3 v7 = v0;
    v7.p0 = v6;
    s3 v3 = v7;
    s0 v10 = v1;
    s0 v25 = v6;
    const std::vector<std::vector<double>> v18 = v25.p1;
    s3 v14 = v7;
    s0 v19 = v1;
    v14.p0 = v10;
    v10.p1 = v18;
    const s0 v36 = v3.p0;
    s3 v22 = v14;
    v25 = v6;
    const s0 v58 = v7.p0;
    v7.p0 = v36;
    v14.p0 = v1;
    v3.p0 = v58;
    const std::vector<std::vector<double>> v50 = v1.p0;
    v25.p0 = v50;
    v14.p0 = v19;
    return v22;
  }
  s3 f20(const s3 &v0, const s6 &v1) {
    const s3 v6 = f96(v0);
    const s3 v11 = f96(v6);
    return v11;
  }
  __attribute__((noinline))
  double f0(const s3 &v0, const s6 &v1, const double &v2) {
    const s3 v7 = f20(v0, v1);
    const s0 v11 = v7.p0;
    const std::vector<std::vector<double>> v23 = v11.p1;
    const double v40 = v2 / v2;
    double v51 = v40;
    const std::vector<double> v47 = v23[0];
    const double v19 = v47[0];
    std::vector<double> v37 = v47;
    v37[0] = v40;
    double v31 = v2;
    v37[0] = v40;
    v37[0] = v19;
    v37[0] = v40;
    v37[0] = v51;
    v37[0] = v40;
    const double v140 = v37[0];
    v37[0] = v31;
    v37[0] = v19;
    v37[0] = v140;
    return v140;
  }
  int main() {
    s3 v0({ { { { 0.0 }, { 1.0 } }, { { 2.0 } } } });
    s6 v1({ { { { { 3.0 }, { 4.0 } }, { { 5.0 } } }, { { { { { 6.0 }, { 7.0 } }, { { 8.0 } } } }, { { { { 9.0 }, { 10.0 } }, { { 11.0 } } } } }, { { { { 12.0 }, { 13.0 } }, { { 14.0 } } } } }, { { { { { 15.0 }, { 16.0 } }, { { 17.0 } } }, { { { { 18.0 }, { 19.0 } }, { { 20.0 } } }, { { { 21.0 }, { 22.0 } }, { { 23.0 } } }, { { { 24.0 }, { 25.0 } }, { { 26.0 } } } } }, { { { { 27.0 }, { 28.0 } }, { { 29.0 } } }, { { { { 30.0 }, { 31.0 } }, { { 32.0 } } }, { { { 33.0 }, { 34.0 } }, { { 35.0 } } }, { { { 36.0 }, { 37.0 } }, { { 38.0 } } } } } } });
    double v2(39.0);
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
