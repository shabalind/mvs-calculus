  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s0 p0;
    s3(s0 v0): p0(v0) { }
  };
  struct s4 {
    std::vector<s3> p0;
    double p1;
    s4(std::vector<s3> v0, double v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    std::vector<s4> p0;
    std::vector<std::vector<s3>> p1;
    s5(std::vector<s4> v0, std::vector<std::vector<s3>> v1): p0(v0), p1(v1) { }
  };
  s4 f111(const s4 &v0) {
    s4 v4 = v0;
    s4 v3 = v4;
    s4 v6 = v0;
    const double v8 = v3.p1;
    s4 v12 = v3;
    const double v7 = v3.p1;
    s4 v1 = v4;
    const std::vector<s3> v9 = v3.p0;
    v6.p1 = v8;
    const std::vector<s3> v13 = v6.p0;
    const s4 v11(v13, v8);
    v3.p1 = v7;
    const s3 v2 = v9[2];
    double v10 = v7;
    std::vector<s3> v25 = v13;
    s4 v15 = v11;
    double v16 = v7;
    v4.p1 = v10;
    const std::vector<s3> v20 = v12.p0;
    v4.p0 = v20;
    s3 v17 = v2;
    v15.p0 = v25;
    v25[2] = v2;
    v12.p1 = v16;
    v3.p0 = v13;
    v25[2] = v17;
    const s0 v50 = v17.p0;
    v1.p0 = v9;
    const double v56 = v4.p1;
    v17.p0 = v50;
    v4.p1 = v56;
    const std::vector<s3> v55 = v1.p0;
    v15.p1 = v56;
    const double v116 = v11.p1;
    v3.p1 = v116;
    v15.p0 = v55;
    v3 = v6;
    const double v97 = v15.p1;
    v3.p1 = v97;
    return v15;
  }
  s4 f83(const s4 &v0) {
    s4 v5 = v0;
    const s4 v2 = f111(v5);
    const std::vector<s4> v7 { v0, v0, v0, v0, v0, v0, v5 };
    const std::vector<std::vector<s4>> v6 { v7, v7, v7, v7, v7 };
    const std::vector<s3> v3 = v2.p0;
    const std::vector<s4> v4 = v6[2];
    v5.p0 = v3;
    const s4 v15 = v4[3];
    v5.p0 = v3;
    const s4 v75 = f111(v2);
    const s4 v34 = f111(v75);
    s4 v39 = v34;
    v5 = v39;
    s4 v74 = v15;
    return v74;
  }
  __attribute__((noinline))
  double f0(const std::vector<s5> &v0, const double &v1) {
    const s5 v4 = v0[0];
    const std::vector<s4> v3 = v4.p0;
    const s4 v12 = v3[2];
    const double v5 = v12.p1;
    const s4 v14 = f83(v12);
    const s4 v13 = v3[2];
    const std::vector<double> v16 { v5 };
    s4 v19 = v14;
    const double v10 = v16[0];
    v19 = v13;
    const double v44 = v19.p1;
    double v62 = v44;
    double v73 = v10;
    v19.p1 = v73;
    return v62;
  }
  int main() {
    std::vector<s5> v0({ { { { { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 } } } }, { { { { 5.0 }, { 6.0 }, { 7.0 } }, { { 8.0 }, { 9.0 } } } }, { { { { 10.0 }, { 11.0 }, { 12.0 } }, { { 13.0 }, { 14.0 } } } } }, 15.0 }, { { { { { { 16.0 }, { 17.0 }, { 18.0 } }, { { 19.0 }, { 20.0 } } } }, { { { { 21.0 }, { 22.0 }, { 23.0 } }, { { 24.0 }, { 25.0 } } } }, { { { { 26.0 }, { 27.0 }, { 28.0 } }, { { 29.0 }, { 30.0 } } } } }, 31.0 }, { { { { { { 32.0 }, { 33.0 }, { 34.0 } }, { { 35.0 }, { 36.0 } } } }, { { { { 37.0 }, { 38.0 }, { 39.0 } }, { { 40.0 }, { 41.0 } } } }, { { { { 42.0 }, { 43.0 }, { 44.0 } }, { { 45.0 }, { 46.0 } } } } }, 47.0 } }, { { { { { { 48.0 }, { 49.0 }, { 50.0 } }, { { 51.0 }, { 52.0 } } } } }, { { { { { 53.0 }, { 54.0 }, { 55.0 } }, { { 56.0 }, { 57.0 } } } } } } }, { { { { { { { { 58.0 }, { 59.0 }, { 60.0 } }, { { 61.0 }, { 62.0 } } } }, { { { { 63.0 }, { 64.0 }, { 65.0 } }, { { 66.0 }, { 67.0 } } } }, { { { { 68.0 }, { 69.0 }, { 70.0 } }, { { 71.0 }, { 72.0 } } } } }, 73.0 }, { { { { { { 74.0 }, { 75.0 }, { 76.0 } }, { { 77.0 }, { 78.0 } } } }, { { { { 79.0 }, { 80.0 }, { 81.0 } }, { { 82.0 }, { 83.0 } } } }, { { { { 84.0 }, { 85.0 }, { 86.0 } }, { { 87.0 }, { 88.0 } } } } }, 89.0 }, { { { { { { 90.0 }, { 91.0 }, { 92.0 } }, { { 93.0 }, { 94.0 } } } }, { { { { 95.0 }, { 96.0 }, { 97.0 } }, { { 98.0 }, { 99.0 } } } }, { { { { 100.0 }, { 101.0 }, { 102.0 } }, { { 103.0 }, { 104.0 } } } } }, 105.0 } }, { { { { { { 106.0 }, { 107.0 }, { 108.0 } }, { { 109.0 }, { 110.0 } } } } }, { { { { { 111.0 }, { 112.0 }, { 113.0 } }, { { 114.0 }, { 115.0 } } } } } } } });
    double v1(116.0);
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
