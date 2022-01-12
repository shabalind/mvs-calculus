  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    double p0;
    std::vector<std::vector<double>> p1;
    s0(double v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    s0 p0;
    std::vector<std::vector<double>> p1;
    s1(s0 v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s1 p0;
    s0 p1;
    s1 p2;
    std::vector<std::vector<s0>> p3;
    s3(s1 v0, s0 v1, s1 v2, std::vector<std::vector<s0>> v3): p0(v0), p1(v1), p2(v2), p3(v3) { }
  };
  struct s5 {
    std::vector<s3> p0;
    s3 p1;
    s5(std::vector<s3> v0, s3 v1): p0(v0), p1(v1) { }
  };
  double f11(const double &v0) {
    double v7 = v0;
    double v5 = v7;
    double v2 = v7;
    double v8 = v0;
    double v13 = v5;
    double v12 = v7;
    double v15 = v2;
    double v16 = v2;
    const double v10 = v15 - v8;
    double v26 = v5;
    double v25 = v7;
    const std::vector<double> v19 { v15, v2, v26, v2, v8, v13 };
    const double v40 = v19[5];
    std::vector<double> v30 = v19;
    double v28 = v7;
    v30[4] = v12;
    v30[4] = v40;
    double v99 = v10;
    const double v36 = v30[4];
    std::vector<double> v42 = v19;
    v42[4] = v28;
    const double v31 = v42[2];
    v30[4] = v25;
    v30[4] = v16;
    v42[3] = v36;
    const std::vector<std::vector<double>> v119 { v42, v30, v42, v30 };
    const std::vector<double> v39 = v119[1];
    v42[5] = v2;
    const double v86 = v39[2];
    v30[3] = v31;
    v30[2] = v2;
    v30[1] = v99;
    return v86;
  }
  __attribute__((noinline))
  double f0(const s5 &v0, const std::vector<std::vector<s0>> &v1, const double &v2) {
    const double v8 = f11(v2);
    const std::vector<s0> v9 = v1[1];
    const s0 v4 = v9[0];
    const double v7 = v2 / v2;
    const double v30 = v4.p0;
    const double v29 = f11(v30);
    const double v60 = v8 + v29;
    const double v92 = v7 + v60;
    return v92;
  }
  int main() {
    s5 v0({ { { { { 0.0, { { 1.0 }, { 2.0 } } }, { { 3.0 }, { 4.0 }, { 5.0 } } }, { 6.0, { { 7.0 }, { 8.0 } } }, { { 9.0, { { 10.0 }, { 11.0 } } }, { { 12.0 }, { 13.0 }, { 14.0 } } }, { { { 15.0, { { 16.0 }, { 17.0 } } } }, { { 18.0, { { 19.0 }, { 20.0 } } } }, { { 21.0, { { 22.0 }, { 23.0 } } } } } }, { { { 24.0, { { 25.0 }, { 26.0 } } }, { { 27.0 }, { 28.0 }, { 29.0 } } }, { 30.0, { { 31.0 }, { 32.0 } } }, { { 33.0, { { 34.0 }, { 35.0 } } }, { { 36.0 }, { 37.0 }, { 38.0 } } }, { { { 39.0, { { 40.0 }, { 41.0 } } } }, { { 42.0, { { 43.0 }, { 44.0 } } } }, { { 45.0, { { 46.0 }, { 47.0 } } } } } } }, { { { 48.0, { { 49.0 }, { 50.0 } } }, { { 51.0 }, { 52.0 }, { 53.0 } } }, { 54.0, { { 55.0 }, { 56.0 } } }, { { 57.0, { { 58.0 }, { 59.0 } } }, { { 60.0 }, { 61.0 }, { 62.0 } } }, { { { 63.0, { { 64.0 }, { 65.0 } } } }, { { 66.0, { { 67.0 }, { 68.0 } } } }, { { 69.0, { { 70.0 }, { 71.0 } } } } } } });
    std::vector<std::vector<s0>> v1({ { { 72.0, { { 73.0 }, { 74.0 } } } }, { { 75.0, { { 76.0 }, { 77.0 } } } } });
    double v2(78.0);
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
