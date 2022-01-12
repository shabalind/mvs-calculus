  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<std::vector<s0>> p0;
    s0 p1;
    s1(std::vector<std::vector<s0>> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<std::vector<s0>> p0;
    s0 p1;
    s2(std::vector<std::vector<s0>> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s2 p0;
    s1 p1;
    s3(s2 v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    std::vector<s0> p0;
    s2 p1;
    s4(std::vector<s0> v0, s2 v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    s2 p0;
    std::vector<s0> p1;
    s5(s2 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  s4 f32(const std::vector<s1> &v0, const s4 &v1) {
    const s2 v6 = v1.p1;
    const s2 v15 = v1.p1;
    const std::vector<std::vector<s0>> v30 = v6.p0;
    const std::vector<s0> v72 = v30[0];
    const s4 v150(v72, v15);
    return v150;
  }
  __attribute__((noinline))
  double f0(const s4 &v0, const s5 &v1, const s3 &v2, const s4 &v3, const double &v4, const std::vector<std::vector<s1>> &v5) {
    const s2 v8 = v3.p1;
    s4 v10 = v3;
    const s0 v13 = v8.p1;
    const std::vector<s1> v16 = v5[1];
    const std::vector<std::vector<double>> v26 = v13.p1;
    const s4 v27 = f32(v16, v10);
    const std::vector<double> v20 = v26[0];
    const s2 v44 = v27.p1;
    const std::vector<std::vector<s0>> v60 = v44.p0;
    const std::vector<s0> v50 = v60[0];
    const double v51 = v20[0];
    v10.p1 = v8;
    const s0 v49 = v50[0];
    const std::vector<std::vector<double>> v41 = v49.p1;
    const std::vector<double> v43 = v41[0];
    const double v114 = v43[0];
    const double v148 = v51 + v114;
    return v148;
  }
  int main() {
    s4 v0({ { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } } } }, { { { { { { 4.0 }, { 5.0 }, { 6.0 } }, { { 7.0 } } } } }, { { { 8.0 }, { 9.0 }, { 10.0 } }, { { 11.0 } } } } });
    s5 v1({ { { { { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 } } } } }, { { { 16.0 }, { 17.0 }, { 18.0 } }, { { 19.0 } } } }, { { { { 20.0 }, { 21.0 }, { 22.0 } }, { { 23.0 } } }, { { { 24.0 }, { 25.0 }, { 26.0 } }, { { 27.0 } } } } });
    s3 v2({ { { { { { { 28.0 }, { 29.0 }, { 30.0 } }, { { 31.0 } } } } }, { { { 32.0 }, { 33.0 }, { 34.0 } }, { { 35.0 } } } }, { { { { { { 36.0 }, { 37.0 }, { 38.0 } }, { { 39.0 } } } }, { { { { 40.0 }, { 41.0 }, { 42.0 } }, { { 43.0 } } } }, { { { { 44.0 }, { 45.0 }, { 46.0 } }, { { 47.0 } } } } }, { { { 48.0 }, { 49.0 }, { 50.0 } }, { { 51.0 } } } } });
    s4 v3({ { { { { 52.0 }, { 53.0 }, { 54.0 } }, { { 55.0 } } } }, { { { { { { 56.0 }, { 57.0 }, { 58.0 } }, { { 59.0 } } } } }, { { { 60.0 }, { 61.0 }, { 62.0 } }, { { 63.0 } } } } });
    double v4(64.0);
    std::vector<std::vector<s1>> v5({ { { { { { { { 65.0 }, { 66.0 }, { 67.0 } }, { { 68.0 } } } }, { { { { 69.0 }, { 70.0 }, { 71.0 } }, { { 72.0 } } } }, { { { { 73.0 }, { 74.0 }, { 75.0 } }, { { 76.0 } } } } }, { { { 77.0 }, { 78.0 }, { 79.0 } }, { { 80.0 } } } } }, { { { { { { { 81.0 }, { 82.0 }, { 83.0 } }, { { 84.0 } } } }, { { { { 85.0 }, { 86.0 }, { 87.0 } }, { { 88.0 } } } }, { { { { 89.0 }, { 90.0 }, { 91.0 } }, { { 92.0 } } } } }, { { { 93.0 }, { 94.0 }, { 95.0 } }, { { 96.0 } } } } } });
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3, v4, v5);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
