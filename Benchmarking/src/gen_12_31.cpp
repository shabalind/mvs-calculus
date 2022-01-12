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
    std::vector<s0> p1;
    s1(std::vector<s0> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s1 p0;
    std::vector<s0> p1;
    s3(s1 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    s3 p0;
    s1 p1;
    s4(s3 v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    s1 p0;
    s0 p1;
    s5(s1 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s6 {
    std::vector<s4> p0;
    s0 p1;
    s6(std::vector<s4> v0, s0 v1): p0(v0), p1(v1) { }
  };
  double f35(const double &v0) {
    double v7 = v0;
    double v6 = v7;
    double v5 = v6;
    double v8 = v5;
    v6 = v7;
    double v2 = v8;
    double v3 = v5;
    double v4 = v2;
    double v12 = v0;
    double v13 = v4;
    double v10 = v3;
    const std::vector<double> v9 { v2, v6, v13, v13 };
    std::vector<double> v22 = v9;
    v22[1] = v3;
    double v19 = v8;
    v4 = v0;
    std::vector<double> v26 = v22;
    v26[1] = v6;
    const double v34 = v22[0];
    const double v30 = v26[2];
    double v15 = v30;
    v22[2] = v2;
    v22[2] = v19;
    double v25 = v15;
    const double v42 = v9[1];
    const std::vector<double> v31 { v19, v7, v10, v42, v34, v12, v25 };
    v26[3] = v0;
    std::vector<double> v54 = v31;
    v26[2] = v15;
    const double v23 = v54[5];
    const double v86 = v15 / v0;
    const double v40 = v31[2];
    double v46 = v40;
    v10 = v86;
    v54[1] = v25;
    double v43 = v23;
    v26[0] = v43;
    return v46;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s6>> &v0, const std::vector<s5> &v1, const s1 &v2, const std::vector<std::vector<s5>> &v3, const double &v4) {
    const double v7 = f35(v4);
    double v10 = v7;
    double v21 = v10;
    const double v25 = f35(v21);
    return v25;
  }
  int main() {
    std::vector<std::vector<s6>> v0({ { { { { { { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 }, { 5.0 } } } }, { { { { 6.0 }, { 7.0 }, { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } } } }, { { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 }, { 16.0 }, { 17.0 } } } } }, { { { { { 18.0 }, { 19.0 }, { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } } }, { { { { 24.0 }, { 25.0 }, { 26.0 } }, { { 27.0 }, { 28.0 }, { 29.0 } } } } } } }, { { { 30.0 }, { 31.0 }, { 32.0 } }, { { 33.0 }, { 34.0 }, { 35.0 } } } } }, { { { { { { { { { { 36.0 }, { 37.0 }, { 38.0 } }, { { 39.0 }, { 40.0 }, { 41.0 } } } }, { { { { 42.0 }, { 43.0 }, { 44.0 } }, { { 45.0 }, { 46.0 }, { 47.0 } } } } }, { { { { 48.0 }, { 49.0 }, { 50.0 } }, { { 51.0 }, { 52.0 }, { 53.0 } } } } }, { { { { { 54.0 }, { 55.0 }, { 56.0 } }, { { 57.0 }, { 58.0 }, { 59.0 } } } }, { { { { 60.0 }, { 61.0 }, { 62.0 } }, { { 63.0 }, { 64.0 }, { 65.0 } } } } } } }, { { { 66.0 }, { 67.0 }, { 68.0 } }, { { 69.0 }, { 70.0 }, { 71.0 } } } } } });
    std::vector<s5> v1({ { { { { { { 72.0 }, { 73.0 }, { 74.0 } }, { { 75.0 }, { 76.0 }, { 77.0 } } } }, { { { { 78.0 }, { 79.0 }, { 80.0 } }, { { 81.0 }, { 82.0 }, { 83.0 } } } } }, { { { 84.0 }, { 85.0 }, { 86.0 } }, { { 87.0 }, { 88.0 }, { 89.0 } } } }, { { { { { { 90.0 }, { 91.0 }, { 92.0 } }, { { 93.0 }, { 94.0 }, { 95.0 } } } }, { { { { 96.0 }, { 97.0 }, { 98.0 } }, { { 99.0 }, { 100.0 }, { 101.0 } } } } }, { { { 102.0 }, { 103.0 }, { 104.0 } }, { { 105.0 }, { 106.0 }, { 107.0 } } } } });
    s1 v2({ { { { { 108.0 }, { 109.0 }, { 110.0 } }, { { 111.0 }, { 112.0 }, { 113.0 } } } }, { { { { 114.0 }, { 115.0 }, { 116.0 } }, { { 117.0 }, { 118.0 }, { 119.0 } } } } });
    std::vector<std::vector<s5>> v3({ { { { { { { { 120.0 }, { 121.0 }, { 122.0 } }, { { 123.0 }, { 124.0 }, { 125.0 } } } }, { { { { 126.0 }, { 127.0 }, { 128.0 } }, { { 129.0 }, { 130.0 }, { 131.0 } } } } }, { { { 132.0 }, { 133.0 }, { 134.0 } }, { { 135.0 }, { 136.0 }, { 137.0 } } } } } });
    double v4(138.0);
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
