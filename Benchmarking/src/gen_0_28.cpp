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
    std::vector<s0> p1;
    s2(std::vector<s0> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<s0> p0;
    std::vector<s2> p1;
    s3(std::vector<s0> v0, std::vector<s2> v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    std::vector<s2> p0;
    s2 p1;
    std::vector<s3> p2;
    s2 p3;
    s5(std::vector<s2> v0, s2 v1, std::vector<s3> v2, s2 v3): p0(v0), p1(v1), p2(v2), p3(v3) { }
  };
  struct s6 {
    std::vector<std::vector<s5>> p0;
    s1 p1;
    s6(std::vector<std::vector<s5>> v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s7 {
    s6 p0;
    s2 p1;
    s7(s6 v0, s2 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s7 &v0, const double &v1) {
    const s6 v6 = v0.p0;
    s6 v7 = v6;
    const s1 v5 = v7.p1;
    const s6 v8 = v0.p0;
    s1 v10 = v5;
    const std::vector<std::vector<s5>> v13 = v6.p0;
    const std::vector<s5> v9 = v13[0];
    const std::vector<s5> v18 = v13[0];
    const s5 v16 = v18[0];
    const s5 v23 = v9[0];
    const std::vector<std::vector<s5>> v14 = v8.p0;
    s5 v41 = v16;
    const s2 v29 = v41.p1;
    const std::vector<s3> v40 = v16.p2;
    const s2 v22 = v23.p3;
    const std::vector<s3> v21 = v23.p2;
    const s0 v26 = v10.p1;
    const std::vector<std::vector<double>> v48 = v26.p1;
    v7.p1 = v5;
    v7.p0 = v13;
    v7.p1 = v10;
    std::vector<s3> v67 = v21;
    const s5 v44 = v9[0];
    const std::vector<double> v49 = v48[0];
    v41 = v16;
    const s3 v25 = v21[0];
    v67[0] = v25;
    const s3 v80 = v40[0];
    const std::vector<std::vector<double>> v32 { v49, v49, v49, v49, v49, v49 };
    v7.p0 = v13;
    const std::vector<double> v37 = v32[2];
    v67[0] = v80;
    const std::vector<s0> v34 = v29.p0;
    const s0 v94 = v34[0];
    const s0 v66 = v34[0];
    v41 = v44;
    const std::vector<s2> v39 = v80.p1;
    v67[0] = v80;
    v10.p0 = v94;
    const s0 v72 = v34[0];
    v41.p1 = v22;
    v41.p2 = v67;
    v7.p0 = v14;
    const s2 v62 = v39[0];
    std::vector<std::vector<s5>> v165 = v14;
    v41.p3 = v62;
    v10.p1 = v72;
    const double v91 = v37[0];
    v10.p0 = v66;
    v7.p1 = v5;
    v7.p0 = v165;
    return v91;
  }
  int main() {
    s7 v0({ { { { { { { { { { { 0.0 } }, { { 1.0 }, { 2.0 } } } }, { { { { 3.0 } }, { { 4.0 }, { 5.0 } } }, { { { 6.0 } }, { { 7.0 }, { 8.0 } } }, { { { 9.0 } }, { { 10.0 }, { 11.0 } } } } } }, { { { { { 12.0 } }, { { 13.0 }, { 14.0 } } } }, { { { { 15.0 } }, { { 16.0 }, { 17.0 } } }, { { { 18.0 } }, { { 19.0 }, { 20.0 } } }, { { { 21.0 } }, { { 22.0 }, { 23.0 } } } } }, { { { { { { 24.0 } }, { { 25.0 }, { 26.0 } } }, { { { 27.0 } }, { { 28.0 }, { 29.0 } } }, { { { 30.0 } }, { { 31.0 }, { 32.0 } } } }, { { { { { { 33.0 } }, { { 34.0 }, { 35.0 } } } }, { { { { 36.0 } }, { { 37.0 }, { 38.0 } } }, { { { 39.0 } }, { { 40.0 }, { 41.0 } } }, { { { 42.0 } }, { { 43.0 }, { 44.0 } } } } } } } }, { { { { { 45.0 } }, { { 46.0 }, { 47.0 } } } }, { { { { 48.0 } }, { { 49.0 }, { 50.0 } } }, { { { 51.0 } }, { { 52.0 }, { 53.0 } } }, { { { 54.0 } }, { { 55.0 }, { 56.0 } } } } } } } }, { { { { 57.0 } }, { { 58.0 }, { 59.0 } } }, { { { 60.0 } }, { { 61.0 }, { 62.0 } } } } }, { { { { { 63.0 } }, { { 64.0 }, { 65.0 } } } }, { { { { 66.0 } }, { { 67.0 }, { 68.0 } } }, { { { 69.0 } }, { { 70.0 }, { 71.0 } } }, { { { 72.0 } }, { { 73.0 }, { 74.0 } } } } } });
    double v1(75.0);
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
