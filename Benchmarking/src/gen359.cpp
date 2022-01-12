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
    s1 p0;
    std::vector<s0> p1;
    s2(s1 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s1 p0;
    std::vector<s2> p1;
    s3(s1 v0, std::vector<s2> v1): p0(v0), p1(v1) { }
  };
  s0 f70(const s0 &v0, const s0 &v1) {
    const std::vector<std::vector<double>> v5 = v1.p1;
    const std::vector<std::vector<double>> v7 = v0.p0;
    const std::vector<double> v2 = v7[0];
    s0 v6 = v0;
    const std::vector<std::vector<double>> v13 = v1.p0;
    v6.p0 = v13;
    const std::vector<double> v8 = v5[1];
    std::vector<std::vector<double>> v19 = v13;
    const std::vector<std::vector<double>> v15 = v6.p1;
    s0 v47 = v0;
    const std::vector<std::vector<double>> v22 = v1.p1;
    v47.p0 = v19;
    s0 v18 = v47;
    v19[0] = v8;
    v47.p1 = v15;
    v19[0] = v2;
    s0 v24 = v18;
    v47.p1 = v15;
    v18.p1 = v22;
    return v24;
  }
  double f36(const double &v0) {
    double v1 = v0;
    double v5 = v0;
    const std::vector<double> v3 { v5, v0, v0, v5, v1 };
    const double v8 = v3[2];
    std::vector<double> v7 = v3;
    const std::vector<double> v6 { v1, v5, v0, v8, v5 };
    v7[1] = v8;
    const double v4 = v7[4];
    const double v2 = v3[0];
    v5 = v8;
    const double v15 = v3[4];
    const std::vector<std::vector<double>> v11 { v6, v7, v6, v6, v6, v3, v7 };
    const std::vector<double> v13 { v15, v2, v4, v2, v2, v1 };
    std::vector<std::vector<double>> v23 = v11;
    const double v16 = v13[3];
    v7[4] = v8;
    v23[0] = v3;
    v5 = v0;
    const std::vector<double> v33 = v23[6];
    const double v14 = v13[1];
    v1 = v2;
    v23[5] = v33;
    const double v24 = v33[4];
    const std::vector<double> v31 = v23[4];
    const double v45 = v7[0];
    double v35 = v5;
    std::vector<double> v48 = v13;
    v48[5] = v24;
    std::vector<double> v71 = v48;
    const double v72 = v71[5];
    v7[2] = v35;
    double v41 = v4;
    const double v62 = v71[2];
    v7[2] = v14;
    v7[1] = v24;
    const std::vector<double> v108 { v41, v24, v45, v72 };
    std::vector<double> v74 = v108;
    v23[1] = v31;
    v74[1] = v16;
    std::vector<double> v192 = v74;
    const double v181 = v192[1];
    v35 = v62;
    return v181;
  }
  __attribute__((noinline))
  double f0(const std::vector<s0> &v0, const std::vector<s1> &v1, const s3 &v2, const double &v3) {
    const s1 v6 = v1[2];
    double v10 = v3;
    const s0 v15 = v6.p0;
    const s0 v13 = f70(v15, v15);
    const std::vector<std::vector<double>> v39 = v13.p1;
    const double v16 = f36(v10);
    const std::vector<double> v58 = v39[0];
    const double v45 = v58[0];
    v10 = v3;
    const double v109 = v10 + v16;
    const double v44 = v109 - v45;
    return v44;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } } }, { { { 4.0 } }, { { 5.0 }, { 6.0 }, { 7.0 } } } });
    std::vector<s1> v1({ { { { { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } }, { { { { 12.0 } }, { { 13.0 }, { 14.0 }, { 15.0 } } }, { { { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } }, { { { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } } } }, { { { { 24.0 } }, { { 25.0 }, { 26.0 }, { 27.0 } } }, { { { { 28.0 } }, { { 29.0 }, { 30.0 }, { 31.0 } } }, { { { 32.0 } }, { { 33.0 }, { 34.0 }, { 35.0 } } }, { { { 36.0 } }, { { 37.0 }, { 38.0 }, { 39.0 } } } } }, { { { { 40.0 } }, { { 41.0 }, { 42.0 }, { 43.0 } } }, { { { { 44.0 } }, { { 45.0 }, { 46.0 }, { 47.0 } } }, { { { 48.0 } }, { { 49.0 }, { 50.0 }, { 51.0 } } }, { { { 52.0 } }, { { 53.0 }, { 54.0 }, { 55.0 } } } } } });
    s3 v2({ { { { { 56.0 } }, { { 57.0 }, { 58.0 }, { 59.0 } } }, { { { { 60.0 } }, { { 61.0 }, { 62.0 }, { 63.0 } } }, { { { 64.0 } }, { { 65.0 }, { 66.0 }, { 67.0 } } }, { { { 68.0 } }, { { 69.0 }, { 70.0 }, { 71.0 } } } } }, { { { { { { 72.0 } }, { { 73.0 }, { 74.0 }, { 75.0 } } }, { { { { 76.0 } }, { { 77.0 }, { 78.0 }, { 79.0 } } }, { { { 80.0 } }, { { 81.0 }, { 82.0 }, { 83.0 } } }, { { { 84.0 } }, { { 85.0 }, { 86.0 }, { 87.0 } } } } }, { { { { 88.0 } }, { { 89.0 }, { 90.0 }, { 91.0 } } }, { { { 92.0 } }, { { 93.0 }, { 94.0 }, { 95.0 } } } } }, { { { { { 96.0 } }, { { 97.0 }, { 98.0 }, { 99.0 } } }, { { { { 100.0 } }, { { 101.0 }, { 102.0 }, { 103.0 } } }, { { { 104.0 } }, { { 105.0 }, { 106.0 }, { 107.0 } } }, { { { 108.0 } }, { { 109.0 }, { 110.0 }, { 111.0 } } } } }, { { { { 112.0 } }, { { 113.0 }, { 114.0 }, { 115.0 } } }, { { { 116.0 } }, { { 117.0 }, { 118.0 }, { 119.0 } } } } }, { { { { { 120.0 } }, { { 121.0 }, { 122.0 }, { 123.0 } } }, { { { { 124.0 } }, { { 125.0 }, { 126.0 }, { 127.0 } } }, { { { 128.0 } }, { { 129.0 }, { 130.0 }, { 131.0 } } }, { { { 132.0 } }, { { 133.0 }, { 134.0 }, { 135.0 } } } } }, { { { { 136.0 } }, { { 137.0 }, { 138.0 }, { 139.0 } } }, { { { 140.0 } }, { { 141.0 }, { 142.0 }, { 143.0 } } } } } } });
    double v3(144.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
