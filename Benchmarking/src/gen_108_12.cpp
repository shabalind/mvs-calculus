  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    double p0;
    std::vector<std::vector<double>> p1;
    s0(double v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<s0> p0;
    std::vector<s0> p1;
    s1(std::vector<s0> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s1 p0;
    std::vector<s0> p1;
    s0 p2;
    s1 p3;
    s0 p4;
    s2(s1 v0, std::vector<s0> v1, s0 v2, s1 v3, s0 v4): p0(v0), p1(v1), p2(v2), p3(v3), p4(v4) { }
  };
  struct s3 {
    s0 p0;
    std::vector<std::vector<s2>> p1;
    s3(s0 v0, std::vector<std::vector<s2>> v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    std::vector<s3> p0;
    s3 p1;
    s5(std::vector<s3> v0, s3 v1): p0(v0), p1(v1) { }
  };
  s5 f80(const s5 &v0) {
    const s3 v4 = v0.p1;
    s5 v5 = v0;
    v5.p1 = v4;
    s5 v16 = v5;
    return v16;
  }
  double f66(const double &v0) {
    double v7 = v0;
    v7 = v0;
    double v5 = v7;
    double v6 = v0;
    v6 = v5;
    v5 = v7;
    double v4 = v0;
    const double v1 = v0 - v4;
    double v9 = v6;
    double v3 = v5;
    double v15 = v0;
    double v22 = v1;
    double v21 = v3;
    const std::vector<double> v39 { v7, v5, v5, v22, v3, v5, v21 };
    double v20 = v15;
    const double v11 = v39[4];
    std::vector<double> v50 = v39;
    std::vector<double> v80 = v50;
    v50[3] = v20;
    const double v26 = v80[5];
    const double v31 = v80[4];
    v80[2] = v11;
    const double v54 = v26 - v21;
    double v64 = v54;
    v80[4] = v11;
    std::vector<double> v75 = v39;
    v80[4] = v31;
    v50 = v75;
    v80[5] = v3;
    v50[1] = v9;
    v80[4] = v3;
    v50[0] = v6;
    return v64;
  }
  __attribute__((noinline))
  double f0(const std::vector<s5> &v0, const double &v1) {
    const s5 v8 = v0[1];
    const std::vector<s3> v7 = v8.p0;
    const s5 v18 = f80(v8);
    const s3 v12 = v18.p1;
    const std::vector<std::vector<s2>> v19 = v12.p1;
    s3 v32 = v12;
    const s0 v30 = v32.p0;
    v32.p1 = v19;
    const double v41 = f66(v1);
    const std::vector<std::vector<double>> v51 = v30.p1;
    const std::vector<std::vector<s2>> v33 = v32.p1;
    const std::vector<double> v29 = v51[0];
    v32.p0 = v30;
    const s3 v37 = v7[1];
    std::vector<double> v27 = v29;
    v32.p1 = v33;
    v27[0] = v41;
    const std::vector<std::vector<s2>> v82 = v37.p1;
    v32.p1 = v82;
    const double v167 = v27[0];
    return v167;
  }
  int main() {
    std::vector<s5> v0({ { { { { 0.0, { { 1.0 } } }, { { { { { { 2.0, { { 3.0 } } }, { 4.0, { { 5.0 } } }, { 6.0, { { 7.0 } } } }, { { 8.0, { { 9.0 } } } } }, { { 10.0, { { 11.0 } } }, { 12.0, { { 13.0 } } } }, { 14.0, { { 15.0 } } }, { { { 16.0, { { 17.0 } } }, { 18.0, { { 19.0 } } }, { 20.0, { { 21.0 } } } }, { { 22.0, { { 23.0 } } } } }, { 24.0, { { 25.0 } } } } } } }, { { 26.0, { { 27.0 } } }, { { { { { { 28.0, { { 29.0 } } }, { 30.0, { { 31.0 } } }, { 32.0, { { 33.0 } } } }, { { 34.0, { { 35.0 } } } } }, { { 36.0, { { 37.0 } } }, { 38.0, { { 39.0 } } } }, { 40.0, { { 41.0 } } }, { { { 42.0, { { 43.0 } } }, { 44.0, { { 45.0 } } }, { 46.0, { { 47.0 } } } }, { { 48.0, { { 49.0 } } } } }, { 50.0, { { 51.0 } } } } } } } }, { { 52.0, { { 53.0 } } }, { { { { { { 54.0, { { 55.0 } } }, { 56.0, { { 57.0 } } }, { 58.0, { { 59.0 } } } }, { { 60.0, { { 61.0 } } } } }, { { 62.0, { { 63.0 } } }, { 64.0, { { 65.0 } } } }, { 66.0, { { 67.0 } } }, { { { 68.0, { { 69.0 } } }, { 70.0, { { 71.0 } } }, { 72.0, { { 73.0 } } } }, { { 74.0, { { 75.0 } } } } }, { 76.0, { { 77.0 } } } } } } } }, { { { { 78.0, { { 79.0 } } }, { { { { { { 80.0, { { 81.0 } } }, { 82.0, { { 83.0 } } }, { 84.0, { { 85.0 } } } }, { { 86.0, { { 87.0 } } } } }, { { 88.0, { { 89.0 } } }, { 90.0, { { 91.0 } } } }, { 92.0, { { 93.0 } } }, { { { 94.0, { { 95.0 } } }, { 96.0, { { 97.0 } } }, { 98.0, { { 99.0 } } } }, { { 100.0, { { 101.0 } } } } }, { 102.0, { { 103.0 } } } } } } }, { { 104.0, { { 105.0 } } }, { { { { { { 106.0, { { 107.0 } } }, { 108.0, { { 109.0 } } }, { 110.0, { { 111.0 } } } }, { { 112.0, { { 113.0 } } } } }, { { 114.0, { { 115.0 } } }, { 116.0, { { 117.0 } } } }, { 118.0, { { 119.0 } } }, { { { 120.0, { { 121.0 } } }, { 122.0, { { 123.0 } } }, { 124.0, { { 125.0 } } } }, { { 126.0, { { 127.0 } } } } }, { 128.0, { { 129.0 } } } } } } } }, { { 130.0, { { 131.0 } } }, { { { { { { 132.0, { { 133.0 } } }, { 134.0, { { 135.0 } } }, { 136.0, { { 137.0 } } } }, { { 138.0, { { 139.0 } } } } }, { { 140.0, { { 141.0 } } }, { 142.0, { { 143.0 } } } }, { 144.0, { { 145.0 } } }, { { { 146.0, { { 147.0 } } }, { 148.0, { { 149.0 } } }, { 150.0, { { 151.0 } } } }, { { 152.0, { { 153.0 } } } } }, { 154.0, { { 155.0 } } } } } } } } });
    double v1(156.0);
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
