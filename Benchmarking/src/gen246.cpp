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
    s1 p0;
    s1 p1;
    s2(s1 v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s2 p0;
    s0 p1;
    s3(s2 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    s3 p0;
    s0 p1;
    s3 p2;
    std::vector<s2> p3;
    s4(s3 v0, s0 v1, s3 v2, std::vector<s2> v3): p0(v0), p1(v1), p2(v2), p3(v3) { }
  };
  struct s5 {
    s4 p0;
    std::vector<s0> p1;
    s5(s4 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s7 {
    s1 p0;
    s5 p1;
    s7(s1 v0, s5 v1): p0(v0), p1(v1) { }
  };
  struct s8 {
    s7 p0;
    std::vector<s0> p1;
    s8(s7 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  double f22(const double &v0) {
    double v2 = v0;
    double v5 = v2;
    v5 = v0;
    double v3 = v5;
    double v8 = v0;
    double v7 = v2;
    double v1 = v8;
    const double v11 = v2 / v1;
    double v6 = v3;
    double v12 = v0;
    double v10 = v11;
    const std::vector<double> v4 { v8, v2, v8, v2, v6, v10 };
    const double v22 = v4[5];
    std::vector<double> v9 = v4;
    double v16 = v3;
    const double v21 = v4[1];
    v9[0] = v12;
    double v13 = v21;
    double v20 = v6;
    v9[5] = v7;
    v9 = v4;
    const double v18 = v4[5];
    std::vector<double> v29 = v4;
    v9[3] = v13;
    v29[4] = v7;
    const double v38 = v4[0];
    v29[4] = v18;
    v29[1] = v38;
    const double v37 = v29[2];
    double v19 = v21;
    std::vector<double> v14 = v9;
    double v24 = v2;
    v14[4] = v22;
    v20 = v19;
    double v51 = v1;
    const double v58 = v9[3];
    const double v47 = v14[0];
    v9[4] = v20;
    v14[3] = v0;
    double v73 = v11;
    std::vector<double> v40 = v4;
    std::vector<double> v85 = v14;
    v29[2] = v1;
    std::vector<double> v39 = v4;
    v9[5] = v37;
    double v48 = v24;
    const double v137 = v4[3];
    const double v59 = v40[3];
    const double v72 = v14[2];
    const double v114 = v29[4];
    const double v143 = v39[3];
    v85[0] = v51;
    v85[0] = v73;
    v9[1] = v114;
    v40[3] = v47;
    const double v95 = v59 + v137;
    v9[4] = v72;
    v14[3] = v12;
    v85[0] = v21;
    std::vector<double> v88 = v85;
    v39[0] = v48;
    v40 = v88;
    v40[5] = v58;
    double v68 = v143;
    v29[5] = v16;
    v29[2] = v68;
    return v95;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s8>> &v0, const double &v1) {
    const double v6 = v1 / v1;
    const double v15 = f22(v1);
    const double v28 = f22(v15);
    const double v39 = v15 + v28;
    const double v110 = v39 / v6;
    return v110;
  }
  int main() {
    std::vector<std::vector<s8>> v0({ { { { { { { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } } }, { { { 4.0 } }, { { 5.0 }, { 6.0 }, { 7.0 } } } }, { { { { { { { { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } }, { { { 12.0 } }, { { 13.0 }, { 14.0 }, { 15.0 } } } }, { { { { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } }, { { { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } } } }, { { { 24.0 } }, { { 25.0 }, { 26.0 }, { 27.0 } } } }, { { { 28.0 } }, { { 29.0 }, { 30.0 }, { 31.0 } } }, { { { { { { 32.0 } }, { { 33.0 }, { 34.0 }, { 35.0 } } }, { { { 36.0 } }, { { 37.0 }, { 38.0 }, { 39.0 } } } }, { { { { 40.0 } }, { { 41.0 }, { 42.0 }, { 43.0 } } }, { { { 44.0 } }, { { 45.0 }, { 46.0 }, { 47.0 } } } } }, { { { 48.0 } }, { { 49.0 }, { 50.0 }, { 51.0 } } } }, { { { { { { 52.0 } }, { { 53.0 }, { 54.0 }, { 55.0 } } }, { { { 56.0 } }, { { 57.0 }, { 58.0 }, { 59.0 } } } }, { { { { 60.0 } }, { { 61.0 }, { 62.0 }, { 63.0 } } }, { { { 64.0 } }, { { 65.0 }, { 66.0 }, { 67.0 } } } } }, { { { { { 68.0 } }, { { 69.0 }, { 70.0 }, { 71.0 } } }, { { { 72.0 } }, { { 73.0 }, { 74.0 }, { 75.0 } } } }, { { { { 76.0 } }, { { 77.0 }, { 78.0 }, { 79.0 } } }, { { { 80.0 } }, { { 81.0 }, { 82.0 }, { 83.0 } } } } }, { { { { { 84.0 } }, { { 85.0 }, { 86.0 }, { 87.0 } } }, { { { 88.0 } }, { { 89.0 }, { 90.0 }, { 91.0 } } } }, { { { { 92.0 } }, { { 93.0 }, { 94.0 }, { 95.0 } } }, { { { 96.0 } }, { { 97.0 }, { 98.0 }, { 99.0 } } } } } } }, { { { { 100.0 } }, { { 101.0 }, { 102.0 }, { 103.0 } } }, { { { 104.0 } }, { { 105.0 }, { 106.0 }, { 107.0 } } } } } }, { { { { 108.0 } }, { { 109.0 }, { 110.0 }, { 111.0 } } }, { { { 112.0 } }, { { 113.0 }, { 114.0 }, { 115.0 } } }, { { { 116.0 } }, { { 117.0 }, { 118.0 }, { 119.0 } } } } } } });
    double v1(120.0);
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
