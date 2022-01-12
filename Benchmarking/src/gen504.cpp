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
    s1 p1;
    s2(s1 v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s0 p0;
    s1 p1;
    s3(s0 v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    std::vector<s2> p0;
    std::vector<s3> p1;
    s4(std::vector<s2> v0, std::vector<s3> v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    s4 p0;
    s5(s4 v0): p0(v0) { }
  };
  struct s6 {
    s2 p0;
    s1 p1;
    s6(s2 v0, s1 v1): p0(v0), p1(v1) { }
  };
  s0 f59(const s0 &v0) {
    const std::vector<s0> v7 { v0 };
    const s0 v3 = v7[0];
    const std::vector<std::vector<double>> v15 = v0.p0;
    const std::vector<std::vector<double>> v18 = v3.p1;
    const s0 v17(v15, v18);
    return v17;
  }
  s0 f22(const s0 &v0) {
    const std::vector<std::vector<double>> v5 = v0.p1;
    s0 v7 = v0;
    const std::vector<std::vector<double>> v3 = v0.p0;
    std::vector<std::vector<double>> v1 = v5;
    const std::vector<std::vector<double>> v11 = v7.p0;
    const std::vector<double> v2 = v3[0];
    const s0 v10 = f59(v7);
    const std::vector<std::vector<double>> v9 = v10.p1;
    const std::vector<double> v4 = v5[1];
    const std::vector<double> v13 = v1[1];
    const s0 v8 = f59(v7);
    std::vector<std::vector<double>> v15 = v3;
    std::vector<std::vector<double>> v16 = v1;
    const std::vector<std::vector<std::vector<double>>> v19 { v16, v5, v16, v9, v1, v16, v5 };
    std::vector<std::vector<std::vector<double>>> v14 = v19;
    const s0 v24 = f59(v8);
    const s0 v18 = f59(v7);
    const std::vector<double> v20 = v11[0];
    const std::vector<std::vector<double>> v22 = v24.p1;
    const s0 v26 = f59(v8);
    v7.p0 = v15;
    const std::vector<std::vector<double>> v34 = v18.p0;
    const std::vector<std::vector<double>> v51 = v24.p1;
    const std::vector<std::vector<double>> v56 = v8.p1;
    std::vector<std::vector<std::vector<double>>> v65 = v14;
    const std::vector<std::vector<double>> v43 = v0.p1;
    v7.p0 = v3;
    v7.p1 = v43;
    const s0 v55 = f59(v26);
    v65[0] = v51;
    v7.p0 = v3;
    v15[0] = v4;
    const std::vector<std::vector<double>> v69 = v65[4];
    const std::vector<std::vector<double>> v149 = v8.p0;
    const s0 v47 = f59(v7);
    v1[0] = v20;
    const std::vector<std::vector<double>> v42 = v47.p0;
    v7.p0 = v149;
    std::vector<std::vector<double>> v50 = v34;
    const s0 v113 = f59(v8);
    v1[0] = v13;
    v7.p0 = v50;
    s0 v70 = v10;
    v7.p1 = v69;
    v70.p0 = v42;
    const std::vector<std::vector<double>> v152 = v55.p1;
    const std::vector<std::vector<double>> v63 = v113.p0;
    const std::vector<std::vector<double>> v219 = v14[4];
    const std::vector<std::vector<double>> v141 = v26.p0;
    v14[5] = v9;
    v50[0] = v2;
    v70.p0 = v63;
    v7.p1 = v56;
    v14[0] = v22;
    v70.p0 = v141;
    v65[2] = v152;
    v70.p1 = v69;
    v70.p1 = v219;
    return v70;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s3>> &v0, const std::vector<s6> &v1, const s5 &v2, const double &v3) {
    const std::vector<s3> v4 = v0[0];
    const s3 v7 = v4[0];
    const s0 v8 = v7.p0;
    const s0 v16 = f22(v8);
    const s0 v17 = f59(v16);
    const std::vector<std::vector<double>> v47 = v17.p0;
    const std::vector<double> v55 = v47[0];
    const double v82 = v55[0];
    return v82;
  }
  int main() {
    std::vector<std::vector<s3>> v0({ { { { { { 0.0 } }, { { 1.0 }, { 2.0 } } }, { { { { 3.0 } }, { { 4.0 }, { 5.0 } } }, { { { { 6.0 } }, { { 7.0 }, { 8.0 } } }, { { { 9.0 } }, { { 10.0 }, { 11.0 } } } } } } } });
    std::vector<s6> v1({ { { { { { { 12.0 } }, { { 13.0 }, { 14.0 } } }, { { { { 15.0 } }, { { 16.0 }, { 17.0 } } }, { { { 18.0 } }, { { 19.0 }, { 20.0 } } } } }, { { { { 21.0 } }, { { 22.0 }, { 23.0 } } }, { { { { 24.0 } }, { { 25.0 }, { 26.0 } } }, { { { 27.0 } }, { { 28.0 }, { 29.0 } } } } } }, { { { { 30.0 } }, { { 31.0 }, { 32.0 } } }, { { { { 33.0 } }, { { 34.0 }, { 35.0 } } }, { { { 36.0 } }, { { 37.0 }, { 38.0 } } } } } }, { { { { { { 39.0 } }, { { 40.0 }, { 41.0 } } }, { { { { 42.0 } }, { { 43.0 }, { 44.0 } } }, { { { 45.0 } }, { { 46.0 }, { 47.0 } } } } }, { { { { 48.0 } }, { { 49.0 }, { 50.0 } } }, { { { { 51.0 } }, { { 52.0 }, { 53.0 } } }, { { { 54.0 } }, { { 55.0 }, { 56.0 } } } } } }, { { { { 57.0 } }, { { 58.0 }, { 59.0 } } }, { { { { 60.0 } }, { { 61.0 }, { 62.0 } } }, { { { 63.0 } }, { { 64.0 }, { 65.0 } } } } } }, { { { { { { 66.0 } }, { { 67.0 }, { 68.0 } } }, { { { { 69.0 } }, { { 70.0 }, { 71.0 } } }, { { { 72.0 } }, { { 73.0 }, { 74.0 } } } } }, { { { { 75.0 } }, { { 76.0 }, { 77.0 } } }, { { { { 78.0 } }, { { 79.0 }, { 80.0 } } }, { { { 81.0 } }, { { 82.0 }, { 83.0 } } } } } }, { { { { 84.0 } }, { { 85.0 }, { 86.0 } } }, { { { { 87.0 } }, { { 88.0 }, { 89.0 } } }, { { { 90.0 } }, { { 91.0 }, { 92.0 } } } } } } });
    s5 v2({ { { { { { { { 93.0 } }, { { 94.0 }, { 95.0 } } }, { { { { 96.0 } }, { { 97.0 }, { 98.0 } } }, { { { 99.0 } }, { { 100.0 }, { 101.0 } } } } }, { { { { 102.0 } }, { { 103.0 }, { 104.0 } } }, { { { { 105.0 } }, { { 106.0 }, { 107.0 } } }, { { { 108.0 } }, { { 109.0 }, { 110.0 } } } } } } }, { { { { { 111.0 } }, { { 112.0 }, { 113.0 } } }, { { { { 114.0 } }, { { 115.0 }, { 116.0 } } }, { { { { 117.0 } }, { { 118.0 }, { 119.0 } } }, { { { 120.0 } }, { { 121.0 }, { 122.0 } } } } } } } } });
    double v3(123.0);
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
