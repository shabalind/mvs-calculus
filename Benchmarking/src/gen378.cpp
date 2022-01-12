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
    std::vector<std::vector<s0>> p1;
    s1(s0 v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s0 p0;
    s1 p1;
    s2(s0 v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<s1> p0;
    s1 p1;
    s3(std::vector<s1> v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    std::vector<s1> p0;
    std::vector<s2> p1;
    s4(std::vector<s1> v0, std::vector<s2> v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    s4 p0;
    std::vector<std::vector<s3>> p1;
    s5(s4 v0, std::vector<std::vector<s3>> v1): p0(v0), p1(v1) { }
  };
  struct s8 {
    s0 p0;
    s5 p1;
    s8(s0 v0, s5 v1): p0(v0), p1(v1) { }
  };
  struct s10 {
    s8 p0;
    s10(s8 v0): p0(v0) { }
  };
  double f56(const double &v0) {
    double v3 = v0;
    double v5 = v0;
    double v15 = v0;
    double v4 = v0;
    double v1 = v0;
    double v7 = v4;
    double v9 = v15;
    v4 = v5;
    double v8 = v7;
    double v11 = v8;
    double v10 = v1;
    double v21 = v15;
    double v30 = v3;
    v21 = v4;
    const std::vector<double> v25 { v11, v11, v9, v30, v10 };
    const double v27 = v25[0];
    std::vector<double> v57 = v25;
    std::vector<double> v36 = v57;
    v36[3] = v7;
    v57[2] = v27;
    std::vector<double> v72 = v36;
    v72[4] = v21;
    std::vector<double> v32 = v72;
    std::vector<double> v38 = v32;
    std::vector<double> v60 = v38;
    const double v42 = v60[0];
    return v42;
  }
  __attribute__((noinline))
  double f0(const s10 &v0, const double &v1) {
    double v8 = v1;
    const double v5 = v1 + v8;
    const double v7 = f56(v8);
    double v37 = v1;
    const double v54 = v37 + v7;
    const double v120 = v5 * v54;
    v37 = v8;
    return v120;
  }
  int main() {
    s10 v0({ { { { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } } }, { { { { { { { 4.0 } }, { { 5.0 }, { 6.0 }, { 7.0 } } }, { { { { { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } } }, { { { { 12.0 } }, { { 13.0 }, { 14.0 }, { 15.0 } } } } } } }, { { { { { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } }, { { { { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } }, { { { { { 24.0 } }, { { 25.0 }, { 26.0 }, { 27.0 } } } }, { { { { 28.0 } }, { { 29.0 }, { 30.0 }, { 31.0 } } } } } } }, { { { { 32.0 } }, { { 33.0 }, { 34.0 }, { 35.0 } } }, { { { { 36.0 } }, { { 37.0 }, { 38.0 }, { 39.0 } } }, { { { { { 40.0 } }, { { 41.0 }, { 42.0 }, { 43.0 } } } }, { { { { 44.0 } }, { { 45.0 }, { 46.0 }, { 47.0 } } } } } } } } }, { { { { { { { { 48.0 } }, { { 49.0 }, { 50.0 }, { 51.0 } } }, { { { { { 52.0 } }, { { 53.0 }, { 54.0 }, { 55.0 } } } }, { { { { 56.0 } }, { { 57.0 }, { 58.0 }, { 59.0 } } } } } }, { { { { 60.0 } }, { { 61.0 }, { 62.0 }, { 63.0 } } }, { { { { { 64.0 } }, { { 65.0 }, { 66.0 }, { 67.0 } } } }, { { { { 68.0 } }, { { 69.0 }, { 70.0 }, { 71.0 } } } } } }, { { { { 72.0 } }, { { 73.0 }, { 74.0 }, { 75.0 } } }, { { { { { 76.0 } }, { { 77.0 }, { 78.0 }, { 79.0 } } } }, { { { { 80.0 } }, { { 81.0 }, { 82.0 }, { 83.0 } } } } } } }, { { { { 84.0 } }, { { 85.0 }, { 86.0 }, { 87.0 } } }, { { { { { 88.0 } }, { { 89.0 }, { 90.0 }, { 91.0 } } } }, { { { { 92.0 } }, { { 93.0 }, { 94.0 }, { 95.0 } } } } } } } } } } } });
    double v1(96.0);
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
